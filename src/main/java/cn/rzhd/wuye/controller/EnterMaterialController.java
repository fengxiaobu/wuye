package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.EnterMaterial;
import cn.rzhd.wuye.bean.ProjectInfo;
import cn.rzhd.wuye.service.IEnterMaterialService;
import cn.rzhd.wuye.service.IProjectInfoService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/6/5 创建.
 */
@Controller
@RequestMapping("/dist/enterMaterial")
public class EnterMaterialController {
    @Autowired
    IEnterMaterialService enterMaterialService;
    @Autowired
    IProjectInfoService projectInfoService;

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
    public String toEnterMaterialAdd(Model model) {
        List<ProjectInfo> projectInfos = projectInfoService.selectPKAndName();
        model.addAttribute("projectInfos",projectInfos);
        return "forbusiness/enterMaterialAdd";
    }

    /**
     * 房产资料查询
     * 获取房产资料地址
     *
     * @param pkproject
     * @return
     */
    @RequestMapping("/findEnterMaterialBypkproject")
    @ResponseBody
    public String findEnterMaterialByHouseId(String pkproject) {
        if (StringUtil.isEmpty(pkproject)) {
            return "项目ID为空!";
        }
        PropertyFilter propertyFilter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                if (name.equalsIgnoreCase("user")) {
                    //false表示last字段将被排除在外
                    return false;
                }
                if (name.equalsIgnoreCase("userId")) {
                    //false表示last字段将被排除在外
                    return false;
                }
                return true;
            }
        };
        EnterMaterial material = enterMaterialService.findEnterMaterialBypkproject(pkproject.trim());

        String jsonString = JSON.toJSONString(material, propertyFilter);
        return jsonString;
    }
   @RequestMapping("/")
    public String toEnterMaterial(){

        return "forbusiness/enterApplyEdit";
    }
}
