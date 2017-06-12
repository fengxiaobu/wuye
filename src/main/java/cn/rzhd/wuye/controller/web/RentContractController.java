package cn.rzhd.wuye.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.rzhd.wuye.service.IRentContractService;
import cn.rzhd.wuye.vo.PactVO;

/**
 * Created by ghr on 2017/6/10.
 *
 */
@RestController
@RequestMapping("/rent/contract")
public class RentContractController {
	@Autowired
	IRentContractService rentContractService;
	
	@RequestMapping("/getRentContractlist")
	public List<PactVO> getRentContract(String pk_pact){
        List<PactVO> rentContractlist = rentContractService.getRentContract(pk_pact);
        return rentContractlist;
    } 
}
