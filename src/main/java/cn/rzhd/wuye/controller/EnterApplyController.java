package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.service.IEnterApplyService;
import cn.rzhd.wuye.utils.JsonUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/5/25 创建.
 * <h1>入驻申请Controller</h1>
 */
@Controller
@RequestMapping("/enterApply")
public class EnterApplyController {
    @Autowired
    IEnterApplyService enterApplyService;
    @RequestMapping("/getEnterApplyByID")
    @ResponseBody
    public EnterApply getEnterApplyByID() {
        EnterApply enterApply=enterApplyService.getEnterApplyByID(1694616565L);
        return enterApply;
    }

    @RequestMapping("/findEnterApplyList")
    @ResponseBody
    public String findEnterApplyList(Integer pageNum, Integer pageSize) {
        if (pageNum == null || pageNum <= 0) {
            return JsonUtils.objectToJson("当前页码无效");
        }
        if (pageSize == null || pageSize <= 0) {
            return JsonUtils.objectToJson("每页显示条数无效");
        }
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList();
            PageInfo pageInfo = new PageInfo(enterApplyList);
            Page page=(Page) enterApplyList;
            System.out.println("page = " + page);
            return JSONObject.toJSONString(pageInfo, SerializerFeature.WriteMapNullValue)+JSONObject.toJSONString(page, SerializerFeature.WriteMapNullValue);
        } catch (Exception e) {
            System.err.println("入驻申请列表分页查询失败");
            e.printStackTrace();
            return JsonUtils.objectToJson("异常");
        }
    }

    /**
     * 显示业务办理页面
     * @return
     */
    @RequestMapping("/enterApplyList")
    public String showEnterApplyList(Model model, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList();
        PageInfo pageInfo = new PageInfo(enterApplyList);

        Page page=(Page) enterApplyList;
         System.out.println(JSONObject.toJSONString(page,SerializerFeature.WriteMapNullValue));
        System.out.println(page);
        //List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList(pageNum, pageSize);
        model.addAttribute("enterApplyList", enterApplyList);

        model.addAttribute("pages", page.getPages());
        return "forbusiness/enterApplyList";
    }

    /**
     * 入驻申请编辑
     *
     * @return
     */
    @RequestMapping("/enterApplyEdit")
    public String toEnterApplyAdd(Model model, Long enterApplyId) {
        EnterApply enterApply = enterApplyService.getEnterApplyByID(enterApplyId);
        model.addAttribute("enterApply", enterApply);
        return "forbusiness/enterApplyEdit";
    }
}
