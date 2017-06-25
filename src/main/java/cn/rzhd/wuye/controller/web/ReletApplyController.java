package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.ReletApply;
import cn.rzhd.wuye.bean.RetreatLeaseApply;
import cn.rzhd.wuye.service.IReletApplyService;
import cn.rzhd.wuye.service.IRetreatLeaseApplyService;
import cn.rzhd.wuye.utils.IDUtils;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * luopa 在 2017/6/16 创建.
 * 退租续租
 */

@Controller
public class ReletApplyController {
    @Autowired
    IReletApplyService reletApplyService;
    @Autowired
    IRetreatLeaseApplyService retreatLeaseApplyService;

    /**
     * 续租申请
     *
     * @param reletApply
     * @return
     */
    @RequestMapping("/dist/insertReletApply")
    @ResponseBody
    public Map<String, Object> insertReletApply(ReletApply reletApply) {
        Map<String, Object> result = new HashMap<>();
        try {
            Date date = new Date();
            reletApply.setCreationTime(date);
            reletApply.setRetreaTime(date);
            // reletApply.setType(1);
            reletApply.setReletApplyId(IDUtils.genId15());

            if (StringUtil.isEmpty(reletApply.getHouseInfoId())) {
                result.put("state", "0");
                result.put("msg", "房产ID不能为空!");
                return result;
            }

            reletApplyService.insert(reletApply);
        } catch (Exception e) {
            result.put("state", "0");
            result.put("msg", "发生错误" + e.getMessage());
            return result;
        }
        result.put("state", "1");
        result.put("msg", "提交申请成功!");
        return result;
    }

    /**
     * 更新续租
     * @param reletApply
     * @param model
     * @return
     */
    @RequestMapping("/updateReletApply")
    public String updateReletApply(ReletApply reletApply, Model model) {
        Map<String, Object> result = new Hashtable<>();
        try {
            if (reletApply.getReletApplyId() == null) {
                model.addAttribute("msg", "错误");
            }
            reletApplyService.updateByPrimaryKey(reletApply);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "rent/xuzuList";
    }

    /**
     *
     * @param model
     *
     * @return
     */
    @RequestMapping("/findReletApply")
    public String findReletApply(Model model) {
        List<ReletApply> reletApplys = reletApplyService.selectAll();
        model.addAttribute("reletApplys", reletApplys);

        return "rent/xuzuList";
    }

    /**
     * 获取所有退租申请信息
     * @param model
     * @return
     */
    @RequestMapping("/findRetreatLeaseApply")
    public String findRetreatLeaseApply(Model model) {
        List<RetreatLeaseApply> retreatLeaseApplies = retreatLeaseApplyService.selectAll();
        model.addAttribute("retreatLeaseApplies", retreatLeaseApplies);
        return "rent/tuizuList";
    }

    /**
     * 根据房产ID获取退租申请信息
     * @param pkHouse
     * @return
     */
    @RequestMapping("/findRetreatLeaseApplyByHouseId")
    @ResponseBody
    public String findRetreatLeaseApplyByHouseId(String pkHouse) {
        List<RetreatLeaseApply> retreatLeaseApplies = retreatLeaseApplyService.selectAll();

        return "rent/xuzuList";
    }

    /**
     * 退租申请
     *
     * @param retreatLeaseApply
     * @return
     */
    @RequestMapping("/dist/insertRetreatLease")
    @ResponseBody
    public Map<String, Object> insertRetreatLeaseApply(RetreatLeaseApply retreatLeaseApply) {
        Map<String, Object> result = new HashMap<>();
        try {
            Date date = new Date();
            retreatLeaseApply.setCreationTime(date);
            retreatLeaseApply.setCreationTime(new Date());
            retreatLeaseApply.setRetreatLeaseTime(new Date());
            retreatLeaseApply.setRetreatLeaseApplyId(IDUtils.genId15());
            if (StringUtil.isEmpty(retreatLeaseApply.getHouseInfoId())) {
                result.put("state", "0");
                result.put("msg", "房产ID不能为空!");
                return result;
            }

            retreatLeaseApplyService.insert(retreatLeaseApply);
        } catch (Exception e) {
            result.put("state", "0");
            result.put("msg", "发生错误" + e.getMessage());
            return result;
        }
        result.put("state", "1");
        result.put("msg", "提交申请成功!");
        return result;
    }

    /**
     * 根据房产ID获取续租信息
     *
     * @param houseInfoId
     * @return
     */
    @RequestMapping("/dist/findReletApply")
    @ResponseBody
    public Map<String, Object> findReletApply(String houseInfoId) {
        Map<String, Object> result = new HashMap<>();
        if (StringUtil.isEmpty(houseInfoId)) {
            result.put("state", "0");
            result.put("msg", "房产ID不能为空");
            return result;
        }
        ReletApply reletApply = reletApplyService.findReletApply(houseInfoId);
        result.put("state", "1");
        result.put("data", reletApply);
        return result;
    }

    /**
     * 根据房产ID获取退租信息
     *
     * @param houseInfoId
     * @return
     */
    @RequestMapping("/dist/findRetreatLease")
    @ResponseBody
    public Map<String, Object> findRetreatLease(String houseInfoId) {
        Map<String, Object> result = new HashMap<>();
        if (StringUtil.isEmpty(houseInfoId)) {
            result.put("state", "0");
            result.put("msg", "房产ID不能为空");
            return result;
        }
        RetreatLeaseApply retreatLeaseApply = retreatLeaseApplyService.findRetreatLeaseApply(houseInfoId);
        result.put("state", "1");
        result.put("data", retreatLeaseApply);
        return result;
    }
}
