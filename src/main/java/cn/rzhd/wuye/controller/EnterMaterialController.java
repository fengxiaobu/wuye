package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.EnterMaterial;
import cn.rzhd.wuye.bean.ProjectInfo;
import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.service.IEnterMaterialService;
import cn.rzhd.wuye.service.IProjectInfoService;
import cn.rzhd.wuye.utils.UserContext;
import cn.rzhd.wuye.vo.query.ApplyQuery;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.xiaoleilu.hutool.date.DateUtil;
import com.xiaoleilu.hutool.util.RandomUtil;
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
        // PageHelper.startPage(pageNum, pageSize);
        List<Map<String, JsonFormat.Value>> enterMaterialList = enterMaterialService.findEnterMaterialList();

        // Page page = (Page) enterMaterialList;
        model.addAttribute("enterMaterialList", enterMaterialList);

        //model.addAttribute("pages", page.getPages());
        return "forbusiness/enterMaterialList";
    }

    @RequestMapping("/toEnterMaterialAdd")
    public String toEnterMaterialAdd(Model model) {
        List<ProjectInfo> projectInfos = projectInfoService.selectPKAndName();
        model.addAttribute("projectInfos", projectInfos);
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
        EnterMaterial material = enterMaterialService.findEnterMaterialBypkprojectId(pkproject.trim());

        String jsonString = JSON.toJSONString(material, propertyFilter);
        return jsonString;
    }

    /**
     * 编辑
     *
     * @param enterMaterialId
     * @param model
     * @return
     */
    @RequestMapping("/toEnterMaterial")
    public String toEnterMaterial(Long enterMaterialId, Model model) {
        EnterMaterial enterMaterialByKey = enterMaterialService.findEnterMaterialByKey(enterMaterialId);
        model.addAttribute("enterMaterial", enterMaterialByKey);
        return "forbusiness/enterMaterialEdit";
    }

    /**
     * 删除
     *
     * @param enterMaterialId
     * @param model
     * @return
     */
    @RequestMapping("/delEnterMaterial")
    public String delEnterMaterial(Long enterMaterialId, Model model) {
        if (enterMaterialId != null) {
            enterMaterialService.delEnterMaterial(enterMaterialId);
        }
        List<Map<String, JsonFormat.Value>> enterMaterialList = enterMaterialService.findEnterMaterialList();
        model.addAttribute("enterMaterialList", enterMaterialList);
        return "forbusiness/enterMaterialList";
    }

    /**
     * 搜索
     *
     * @param query
     * @param model
     * @return
     */
    @RequestMapping("/search")
    public String enterMaterialsearch(ApplyQuery query, Model model) {
        List<Map<String, JsonFormat.Value>> enterMaterialBypkproject = enterMaterialService.findEnterMaterialBypkproject(query);
        model.addAttribute("enterMaterialList", enterMaterialBypkproject);
        model.addAttribute("clientName", query.getClientName());
        model.addAttribute("startDate", query.getStartDate());
        model.addAttribute("endDate", query.getEndDate());
        return "forbusiness/enterMaterialList";
    }

    /**
     * 新增
     *
     * @param enterMaterial
     * @param model
     * @return
     */
    @RequestMapping("/insertEnterMaterial")
    public String insertEnterMaterial(EnterMaterial enterMaterial, Model model) {
        enterMaterial.setUpdateTime(DateUtil.date());
        enterMaterial.setEnterMaterialId(Long.valueOf(RandomUtil.randomNumbers(20)));
        User user = UserContext.getUser();
        System.out.println("user = " + user);
        enterMaterial.setUserId(user.getUserId());
        System.out.println("enterMaterial = " + enterMaterial);
        enterMaterialService.insertEnterMaterial(enterMaterial);
        List<Map<String, JsonFormat.Value>> enterMaterialList = enterMaterialService.findEnterMaterialList();
        model.addAttribute("enterMaterialList", enterMaterialList);
        return "forbusiness/enterMaterialList";
    }

}
