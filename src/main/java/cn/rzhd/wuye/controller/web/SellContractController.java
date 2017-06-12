package cn.rzhd.wuye.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.rzhd.wuye.service.ISellContractService;
import cn.rzhd.wuye.vo.SignVO;

/**
 * Created by ghr on 2017/6/10.
 *
 */
@RestController
@RequestMapping("/sell/contract")
public class SellContractController {
	@Autowired
	ISellContractService sellContractService;
	
	@RequestMapping("/getSellContractlist")
	public List<SignVO> getSellContract(String pk_sign){
        List<SignVO> sellContractList = sellContractService.getSellContract(pk_sign);
        return sellContractList;
    } 
}
