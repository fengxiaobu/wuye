package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.UtilitiesDetails;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.util.List;
@Mapper
public interface UtilitiesDetailsMapper {

    int deleteByPrimaryKey(BigDecimal utilitiesDetailsId);

    int insert(UtilitiesDetails record);

    UtilitiesDetails selectByPrimaryKey(BigDecimal utilitiesDetailsId);

    List<UtilitiesDetails> selectAll(UtilitiesQuery query);

    int updateByPrimaryKey(UtilitiesDetails record);

    UtilitiesDetails getLastElectric(UtilitiesQuery query);

    UtilitiesDetails getLastWater(UtilitiesQuery query);

    void changeStatus(UtilitiesDetails record);
}