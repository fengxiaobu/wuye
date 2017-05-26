package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.IRentContractService;
import cn.rzhd.wuye.vo.RequesterVO;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/5/26.
 */
@Service
public class RentContractServiceImpl implements IRentContractService {


    @Override
    public String getRentContract(String billType, String companyId) {
        RequesterVO vo = new RequesterVO();
        vo.setBilltype(billType);
        vo.setPk_corp(companyId);
        return WebService.getBaseData(vo);
    }
}
