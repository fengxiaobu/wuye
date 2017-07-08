package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.*;
import cn.rzhd.wuye.service.*;
import cn.rzhd.wuye.utils.JsonResult;
import cn.rzhd.wuye.vo.PactVO;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.xiaoleilu.hutool.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by hasee on 2017/6/1.
 */
@RestController
@RequestMapping("/dist/customer")
public class LoginController {
    @Autowired
    ICustomerService customerService;
    @Autowired
    IRentContractService rentContractService;
    @Autowired
    IReletApplyService reletApplyService;
    @Autowired
    IRetreatLeaseApplyService retreatLeaseApplyService;
    @Autowired
    IHouseInfoDetailsService houseInfoDetailsService;
    @Autowired
    IEnterApplyService enterApplyService;
    
	private Producer captchaProducer = null;

	@Autowired
	public void setCaptchaProducer(Producer captchaProducer) {
		this.captchaProducer = captchaProducer;
	}

    /**
     * @param customer 通过Customer对象将vccode账号,password密码(未加密)封装起来
     * @return json对象, 包含房产id及房产名称
     */
    @RequestMapping("/login")
    public JsonResult login(@RequestBody Customer customer) {
    	
        List<Customer> customers = customerService.loginByPwd(customer);
        if (customers.isEmpty()) {
            return new JsonResult("账号或密码错误!!!");
        } else {
            JsonResult result = new JsonResult();
            //只取租赁客户
            for (Customer cus : customers) {
                List<PactVO> pactVOS = rentContractService.queryByCustomer(cus.getPk_customerid());
                for (PactVO vo : pactVOS) {
                    List<ReletApply> reletApply = reletApplyService.findReletApply(vo.getPk_house(), cus.getPk_customerid());
                    List<RetreatLeaseApply> retreatLeaseApply = retreatLeaseApplyService.findRetreatLeaseApply(vo.getPk_house(), cus.getPk_customerid());
                    //获取房产状态
                    HouseInfoDetails houseInfoDetails = houseInfoDetailsService.selectByPkHouse(vo.getPk_house());

                    EnterApply enterApply = enterApplyService.getEnterApply(vo.getPk_house(), cus.getPk_customerid());
                    if (reletApply.size() > 0) {
                        vo.setContractStatus("1");
                    } else if (retreatLeaseApply.size() > 0) {
                        vo.setContractStatus("-1");
                    } else {
                        vo.setContractStatus("0");
                    }
                    if (houseInfoDetails != null) {
                        vo.setHouseInfoDetails(houseInfoDetails);
                    }
                    if (enterApply != null) {
                        vo.setVdef5(JSON.toJSONString(enterApply));
                    }
                }
                cus.getHouseInfos().addAll(pactVOS);
            }
            result.getData().addAll(customers);

//            for (Customer cus : customers) {
//                String customerid = cus.getPk_customerid();
//                List<SignVO> signVOS = sellContractService.queryByCustomer(cus.getPk_customerid());
//                //List<PactVO> pactVOS = rentContractService.queryByCustomer(cus.getPk_customerid());
//                if (!signVOS.isEmpty()){
//                    result.getData().add(signVOS);
//                }
////                if (!pactVOS.isEmpty()){
////                    result.getData().add(pactVOS);
////                }
//            }
            return result;
        }
    }

    public Map<String, Object> getEnterApply(String pkHouse) {
        Map<String, Object> result = new HashMap<>();
        try {
            if (StrUtil.isEmpty(pkHouse)) {
                result.put("state", "0");
                result.put("msg", "ID不能为空!");
                return result;
            }
            List<Map<String, JsonFormat.Value>> mapList = enterApplyService.getEnterApplyByIDAndState(pkHouse);
            result.put("state", "1");
            result.put("data", JSON.toJSONString(mapList));
            return result;
        } catch (Exception e) {
            result.put("state", "0");
            result.put("msg", "erro" + e.getMessage());
            return result;
        }
    }
    
    
 // 生成验证码
 	@RequestMapping("/kaptcha.jpg")
 	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
 		// Set to expire far in the past.
 		response.setDateHeader("Expires", 0);
 		// Set standard HTTP/1.1 no-cache headers.
 		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
 		// Set IE extended HTTP/1.1 no-cache headers (use addHeader).
 		response.addHeader("Cache-Control", "post-check=0, pre-check=0");
 		// Set standard HTTP/1.0 no-cache header.
 		response.setHeader("Pragma", "no-cache");

 		// return a jpeg
 		response.setContentType("image/jpeg");

 		// create the text for the image
 		String capText = captchaProducer.createText();

 		// store the text in the session
 		request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);

 		// create the image with the text
 		BufferedImage bi = captchaProducer.createImage(capText);

 		ServletOutputStream out = response.getOutputStream();

 		// write the data out
 		ImageIO.write(bi, "jpg", out);
 		try {
 			out.flush();
 		} finally {
 			out.close();
 		}
 		return null;
 	}
}
