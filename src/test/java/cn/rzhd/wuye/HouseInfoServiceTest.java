package cn.rzhd.wuye;

import cn.rzhd.wuye.bean.HouseInfo;
import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.mapper.HouseInfoMapper;
import cn.rzhd.wuye.service.IHouseInfoService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.HouseVO;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

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
        HouseInfo houseInfo = houseInfoService.getById("");
        System.out.println(houseInfo.getCustomerId());
    }
    
    @Test
    public void getAllTest(){
        List<HouseInfo> list = houseInfoService.getAll();
        RequesterVO vo = new RequesterVO();
        vo.setKey("liando");
        vo.setBilltype("HOUSE");
        vo.setPk_corp("1031");
        String data = WebService.getBaseData(vo);
        ResponseVO responseVO = JsonUtils.jsonToPojo(data, ResponseVO.class);
        if (responseVO!=null){
            if ("Y".equals(responseVO.getIssuccess())){
                List<HouseVO> houseVOS = Arrays.asList(responseVO.getHousedata());
                for (HouseVO houseVO : houseVOS) {
                    System.out.println(houseVO);
                }


            }


        }
    }

    @Test
    public void insertTest(){
        HouseInfo houseInfo = new HouseInfo();
        houseInfo.setCustomerId("xxx");
        houseInfo.setEnterStatus(1);
        houseInfo.setHouseProperty("TestTest");
        houseInfo.setProjectInfoId("123");
        houseInfo.setStarLevel(3);
        houseInfo.setStatus(1);
        houseInfoService.add(houseInfo);
    }

    @Test
    public void updateTest(){
        HouseInfo houseInfo = houseInfoService.getById("");
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

