package cn.rzhd.wuye.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.rzhd.wuye.bean.User;

@Mapper
public interface UserMapper {
	User get(Long id);
}
