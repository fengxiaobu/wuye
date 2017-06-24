package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hasee on 2017/6/24.
 */
@Mapper
public interface RoleMapper {

    List<Role> getMyRole(Long id);

    void addMyRole(@Param("roleId") Long roleId,@Param("userId") Long userId);

    void removeByUser(Long id);
}
