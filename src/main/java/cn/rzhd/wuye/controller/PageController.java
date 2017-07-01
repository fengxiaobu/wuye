package cn.rzhd.wuye.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName PortController
 * @Description 通用页面跳转
 * @author qinjuncai
 * @Date 2017年6月22日 下午9:14:16
 * @version 1.0.0
 */
@Controller
@RequestMapping("/page/")
public class PageController {

    
    /**
     * 通用菜单跳转
     * 
     * @param pageName
     *            需要跳转的页面
     * @param projectId
     *            项目id
     * @param model
     * @return
     */
    @RequestMapping(value = "{menu}/{mod}/{pageName}", method = RequestMethod.GET)
    public String toPage(@PathVariable("menu") String menu, @PathVariable("mod") String mod,@PathVariable("pageName") String pageName, Model model,
            HttpServletRequest request) {

        return menu + "/" + mod + "/" + pageName;
    }
    /**
     * 通用菜单跳转
     * 
     * @param pageName
     *            需要跳转的页面
     * @param projectId
     *            项目id
     * @param model
     * @return
     */
    @RequestMapping(value = "{menu}/{pageName}", method = RequestMethod.GET)
    public String toPage(@PathVariable("menu") String menu, @PathVariable("pageName") String pageName, Model model,
            HttpServletRequest request) {

        return menu + "/" + pageName;
    }
   
}
