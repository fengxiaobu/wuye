package cn.rzhd.wuye.service.impl;

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

}
