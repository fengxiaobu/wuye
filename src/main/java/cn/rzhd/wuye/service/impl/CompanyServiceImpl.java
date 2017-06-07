package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.Company;
import cn.rzhd.wuye.mapper.CompanyMapper;
import cn.rzhd.wuye.service.ICompanyService;
import cn.rzhd.wuye.vo.CorpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Company> getAll() {
        return mapper.selectAll();
    }

    @Override
    public void saveRecords(CorpVO company) throws Exception{
        Company one = mapper.getById(company.getPk_corp());
        if(one!=null){
            mapper.update(company);
        }else{
            mapper.insert(company);
        }
    }
}
