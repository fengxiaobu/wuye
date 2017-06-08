package cn.rzhd.wuye.controller;

import cn.rzhd.wuye.bean.HouseInfo;
import cn.rzhd.wuye.bean.ProjectInfo;
import cn.rzhd.wuye.service.IHouseInfoService;
import cn.rzhd.wuye.service.IProjectInfoService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhongchaojie on 2017/5/25.
 * 房产信息Controller
 */
@Controller
@RequestMapping("/dist/houseInfo")
public class HouseInfoController {

    @Autowired
    IHouseInfoService houseInfoService;
    @Autowired
    IProjectInfoService projectInfoService;
    /**
     *
     * @return
     */
    @RequestMapping("/list")
    @ResponseBody
    public String houseInfoList() {
        List<HouseInfo> list = houseInfoService.getAll();
        //SimplePropertyPreFilter filter = new SimplePropertyPreFilter(HouseInfo.class, "houseProperty", "projectInfo");
        PropertyFilter propertyFilter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                if (name.equalsIgnoreCase("projectInfo")) {
                    //false表示last字段将被排除在外
                    return false;
                }
                return true;
            }
        };
        String jsonString = JSON.toJSONString(list, propertyFilter);
        return jsonString;
    }

    /**
     *
     * @return 返回跳转路径,用于跳转到HouseInfo页面
     */
    @RequestMapping("/index")
    public String houseInfo(){
        return "houseinfo/houseList";
    }

    /**
     * 获取客户名下的房产信息
     *
     * @param customerid
     * @return
     */
    @RequestMapping(value = "/getHouseNum",method = RequestMethod.GET)
    @ResponseBody
    public String selectByQuery(String customerid) {
        if (customerid == null || customerid == "") {
            return "客户ID未知!";
        }
        PropertyFilter propertyFilter = new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                if (name.equalsIgnoreCase("projectInfo")) {
                    //false表示last字段将被排除在外
                    return false;
                }
                return true;
            }
        };
        List<HouseInfo> houseInfos = houseInfoService.selectByQuery(customerid);
        String jsonString = JSON.toJSONString(houseInfos, propertyFilter);
        return jsonString;
    }

    /**
     * 获取项目信息
     *
     * @param projectInfoId
     * @return
     */
    @RequestMapping("/projectInfo/getProjectByHouse")
    @ResponseBody
    public String getProjectByHouse(String projectInfoId) {

        ProjectInfo projectInfo = projectInfoService.selectByPrimaryKey(projectInfoId);
        String jsonString = JSON.toJSONString(projectInfo, SerializerFeature.WriteMapNullValue);
        return jsonString;
    }

}
