package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.PerfectInformation;
import cn.rzhd.wuye.service.ICustomerCentreService;
import cn.rzhd.wuye.service.ICustomerService;
import cn.rzhd.wuye.service.IHouseInfoDetailsService;
import cn.rzhd.wuye.service.IPerfectInformationService;
import cn.rzhd.wuye.utils.Client;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xiaoleilu.hutool.util.StrUtil;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;

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
@RequestMapping("/dist/CustomerCentre")
public class CustomerCentreController {

	@Autowired
	IPerfectInformationService perfectInformationService;
	@Autowired
	ICustomerService customerService;
	@Autowired
	private ICustomerCentreService customerCentreService;
	@Autowired
	IHouseInfoDetailsService houseInfoDetailsService;

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
	
	/**
	 * 重置密码获取验证码
	 * */
	@RequestMapping(value = "/getVcodeReset", method = RequestMethod.POST)
	public Map<String, String> getVcodeReset(String bindingPhone) {
		Map<String, String> result = new HashMap<>();
		List<String> allPhone = customerService.allPhone();
		//包含则绑定了，不包含则没绑定
		if (allPhone.contains(bindingPhone)) {
			result.put("state", "0");
			result.put("msg", "该手机号已绑定");
			try {
				String vcode = Client.createRandomVcode();
				String sn = "SDK-CSL-010-00073";
				String pwd = "22baa8)d-d5";
				
				Client client = new Client(sn, pwd);
				String content = URLEncoder.encode("您的验证码为：" + vcode + "【联东物业】", "utf8");
				
				String result_mt = client.mdsmssend(bindingPhone, content, "", "", "", "");
				System.out.print(result_mt);
				result.put("vcode", vcode);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			result.put("state", "1");
			result.put("msg", "该手机号未绑定");
		}
		return result;
	}
	
	/**
	 * 修改手机号获取验证码
	 * */
	@RequestMapping(value = "/getVcodeModify", method = RequestMethod.POST)
	public Map<String, String> getVcodeModify(String bindingPhone) {
		Map<String, String> result = new HashMap<>();
		List<String> allPhone = customerService.allPhone();
		//包含则绑定了，不包含则没绑定
		if (allPhone.contains(bindingPhone)) {
			result.put("state", "0");
			result.put("msg", "该手机号已绑定");
		}else {
			result.put("state", "1");
			result.put("msg", "该手机号未绑定");
			try {
				String vcode = Client.createRandomVcode();
				String sn = "SDK-CSL-010-00073";
				String pwd = "22baa8)d-d5";
				
				Client client = new Client(sn, pwd);
				String content = URLEncoder.encode("您的验证码为：" + vcode + "【联东物业】", "utf8");
				
				String result_mt = client.mdsmssend(bindingPhone, content, "", "", "", "");
				System.out.print(result_mt);
				result.put("vcode", vcode);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 修改绑定号码
	 *
	 * @return
	 */
	@RequestMapping("/updatePhone")
	public Map<String, String> updatePhone(String bindingPhone, String vccode, String password) {
		Map<String, String> result = new HashMap<>();
		String pwd = customerCentreService.getPassword(vccode);
		password = MD5Utils.md5(password);
		if (password.equals(pwd)) {
			try {
				customerCentreService.updatePhone(bindingPhone, vccode);
				result.put("message", "修改成功");
			} catch (Exception e) {
				e.printStackTrace();
				result.put("message", "修改失败");
			}
			result.put("state", "0");
			result.put("msg", "密码正确");
		}else {
			result.put("state", "1");
			result.put("msg", "密码错误");
		}
		return result;
	}


	/**
	 * 完善资料
	 *
	 * @param perfectInformation
	 */
	@RequestMapping(value = "/savePerfectInformation", method = RequestMethod.POST)
	public Map<String, Object> savePerfectInformation(PerfectInformation perfectInformation, String houseInfoId) {
		Map<String, Object> result = new Hashtable<>();
		
			if (StrUtil.isBlank(String.valueOf(perfectInformation.getPerfectInformationId()))) {
				//保存
				try {
					perfectInformation.setPerfectInformationId(houseInfoId);
					perfectInformation.setCarteTime(new Date());
					perfectInformationService.save(perfectInformation);
					houseInfoDetailsService.updadteState("1", houseInfoId);
					result.put("state", "1");
					result.put("msg", "成功");
				} catch (Exception e) {
					result.put("state", "0");
					result.put("msg", e.getMessage());
					return result;
				}
			}else {
				try {
					perfectInformation.setUpdateTime(new Date());
					//修改
					perfectInformationService.updateByHouseInfoId(perfectInformation);
					result.put("state", "1");
					result.put("msg", "成功");
				} catch (Exception e) {
					result.put("state", "0");
					result.put("msg", e.getMessage());
					return result;
				}
			}
			return result;
		} 
	
	
	@RequestMapping("/getPerfectInformation")
	public PerfectInformation getPerfectInformation(String houseInfoId) {
		PerfectInformation perfectInformation = perfectInformationService.getByHouseInfoId(houseInfoId);
		return perfectInformation;
	}
	
	/**
	 * 修改密码
	 * */
	@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
	public Map<String, String> findPassword(String bindingPhone, String password) {
		Map<String, String> result = new HashMap<>();
		try {
			customerCentreService.findPassword(password, bindingPhone);
			result.put("state", "0");
			result.put("msg", "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("state", "1");
			result.put("msg", "修改失败");
		}
		return result;
	}

	
}
