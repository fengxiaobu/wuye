package cn.rzhd.wuye.service;

import java.util.List;

import cn.rzhd.wuye.bean.MessageManage;

public interface IMessageManageService {

	MessageManage findEnterMessage();

	/**
	 * 查询所有通知
	 */
	List<MessageManage> getAllMessage();

	/**
	 * @param message_manage_id
	 * @return 查询单个通知
	 */
	MessageManage getMessageManage(Long message_manage_id);

	/**
	 * @param 批量删除
	 */
	void DeleteMessageManages(String[] message_manage_id);
	
	List<String> getAllType();
}
