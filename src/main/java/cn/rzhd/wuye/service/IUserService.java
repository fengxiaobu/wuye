package cn.rzhd.wuye.service;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat.Value;

import cn.rzhd.wuye.bean.User;

public interface IUserService {
    public List<Map<String, Value>> findUserList(Integer pageNum,Integer pageSize);
    public List<Map<String, Value>> findUserByCondition(String condition,Integer pageNum,Integer pageSize);
    public void updateUser(User user);
    public void delUser(Long id);
}
