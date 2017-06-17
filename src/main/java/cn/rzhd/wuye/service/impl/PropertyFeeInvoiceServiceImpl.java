package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.PropertyFeeInvoiceDetails;
import cn.rzhd.wuye.mapper.PropertyFeeInvoiceMapper;
import cn.rzhd.wuye.service.IPropertyFeeInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/6/17.
 */
@Service
public class PropertyFeeInvoiceServiceImpl implements IPropertyFeeInvoiceService {

    @Autowired
    PropertyFeeInvoiceMapper mapper;

    @Override
    public void addInvoice(PropertyFeeInvoiceDetails invoice) {
        mapper.addInvoice(invoice);
    }

    @Override
    public void changeStatus(Long detailsId) {
        mapper.changeStatus(detailsId);
    }
}
