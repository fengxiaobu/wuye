package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.HouseInfo;
import cn.rzhd.wuye.service.IHouseInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hasee on 2017/5/25.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class HouseInfoServiceTest {
    @Autowired
    IHouseInfoService houseInfoService;

    @Test
    public void getByIdTest(){
        HouseInfo houseInfo = houseInfoService.getById(1L);
        System.out.println(houseInfo.getCustomerId());
    }
}
