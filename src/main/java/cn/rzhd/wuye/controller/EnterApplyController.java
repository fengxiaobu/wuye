package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.service.IEnterApplyService;
import cn.rzhd.wuye.utils.JsonUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
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
            List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList(pageNum, pageSize);
            return JsonUtils.objectToJson(enterApplyList);
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
      /*  if (pageNum == null || pageNum <= 0) {
          //  return JsonUtils.objectToJson("当前页码无效");
        }
        if (pageSize == null || pageSize <= 0) {
          //  return JsonUtils.objectToJson("每页显示条数无效");
        }*/
        System.out.println("pageNum = " + pageNum);
        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyService.findEnterApplyList(pageNum, pageSize);
        model.addAttribute("enterApplyList", enterApplyList);
        return "forbusiness/enterApplyList";
    }

    @RequestMapping("/getEnterApplyPage")
    public String getEnterApplyPage() {

        return "";
    }
}
