package cn.rzhd.wuye;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.rzhd.wuye.bean.MessageManage;
import cn.rzhd.wuye.mapper.MessageManageMapper;
import cn.rzhd.wuye.service.IMessageManageService;


public class MessageMangeServiceTest extends BaseTest {
	@Autowired
	IMessageManageService service;
	@Autowired
	MessageManageMapper mapper;

	@Test
	public void testMsg() throws Exception {
		List<MessageManage> messages = service.getAllMessage();
		System.out.println(messages.size());
	}
	
	@Test
	public void testDel() throws Exception {
		String[] message_manage_id = {"3","4"};
		mapper.deleteInfoArray(message_manage_id );
	}
	
	@Test
	public void testType() throws Exception {
		List<String> allType = mapper.getAllType();
		for (String type : allType) {
			System.out.println(type);
		}
	}
}
