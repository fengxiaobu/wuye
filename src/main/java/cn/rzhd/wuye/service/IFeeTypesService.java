package cn.rzhd.wuye.service;

import cn.rzhd.wuye.vo.FeeitemVO;

import java.util.List;

/**
 * Created by hasee on 2017/6/5.
 */
public interface IFeeTypesService {

    void addFeeTypes(FeeitemVO feeTypes);

    List<FeeitemVO> getAll();
}
