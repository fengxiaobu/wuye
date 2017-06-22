package cn.rzhd.wuye.service;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat.Value;

import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.vo.CustomerVO;

public interface IUserService {
    public List<Map<String, Value>> findCustomerList(Integer pageNum,Integer pageSize);
    public List<Map<String, Value>> findCustomerByCondition(String condition,Integer pageNum,Integer pageSize);
    public void updateCustomer(CustomerVO customerVo);
    public void delCustomer(Long customerId);
    public String ERPAllCustomerPull();
    
    User getLoger(String username,String password);
}
