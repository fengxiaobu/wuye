package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.mapper.EnterApplyMapper;
import cn.rzhd.wuye.service.IEnterApplyService;
import cn.rzhd.wuye.vo.RequesterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * luopa 在 2017/5/25 创建.
 */
@Service
public class IEnterApplyServiceImpl implements IEnterApplyService {

    @Autowired
    EnterApplyMapper enterApplyMapper;

    /**
     * 根据ID查询所有入驻申请
     *
     * @param enterApplyId
     * @return
     */
    @Override
    public EnterApply getEnterApplyByID(Long enterApplyId) {
        RequesterVO requesterVO=new RequesterVO();
        requesterVO.setKey("liando");
        requesterVO.setBilltype("");
        return enterApplyMapper.getEnterApplyByID(enterApplyId);
    }

    /**
     * 获取所有入驻申请信息
     *
     * @return
     */
    @Override
    public List<EnterApply> getEnterApplyAll() {
        return enterApplyMapper.getEnterApplyAll();
    }
}
