package cn.rzhd.wuye.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.rzhd.wuye.bean.PerfectInformation;

@Mapper
public interface UserDataPerfectionMapper {
    
    Integer findMaxPerfectInformationId();
    
    Integer findMaxEnterTransactMaterialId();
    
    void addUserDataPerfection(@Param("perfectInformation") PerfectInformation perfectInformation);
    
//    void addEnterTransactMaterial(@Param("enterMaterial") EnterMaterial enterMaterial);
//    
//    List<Map<String, Object>> kfFeePaymentByHouseId(@Param("houseId")String houseId,@Param("customerId")String customerId);
//    
//    List<Map<String, Object>> pfFeePaymentByHouseId(@Param("houseId")String houseId,@Param("customerId")String customerId);
//    
//    <T> T findDataPerfectionMessage();
//    
//    <T> T propertyFeePayInfo(@Param("customerId")String customerId,@Param("houseId")String houseId);
//    
//    void payPropertyFeeInvoice(@Param("propertyFeeInvoiceDetails")PropertyFeeInvoiceDetails propertyFeeInvoiceDetails);

}
