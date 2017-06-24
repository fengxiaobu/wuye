package cn.rzhd.wuye;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.rzhd.wuye.service.IRentContractService;
import cn.rzhd.wuye.vo.PactVO;

public class RentContractServiceTest extends BaseTest {
	@Autowired
	IRentContractService service;
	
	@Test
	public void test1() throws Exception {
		String vccode = "ZLZH20100703108";
		List<PactVO> pactVOs = service.getRentContractByCustomer(vccode);
		for (PactVO pactVO : pactVOs) {
			System.out.println(pactVO);
		}
	}
}
