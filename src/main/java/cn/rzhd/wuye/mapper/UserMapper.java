package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface UserMapper {
	User findByUsername(String username);

	List<String> getManageId(Long userId);

    List<User> getAll();

    User getDetailsById(Long id);

    void insert(User user);

    void update(User user);

    void delete(@Param("id") Long id);

    User getByUsername(String username);
}
