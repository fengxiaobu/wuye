package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.Invoice;
import cn.rzhd.wuye.mapper.KfInvoiceMapper;
import cn.rzhd.wuye.service.IKfFeeInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/6/21.
 */
@Service
public class KfFeeInvoiceServiceImpl implements IKfFeeInvoiceService {
    @Autowired
    KfInvoiceMapper mapper;

    @Override
    public void addInvoice(Invoice invoice) {
        mapper.insert(invoice);
    }

    @Override
    public void changeStatusByRecordsId(String id) {
        mapper.changeStatusByRecordsId(id);
    }
}
