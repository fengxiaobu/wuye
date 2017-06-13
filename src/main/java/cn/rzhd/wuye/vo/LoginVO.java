package cn.rzhd.wuye.vo;

import cn.rzhd.wuye.bean.Customer;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/12.
 * 封装登录成功后需要返回的信息
 */
public class LoginVO {
    private Customer customer;//客户
    private List<Map<String,String>> companys;//公司信息
    private List<Map<String,String>> houseInfos;//房产信息
    private List<Map<String,String>> projectInfos;//项目信息

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Map<String, String>> getCompanys() {
        return companys;
    }

    public void setCompanys(List<Map<String, String>> companys) {
        this.companys = companys;
    }

    public List<Map<String, String>> getHouseInfos() {
        return houseInfos;
    }

    public void setHouseInfos(List<Map<String, String>> houseInfos) {
        this.houseInfos = houseInfos;
    }

    public List<Map<String, String>> getProjectInfos() {
        return projectInfos;
    }

    public void setProjectInfos(List<Map<String, String>> projectInfos) {
        this.projectInfos = projectInfos;
    }
}
