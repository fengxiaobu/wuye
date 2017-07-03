package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.mapper.EnterApplyMapper;
import cn.rzhd.wuye.service.IEnterApplyService;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.query.EnterApplyQuery;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/5/25 创建.
 */
@Service
public class EnterApplyServiceImpl implements IEnterApplyService {

    @Autowired
    EnterApplyMapper enterApplyMapper;

    /**
     * 根据ID查询所有入驻申请
     *
     * @param enterApplyId
     * @return
     */
    @Override
    public List<Map<String, JsonFormat.Value>> getEnterApplyByID(Long enterApplyId) {
        RequesterVO requesterVO = new RequesterVO();
        requesterVO.setKey("liando");
        requesterVO.setBilltype(LiandoServiceConstant.DATA_TYPE_CORP);
        return enterApplyMapper.getEnterApplyByID(enterApplyId);
    }

    /**
     * 获取所有入驻申请信息
     *
     * @return
     */
    @Override
    public List<Map<String, Value>> findEnterApplyList() {
     /*   RequesterVO requesterVO=new RequesterVO();
        requesterVO.setKey("liando");
        requesterVO.setBilltype(LiandoServiceConstant.DATA_TYPE_CORP);*/
        //requesterVO.setPk_corp("1028");

        List<Map<String, JsonFormat.Value>> enterApplyList = enterApplyMapper.findEnterApplyList();
        String jsonString = JSON.toJSONString(enterApplyList);
        List<EnterApply> enterApplies = JSON.parseArray(jsonString, EnterApply.class);
       /* for (EnterApply enterApply : enterApplies) {
            System.out.println("enterApply = " + enterApply);
        }*/
        // String baseData = WebService.getBaseData(requesterVO);

        return enterApplyList;
    }

    @Override
    public int insertEnterApply(EnterApply enterApply) {

        return enterApplyMapper.insertEnterApply(enterApply);
    }

    @Override
    public int deleteEnterApply(Long enterApplyId) {
        return enterApplyMapper.deleteEnterApply(enterApplyId);
    }

    @Override
    public int updateEnterApply(EnterApply enterApply) {
        return enterApplyMapper.updateEnterApply(enterApply);
    }

    @Override
    public List<Map<String, Value>> findEnterApplyByQuery(EnterApplyQuery enterApplyQuery) {
        return enterApplyMapper.findEnterApplyByQuery(enterApplyQuery);
    }

    /**
     * 获取审核完成后的结果
     *
     * @param pkHouse
     * @return
     */
    @Override
    public List<Map<String, Value>> getEnterApplyByIDAndState(String pkHouse) {
        return enterApplyMapper.getEnterApplyByIDAndState(pkHouse);
    }

    @Override
    public void updatePayState(String wyState, String kfState, Long enterApplyId) {
        enterApplyMapper.updatePayState(wyState, kfState, enterApplyId);
    }

    @Override
    public Integer getCount(String pkHouse, String customerId) {
        return enterApplyMapper.getCount(pkHouse,customerId);
    }

}
