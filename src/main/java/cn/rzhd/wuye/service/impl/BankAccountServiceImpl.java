package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.mapper.BankAccountMapper;
import cn.rzhd.wuye.service.IBankAccountService;
import cn.rzhd.wuye.vo.FeeAccountVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/6/28.
 */
@Service
public class BankAccountServiceImpl implements IBankAccountService {
    @Autowired
    BankAccountMapper mapper;

    @Override
    public void addAccount(FeeAccountVO vo) {
        mapper.insert(vo);
    }
}
