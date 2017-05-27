package cn.rzhd.wuye;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.ISellContractService;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.RequesterVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hasee on 2017/5/26.
 */

public class SellContractServiceTest extends BaseTest {
    @Autowired
    ISellContractService service;

    @Test
    public void getSellContractTest(){
        String jsonStr = service.getSellContract(LiandoServiceConstant.DATA_TYPE_SIGN,"1031");
        System.out.println(jsonStr);
    }

    @Test
    public void getCompanyId(){
        RequesterVO vo = new RequesterVO();
        vo.setBilltype("CORP");
        String baseData = WebService.getBaseData(vo);
        System.out.println(baseData);
    }
}
