package cn.rzhd.wuye.controller.web;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.PerfectInformation;
import cn.rzhd.wuye.service.ICustomerCentreService;
import cn.rzhd.wuye.service.ICustomerService;
import cn.rzhd.wuye.service.IPerfectInformationService;
import cn.rzhd.wuye.utils.Client;
import cn.rzhd.wuye.utils.JsonUtils;

/**
 * © 2017 RZHD.CN
 *
 * @Package: cn.rzhd.wuye.controller.web
 * @ClassName: CustomerCentreController
 * @Description: 描述：个人中心
 * @author: an-wei.xie@rzhd.cn
 * @date: 2017年6月9日 上午11:39:06
 * @version: V1.0
 */

@RestController
@RequestMapping(value = "/dist/CustomerCentre", method = RequestMethod.POST)
public class CustomerCentreController{

	@Autowired
	IPerfectInformationService perfectInformationService;
	@Autowired
	ICustomerService customerService;
	@Autowired
	private ICustomerCentreService customerCentreService;

	/**
	 * 查询用户信息和入驻信息
	 *
	 * @param customer
	 * @return
	 */
	@RequestMapping(value = "/findCustomerInfo", method = RequestMethod.POST)
	public String findCustomerInfo(Customer customer) {
		List<Map<String, Object>> findCustomerInfo = customerCentreService.findCustomerInfo(customer);
		return JsonUtils.objectToJson(findCustomerInfo);
	}

	/**
	 * 修改logo
	 *
	 * @param customer
	 * @return
	 */

	@RequestMapping(value = "/updateLogo", method = RequestMethod.POST)
	public Map<String, String> updateLogo(String LOGO, String vccode, HttpServletRequest request) {
		Map<String, String> result = new HashMap<>();
		try {
			customerCentreService.updateLogo(LOGO, vccode);
			result.put("msg", "修改成功");
			return result;
		} catch (Exception e) {
			result.put("msg", "修改成功");
			return result;
		}
	}


	@RequestMapping(value = "/getVcode", method = RequestMethod.POST)
	public void getVcode(String bindingPhone,HttpSession httpSession) {
		String sn = "SDK-CSL-010-00073";
		String pwd = "22baa8)d-d5";
		
		String vcode = Client.createRandomVcode();
		
		try {
			Client client = new Client(sn, pwd);
			String content = URLEncoder.encode("您的验证码为：" + vcode + "【联东物业】", "utf8");
			
			httpSession.setAttribute("vcode", vcode); 
			System.out.println("获取："+vcode);
			
			String result_mt = client.mdsmssend(bindingPhone, content, "", "", "", "");
			System.out.print(result_mt);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 修改绑定号码
	 *
	 * @param customer
	 * @return
	 */
	@RequestMapping(value = "/updatePhone", method = RequestMethod.POST)
	public Map<String, String> updatePhone(HttpSession httpSession,String bindingPhone, String vccode,String verificationCode) {
		Map<String, String> result = new HashMap<>();
		
		
		String vcode = (String)httpSession.getAttribute("vcode");  
		System.out.println("获取后："+vcode);
		
		if (verificationCode.equals(vcode)) {
			customerCentreService.updatePhone(bindingPhone, vccode);
			result.put("msg", "修改成功");
		}
		result.put("msg", "修改失败");
		return result;
	}

	/**
	 * 修改密码
	 *
	 * @param customer
	 * @return
	 */
	@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
	public Map<String, String> updatePassword(String password, String vccode,String verificationCode) {
		Map<String, String> result = new HashMap<>();
		customerCentreService.updatePassword(password,vccode);
		return result;
	}

	/**
	 * 修改资料
	 *
	 * @param perfectInformation
	 * @return
	 */
	@RequestMapping(value = "/updatePerfectInformation", method = RequestMethod.POST)
	public void updatePerfectInformation(PerfectInformation perfectInformation, String Vccode) {
		perfectInformation.setPerfectInformationId(Vccode);
		perfectInformationService.updateByVccode(perfectInformation);
	}

	/**
	 * 完善资料
	 *
	 * @param perfectInformation
	 * @param Vccode
	 */
	@RequestMapping(value = "/savePerfectInformation", method = RequestMethod.POST)
	public Map<String, Object> savePerfectInformation(PerfectInformation perfectInformation, String houseInfoId) {
		Map<String, Object> result = new Hashtable<>();
		try {
			perfectInformation.setPerfectInformationId(houseInfoId);
			perfectInformation.setCarteTime(new Date());
			perfectInformationService.save(perfectInformation);
			customerService.updadteState("1", houseInfoId);
			result.put("state", "1");
			return result;
		} catch (Exception e) {
			result.put("state", "0");
			result.put("msg", e.getMessage());
			return result;
		}
	}

}
