package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.mapper.CompanyMapper;
import cn.rzhd.wuye.service.ICompanyService;
import cn.rzhd.wuye.vo.CorpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/6/5.
 */
@Service
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    CompanyMapper mapper;

    @Override
    public void addCompany(CorpVO company) {
        mapper.insert(company);
    }
}
