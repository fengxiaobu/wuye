package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.mapper.UserMapper;
import cn.rzhd.wuye.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public User get(Long id) {
		return userMapper.get(id);
	}

}
