package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.service.IEnterMaterialService;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/6/5 创建.
 */
@Controller
@RequestMapping("/enterMaterial")
public class EnterMaterialController {
    @Autowired
    IEnterMaterialService enterMaterialService;

    @RequestMapping("/findEnterMaterialList")
    public String findEnterMaterialList(Model model, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, JsonFormat.Value>> enterMaterialList = enterMaterialService.findEnterMaterialList();

        Page page = (Page) enterMaterialList;
        model.addAttribute("enterMaterialList", enterMaterialList);

        model.addAttribute("pages", page.getPages());
        return "forbusiness/enterMaterialList";
    }

    @RequestMapping("/toEnterMaterialAdd")
    public String toEnterMaterialAdd() {

        return "forbusiness/enterMaterialAdd";
    }

}
