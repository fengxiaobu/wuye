package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.PropertyFeeInvoiceDetails;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by hasee on 2017/6/17.
 */
@Mapper
public interface PropertyFeeInvoiceMapper {
    void addInvoice(PropertyFeeInvoiceDetails invoice);

//    void changeStatus(Long detailsId);
}
