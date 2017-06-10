package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.ElectricFeePayDetails;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by hasee on 2017/6/2.
 */
@Mapper
public interface ElectricFeePayDetailsMapper {

    List<ElectricFeePayDetails> selectAll(UtilitiesQuery query);

    void insert(ElectricFeePayDetails details);

    BigDecimal getAstrictPaid(@Param("houseInfoId") String houseInfoId, @Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
