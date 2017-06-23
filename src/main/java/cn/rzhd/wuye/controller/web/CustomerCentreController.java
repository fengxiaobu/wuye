package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.PerfectInformation;
import cn.rzhd.wuye.service.ICustomerCentreService;
import cn.rzhd.wuye.service.ICustomerService;
import cn.rzhd.wuye.service.IPerfectInformationService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.utils.UploadHead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
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
    public void updateLogo(Customer customer, MultipartFile file, HttpServletRequest request) {
        UploadHead.uploadPic(file, request);
        customerCentreService.updateLogo(customer);
    }

    /**
     * 修改联系号码
     *
     * @param customer
     * @return
     */
    @RequestMapping(value = "/updatePhone", method = RequestMethod.POST)
    public String updatePhone(Customer customer) {
        customerCentreService.updatePhone(customer);
        return JsonUtils.objectToJson("success");
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
    public Map<String, Object> savePerfectInformation(PerfectInformation perfectInformation, String Vccode) {
        Map<String, Object> result = new Hashtable<>();
        try {
            perfectInformation.setPerfectInformationId(Vccode);
            perfectInformation.setCarteTime(new Date());
            perfectInformationService.save(perfectInformation);
            customerService.updadteState("1", Vccode);
            result.put("state", "1");
            return result;
        } catch (Exception e) {
            result.put("state", "0");
            result.put("msg", e.getMessage());
            return result;
        }
    }

}
