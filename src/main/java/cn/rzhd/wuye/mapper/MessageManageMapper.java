package cn.rzhd.wuye.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.rzhd.wuye.bean.MessageManage;

@Mapper
public interface MessageManageMapper {

	MessageManage findEnterMessage();

	List<MessageManage> getAllMessage();

	MessageManage selectOne(Long message_manage_id);

	/**
	 * @param 批量删除
	 */
	void deleteInfoArray(String[] message_manage_id);
	
	List<String> getAllType();
	
	void deleteOne(String message_manage_id);
}
