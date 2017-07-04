package cn.rzhd.wuye;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.rzhd.wuye.bean.PerfectInformation;
import cn.rzhd.wuye.mapper.PerfectInformationMapper;
import cn.rzhd.wuye.service.IPerfectInformationService;

public class PerfectInformationTest extends BaseTest {
	@Autowired
	IPerfectInformationService service;
	@Autowired
	PerfectInformationMapper mapper;

	Date date = new Date();

	@Test
	public void test1() throws Exception {
		String vccode = "          ";
		PerfectInformation perfectInformation = new PerfectInformation();
		perfectInformation.setPerfectInformationId(vccode);
		perfectInformation.setCarteTime(date);
		perfectInformation.setCertificateTime(date);
		perfectInformation.setCompanyCoverageId(123L);
		perfectInformation.setCompanyEstablishTime(date);
		perfectInformation.setCompanyType(123);
		perfectInformation.setCustomerId("123");
		perfectInformation.setEmergencyContactNumber("22");
		perfectInformation.setEmergencyContactPerson("56465");
		perfectInformation.setEmployeeNumber(77L);
		perfectInformation.setHangBoardTime(date);
		perfectInformation.setHighNewType(12300);
		perfectInformation.setHouseInfoId("741");
		perfectInformation.setHousePropertyId(1L);
		perfectInformation.setIndustryInvolvedId(1L);
		perfectInformation.setMainProduct("777");
		perfectInformation.setIsUpBazaar(1);
		perfectInformation.setNotes("123");
		perfectInformation.setPatentNumber(12300);
		perfectInformation.setPropertyToAccess("111");
		perfectInformation.setPropertyToAccessContact("777");
		perfectInformation.setSignInFund(new BigDecimal(111));
		perfectInformation.setUpdateTime(date);
		//perfectInformation.setURavinePropertyId(444L);
		perfectInformation.setUpBazaarTypeId(1L);
		perfectInformation.setStockCode("456");
		perfectInformation.setStatus(11);
		
		service.save(perfectInformation);
	}
	
	@Test
	public void test2() throws Exception {
		List<PerfectInformation> all = mapper.selectAll();
		for (PerfectInformation perfectInformation : all) {
			System.out.println(perfectInformation);
		}
	}

	
	@Test
	public void test3() throws Exception {
		String houseInfoId="1040AM1000000000SVVZ";
		PerfectInformation information = mapper.selectByHouseInfoId(houseInfoId);
		System.out.println(information);
	}
}
