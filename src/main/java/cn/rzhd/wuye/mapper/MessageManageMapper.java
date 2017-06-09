package cn.rzhd.wuye.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.rzhd.wuye.bean.MessageManage;

@Mapper
public interface MessageManageMapper {

    MessageManage findEnterMessage();
}
