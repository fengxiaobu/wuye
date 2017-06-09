package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.ElectricFeePayDetails;
import cn.rzhd.wuye.service.IElectricPayDetailsService;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hasee on 2017/6/3.
 */
public class ElectricPayDetailsServiceTest extends BaseTest {

    @Autowired
    IElectricPayDetailsService service;

    @Test
    public void queryAllTest(){
        UtilitiesQuery query = new UtilitiesQuery();
        query.setHouseInfoId(123L);
        List<ElectricFeePayDetails> list = service.queryAll(query);
        for (ElectricFeePayDetails details : list) {
            System.out.println(details);
        }

    }
}
