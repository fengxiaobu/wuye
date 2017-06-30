package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.PerfectInformation;
import cn.rzhd.wuye.service.ICustomerCentreService;
import cn.rzhd.wuye.service.ICustomerService;
import cn.rzhd.wuye.service.IPerfectInformationService;
import cn.rzhd.wuye.utils.Client;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.utils.UploadHead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jcraft.jsch.Session;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

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
public class CustomerCentreController extends HttpServlet {

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

	String vcode = Client.createRandomVcode();

	@RequestMapping(value = "/getVcode", method = RequestMethod.POST)
	public String getVcode(String bindingPhone) {
		String sn = "SDK-CSL-010-00073";
		String pwd = "22baa8)d-d5";
		try {
			Client client = new Client(sn, pwd);
			String content = URLEncoder.encode("您的验证码为：" + vcode + "【联东物业】", "utf8");

			String result_mt = client.mdsmssend(bindingPhone, content, "", "", "", "");
			System.out.print(result_mt);
			
			return vcode;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 修改绑定号码
	 *
	 * @param customer
	 * @return
	 */
	@RequestMapping(value = "/updatePhone", method = RequestMethod.POST)
	public Map<String, String> updatePhone(String bindingPhone, String vccode) {
		Map<String, String> result = new HashMap<>();

		try {
			customerCentreService.updatePhone(bindingPhone, vccode);
			result.put("msg", "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		result.put("msg", "修改失败");
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

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
		Map<String, String> result = new HashMap<>();

		String savePath = request.getServletContext().getRealPath("/upload/");
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy_MM_dd");// 设置日期格式
		SimpleDateFormat df2 = new SimpleDateFormat("HH_mm_ss_SSSS");// 设置日期格式
		String dateDir1 = df1.format(new Date());// new Date()为获取当前系统时间
		String dateDir2 = df2.format(new Date());// new Date()为获取当前系统时间
		String serviceName = file.getOriginalFilename().substring(0, file.getOriginalFilename().lastIndexOf("."))
				+ file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

		File tempFile = new File(savePath + dateDir1 + "/" + dateDir2 + File.separator + serviceName);
		String path = "/upload/" + dateDir1 + "/" + dateDir2 + File.separator + serviceName;
		if (!tempFile.getParentFile().exists()) {
			tempFile.getParentFile().mkdirs();
		}
		if (!file.isEmpty()) {
			try {
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(tempFile));
				out.write(file.getBytes());
				out.flush();
				out.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				result.put("state", "0");
				result.put("msg", "文件找不到");
				return result;
			} catch (IOException e) {
				e.printStackTrace();
				result.put("state", "0");
				result.put("msg", "上传失败," + e.getMessage());
				return result;
			}
			result.put("state", "1");
			result.put("msg", "上传成功");
			result.put("url", path);
			return result;
		} else {
			result.put("state", "0");
			result.put("msg", "上传失败，因为文件是空的");
			return result;
		}
	}
}
