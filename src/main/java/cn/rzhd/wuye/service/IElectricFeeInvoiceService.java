package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.ElectricFeeInvoiceDeta;

/**
 * Created by hasee on 2017/6/17.
 */
public interface IElectricFeeInvoiceService {

    void addInvoice(ElectricFeeInvoiceDeta invoice);

    void changeStatus(Long detailsId);
}
