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
    
    @Test
    public void getAllTest(){
        for (HouseInfo houseInfo : houseInfoService.getAll()) {
            System.out.println(houseInfo.getHouseProperty());
        }
    }

    @Test
    public void insertTest(){
        HouseInfo houseInfo = new HouseInfo();
        houseInfo.setCustomerId("xxx");
        houseInfo.setEnterStatus(1);
        houseInfo.setErpHouseId("asdf");
        houseInfo.setHouseProperty("TestTest");
        houseInfo.setProjectInfoId(123L);
        houseInfo.setStarLevel(3);
        houseInfo.setStatus(1);
        houseInfoService.add(houseInfo);
    }

    @Test
    public void updateTest(){
        HouseInfo houseInfo = houseInfoService.getById(3L);
        houseInfo.setHouseProperty("测试修改!");
        houseInfoService.update(houseInfo);
    }

    @Test
    public void deleteTest(){
        houseInfoService.delete(5L);
    }
    @Test
    public void str2MapTest(){
        
    }
}

