package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.ReName;
import cn.rzhd.wuye.mapper.ReNameMapper;
import cn.rzhd.wuye.service.IReNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * luopa 在 2017/6/28 创建.
 */
@Service
public class ReNameService implements IReNameService {
    @Autowired
    ReNameMapper reNameMapper;

    @Override
    public ReName getAll() {
        return reNameMapper.getAll();
    }
}
