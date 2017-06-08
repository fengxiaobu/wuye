package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.EnterMaterial;
import cn.rzhd.wuye.service.IEnterMaterialService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
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

    /**
     * 房产资料查询
     *   获取房产资料地址
     * @param pkproject
     * @return
     */
    @RequestMapping("/findEnterMaterialByHouseId")
    @ResponseBody
    public String findEnterMaterialByHouseId(String pkproject) {
        if (StringUtil.isEmpty(pkproject)) {
            return "房产ID为空!";
        }
        EnterMaterial material = enterMaterialService.findEnterMaterialByHouseId(pkproject);
        String jsonString = JSON.toJSONString(material, SerializerFeature.WriteMapNullValue);
        return jsonString;
    }

    /**
     *
     * @param pkproject
     * @return
     */
    /*@RequestMapping("/downLoadEnterMaterial")
    @ResponseBody
    public String upLoadEnterMaterial(String pkproject) {
        if (StringUtil.isEmpty(pkproject)) {
            return "房产ID为空!";
        }
        EnterMaterial material = enterMaterialService.findEnterMaterialByHouseId(pkproject);
        String jsonString = JSON.toJSONString(material, SerializerFeature.WriteMapNullValue);
        return jsonString;
    }*/

/*
    *//**
     * 房产资料下载
     *
     * @param houseInfoId
     * @return
     *//*
    @RequestMapping("/downLoadEnterMaterial")
    @ResponseBody
    public String downLoadEnterMaterial(String houseInfoId) {
        if (houseInfoId == null || houseInfoId == "") {
            return "房产ID为空!";
        }
        EnterMaterial material = enterMaterialService.findEnterMaterialByHouseId(houseInfoId);
        String jsonString = JSON.toJSONString(material, SerializerFeature.WriteMapNullValue);
        return jsonString;
    }*/


}
