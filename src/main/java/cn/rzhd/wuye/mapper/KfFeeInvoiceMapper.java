package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.KfFeeInvoice;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
import java.util.List;
@Mapper
public interface KfFeeInvoiceMapper {
    int deleteByPrimaryKey(BigDecimal kfFeeInvoiceDetailsId);

    int insert(KfFeeInvoice record);

    KfFeeInvoice selectByPrimaryKey(BigDecimal kfFeeInvoiceDetailsId);

    List<KfFeeInvoice> selectAll();

    int updateByPrimaryKey(KfFeeInvoice record);
}