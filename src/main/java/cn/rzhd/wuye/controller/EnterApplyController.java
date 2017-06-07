package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.service.IEnterApplyService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.EnterApplyQuery;
import com.alibaba.fastjson.JSON;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
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

    /**
     * 根据ID查询
     *
     * @return
     */
    @RequestMapping("/getEnterApplyByID")
    @ResponseBody
    public String getEnterApplyByID() {
        EnterApply enterApply = enterApplyService.getEnterApplyByID(156156156L);
        String jsonString = JSON.toJSONString(enterApply);
        return jsonString;
    }

    /**
     * 查询接口
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
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
            //return JSONObject.toJSONString(pageInfo, SerializerFeature.WriteMapNullValue)+JSONObject.toJSONString(page, SerializerFeature.WriteMapNullValue);
            return JSONObject.toJSONString(page, SerializerFeature.WriteMapNullValue);
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
        Page page=(Page) enterApplyList;
        //System.out.println(JSONObject.toJSONString(page,SerializerFeature.WriteMapNullValue));
        System.out.println("page:" + page.getTotal());
        model.addAttribute("enterApplyList", enterApplyList);

        model.addAttribute("total", page.getTotal());
        return "forbusiness/enterApplyList";
    }

    /**
     * 入驻申请编辑
     *
     * @return
     */
    @RequestMapping(value = "/enterApplyEdit", method = RequestMethod.GET)
    public String toEnterApplyAdd(Model model, Long enterApplyId) {
        EnterApply enterApply = enterApplyService.getEnterApplyByID(enterApplyId);

        model.addAttribute("enterApply", enterApply);
        return "forbusiness/enterApplyEdit";
    }

    /**
     * 条件查询
     *
     * @param model
     * @param enterApplyQuery
     * @return
     */
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(Model model, EnterApplyQuery enterApplyQuery) {
        System.out.println("enterApplyQuery = " + enterApplyQuery.toString());
        PageHelper.startPage(1, 5);
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyByQuery(enterApplyQuery);
        Page page = (Page) enterApplyList;
        model.addAttribute("enterApplyList", enterApplyList);

        model.addAttribute("pages", page.getPages());
        return "forbusiness/enterApplyList";
    }

    /**
     * 修改入驻申请信息
     *
     * @param model
     * @param enterApply
     * @return
     */
    @RequestMapping("/updateEnterApply")
    public String updateEnterApply(Model model, EnterApply enterApply) {
        enterApplyService.updateEnterApply(enterApply);
        //查询更新数据
        PageHelper.startPage(1, 5);
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList();
        Page page = (Page) enterApplyList;
        System.out.println(JSONObject.toJSONString(page, SerializerFeature.WriteMapNullValue));
        model.addAttribute("enterApplyList", enterApplyList);
        model.addAttribute("pages", page.getPages());
        return "forbusiness/enterApplyList";
    }

    /**
     * 新增入驻申请
     * @param model
     * @param enterApply
     * @return
     */
    @RequestMapping("/insertEnterApply")
    public String insertEnterApply(Model model, EnterApply enterApply) {
        Date date = new Date();
        //String createDate = StringTimeUtil.format(date);
        enterApply.setApplyTime(date);
        enterApply.setCreationTime(date);
        enterApplyService.insertEnterApply(enterApply);

        //查询更新数据
        PageHelper.startPage(1, 5);
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList();
        Page page = (Page) enterApplyList;
        System.out.println(JSONObject.toJSONString(page, SerializerFeature.WriteMapNullValue));
        model.addAttribute("enterApplyList", enterApplyList);
        model.addAttribute("pages", page.getPages());
        return "forbusiness/enterApplyList";
    }

    /**
     * 删除入驻信息
     * @param model
     * @param enterApplyId
     * @return
     */
    @RequestMapping("/deleteEnterApply")
    public String deleteEnterApply(Model model, Long enterApplyId) {
        if (enterApplyId != null) {
            enterApplyService.deleteEnterApply(enterApplyId);
        }
        //查询更新数据
        PageHelper.startPage(1, 5);
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList();
        Page page = (Page) enterApplyList;
        System.out.println(JSONObject.toJSONString(page, SerializerFeature.WriteMapNullValue));
        model.addAttribute("enterApplyList", enterApplyList);
        model.addAttribute("pages", page.getPages());
        return "forbusiness/enterApplyList";
    }
}
