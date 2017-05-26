package cn.rzhd.wuye.common;

import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.wsclient.IExamDataServiceStub;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * luopa 在 2017/5/26 创建.
 */
public class WebService {

    public static String getBaseData(RequesterVO requesterVO) {
        //Jackson
        ObjectMapper json = new ObjectMapper();
        String jsonStr = null;
        try {
            //Java2Json
            jsonStr = json.writeValueAsString(requesterVO);
            //创建IExamDataServiceStub对象
            IExamDataServiceStub serviceStub = new IExamDataServiceStub();
            //创建GetBaseData对象
            IExamDataServiceStub.GetBaseData getBaseData = new IExamDataServiceStub.GetBaseData();
            //通过GetBaseData对象设置请求所用的json字符串,及请求实体转换而来的json字符串
            getBaseData.setString(jsonStr);
            //通过IExamDataServiceStub对象调用getBaseData方法,传入getBaseData,获得响应
            IExamDataServiceStub.GetBaseDataResponse response = serviceStub.getBaseData(getBaseData);
            //从响应中取出json字符串
            return response.get_return();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
