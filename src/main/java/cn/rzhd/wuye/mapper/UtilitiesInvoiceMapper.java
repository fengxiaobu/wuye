package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.UtilitiesInvoice;

import java.math.BigDecimal;
import java.util.List;

public interface UtilitiesInvoiceMapper {
    int deleteByPrimaryKey(BigDecimal utilitiesInvoiceId);

    int insert(UtilitiesInvoice record);

    UtilitiesInvoice selectByPrimaryKey(BigDecimal utilitiesInvoiceId);

    List<UtilitiesInvoice> selectAll();

    int updateByPrimaryKey(UtilitiesInvoice record);
}