package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.ReletApply;
import cn.rzhd.wuye.bean.RetreatLeaseApply;
import cn.rzhd.wuye.service.IReletApplyService;
import cn.rzhd.wuye.service.IRetreatLeaseApplyService;
import cn.rzhd.wuye.utils.IDUtils;
import jodd.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * luopa 在 2017/6/16 创建.
 * 退租续租
 */

@RestController("/dist")
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
    @RequestMapping("/insertReletApply")
    public Map<String, Object> insertReletApply(ReletApply reletApply) {
        Map<String, Object> result = new HashMap<>();
        Date date = new Date();
        reletApply.setCreationTime(date);
        reletApply.setRetreaTime(date);
        reletApply.setType(1);
        reletApply.setReletApplyId(IDUtils.genId15());

        if (StringUtil.isEmpty(reletApply.getHouseInfoId())) {
            result.put("state", "0");
            result.put("msg", "房产ID不能为空!");
            return result;
        }
        try {
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
     * 退租申请
     *
     * @param retreatLeaseApply
     * @return
     */
    @RequestMapping("/insertRetreatLease")
    public Map<String, Object> insertRetreatLeaseApply(RetreatLeaseApply retreatLeaseApply) {
        Map<String, Object> result = new HashMap<>();
        Date date = new Date();
        retreatLeaseApply.setCreationTime(date);

        if (StringUtil.isEmpty(retreatLeaseApply.getHouseInfoId())) {
            result.put("state", "0");
            result.put("msg", "房产ID不能为空!");
            return result;
        }
        try {
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

}
