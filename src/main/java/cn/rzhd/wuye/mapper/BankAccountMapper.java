package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.vo.FeeAccountVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BankAccountMapper {
    int deleteByPrimaryKey(String pkAccount);

    int insert(FeeAccountVO record);

    FeeAccountVO selectByPrimaryKey(String pkAccount);

    List<FeeAccountVO> selectAll();

    int updateByPrimaryKey(FeeAccountVO record);
}