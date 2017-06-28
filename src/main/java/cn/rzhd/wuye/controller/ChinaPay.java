package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.common.ChinaPayHelper;
import cn.rzhd.wuye.common.ChinaPaySignUtils;
import cn.rzhd.wuye.common.RequestVO;
import cn.rzhd.wuye.service.IKfFeePayDetailsService;
import cn.rzhd.wuye.service.IPropertyFeePayDetailsService;
import cn.rzhd.wuye.service.IUtilitiesService;
import cn.rzhd.wuye.utils.BeanUtils;
import cn.rzhd.wuye.utils.HttpUtils;
import cn.rzhd.wuye.vo.CallBackVO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.xiaoleilu.hutool.lang.Base64;
import com.xiaoleilu.hutool.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.*;

/**
 * luopa 在 2017/6/1 创建.
 */
@Controller
public class ChinaPay {

    @Autowired
    IPropertyFeePayDetailsService wuye;
    @Autowired
    IKfFeePayDetailsService kaifa;
    @Autowired
    IUtilitiesService shuidian;

    @RequestMapping("/topay")
    public String toPay() {
        return "/pay";
    }

    @RequestMapping("/pay")
    public String toChinaPay(Model model, RequestVO requestVO, HttpServletRequest req, HttpServletResponse resp) throws IOException {
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
        for (String s : objectMap.keySet()) {
            System.out.println("name = " + s + "    value=" + objectMap.get(s));

        }
        System.out.println("objectMap = " + objectMap);
        Map<String, Object> sign = ChinaPaySignUtils.sign(objectMap);
        resp.setCharacterEncoding("UTF-8");

        //签名
        model.addAttribute("Signature", sign.get("sign"));
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

/*    @RequestMapping("/dist/sendpay")
    @ResponseBody
    public Map<String, Object> pay(@RequestBody Map<String,String> map) throws IOException {

        RequestVO requestVO = BeanUtil.mapToBean(map, RequestVO.class, true);
        //前台页面传过来的
        ChinaPayHelper chinaPayHelper = new ChinaPayHelper();
        //requestVO.setRemoteAddr(HttpUtils.getIpAddr(req));
        requestVO.setMerOrderNo(RandomUtil.randomString(32));
        //requestVO.setBankInstNo("700000000000017");
        //requestVO.setCommodityMsg("物业测试");
        //requestVO.setMerResv("交易商品");
        // requestVO.setAcqCode("");//收单机构号
        RequestVO vo = chinaPayHelper.getSign(requestVO);
        System.out.println("requestVO = " + requestVO);
        Map<String, Object> objectMap = BeanUtils.objectToMap(vo);
        Map<String, Object> sign = ChinaPaySignUtils.sign(objectMap);
        objectMap.put("Signature", sign.get("sign"));
        objectMap.put("postUrl", "http://newpayment-test.chinapay.com/CTITS/service/rest/page/nref/000000000017/0/0/0/0/0");
        return objectMap;
    }*/

    @RequestMapping(value = "/dist/sendpay")
    public @ResponseBody
    Map<String, Object> pay(HttpServletRequest req, String orderAmt, String commodityMsg, String merResv, String bankInstNo) throws IOException {
        RequestVO requestVO = new RequestVO();
       // merResv = Base64.encodeUrlSafe(merResv);
        requestVO.setOrderAmt(orderAmt);
        requestVO.setCommodityMsg(commodityMsg);
        requestVO.setMerResv(merResv);
        requestVO.setBankInstNo(bankInstNo);
        System.out.println("requestVO = " + requestVO);
        System.out.println("Base64.decodeStr(merResv) = " + Base64.decodeStr(merResv));
        //前台页面传过来的
        ChinaPayHelper chinaPayHelper = new ChinaPayHelper();
        requestVO.setRemoteAddr(HttpUtils.getIpAddr(req));
        requestVO.setMerOrderNo(RandomUtil.randomString(32));
        //requestVO.setBankInstNo("700000000000017");
        //requestVO.setCommodityMsg("物业测试");
        //requestVO.setMerResv("交易商品");
        // requestVO.setAcqCode("");//收单机构号
        RequestVO vo = chinaPayHelper.getSign(requestVO);
        System.out.println("requestVO = " + requestVO);
        Map<String, Object> objectMap = BeanUtils.objectToMap(requestVO);
        // Map<String, Object> objectMap = BeanUtil.beanToMap(requestVO);
        Map<String, Object> sign = ChinaPaySignUtils.sign(objectMap);
        System.out.println("sign = " + sign);
        objectMap.put("Signature", sign.get("sign"));
        objectMap.put("postUrl", "http://newpayment-test.chinapay.com/CTITS/service/rest/page/nref/000000000017/0/0/0/0/0");
        return objectMap;
    }

    @RequestMapping("/bgReturn")
    public void bgReturn(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //解析 返回报文
        Enumeration<String> requestNames = request.getParameterNames();
        Map<String, String> resultMap = new HashMap<>();
        while (requestNames.hasMoreElements()) {
            String name = requestNames.nextElement();
            String value = request.getParameter(name);
            value = URLDecoder.decode(value, "UTF-8");
            resultMap.put(name, value);
        }

        //验证签名
        if (ChinaPayHelper.verify(resultMap)) {
            //验证成功调用方法使缴费记录生效
            JSONArray objects = JSON.parseArray(resultMap.get("MerResv"));
            Iterator<Object> iterator = objects.iterator();
            while (iterator.hasNext()) {
                CallBackVO vo = JSON.toJavaObject((JSON) iterator.next(), CallBackVO.class);
                if ("wuye".equals(vo.getType())) {
                    wuye.changeStatus(vo.getId());
                } else if ("kaifa".equals(vo.getType())) {
                    kaifa.changeStatus(vo.getId());
                } else if ("shuidian".equals(vo.getType())) {
                    shuidian.changeStatus(vo.getId());
                } else if ("rzwuye".equals(vo.getType())) {
                    request.getSession().setAttribute("rzwuye", "1");
                } else if ("rzkaifa".equals(vo.getType())) {
                    request.getSession().setAttribute("rzkaifa", "1");
                } else {
                    System.out.println("缴费记录生成失败:未知的缴费类型(物业,开发,水电)");
                }
            }

            System.out.println("*************************                               ******************************");
            System.out.println("*************************                               ******************************");
            System.out.println("***********************交易成功************************");
            System.out.println("*************************                               ******************************");
            response.getWriter().write("success  返回报文解析成功");
        } else {
            System.out.println("*************************                               ******************************");
            System.out.println("*************************                               ******************************");
            System.out.println("***********************交易失败************************");
            System.out.println("*************************                               ******************************");
            response.getWriter().write("fail");
        }
    }

    /**
     * 前台解析报文
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping("/pgReturn")
    public void pgReturn(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //解析 返回报文
        Enumeration<String> requestNames = request.getParameterNames();
        Map<String, String> resultMap = new HashMap<>();
        Map<String, Object> result = new HashMap<>();
        while (requestNames.hasMoreElements()) {
            String name = requestNames.nextElement();
            String value = request.getParameter(name);
            resultMap.put(name, value);
        }

        //验证签名
        if (ChinaPayHelper.verify(resultMap)) {
            result.put("state", "success");
            result.put("data", resultMap);
            //response.getWriter().write("success  返回报文解析成功");

        } else {
            // response.getWriter().write("fail");
            result.put("state", "fail");
            result.put("data", resultMap);
        }
        request.setAttribute("pay", result);
       /* for(Map.Entry<String, String> entry:resultMap.entrySet()){
            System.out.println("entry" + entry.getKey()+"   "+entry.getValue());
            request.setAttribute(entry.getKey(), entry.getValue());
        }*/
        //response.getWriter().write(result.toString());
        System.out.println("延签");
        request.getSession().setAttribute("pay", result);
        //转发请求到页面
        //return "forward:dist/pay";
    }

    @RequestMapping("/dist/pay")
    @ResponseBody
    public Map<String, Object> getResponsePay(HttpServletRequest request) {
        Map<String, Object> result = new HashMap<>();
        Object pay = request.getSession().getAttribute("pay");
        if (pay == null) {
            result.put("state", "0");
            result.put("msg", "未获取到数据!");
            return result;
        }
        result.put("state", "1");
        result.put("data", pay);
        request.getSession().removeAttribute("pay");
        System.out.println("删除session");
        return result;
    }

    /**
     * 获取入驻支付结果
     *
     * @param request
     * @return
     */
    @RequestMapping("dist/getPayState")
    @ResponseBody
    public Map<String, String> getPayState(HttpServletRequest request) {
        Map<String, String> result = new Hashtable<>();
        String rzkaifa = request.getSession().getAttribute("rzkaifa").toString();
        String rzwuye = request.getSession().getAttribute("rzwuye").toString();
        request.getSession().removeAttribute("rzkaifa");
        request.getSession().removeAttribute("rzwuye/");
        result.put("rzkaifa", rzkaifa);
        result.put("rzwuye", rzwuye);
        return result;
    }
}
