package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.WaterRateInvoiceDetails;

/**
 * Created by hasee on 2017/6/17.
 */
public interface IWaterFeeInvoiceService {
    void addInvoice(WaterRateInvoiceDetails invoice);

    void changeStatus(Long detailsId);
}
