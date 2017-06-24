package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.vo.CustomerVO;
import cn.rzhd.wuye.vo.ManageVO;
import com.fasterxml.jackson.annotation.JsonFormat.Value;

import java.util.List;
import java.util.Map;

public interface IUserService {
    public List<Map<String, Value>> findCustomerList(Integer pageNum,Integer pageSize);
    public List<Map<String, Value>> findCustomerByCondition(String condition,Integer pageNum,Integer pageSize);
    public void updateCustomer(CustomerVO customerVo);
    public void delCustomer(Long customerId);
    public String ERPAllCustomerPull();
    
    User getLoger(String username,String password);

    List<String> getHouseInfos(Long userId);

    List<User> getAll();

    List<ManageVO> getMyProjects(Long id);

    List<ManageVO> getAllProjects();

    User getDetails(Long id);

    Long saveUser(User user);

    void delete(Long id);
}
