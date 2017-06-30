package cn.rzhd.wuye;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.IBankAccountService;
import cn.rzhd.wuye.service.IFeeTypesService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.*;
import com.github.pagehelper.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hasee on 2017/6/28.
 */
public class BankAccountServiceTest extends BaseTest {

    @Autowired
    IBankAccountService service;
    @Autowired
    IFeeTypesService feeTypesService;

    @Test
    public void addAccountTest(){
        RequesterVO req = new RequesterVO();
        req.setKey(LiandoServiceConstant.SERVICE_KEY);
        req.setPk_corp("1031");
        req.setBilltype(LiandoServiceConstant.DATA_TYPE_BANK_ACCOUNT);
        List<FeeitemVO> list = feeTypesService.getAll();
        for (FeeitemVO vo : list) {
            req.setPk_feetype(vo.getPk_fee());
            String baseData = WebService.getBaseData(req);
            ResponseVO resp = JsonUtils.jsonToPojo(baseData, ResponseVO.class);
            if("Y".equals(resp.getIssuccess()) && StringUtil.isEmpty(resp.getErrorinfo())){
                FeeAccountVO feeAccountVO = resp.getFeeaccountdata();
                service.addAccount(feeAccountVO);
            }
        }

    }
}
