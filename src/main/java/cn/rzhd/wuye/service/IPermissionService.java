package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Permission;

import java.util.List;

/**
 * Created by hasee on 2017/7/1.
 */
public interface IPermissionService {
    List<Permission> getPermissionsByUser(String username);
    List<Permission> getAllPermissions();
}
