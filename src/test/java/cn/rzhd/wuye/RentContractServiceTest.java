package cn.rzhd.wuye;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.IRentContractService;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.RequesterVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hasee on 2017/5/26.
 */
public class RentContractServiceTest extends BaseTest {
    @Autowired
    IRentContractService rentContractService;

    @Test
    public void getRentContractTest(){
        String contract = rentContractService.getRentContract(LiandoServiceConstant.DATA_TYPE_PACT, "1031");
        System.out.println(contract);
    }

    @Test
    public void getCompanyId(){
        RequesterVO vo = new RequesterVO();
        vo.setBilltype("CORP");
        String baseData = WebService.getBaseData(vo);
        System.out.println(baseData);
    }
}
