package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.EnterMaterial;
import cn.rzhd.wuye.bean.PerfectInformation;
import cn.rzhd.wuye.bean.PropertyFeeInvoiceDetails;

public interface IUserDataPerfectionService {
    
    public <T> T findHouseListByCustomer(Customer customer);
    
    public void addUserDataPerfection(PerfectInformation perfectInformation);
    
//    public void addEnterTransactMaterial(EnterMaterial enterMaterial);
//    
//    <T> T feePaymentByHouseId(String customerId,String houseId);
//    
//    <T> T findDataPerfectionMessage();
//    
//    <T> T propertyFeePayInfo(String customerId,String houseId);
//    
//    void payPropertyFeeInvoice(PropertyFeeInvoiceDetails propertyFeeInvoiceDetails);

}
