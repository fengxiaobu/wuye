package cn.rzhd.wuye;

import static org.junit.Assert.*;

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
		String vccode = "941Y15043000081";
		PerfectInformation perfectInformation = new PerfectInformation();
		perfectInformation.setPerfectInformationId(vccode);
		
		service.save(perfectInformation);
	}
	
	@Test
	public void test2() throws Exception {
		List<PerfectInformation> all = mapper.selectAll();
		for (PerfectInformation perfectInformation : all) {
			System.out.println(perfectInformation);
		}
	}

}
