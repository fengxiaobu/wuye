package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.PropertyFeeInvoiceDetails;

/**
 * Created by hasee on 2017/6/17.
 */
public interface IPropertyFeeInvoiceService {
    void addInvoice(PropertyFeeInvoiceDetails invoice);

    void changeStatus(Long detailsId);
}
