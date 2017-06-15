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
@RequestMapping("/dist/rent/contract")
public class RentContractController {
	@Autowired
	IRentContractService rentContractService;
	
	@RequestMapping("/getRentContractlist")
	public List<PactVO> getRentContract(String house){
        List<PactVO> rentContractlist = rentContractService.getRentContract(house);
       
        return rentContractlist;
    } 
}
