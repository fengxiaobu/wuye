package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.service.IEnterApplyService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.utils.StringTimeUtil;
import cn.rzhd.wuye.vo.query.EnterApplyQuery;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/5/25 创建.
 * <h1>入驻申请Controller</h1>
 */
@PropertySource(value = "classpath:fileDirConfig.properties")
@Controller
@RequestMapping("/dist/enterApply")
public class EnterApplyController {
    @Autowired
    IEnterApplyService enterApplyService;

    /**
     * 查询接口
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/findEnterApplyList")
    @ResponseBody
    public String findEnterApplyList(Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageNum <= 0) {
            return JsonUtils.objectToJson("当前页码无效");
        }
        if (pageSize == null || pageSize <= 0) {
            return JsonUtils.objectToJson("每页显示条数无效");
        }
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList();
            PageInfo pageInfo = new PageInfo(enterApplyList);
            Page page = (Page) enterApplyList;
            System.out.println("page = " + page);
            //return JSONObject.toJSONString(pageInfo, SerializerFeature.WriteMapNullValue)+JSONObject.toJSONString(page, SerializerFeature.WriteMapNullValue);
            return JSONObject.toJSONString(page, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            System.err.println("入驻申请列表分页查询失败");
            e.printStackTrace();
            return JsonUtils.objectToJson("异常");
        }
    }

    /**
     * 显示业务办理页面
     *
     * @return
     */
    @RequestMapping("/enterApplyList")
    public String showEnterApplyList(Model model, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList();
        Page page = (Page) enterApplyList;
        System.out.println("page:" + page.getTotal());
        model.addAttribute("enterApplyList", enterApplyList);

        model.addAttribute("total", page.getTotal());
        return "forbusiness/enterApplyList";
    }

    /**
     * 入驻申请审核
     *
     * @return
     */
    @RequestMapping(value = "/enterApplyEdit", method = RequestMethod.GET)
    public String toEnterApplyAdd(Model model, Long enterApplyId) throws InvocationTargetException, IllegalAccessException {
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.getEnterApplyByID(enterApplyId);
        Map<String, JsonFormat.Value> map = new HashMap<>();
        if (enterApplyList.size() == 1) {
            map = enterApplyList.get(0);
        }
        model.addAttribute("enterApply", map);
        return "forbusiness/enterApplyEdit";
    }

    /**
     * 条件查询
     *
     * @param model
     * @param enterApplyQuery
     * @return
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(Model model, EnterApplyQuery enterApplyQuery) {
        System.out.println("日期+++++++++++"+StringTimeUtil.parse(enterApplyQuery.getStartDate()));
        PageHelper.startPage(1, 5);
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyByQuery(enterApplyQuery);
        Page page = (Page) enterApplyList;
        model.addAttribute("enterApplyList", enterApplyList);

        model.addAttribute("pages", page.getPages());
        return "forbusiness/enterApplyList";
    }

    /**
     * 修改入驻申请信息
     *
     * @param model
     * @param enterApply
     * @return
     */
    @RequestMapping("/updateEnterApply")
    public String updateEnterApply(Model model, EnterApply enterApply) {
        //获取当前时间
        Date date = new Date();
        enterApply.setUpdateTime(date);
        enterApplyService.updateEnterApply(enterApply);
        //查询更新数据
        PageHelper.startPage(1, 5);
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList();
        Page page = (Page) enterApplyList;
        System.out.println(JSONObject.toJSONString(page, SerializerFeature.WriteMapNullValue));
        model.addAttribute("enterApplyList", enterApplyList);
        model.addAttribute("pages", page.getPages());
        return "forbusiness/enterApplyList";
    }

    /**
     * 入驻申请
     * @param enterApply
     * @return
     */
    @RequestMapping("/insertEnterApply")
    @ResponseBody
    public Map insertEnterApply(EnterApply enterApply) {
        Map result = new HashMap();
        if (StringUtil.isEmpty(enterApply.getHouseInfoId())) {
            result.put("state", "0");
            result.put("msg", "房产ID不能为空!");
            return result;
        }
        if (StringUtil.isEmpty(enterApply.getEnterAdviceNote())) {
            result.put("state", "0");
            result.put("msg", "入驻通知书不能为空!");
            return result;
        }
        try {
            //获取当前时间
            Date date = new Date();
            enterApply.setApplyTime(date);
            enterApply.setCreationTime(date);
            //初始化审核状态
            enterApply.setAuditStatus(0);
            System.out.println("enterApply = " + enterApply);
            enterApplyService.insertEnterApply(enterApply);
            result.put("state", "1");
            result.put("msg", "成功!");
            return result;
        } catch (Exception e) {
            result.put("state", "0");
            result.put("msg", "入驻申请失败!  " + e.getMessage());
            return result;
        }

    }


    /**
     * 删除入驻信息
     *
     * @param model
     * @param enterApplyId
     * @return
     */
    @RequestMapping("/deleteEnterApply")
    public String deleteEnterApply(Model model, Long enterApplyId) {
        if (enterApplyId != null) {
            enterApplyService.deleteEnterApply(enterApplyId);
        }
        //查询更新数据
        PageHelper.startPage(1, 5);
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList();
        Page page = (Page) enterApplyList;
        System.out.println(JSONObject.toJSONString(page, SerializerFeature.WriteMapNullValue));
        model.addAttribute("enterApplyList", enterApplyList);
        model.addAttribute("pages", page.getPages());
        return "forbusiness/enterApplyList";
    }


    @RequestMapping("/upLoadEnterApply")
    @ResponseBody
    public String dwonLoadEnterApply(HttpServletResponse response, String filePath) {
        Map result = new HashMap();
        try {
            String[] fp = filePath.split("\\\\");
            String fileName = fp[fp.length - 1];// 文件名称
            System.out.println("-------------------------------上传文件名为=" + fileName);

            //下载机器码文件
            response.setHeader("conent-type", "application/octet-stream");
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Disposition", "attachment; filename=" + new String(fileName.getBytes("ISO-8859-1"), "UTF-8"));

            OutputStream os = response.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);

            InputStream is = null;

            is = new FileInputStream(filePath);
            BufferedInputStream bis = new BufferedInputStream(is);

            int length = 0;
            byte[] temp = new byte[1 * 1024 * 10];

            while ((length = bis.read(temp)) != -1) {
                bos.write(temp, 0, length);
            }
            bos.flush();
            bis.close();
            bos.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    @Value("${fileDir}")
    private String fileDir;

    // 文件上传
    @RequestMapping("/fileUpload")
    @ResponseBody
    public Map fileUpload(@RequestParam("file") MultipartFile file, HttpServletRequest req) {
        Map result = new HashMap();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");// 设置日期格式
        String dateDir = df.format(new Date());// new Date()为获取当前系统时间
        String serviceName = file.getOriginalFilename().substring(0, file.getOriginalFilename().lastIndexOf(".")) + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        System.out.println("serviceName = " + serviceName);
        System.out.println("fileDir = " + fileDir);
        File tempFile = new File(fileDir + dateDir + File.separator + serviceName);
        if (!tempFile.getParentFile().exists()) {
            tempFile.getParentFile().mkdirs();
        }
        if (!file.isEmpty()) {
            try {
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(tempFile));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                result.put("msg", "上传失败," + e.getMessage());
                result.put("state", false);
                return result;
            } catch (IOException e) {
                e.printStackTrace();
                result.put("msg", "上传失败," + e.getMessage());
                result.put("state", false);
                return result;
            }
            result.put("msg", "上传成功");
            //String fileId = Get8uuid.generateShortUuid();
            String fileName = file.getOriginalFilename();
            String fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
            String fileUrl = fileDir + dateDir + '/' + serviceName;
            System.out.println("fileUrl = " + fileUrl);
            System.out.println("fileType = " + fileType);
            System.out.println("fileName = " + fileName);
            //uploadMapper.saveFileInfo(fileId, serviceName, fileType, fileUrl);
            result.put("state", true);
            result.put("fileUrl", fileUrl);
            result.put("fileName", fileName);
            return result;
        } else {
            result.put("msg", "上传失败，因为文件是空的");
            result.put("state", false);
            return result;
        }
    }
}
