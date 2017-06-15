package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.service.IHouseInfoDetailsService;
import cn.rzhd.wuye.vo.HouseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ghr on 2017/6/12.
 *
 */
@RestController
@RequestMapping("/houseInfo/houseInfoDetails")
public class HouseInfoDetailsController {
	@Autowired
	IHouseInfoDetailsService houseInfoDetailsService;

	@RequestMapping("/getHouseInfoDetails")
	public List<HouseVO> getHouseInfoDetails(String pk_house) {
		List<HouseVO> houseInfoDetails = houseInfoDetailsService.getHouseInfoDetails(pk_house);
		return houseInfoDetails;
	}
}
