package cn.rzhd.wuye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * luopa 在 2017/5/25 创建.
 * 跳转页面
 */
@Controller
public class ShowPageController {
    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }

    @RequestMapping("/views/user/{page}")
    public String showUserPage(@PathVariable String page) {

        return "user/" + page;
    }


}
