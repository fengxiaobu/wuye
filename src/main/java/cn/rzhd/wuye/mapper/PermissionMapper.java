package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hasee on 2017/7/1.
 */
@Mapper
public interface PermissionMapper {
    List<Permission> getPermissionsByUser(String username);

    int deleteByPrimaryKey(Long permissionId);

    int insert(Permission record);

    Permission selectByPrimaryKey(Long permissionId);

    List<Permission> selectAll();

    int updateByPrimaryKey(Permission record);
}
