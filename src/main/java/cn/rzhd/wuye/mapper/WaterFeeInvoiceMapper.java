package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.WaterRateInvoiceDetails;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by hasee on 2017/6/17.
 */
@Mapper
public interface WaterFeeInvoiceMapper {
    void addInvoice(WaterRateInvoiceDetails invoice);

    void changeStatus(Long detailsId);
}
