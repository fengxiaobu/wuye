package cn.rzhd.wuye.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.rzhd.wuye.bean.Customer;
import cn.rzhd.wuye.bean.PerfectInformation;
import cn.rzhd.wuye.mapper.HomePageMapper;
import cn.rzhd.wuye.mapper.UserDataPerfectionMapper;
import cn.rzhd.wuye.service.IUserDataPerfectionService;
@Service
public class UserDataPerfectionServiceImpl implements IUserDataPerfectionService {

    @Autowired
    private HomePageMapper homeMapper;
    
    @Autowired
    private UserDataPerfectionMapper mapper;
    
    @Override
    public List<Map<String, Object>> findHouseListByCustomer(Customer customer) {
	List<Map<String, Object>> findHomePageHouseByCustomer = homeMapper.findHomePageHouseByCustomer(customer);
	return findHomePageHouseByCustomer;
    }

    @Override
    public void addUserDataPerfection(PerfectInformation perfectInformation) {
	perfectInformation.setStatus(0);
	perfectInformation.setCarteTime(new Date());
//	perfectInformation.setCompanyEstablishTime(new Date());
//	perfectInformation.setCertificateTime(new Date());
//	perfectInformation.setHangBoardTime(new Date());
	mapper.addUserDataPerfection(perfectInformation);
    }

//    @Override
//    public void addEnterTransactMaterial(EnterMaterial enterMaterial) {
//	
//	Integer findMaxEnterTransactMaterialId = mapper.findMaxEnterTransactMaterialId();
//	if (findMaxEnterTransactMaterialId==0) {
//	    enterMaterial.setEnterMaterialId(1l);
//	}else {
//	    enterMaterial.setEnterMaterialId(Long.parseLong((String.valueOf(findMaxEnterTransactMaterialId+1))));
//	}
//	
//	mapper.addEnterTransactMaterial(enterMaterial);
//	
//    }
//
//    @Override
//    public Map<String, Object> feePaymentByHouseId(String customerId, String houseId) {
//	List<Map<String, Object>> kfFeePaymentByHouseId = mapper.kfFeePaymentByHouseId(houseId, customerId);
//	if (kfFeePaymentByHouseId == null || kfFeePaymentByHouseId.size()==0 || kfFeePaymentByHouseId.get(0).size()==0) {
//	    //查询记录表
//	}
//	List<Map<String, Object>> pfFeePaymentByHouseId = mapper.pfFeePaymentByHouseId(houseId, customerId);
//	if (pfFeePaymentByHouseId == null || pfFeePaymentByHouseId.size()==0 || pfFeePaymentByHouseId.get(0).size()==0) {
//	    //查询记录表
//	}
//	return null;
//    }
//
//    @Override
//    public <T> T findDataPerfectionMessage() {
//        
//        return null;
//    }
//
//    @Override
//    public <T> T propertyFeePayInfo(String customerId, String houseId) {
//	// TODO Auto-generated method stub
//	return null;
//    }
//
//    @Override
//    public void payPropertyFeeInvoice(PropertyFeeInvoiceDetails propertyFeeInvoiceDetails) {
//	mapper.payPropertyFeeInvoice(propertyFeeInvoiceDetails);
//	
//    }
}
