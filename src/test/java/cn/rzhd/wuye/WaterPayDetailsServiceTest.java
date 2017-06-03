package cn.rzhd.wuye;

import cn.rzhd.wuye.service.IWaterPayDetailsService;
import cn.rzhd.wuye.vo.WaterPayDetailsQuery;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hasee on 2017/6/2.
 */
public class WaterPayDetailsServiceTest extends BaseTest{

    @Autowired
    IWaterPayDetailsService service;

    @Test
    public void getWaterDetailsTest(){
        WaterPayDetailsQuery query = new WaterPayDetailsQuery();
        service.getAllByQuery(query);

    }
}
