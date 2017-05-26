package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.mapper.UserMapper;
import cn.rzhd.wuye.service.IUserService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonFormat.Value;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserMapper mapper;

	@Override
	public List<Map<String, Value>> findUserList(Integer pageNum, Integer pageSize) {
	    Integer pageStartRow = pageNum*pageSize-pageSize+1;
	    Integer pageEndRow = pageStartRow+pageSize-1;
	   List<Map<String, Value>> findUserList = mapper.findUserList(pageStartRow,pageEndRow );
	   return findUserList;
	}
	
	@Override
	public List<Map<String, Value>> findUserByCondition(String condition, Integer pageNum, Integer pageSize) {
	    Integer pageStartRow = pageNum*pageSize-pageSize+1;
	    Integer pageEndRow = pageStartRow+pageSize-1;
	    List<Map<String, Value>> findUserByCondition = mapper.findUserByCondition(condition, pageStartRow, pageEndRow);
	    return findUserByCondition;
	}

	public void updateUser(User user) {
	    mapper.updateUser(user);
	    
	}

	@Override
	public void delUser(Long userId) {
	    mapper.delUserById(userId);
	    
	}
}
