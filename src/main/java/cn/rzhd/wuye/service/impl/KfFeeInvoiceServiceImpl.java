package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.KfFeeInvoice;
import cn.rzhd.wuye.mapper.KfFeeInvoiceMapper;
import cn.rzhd.wuye.service.IKfFeeInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/6/21.
 */
@Service
public class KfFeeInvoiceServiceImpl implements IKfFeeInvoiceService {
    @Autowired
    KfFeeInvoiceMapper mapper;

    @Override
    public void addInvoice(KfFeeInvoice invoice) {
        mapper.insert(invoice);
    }
}
