package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.mapper.ManageVOMapper;
import cn.rzhd.wuye.service.IManageService;
import cn.rzhd.wuye.vo.ManageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hasee on 2017/6/23.
 */
@Service
public class ManageServiceImpl implements IManageService {

    @Autowired
    ManageVOMapper mapper;
    @Override
    public void addManage(ManageVO vo) {
        mapper.addManage(vo);
    }

    @Override
    public List<ManageVO> getMyManage(Long id) {
        return mapper.getMyManage(id);
    }

    @Override
    public void addMyManage(String proId, Long id) {
        mapper.addMyManage(proId,id);
    }

    @Override
    public void removeAllMyManage(Long id) {
        mapper.removeByUser(id);
    }
}
