package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.ReletApply;
import cn.rzhd.wuye.bean.RetreatLeaseApply;
import cn.rzhd.wuye.service.IReletApplyService;
import cn.rzhd.wuye.service.IRetreatLeaseApplyService;
import cn.rzhd.wuye.utils.IDUtils;
import cn.rzhd.wuye.vo.query.ApplyQuery;
import com.github.pagehelper.StringUtil;
import com.xiaoleilu.hutool.date.BetweenFormater;
import com.xiaoleilu.hutool.date.DateUtil;
import com.xiaoleilu.hutool.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
     *
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
     * @param model
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
     *
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
     *
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

            if (retreatLeaseApply.getLeaseEndTime() != null) {
                String s = DateUtil.formatBetween(retreatLeaseApply.getLeaseEndTime(), retreatLeaseApply.getRetreatLeaseTime(), BetweenFormater.Level.DAY);
                System.out.println("时间间隔*********************** = " + s.substring(0, s.length() - 1));

                if (!"0".equals(s.substring(0, s.length() - 1))) {
                    retreatLeaseApply.setRetreatLeaseType("提前退租");
                } else {
                    retreatLeaseApply.setRetreatLeaseType("正常退租");
                }
            }
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
    public Map<String, Object> findReletApply(String houseInfoId, String customerId) {
        Map<String, Object> result = new HashMap<>();
        if (StringUtil.isEmpty(houseInfoId)) {
            result.put("state", "0");
            result.put("msg", "房产ID不能为空");
            return result;
        }
        List<ReletApply> reletApply = reletApplyService.findReletApply(houseInfoId, customerId);
        if (reletApply.size() > 0) {
            result.put("state", "1");
            result.put("data", reletApply.get(0));
        }
        // String jsonString = JSON.toJSONString(reletApply);

        return result;
    }

    /**
     * 获取退租信息
     *
     * @param houseInfoId
     * @return
     */
    @RequestMapping("/dist/findRetreatLease")
    @ResponseBody
    public Map<String, Object> findRetreatLease(String houseInfoId, String customerId) {
        Map<String, Object> result = new HashMap<>();
        if (StrUtil.isEmpty(houseInfoId) && StrUtil.isEmpty(customerId)) {
            result.put("state", "0");
            result.put("msg", "ID不能为空");
            return result;
        }
        List<RetreatLeaseApply> retreatLeaseApply = retreatLeaseApplyService.findRetreatLeaseApply(houseInfoId, customerId);
        //  String jsonString = JSON.toJSONString(retreatLeaseApply);
        if (retreatLeaseApply.size() > 0) {
            result.put("state", "1");
            result.put("data", retreatLeaseApply.get(0));
        }
        return result;
    }

    /**
     * 查看续租信息
     *
     * @param reletApplyId
     * @param model
     * @return
     */
    @RequestMapping("reletApply/toReletApplyDeatail")
    public String toReletApplyDeatail(Long reletApplyId, Model model) {
        if (reletApplyId != null) {
            ReletApply reletApply = reletApplyService.selectByPrimaryKey(reletApplyId);
            model.addAttribute("reletApply", reletApply);
            return "rent/xuzuDetail";
        }
        model.addAttribute("msg", "ID不能为空!");
        return "redirect:/findReletApply";
    }

    /**
     * 编辑续租信息
     *
     * @param reletApply
     * @return
     */
    @RequestMapping("reletApply/updateReletApplyDeatail")
    public String updateReletApplyDeatail(ReletApply reletApply) {
        try {
            if (reletApply != null) {
                reletApplyService.updateByPrimaryKey(reletApply);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/findReletApply";
    }

    /**
     * 编辑退租信息
     *
     * @param retreatLeaseApply
     * @return
     */
    @RequestMapping("reletApply/updateReletApplyLeaseDeatail")
    public String updateReletApplyLeaseDeatail(RetreatLeaseApply retreatLeaseApply) {
        try {
            if (retreatLeaseApply != null) {
                retreatLeaseApplyService.updateByPrimaryKey(retreatLeaseApply);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/findRetreatLeaseApply";
    }

    /**
     * 查看退租信息
     *
     * @param retreatLeaseApplyId
     * @param model
     * @return
     */
    @RequestMapping("reletApply/toRetreatLeaseDeatail")
    public String toRetreatLeaseDeatail(Long retreatLeaseApplyId, Model model) {
        if (retreatLeaseApplyId != null) {
            RetreatLeaseApply retreatLeaseApply = retreatLeaseApplyService.selectByPrimaryKey(retreatLeaseApplyId);
            model.addAttribute("retreatLeaseApply", retreatLeaseApply);
            return "rent/tuizuDetail";
        }
        model.addAttribute("msg", "ID不能为空!");
        return "redirect:/findRetreatLeaseApply";
    }

    /**
     * 删除续租信息
     *
     * @param reletApplyId
     * @return
     */
    @RequestMapping("reletApply/deleteReletApplyDeatail")
    public String deleteReletApplyDeatail(Long reletApplyId) {
        if (reletApplyId != null) {
            reletApplyService.deleteByPrimaryKey(reletApplyId);
            return "redirect:/findReletApply";
        }
        return "redirect:/findReletApply";
    }

    /**
     * 删除退租信息
     *
     * @param retreatLeaseApplyId
     * @return
     */
    @RequestMapping("reletApply/deleteReletApplyLeaseDeatail")
    public String deleteReletApplyLeaseDeatail(Long retreatLeaseApplyId) {
        if (retreatLeaseApplyId != null) {
            retreatLeaseApplyService.deleteByPrimaryKey(retreatLeaseApplyId);
            return "redirect:/findRetreatLeaseApply";
        }
        return "redirect:/findRetreatLeaseApply";
    }


    @RequestMapping("reletApply/search")
    public String reletApplysearch(ApplyQuery query, Model model) {
        System.out.println("applyQuery = " + query);
        List<ReletApply> reletApplyList = reletApplyService.findEnterApplyByQuery(query);
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("reletApplys", reletApplyList);
        model.addAttribute("clientName", query.getClientName());
        model.addAttribute("startDate", query.getStartDate());
        model.addAttribute("endDate", query.getEndDate());
        return "rent/xuzuList";
    }

    @RequestMapping("retreatLeaseApply/search")
    public String retreatLeaseApplysearch(ApplyQuery query, Model model) {
        System.out.println("applyQuery = " + query);
        List<RetreatLeaseApply> retreatLeaseApplyList = retreatLeaseApplyService.findEnterApplyByQuery(query);
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("retreatLeaseApplies", retreatLeaseApplyList);
        model.addAttribute("clientName", query.getClientName());
        model.addAttribute("startDate", query.getStartDate());
        model.addAttribute("endDate", query.getEndDate());
        return "rent/tuizuList";
    }


}
