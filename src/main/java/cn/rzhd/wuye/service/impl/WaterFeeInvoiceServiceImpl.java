package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.WaterRateInvoiceDetails;
import cn.rzhd.wuye.mapper.WaterFeeInvoiceMapper;
import cn.rzhd.wuye.service.IWaterFeeInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/6/17.
 */
@Service
public class WaterFeeInvoiceServiceImpl implements IWaterFeeInvoiceService {

    @Autowired
    WaterFeeInvoiceMapper mapper;


    @Override
    public void addInvoice(WaterRateInvoiceDetails invoice) {
        mapper.addInvoice(invoice);
    }

    @Override
    public void changeStatus(Long detailsId) {
        mapper.changeStatus(detailsId);
    }
}
