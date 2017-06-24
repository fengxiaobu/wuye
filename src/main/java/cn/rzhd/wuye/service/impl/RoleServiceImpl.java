package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.Role;
import cn.rzhd.wuye.mapper.RoleMapper;
import cn.rzhd.wuye.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hasee on 2017/6/24.
 */
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    RoleMapper mapper;

    @Override
    public List<Role> getMyRole(Long id) {
        return mapper.getMyRole(id);
    }

    @Override
    public void addMyRole(Long roleId,Long userId) {
        mapper.addMyRole(roleId,userId);
    }

    @Override
    public void removeAllMyRole(Long id) {
        mapper.removeByUser(id);
    }
}
