package cn.rzhd.wuye.service;

import cn.rzhd.wuye.vo.ManageVO;

import java.util.List;

/**
 * Created by hasee on 2017/6/23.
 */
public interface IManageService {
    void addManage(ManageVO vo);

    List<ManageVO> getMyManage(Long id);

    void addMyManage(String proId, Long id);

    void removeAllMyManage(Long id);
}
