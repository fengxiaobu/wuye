package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.mapper.EnterApplyMapper;
import cn.rzhd.wuye.service.IEnterApplyService;
import cn.rzhd.wuye.vo.RequesterVO;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
    public List<Map<String, Value>> findEnterApplyList(Integer pageNum, Integer pageSize) {
        Integer pageStartRow = pageNum*pageSize-pageSize+1;
        Integer pageEndRow = pageStartRow+pageSize-1;
        List<Map<String, Value>> enterApplyList = enterApplyMapper.findEnterApplyList(pageStartRow, pageEndRow);
        return enterApplyList;
    }
}
