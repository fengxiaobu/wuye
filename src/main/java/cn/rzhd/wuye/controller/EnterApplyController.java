package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.service.IEnterApplyService;
import cn.rzhd.wuye.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * luopa 在 2017/5/25 创建.
 * 入驻申请Controller
 */
@Controller
public class EnterApplyController {
    @Autowired
    IEnterApplyService enterApplyService;
    @Autowired
    IUserService userService;

    @RequestMapping("/enterApply/getEnterApplyByID")
    @ResponseBody
    public EnterApply getEnterApplyByID() {
        EnterApply enterApply=enterApplyService.getEnterApplyByID(1694616565L);
        return enterApply;
    }

    @RequestMapping("/enterApply/getEnterApplyAll")
    @ResponseBody
    public List<EnterApply> getEnterApplyAll() {
        List<EnterApply> enterApplyAll = enterApplyService.getEnterApplyAll();
        return enterApplyAll;
    }

    @RequestMapping("/user")
    @ResponseBody
    public User getUser() {
        User user = userService.get(1L);
        return user;
    }
    /**
     * 显示业务办理页面
     *
     * @param page
     * @return
     */
    @RequestMapping("/views/forbusiness/enterApplyList")
    public String showEnterApplyList(@PathVariable String page, Model model) {
        List<EnterApply> enterApplyList = enterApplyService.getEnterApplyAll();
        model.addAttribute("enterApplyList",enterApplyList);
        return "forbusiness/" + page;
    }

}
