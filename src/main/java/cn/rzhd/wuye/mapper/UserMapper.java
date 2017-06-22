package cn.rzhd.wuye.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.rzhd.wuye.bean.User;


@Mapper
public interface UserMapper {
	User findByUsername(String username);
}
