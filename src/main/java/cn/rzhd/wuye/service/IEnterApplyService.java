package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.EnterApply;

import java.util.List;

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
    List<EnterApply> getEnterApplyAll();
}