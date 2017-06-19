package cn.rzhd.wuye;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.rzhd.wuye.bean.MessageManage;
import cn.rzhd.wuye.service.IMessageManageService;


public class MessageMangeServiceTest extends BaseTest {
	@Autowired
	IMessageManageService service;

	@Test
	public void testMsg() throws Exception {
		List<MessageManage> messages = service.getAllMessage();
		System.out.println(messages.size());
	}
	
	
}
