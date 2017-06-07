package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.Company;
import cn.rzhd.wuye.vo.CorpVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CompanyMapper {

    void insert(CorpVO record);

    List<Company> selectAll();

    void update(CorpVO record);

    Company getById(String pk_corp);
}