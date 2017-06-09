package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.Company;
import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.ICompanyService;
import cn.rzhd.wuye.service.IKfFeeService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import com.github.pagehelper.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by hasee on 2017/6/8.
 */
public class KfFeeServiceTest extends BaseTest {

    @Autowired
    IKfFeeService service;
    @Autowired
    ICompanyService companyService;

    @Test
    public void addKfFeeTest() {
        List<Company> list = companyService.getAll();
        RequesterVO req = new RequesterVO();
        req.setKey(LiandoServiceConstant.SERVICE_KEY);
        req.setBilltype(LiandoServiceConstant.DATA_TYPE_KF_FEE);
        for (Company company : list) {
            String pkCorp = company.getPkCorp();
            req.setPk_corp(pkCorp);
            String baseData = WebService.getBaseData(req);
            ResponseVO resp = JsonUtils.jsonToPojo(baseData, ResponseVO.class);
            if ("Y".equals(resp.getIssuccess()) && StringUtil.isEmpty(resp.getErrorinfo())) {
                FeeVO[] vos = resp.getFeedata();
                for (FeeVO vo : vos) {
                    service.addKfFee(vo);
                }

            }

        }

    }

    @Test
    public void timeTest() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String time1 = "2017-06-30";
        String time2 = "2017-06-30";
        String time3 = "2017-06-30";
        try {
            Date date1 = sdf.parse(time1);
            Date date2 = sdf.parse(time2);
            Date date3 = sdf.parse(time3);

            System.out.println(date1.getTime());
            System.out.println(date2.getTime());
            System.out.println(date3.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
