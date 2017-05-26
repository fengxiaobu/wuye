package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.service.IEnterApplyService;
import cn.rzhd.wuye.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * luopa 在 2017/5/25 创建.
 * <h1>入驻申请Controller</h1>
 */
@Controller
@RequestMapping("/enterApply")
public class EnterApplyController {
    @Autowired
    IEnterApplyService enterApplyService;
    @Autowired
    IUserService userService;

    @RequestMapping("/getEnterApplyByID")
    @ResponseBody
    public EnterApply getEnterApplyByID() {
        EnterApply enterApply=enterApplyService.getEnterApplyByID(1694616565L);
        return enterApply;
    }

    @RequestMapping("/getEnterApplyAll")
    @ResponseBody
    public List<EnterApply> getEnterApplyAll() {
        List<EnterApply> enterApplyAll = enterApplyService.getEnterApplyAll();
        return enterApplyAll;
    }

    /**
     * 显示业务办理页面
     * @return
     */
    @RequestMapping("/enterApplyList")
    public String showEnterApplyList(Model model) {
        List<EnterApply> enterApplyList = enterApplyService.getEnterApplyAll();

        model.addAttribute("enterApplyList",enterApplyList);
        return "forbusiness/enterApplyList";
    }

    @RequestMapping("/getEnterApplyPage")
    public String getEnterApplyPage() {

        return "";
    }
}
