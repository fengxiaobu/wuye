package cn.rzhd.wuye.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.rzhd.wuye.bean.MessageManage;
import cn.rzhd.wuye.mapper.MessageManageMapper;
import cn.rzhd.wuye.service.IMessageManageService;
@Service
public class findEnterMessageServiceImpl implements IMessageManageService {

    @Autowired
    private MessageManageMapper mapper;
    
    @Override
    public MessageManage findEnterMessage() {
	MessageManage findEnterMessage = mapper.findEnterMessage();
	return findEnterMessage;
    }

	@Override
	public List<MessageManage> getAllMessage() {
		List<MessageManage> messageManages = mapper.getAllMessage();
		return messageManages;
	}

	@Override
	public MessageManage getMessageManage(Long message_manage_id) {
		MessageManage manage = mapper.selectOne(message_manage_id);
		return manage;
	}

	@Override
	public void DeleteMessageManages(String[] message_manage_id) {
		mapper.deleteInfoArray(message_manage_id);
	}

	@Override
	public List<String> getAllType() {
		List<String> allType = mapper.getAllType();
		return allType;
	}

}
