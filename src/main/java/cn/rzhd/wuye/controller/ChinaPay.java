package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.common.ChinaPayHelper;
import cn.rzhd.wuye.common.ChinaPaySignUtils;
import cn.rzhd.wuye.common.RequestVO;
import cn.rzhd.wuye.pay.unionpay.LogUtil;
import cn.rzhd.wuye.service.*;
import cn.rzhd.wuye.utils.BeanUtils;
import cn.rzhd.wuye.utils.HttpUtils;
import cn.rzhd.wuye.vo.CallBackVO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.xiaoleilu.hutool.date.DateField;
import com.xiaoleilu.hutool.date.DateUtil;
import com.xiaoleilu.hutool.lang.Base64;
import com.xiaoleilu.hutool.util.BeanUtil;
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
    private IPropertyFeePayDetailsService wuye;
    @Autowired
    private IKfFeePayDetailsService kaifa;
    @Autowired
    private IUtilitiesService shuidian;
    @Autowired
    private IEnterApplyService enterApplyService;
    @Autowired
    private IDecorationApplyService decorationApplyService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IHouseInfoDetailsService houseInfoDetailsService;
    @Autowired
    private IPayFeeRecordsService payFeeRecordsService;
    @Autowired
    private IPropertyFeeInvoiceService wuyeInvoice;
    @Autowired
    private IKfFeeInvoiceService kaifaInvoice;
    @Autowired
    private IUtilitiesInvoiceService shuidianInvoice;

    @RequestMapping("/topay")
    public String toPay() {
        return "/pay";
    }

    @RequestMapping("/pay")
    public String toChinaPay(Model model, RequestVO requestVO, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //前台页面传过来的
        ChinaPayHelper chinaPayHelper = new ChinaPayHelper();
        requestVO.setRemoteAddr(HttpUtils.getIpAddr(req));
        requestVO.setMerOrderNo(RandomUtil.randomNumbers(23));
        //requestVO.setBankInstNo("700000000000017");
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

    @RequestMapping(value = "/dist/sendpay")
    public @ResponseBody
    Map<String, Object> pay(HttpServletRequest req, String orderAmt, String commodityMsg, String merResv, String bankInstNo) throws IOException {
        RequestVO requestVO = new RequestVO();
        ChinaPayHelper chinaPayHelper = new ChinaPayHelper();

        // requestVO.setOrderAmt(orderAmt);
        requestVO.setOrderAmt(orderAmt);
        requestVO.setCommodityMsg(commodityMsg);
        requestVO.setMerResv(merResv);
        requestVO.setBankInstNo(bankInstNo);
        requestVO.setMerOrderNo(RandomUtil.randomNumbers(22));

        // requestVO.setRemoteAddr(HttpUtils.getIpAddr(req));
        //requestVO.setBankInstNo("700000000000017");
        //requestVO.setCommodityMsg("物业测试");
        //requestVO.setMerResv("交易商品");
        // requestVO.setAcqCode("");//收单机构号
        RequestVO vo = chinaPayHelper.getSign(requestVO);
        System.out.println("requestVO = " + requestVO);
        Map<String, Object> objectMap = BeanUtils.objectToMap(requestVO);
        Map<String, Object> sign = ChinaPaySignUtils.sign(objectMap);
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
            String merResv = Base64.decodeStr(resultMap.get("MerResv"));
            System.out.println("----------------------------解析Base64" + merResv);
            JSONArray objects = JSON.parseArray(merResv);
            System.out.println("---------------------------------解析JSON" + objects);
            Iterator<Object> iterator = objects.iterator();
            System.out.println("---------------------------获得迭代器" + iterator);
            while (iterator.hasNext()) {
                CallBackVO vo = JSON.toJavaObject((JSON) iterator.next(), CallBackVO.class);
                System.out.println("-----------------------------------------------------------------");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("-----------------------------------------------------------------");
              //  System.out.println("费用类型:" + vo.getType() + ",费用记录ID:" + vo.getId());
                System.out.println("-----------------------------------------------------------------");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("-----------------------------------------------------------------");
                String id = vo.getId();
                String type = payFeeRecordsService.getTypeById(id);
                /**
                 * 修改缴费详情记录状态为可见
                 * 修改开票记录状态为可见
                 */
                if("物业".equals(type)){
                    wuye.changeStatusByRecordsId(id);
                    wuyeInvoice.changeStatusByRecordsId(id);
                    wuye.updateToERP(id);
                }else if("开发".equals(type)){
                    kaifa.changeStatusByRecordsId(id);
                    kaifaInvoice.changeStatusByRecordsId(id);
                    kaifa.updateToERP(id);
                }else if("水电".equals(type)){
                    shuidian.changeStatusByRecordsId(id);
                    shuidianInvoice.changeStatusByRecordsId(id);
                    //shuidian.updateToERP(id);
                }

                if ("rzwuye".equals(vo.getType())) {
                    enterApplyService.updatePayState("1", null, vo.getApplyId());
                } else if ("rzkaifa".equals(vo.getType())) {
                    enterApplyService.updatePayState(null, "1", vo.getApplyId());
                } else if ("zxfy".equals(vo.getType())) {
                    decorationApplyService.updatePayState("1", vo.getApplyId());
                } else {
                    System.out.println("缴费记录生成失败:未知的缴费类型(物业,开发,水电)");
                }
            }
            System.out.println("*************************                               ******************************");
            System.out.println("*************************                               ******************************");
            System.out.println("***********************返回报文解析成功************************");
            System.out.println("*************************                               ******************************");
            // response.getWriter().write("success  返回报文解析成功");
        } else {
            System.out.println("*************************                               ******************************");
            System.out.println("*************************                               ******************************");
            System.out.println("***********************交易失败************************");
            System.out.println("*************************                               ******************************");
            // response.getWriter().write("fail");
        }
    }

    /*@RequestMapping("/dist/pay")
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
    }*/

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

        System.out.println("验签" + result);
        request.getSession().setAttribute("pay", result);
    }


    /**
     * 扫码支付
     *
     * @param req
     * @param orderAmt
     * @param commodityMsg
     * @param merResv
     * @return
     * @throws IOException
     */
    @RequestMapping("dist/scanCodePay")
    @ResponseBody
    public Map<String, Object> scanCodePay(HttpServletRequest req, String orderAmt, String commodityMsg, String merResv) throws IOException {
        RequestVO requestVO = new RequestVO();
        //失效时间
        String OrderValidTime = DateUtil.format(DateUtil.offset(new Date(), DateField.SECOND, 120), "YYYYMMDDHHMMSS");
        Map<String, String> map = new Hashtable<>();
        map.put("OrderType", "0001");
        map.put("OrderValidTime", OrderValidTime);
        map.put("qrPattern", "link");
        String OrderReserved = JSON.toJSONString(map);

        requestVO.setOrderReserved(OrderReserved);
        requestVO.setOrderAmt("10");
        requestVO.setCommodityMsg(commodityMsg);
        requestVO.setMerResv(merResv);
        System.out.println("requestVO = " + requestVO);
        System.out.println("Base64.decodeStr(merResv) = " + Base64.decodeStr(merResv));
        //前台页面传过来的
        ChinaPayHelper chinaPayHelper = new ChinaPayHelper();
        requestVO.setRemoteAddr(HttpUtils.getIpAddr(req));
        requestVO.setMerOrderNo(RandomUtil.randomString(32));
        //签名
        LogUtil.writeMessage("开始签名");
        RequestVO vo = chinaPayHelper.getSign(requestVO);
        System.out.println("requestVO = " + requestVO);
        Map<String, Object> objectMap = BeanUtils.objectToMap(requestVO);
        // Map<String, Object> objectMap = BeanUtil.beanToMap(requestVO);
        Map<String, Object> sign = ChinaPaySignUtils.sign(objectMap);
        System.out.println("sign = " + sign);
        objectMap.put("Signature", sign.get("sign"));
        objectMap.put("postUrl", "http://140.206.112.241:9080/momsMgr/bgTransGet");

        return objectMap;
    }

    /**
     * 临时改变支付状态
     *
     * @param merResv
     * @return
     */
    @RequestMapping("dist/updatePayState")
    @ResponseBody
    public Map<String, String> updatePayState(String merResv) {
        Map<String, String> result = new Hashtable<>();
        try {
            merResv = Base64.decodeStr(merResv);
            JSONArray objects = JSON.parseArray(merResv);
            System.out.println("---------------------------------解析JSON" + objects);
            Iterator<Object> iterator = objects.iterator();
            System.out.println("---------------------------获得迭代器" + iterator);
            while (iterator.hasNext()) {
                CallBackVO vo = JSON.toJavaObject((JSON) iterator.next(), CallBackVO.class);
                System.out.println("-----------------------------------------------------------------");
               // System.out.println("费用类型:" + vo.getType() + ",费用记录ID:" + vo.getId());
                System.out.println("-----------------------------------------------------------------");
                /**
                 * 修改缴费详情记录状态为可见
                 * 修改开票记录状态为可见
                 */
                String id = vo.getId();
                String type = payFeeRecordsService.getTypeById(id);
                if("物业".equals(type)){
                    wuye.changeStatusByRecordsId(id);
                    wuyeInvoice.changeStatusByRecordsId(id);
                    wuye.updateToERP(id);
                }else if("开发".equals(type)){
                    kaifa.changeStatusByRecordsId(id);
                    kaifaInvoice.changeStatusByRecordsId(id);
                    kaifa.updateToERP(id);
                }else if("水电".equals(type)){
                    shuidian.changeStatusByRecordsId(id);
                    shuidianInvoice.changeStatusByRecordsId(id);
                    //shuidian.updateToERP(id);
                }
                if ("rzwuye".equals(vo.getType())) {
                    List<Map<String, JsonFormat.Value>> enterApplyByID = enterApplyService.getEnterApplyByID(vo.getApplyId());
                    if (enterApplyByID.size() > 0) {
                        Map<String, JsonFormat.Value> stringValueMap = enterApplyByID.get(0);
                        EnterApply enterApply = BeanUtil.mapToBean(stringValueMap, EnterApply.class, true);
                        enterApplyService.updatePayState("1", null, enterApply.getEnterApplyId());
                        if ("1".equals(enterApply.getKfState())) {
                            houseInfoDetailsService.updateHouse(String.valueOf(enterApply.getEnterApplyId()), "3", null);
                        }
                    }
                    //wuye.changeStatus(vo.getId());
                    result.put("msg", "rzwuye");
                } else if ("rzkaifa".equals(vo.getType())) {
                    List<Map<String, JsonFormat.Value>> enterApplyByID = enterApplyService.getEnterApplyByID(vo.getApplyId());
                    if (enterApplyByID.size() > 0) {
                        Map<String, JsonFormat.Value> stringValueMap = enterApplyByID.get(0);
                        EnterApply enterApply = BeanUtil.mapToBean(stringValueMap, EnterApply.class, true);
                        enterApplyService.updatePayState(null, "1", enterApply.getEnterApplyId());
                        if ("1".equals(enterApply.getWyState())) {
                            enterApplyService.updatePayState(null, "3", vo.getApplyId());
                        }
                    }
                   // kaifa.changeStatus(vo.getId());
                    result.put("msg", "rzkaifa");
                } else if ("zxfy".equals(vo.getType())) {
                    houseInfoDetailsService.updateHouse(String.valueOf(vo.getApplyId()), null, "3");
                     decorationApplyService.updatePayState("3", vo.getApplyId());
                   // wuye.changeStatus(vo.getId());
                    result.put("msg", "zxfy");
                } else {
                    System.out.println("缴费记录生成失败:未知的缴费类型(物业,开发,水电)");
                    result.put("msg", "缴费记录生成失败:未知的缴费类型(物业,开发,水电)");
                    result.put("state", "0");
                    return result;
                }
                result.put("state", "1");
                return result;
            }
        } catch (Exception e) {
            result.put("msg", "erro" + e.getMessage());
            result.put("state", "0");
            e.printStackTrace();
            return result;
        }
        result.put("msg", "未知错误!");
        result.put("state", "0");
        return result;
    }

    public void test() {
        Date date = new Date();
        String format = DateUtil.format(date, "yyyyMMddHHmmss");
        System.out.println("format = " + format);
        String OrderValidTime = DateUtil.format(DateUtil.offsetSecond(new Date(), 120), "YYYYMMDDHHMMSS");
        System.out.println(OrderValidTime);
        System.out.println(DateUtil.parse("20161119170100", "YYYYMMDDHHMMSS"));
        Map<String, String> map = new Hashtable<>();
        map.put("OrderType", "0001");
        map.put("OrderValidTime", OrderValidTime);
        map.put("qrPattern", "link");
        String OrderReserved = JSON.toJSONString(map);
        System.out.println("jsonString = " + OrderReserved);
    }
}
