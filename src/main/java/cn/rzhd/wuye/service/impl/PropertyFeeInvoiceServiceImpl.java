package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.Invoice;
import cn.rzhd.wuye.mapper.PropertyFeeInvoiceDetailsMapper;
import cn.rzhd.wuye.service.IPropertyFeeInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/6/17.
 */
@Service
public class PropertyFeeInvoiceServiceImpl implements IPropertyFeeInvoiceService {

    @Autowired
    PropertyFeeInvoiceDetailsMapper mapper;

    @Override
    public void addInvoice(Invoice invoice) {
        mapper.insert(invoice);
    }

    @Override
    public void changeStatusByRecordsId(String id) {
        mapper.changeStatusByRecordsId(id);
    }
}
