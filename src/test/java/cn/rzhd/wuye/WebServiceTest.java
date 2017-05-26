package cn.rzhd.wuye;

import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.wsclient.IExamDataServiceStub;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.JSONArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2017/5/25.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class WebServiceTest {


    @Test
    public void getBaseDataTest() {
        //请求实体
        RequesterVO request = new RequesterVO();
        request.setKey("liando");
        //request.setBilltype(LiandoServiceConstant.DATA_TYPE_CORP);
        request.setBilltype(LiandoServiceConstant.DATA_TYPE_HOUSE);
        request.setPk_corp("1028");
        //Jackson
        ObjectMapper json = new ObjectMapper();
        String jsonStr = null;
        try {
            //Java2Json
            jsonStr = json.writeValueAsString(request);
            //创建IExamDataServiceStub对象
            IExamDataServiceStub serviceStub = new IExamDataServiceStub();
            //创建GetBaseData对象
            IExamDataServiceStub.GetBaseData getBaseData = new IExamDataServiceStub.GetBaseData();
            //通过GetBaseData对象设置请求所用的json字符串,及请求实体转换而来的json字符串
            getBaseData.setString(jsonStr);
            //通过IExamDataServiceStub对象调用getBaseData方法,传入getBaseData,获得响应
            IExamDataServiceStub.GetBaseDataResponse response = serviceStub.getBaseData(getBaseData);
            //从响应中取出json字符串
            String s = response.get_return();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void JsonStrTest() {
        RequesterVO request = new RequesterVO();
        ObjectMapper json = new ObjectMapper();
        String jsonStr = null;
        try {
            jsonStr = json.writeValueAsString(request);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(jsonStr);
    }

    @Test
    public void jsonArr() {
        RequesterVO vo = new RequesterVO();
        List list = new ArrayList();
        list.add(vo);
        String s = JSONArray.toJSONString(list);
        System.out.println(s);
    }
}
