package cn.rzhd.wuye.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.rzhd.wuye.common.BaseUpload;

@Controller
@Scope(value = "prototype")
@RequestMapping(value = "/test")
public class TestController extends BaseUpload {

    Logger log = Logger.getLogger(TestController.class);

    @RequestMapping("/uploadHeadPic")
    public String uploadHeadPic(@RequestParam("file") MultipartFile[] file, HttpServletRequest request,
            HttpServletResponse response) {
        try {
            super.uploads(file, "/upload/test/", request);
            //super.upload(file, "/upload/test/", request);
            response.getWriter().print(super.getFileName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
