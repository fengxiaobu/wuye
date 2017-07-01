package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.UtilitiesInvoice;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
public interface UtilitiesInvoiceMapper {
    int deleteByPrimaryKey(BigDecimal utilitiesInvoiceId);

    int insert(UtilitiesInvoice record);

    UtilitiesInvoice selectByPrimaryKey(BigDecimal utilitiesInvoiceId);

    List<UtilitiesInvoice> selectAll();

    int updateByPrimaryKey(UtilitiesInvoice record);

    List<UtilitiesInvoice> selectByDetailsId(Long detailsId);

    List<Map<String,String>> getTripleByDetailsId(Long detailsId);

}