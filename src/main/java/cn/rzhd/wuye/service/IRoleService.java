package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Role;

import java.util.List;

/**
 * Created by hasee on 2017/6/24.
 */
public interface IRoleService {
    List<Role> getMyRole(Long id);

    void addMyRole(Long roleId,Long userId);

    void removeAllMyRole(Long id);
}
