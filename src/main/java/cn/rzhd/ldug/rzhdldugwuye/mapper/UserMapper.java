package cn.rzhd.ldug.rzhdldugwuye.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.rzhd.ldug.rzhdldugwuye.bean.User;
@Mapper
public interface UserMapper {
	User get(Long id);
}
