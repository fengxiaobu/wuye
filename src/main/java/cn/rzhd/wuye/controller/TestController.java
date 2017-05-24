package cn.rzhd.wuye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * luopa 在 2017/5/24 创建.
 */
@Controller
public class TestController {
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/userlist")
    public String test() {
        return "/user/userList";
    }
    @RequestMapping("/userEdit")
    public String userAdd() {
        return "/user/userEdit";
    }
}
