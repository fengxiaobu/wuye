package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.UtilitiesDetails;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Mapper
public interface UtilitiesDetailsMapper {

    int deleteByPrimaryKey(BigDecimal utilitiesDetailsId);

    int insert(UtilitiesDetails record);

    UtilitiesDetails selectByPrimaryKey(BigDecimal utilitiesDetailsId);

    List<UtilitiesDetails> selectAll(UtilitiesQuery query);

    int updateByPrimaryKey(UtilitiesDetails record);

    UtilitiesDetails getLastElectric(UtilitiesQuery query);

    UtilitiesDetails getLastWater(UtilitiesQuery query);

    void changeStatus(Long id);

    List<Map<String,Object>> getElectricByProject(PropertyRecordsQuery query);

    List<Map<String,Object>> getWaterByProject(PropertyRecordsQuery query);

    BigDecimal getAstrictPaid(@Param("houseInfoId") String houseInfoId, @Param("startDate") Date startDate, @Param("endDate") Date endDate);

    String getCompanyName(@Param("pk_feeType") String pk_feeType,@Param("pk_corp") String pk_corp);

    String getCompanyAccount(@Param("pk_feeType") String pk_feeType,@Param("pk_corp")String pk_corp);

    String getCostType(@Param("pk_feeType") String pk_feeType,@Param("pk_corp") String pk_corp);

    Map<String,Object> getElectricByPrimaryKey(Long detailsId);

    Map<String,Object> getWaterByPrimaryKey(Long detailsId);

    Integer countElectricByQuery(PropertyRecordsQuery query);

    Integer countWaterByQuery(PropertyRecordsQuery query);
}