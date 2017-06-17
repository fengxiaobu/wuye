package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.ElectricFeeInvoiceDeta;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by hasee on 2017/6/17.
 */
@Mapper
public interface ElectricInvoiceMapper {

    void addInvoice (ElectricFeeInvoiceDeta invoice);

    void changeStatus(Long detailsId);
}
