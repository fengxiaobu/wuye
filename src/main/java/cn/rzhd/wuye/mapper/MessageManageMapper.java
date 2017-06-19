package cn.rzhd.wuye.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.rzhd.wuye.bean.MessageManage;

@Mapper
public interface MessageManageMapper {

	MessageManage findEnterMessage();

	List<MessageManage> getAllMessage();

	MessageManage selectOne(Long message_manage_id);
}
