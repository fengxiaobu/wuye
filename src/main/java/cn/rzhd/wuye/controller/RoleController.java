package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.Role;
import cn.rzhd.wuye.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by hasee on 2017/7/2.
 */
@Controller
@RequestMapping("/admin/role")
public class RoleController {

    @Autowired
    IRoleService service;

    @RequestMapping("/roleIndex")
    public ModelAndView roleIndex(){
        ModelAndView mav = new ModelAndView();
        List<Role> roles = service.getAllRoles();
        mav.addObject("roles",roles);
        mav.setViewName("authority/roleList");
        return mav;
    }

    @RequestMapping("/roleDetails")
    public ModelAndView roleDetails(Long id){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("authority/roleEdit");
        return mav;
    }
}
