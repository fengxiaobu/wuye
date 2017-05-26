package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.ISellContractService;
import cn.rzhd.wuye.vo.RequesterVO;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/5/26.
 */
@Service
public class SellContractServiceImpl implements ISellContractService {

    @Override
    public String getSellContract(String billType,String companyId) {
        RequesterVO requesterVO = new RequesterVO();
        requesterVO.setBilltype(billType);
        requesterVO.setPk_corp(companyId);
        return WebService.getBaseData(requesterVO);
    }
}
