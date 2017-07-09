package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Invoice;

/**
 * Created by hasee on 2017/6/20.
 */
public interface IUtilitiesInvoiceService {

    void addInvoice(Invoice invoice);

    void changeStatusByRecordsId(String id);
}
