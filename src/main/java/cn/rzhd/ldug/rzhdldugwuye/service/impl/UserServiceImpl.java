package cn.rzhd.ldug.rzhdldugwuye.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.rzhd.ldug.rzhdldugwuye.bean.User;
import cn.rzhd.ldug.rzhdldugwuye.mapper.UserMapper;
import cn.rzhd.ldug.rzhdldugwuye.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserMapper mapper;
	
	@Override
	public User get(Long id) {
		return mapper.get(id);
	}

}
