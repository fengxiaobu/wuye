package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.Invoice;
import cn.rzhd.wuye.mapper.UtilitiesInvoiceMapper;
import cn.rzhd.wuye.service.IUtilitiesInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/6/20.
 */
@Service
public class UtilitiesInvoiceServiceImpl implements IUtilitiesInvoiceService {
    @Autowired
    UtilitiesInvoiceMapper mapper;
    @Override
    public void addInvoice(Invoice invoice) {
        mapper.insert(invoice);
    }

    @Override
    public void changeStatusByRecordsId(String id) {
        mapper.changeStatusByRecordsId(id);
    }
}
