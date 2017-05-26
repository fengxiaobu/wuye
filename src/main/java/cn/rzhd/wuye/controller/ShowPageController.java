package cn.rzhd.wuye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * luopa 在 2017/5/25 创建.
 * 显示首页
 */
@Controller
public class ShowPageController {
    @RequestMapping("/index")
    public String showIndex() {
        return "index";
    }
}
