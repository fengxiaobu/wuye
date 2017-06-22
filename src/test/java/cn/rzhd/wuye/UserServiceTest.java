package cn.rzhd.wuye;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.rzhd.wuye.bean.User;
import cn.rzhd.wuye.mapper.UserMapper;
import cn.rzhd.wuye.service.IRentContractService;

public class UserServiceTest extends BaseTest {
	@Autowired
	UserMapper mapper;
	
	@Test
	public void testName() throws Exception {
		String username ="admin";
		User user = mapper.findByUsername(username);
		System.out.println(user);
	}

}
