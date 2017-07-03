package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.vo.query.EnterApplyQuery;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/5/25 创建.
 */
public interface IEnterApplyService {
    /**
     * 根据ID查询所有入驻申请
     *
     * @param enterApplyId
     * @return
     */
    List<Map<String, JsonFormat.Value>> getEnterApplyByID(Long enterApplyId);

    /**
     * 获取所有入驻申请信息
     *
     * @return
     */
    List<Map<String, JsonFormat.Value>> findEnterApplyList();

    int insertEnterApply(EnterApply enterApply);

    int deleteEnterApply(Long enterApplyId);

    int updateEnterApply(EnterApply enterApply);

    List<Map<String, JsonFormat.Value>> findEnterApplyByQuery(EnterApplyQuery enterApplyQuery);

    /**
     * 获取审核完成后的结果
     *
     * @param pkHouse
     * @return
     */
    List<Map<String, JsonFormat.Value>> getEnterApplyByIDAndState(String pkHouse);

    void updatePayState(String wyState, String kfState, Long enterApplyId);

    Integer getCount(String pkHouse, String customerId);
}
