package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.DecorateDetail;
import cn.rzhd.wuye.bean.DecorationApply;
import cn.rzhd.wuye.bean.DecorationMaterial;
import cn.rzhd.wuye.bean.DecorationNotice;
import cn.rzhd.wuye.service.IDecorateDetailService;
import cn.rzhd.wuye.service.IDecorationApplyService;
import cn.rzhd.wuye.service.IDecorationMaterialService;
import cn.rzhd.wuye.service.IDecorationNoticeService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/**
 * luopa 在 2017/6/7 创建.
 * <p>
 * 装修申请
 */
@Controller
@RequestMapping("/dist")
public class DecorationApplyController {
    //装修须知
    @Autowired
    IDecorationNoticeService decorationNoticeService;
    //装修明细
    @Autowired
    IDecorateDetailService decorateDetailService;
    //装修资料
    @Autowired
    IDecorationMaterialService decorationMaterialService;
    //装修申请
    @Autowired
    IDecorationApplyService decorationApplyService;

    /**
     * 装修须知
     *
     * @return
     */
    @RequestMapping("/decorationNotice/list")
    @ResponseBody
    public String selectAll() {
        List<DecorationNotice> decorationNotices = decorationNoticeService.selectAll();
        DecorationNotice decorationNotice = null;
        String jsonString = "没有数据!";
        if (decorationNotices.size() > 0) {
            decorationNotice = decorationNotices.get(0);
            jsonString = JSON.toJSONString(decorationNotice, SerializerFeature.WriteMapNullValue);
        }
        return jsonString;
    }

    /**
     * 装修申请
     *
     * @param request return
     */
    @RequestMapping(value = "/upload/batch", method = RequestMethod.POST)
    public @ResponseBody
    String batchUpload(HttpServletRequest request, DecorationMaterial decorationMaterial, DecorationApply decorationApply, DecorateDetail decorateDetail) {
        System.out.println("装修资料 = " + decorationMaterial);
        System.out.println("装修申请 = " + decorationApply);
        System.out.println("装修明细 = " + decorateDetail);
        try {
            //文件上传
            String s = fileUpload(request);
            //装修申请
            decorationApplyService.insertDecorationApply(decorationApply);
            //装修明细
            decorateDetailService.insert(decorateDetail);
            //装修资料
            decorationMaterialService.insert(decorationMaterial);
            return "申请成功!";
        } catch (Exception e) {
            return "申请失败!";
        }

    }

    /**
     *
     * @param file
     * @return
     */
    /*@RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                // 这里只是简单例子，文件直接输出到项目路径下。
                // 实际项目中，文件需要输出到指定位置，需要在增加代码处理。
                // 还有关于文件格式限制、文件大小限制，详见：中配置。
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(new File(file.getOriginalFilename())));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            }
            return "上传成功";
        } else {
            return "上传失败，因为文件是空的.";
        }
    }*/

    /**
     * 文件上传
     *
     * @param request
     * @return
     */
    private String fileUpload(HttpServletRequest request) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    stream = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
                    stream.write(bytes);
                    stream.close();
                } catch (Exception e) {
                    stream = null;
                    return "上传失败" + i + " => " + e.getMessage();
                }
            } else {
                return "上传失败 " + i + "文件是空的.";
            }
        }
        return "上传成功!";
    }


}
