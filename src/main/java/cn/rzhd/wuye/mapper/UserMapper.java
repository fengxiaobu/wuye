package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	User get(Long id);
}
