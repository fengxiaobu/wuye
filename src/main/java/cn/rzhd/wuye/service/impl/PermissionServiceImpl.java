package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.Permission;
import cn.rzhd.wuye.mapper.PermissionMapper;
import cn.rzhd.wuye.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hasee on 2017/7/1.
 */
@Service
public class PermissionServiceImpl implements IPermissionService {
    @Autowired
    PermissionMapper mapper;

    @Override
    public List<Permission> getPermissionsByUser(String username) {
        return mapper.getPermissionsByUser(username);
    }

    @Override
    public List<Permission> getAllPermissions() {
        return mapper.selectAll();
    }
}
