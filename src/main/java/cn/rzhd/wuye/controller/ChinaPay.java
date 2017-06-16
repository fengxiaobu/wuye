package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.common.ChinaPayHelper;
import cn.rzhd.wuye.common.ChinaPaySignUtils;
import cn.rzhd.wuye.common.RequestVO;
import cn.rzhd.wuye.utils.BeanUtils;
import cn.rzhd.wuye.utils.HttpUtils;
import com.xiaoleilu.hutool.util.RandomUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * luopa 在 2017/6/1 创建.
 */
@Controller
public class ChinaPay {

    @RequestMapping("/topay")
    public String toPay() {
        return "/pay";
    }

    @RequestMapping("/pay")
    public String toChinaPay(Model model,RequestVO requestVO, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //前台页面传过来的
        ChinaPayHelper chinaPayHelper = new ChinaPayHelper();
        requestVO.setRemoteAddr(HttpUtils.getIpAddr(req));
        requestVO.setMerOrderNo(RandomUtil.randomString(32));
        requestVO.setBankInstNo("700000000000017");
        requestVO.setCommodityMsg("物业测试");
        requestVO.setMerResv("交易商品");
        // requestVO.setAcqCode("");
        RequestVO vo = chinaPayHelper.getSign(requestVO);

        Map<String, Object> objectMap = BeanUtils.objectToMap(vo);
        Map<String, Object> sign = ChinaPaySignUtils.sign(objectMap);
        resp.setCharacterEncoding("UTF-8");

        //签名
        model.addAttribute("Signature",sign.get("sign"));
        //版本
        model.addAttribute("Version", vo.getVersion());
        //接入类型
        model.addAttribute("AccessType", vo.getAccessType());
        //交易超时
        model.addAttribute("PayTimeOut", vo.getPayTimeOut());
        //商户号
        model.addAttribute("MerId", vo.getMerId());
        //商户商品ID
        model.addAttribute("MerOrderNo", vo.getMerOrderNo());
        //交易日期
        model.addAttribute("TranDate", vo.getTranDate());
        //交易时间
        model.addAttribute("TranTime", vo.getTranTime());
        //交易金额
        model.addAttribute("OrderAmt", vo.getOrderAmt());
        //业务类型
        model.addAttribute("BusiType", vo.getBusiType());
        //商户后台通知地址
        model.addAttribute("MerBgUrl", vo.getMerBgUrl());
        //防钓鱼客户浏览器IP
        model.addAttribute("RemoteAddr", vo.getRemoteAddr());
        //交易类型
        model.addAttribute("TranType", vo.getTranType());
        ////商户前台通知地址
        model.addAttribute("MerPageUrl", vo.getMerPageUrl());
        //交易币种
        model.addAttribute("CurryNo", vo.getCurryNo());
        //收单机构号
        //model.addAttribute("AcqCode", vo.getAcqCode());
        //支付机构代码
        model.addAttribute("BankInstNo", vo.getBankInstNo());
        //商品信息
        model.addAttribute("CommodityMsg", vo.getCommodityMsg());
        //商户私有域 原样返回
        model.addAttribute("MerResv", vo.getMerResv());
        //交易时间戳
        model.addAttribute("TimeStamp", vo.getTimeStamp());
        //model.addAttribute("TranReserved",vo.getTranReserved());
        return "toChinaPay";
    }

    @RequestMapping("/sendpay")
    @ResponseBody
    public  Map<String, Object> pay(RequestVO requestVO, HttpServletRequest req) throws IOException {
        //前台页面传过来的
        ChinaPayHelper chinaPayHelper = new ChinaPayHelper();
        requestVO.setRemoteAddr(HttpUtils.getIpAddr(req));
        requestVO.setMerOrderNo(RandomUtil.randomString(32));
        //requestVO.setBankInstNo("700000000000017");
        requestVO.setCommodityMsg("物业测试");
        requestVO.setMerResv("交易商品");
        // requestVO.setAcqCode("");
        RequestVO vo = chinaPayHelper.getSign(requestVO);

        Map<String, Object> objectMap = BeanUtils.objectToMap(vo);
        Map<String, Object> sign = ChinaPaySignUtils.sign(objectMap);
        objectMap.put("Signature", sign.get("sign"));
        return objectMap;
    }
}
