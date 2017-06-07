package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.EnterApply;
import cn.rzhd.wuye.vo.EnterApplyQuery;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;
import java.util.Map;

/**
 * luopa 在 2017/5/25 创建.
 */
public interface IEnterApplyService {
    /**
     * 根据ID查询所有入驻申请
     * @param enterApplyId
     * @return
     */
    EnterApply getEnterApplyByID(Long enterApplyId);

    /**
     * 获取所有入驻申请信息
     * @return
     */
    //List<Map<String, JsonFormat.Value>> findEnterApplyList(Integer pageNum, Integer pageSize);
    List<Map<String, JsonFormat.Value>> findEnterApplyList();

    void insertEnterApply(EnterApply enterApply);

    void deleteEnterApply(Long enterApplyId);

    void updateEnterApply(EnterApply enterApply);

    List<Map<String, JsonFormat.Value>> findEnterApplyByQuery(EnterApplyQuery enterApplyQuery);
}
