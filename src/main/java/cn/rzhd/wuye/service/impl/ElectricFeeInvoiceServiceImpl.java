package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.ElectricFeeInvoiceDeta;
import cn.rzhd.wuye.mapper.ElectricInvoiceMapper;
import cn.rzhd.wuye.service.IElectricFeeInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/6/17.
 */
@Service
public class ElectricFeeInvoiceServiceImpl implements IElectricFeeInvoiceService {
    @Autowired
    ElectricInvoiceMapper mapper;

    @Override
    public void addInvoice(ElectricFeeInvoiceDeta invoice) {
        mapper.addInvoice(invoice);
    }

    @Override
    public void changeStatus(Long detailsId) {
        mapper.changeStatus(detailsId);
    }
}
