package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.bean.KfFee;
import cn.rzhd.wuye.bean.PropertyFee;
import cn.rzhd.wuye.bean.ReName;
import cn.rzhd.wuye.service.*;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.utils.StringTimeUtil;
import cn.rzhd.wuye.vo.query.EnterApplyQuery;
import cn.rzhd.wuye.vo.query.FeeDataQuery;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.StringUtil;
import com.xiaoleilu.hutool.io.FileUtil;
import com.xiaoleilu.hutool.util.StrUtil;
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
import java.util.*;

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
    @Autowired
    IPropertyFeeService propertyFeeService;
    @Autowired
    IKfFeeService kfFeeService;
    @Autowired
    IHouseInfoService houseInfoService;
    @Autowired
    IHouseInfoDetailsService houseInfoDetailsService;
    @Autowired
    IReNameService reNameService;
    @Value("${fileDir}")
    private String fileDir;

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

        model.addAttribute("enterApplyList", enterApplyList);

        model.addAttribute("total", enterApplyList.size());
        return "forbusiness/enterApplyList";
    }

    /**
     * 入驻申请审核
     *
     * @return
     */
    @RequestMapping(value = "/enterApplyEdit", method = RequestMethod.GET)
    public String toEnterApplyAdd(Model model, Long enterApplyId, String houseInfoId) throws InvocationTargetException, IllegalAccessException {
        FeeDataQuery query = new FeeDataQuery();
        query.setHouseInfoId(houseInfoId);
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.getEnterApplyByID(enterApplyId);
        Map<String, JsonFormat.Value> map = new HashMap<>();
        //入住开发费
        List<KfFee> kfFeeList = kfFeeService.selectAllRZ(query);
        //入住物业费
        List<PropertyFee> propertyFeeList = propertyFeeService.rzselectAll(query);

        if (enterApplyList.size() == 1) {
            map = enterApplyList.get(0);
        }
        //入住开发费
        model.addAttribute("kfFeeList", kfFeeList);
        //入住物业费
        model.addAttribute("propertyFeeList", propertyFeeList);
        //入驻申请
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
        System.out.println("日期+++++++++++" + StringTimeUtil.parse(enterApplyQuery.getStartDate()));
        PageHelper.startPage(1, 5);
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyByQuery(enterApplyQuery);
        Page page = (Page) enterApplyList;
        model.addAttribute("enterApplyList", enterApplyList);

        model.addAttribute("total", page.getPages());
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
        try {
            //获取当前时间
            Date date = new Date();
            enterApply.setUpdateTime(date);
            enterApplyService.updateEnterApply(enterApply);
            if (enterApply.getAuditStatus() == 1) {
                //修改申请状态
                houseInfoDetailsService.updateHouse(enterApply.getHouseId(), "2", null);
            } else if (enterApply.getAuditStatus() == 2) {
                //修改申请状态
                houseInfoDetailsService.updateHouse(enterApply.getHouseId(), "0", null);
            }

            //查询更新数据
            //PageHelper.startPage(1, 500);
            List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList();
            //Page page = (Page) enterApplyList;
            // System.out.println(JSONObject.toJSONString(page, SerializerFeature.WriteMapNullValue));
            model.addAttribute("enterApplyList", enterApplyList);
            //model.addAttribute("total", page.getTotal());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "forbusiness/enterApplyList";
    }

    /**
     * 入驻申请
     *
     * @param enterApply
     * @return
     */
    @RequestMapping("/insertEnterApply")
    @ResponseBody
    public Map insertEnterApply(EnterApply enterApply) {
        System.out.println("enterApply = " + enterApply);
        Map result = new HashMap();
        if (StringUtil.isEmpty(enterApply.getHouseId())) {
            result.put("state", "0");
            result.put("msg", "房产ID不能为空!");
            return result;
        }
        if (StrUtil.isEmpty(enterApply.getCustomerId())){

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
            //修改申请状态
            houseInfoDetailsService.updateHouse(enterApply.getHouseId(), "1", null);
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
     * @param pkHouse
     * @return
     */
    @RequestMapping("/deleteEnterApply")
    public String deleteEnterApply(Model model, Long enterApplyId, String pkHouse) {
        if (enterApplyId != null) {
            enterApplyService.deleteEnterApply(enterApplyId);
            houseInfoDetailsService.updateHouse(pkHouse, "0", null);
        }
        //查询更新数据
        //PageHelper.startPage(1, 5);
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList();
        //Page page = (Page) enterApplyList;
        //System.out.println(JSONObject.toJSONString(page, SerializerFeature.WriteMapNullValue));
        model.addAttribute("enterApplyList", enterApplyList);
        //model.addAttribute("total", page.getTotal());
        return "forbusiness/enterApplyList";
    }

    @RequestMapping("/downLoad")
    @ResponseBody
    public String downLoad(HttpServletResponse response, String filePath) {
        Map result = new HashMap();
        response.setCharacterEncoding("utf-8");
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
        return "OK";
    }

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
        File file1 = FileUtil.file(fileDir);

        File tempFile = new File(file1.separator + dateDir + File.separator + serviceName);
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

    /**
     * 获取入住申请状态信息
     *
     * @param pkHouse
     * @return
     */
    @RequestMapping(value = "/getEnterApplyByIDAndState", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getEnterApplyByIDAndState(String pkHouse) {
        Map<String, Object> result = new HashMap<>();
        try {
            if (StrUtil.isEmpty(pkHouse)) {
                result.put("state", "0");
                result.put("msg", "ID不能为空!");
                return result;
            }
            List<Map<String, JsonFormat.Value>> mapList = enterApplyService.getEnterApplyByIDAndState(pkHouse);
            result.put("state", "1");
            result.put("data", mapList);
            return result;
        } catch (Exception e) {
            result.put("state", "0");
            result.put("msg", "erro" + e.getMessage());
            return result;
        }
    }

    /**
     * 根据申请ID获取缴费状态
     *
     * @param enterApplyId
     * @return
     */
    @RequestMapping(value = "/getEnterApplyById", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getEnterApplyById(Long enterApplyId) {

        Map<String, Object> result = new HashMap<>();
        try {
            if (enterApplyId == null) {
                result.put("state", "0");
                result.put("msg", "ID不能为空!");
                return result;
            }
            List<Map<String, JsonFormat.Value>> mapList = enterApplyService.getEnterApplyByID(enterApplyId);
            result.put("state", "1");
            result.put("data", mapList);
            return result;
        } catch (Exception e) {
            result.put("state", "0");
            result.put("msg", "erro" + e.getMessage());
            return result;
        }
    }

    /**
     * 根据申请ID获取更名须知
     *
     * @return
     */
    @RequestMapping(value = "/getEnterApplyByEnterApplyId", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getReName() {
        Map<String, Object> result = new HashMap<>();
        try {
            ReName all = reNameService.getAll();
            result.put("state", "1");
            result.put("data", all);
            return result;
        } catch (Exception e) {
            result.put("state", "0");
            result.put("msg", "erro" + e.getMessage());
            return result;
        }
    }

    /**
     * 完成入驻流程
     *
     * @param enterApplyId
     * @return
     */
    @RequestMapping("/updateEnterApplyState")
    @ResponseBody
    public Map<String, String> updateEnterApplyState(Long enterApplyId) {
        Map<String, String> result = new Hashtable<>();
        enterApplyService.updatePayState("-1", "-1", enterApplyId);
        result.put("state", "1");
        return result;
    }

    /**
     * 获取入驻申请表中是否有数据
     *
     * @param pkHouse
     * @param customerId
     * @return
     */
    @RequestMapping("/getEnterApplyCount")
    @ResponseBody
    public Map<String, String> getCount(String pkHouse, String customerId) {
        Map<String, String> result = new Hashtable<>();
        if (StrUtil.isEmpty(pkHouse) && StrUtil.isEmpty(customerId)) {
            result.put("state", "0");
            result.put("msg", "ID为空");
            return result;
        }
        Integer count = enterApplyService.getCount(pkHouse, customerId);
        result.put("state", "1");
        result.put("data", count.toString());
        return result;
    }
}
