package cn.rzhd.wuye.service;

import java.util.List;

import cn.rzhd.wuye.bean.PerfectInformation;

public interface IPerfectInformationService {
	
	PerfectInformation getByHouseInfoId(String houseInfoId);

	void updateByHouseInfoId(PerfectInformation perfectInformation);
	
	void save(PerfectInformation perfectInformation);
	
	void updateFlow(String vccode);
	
	List<PerfectInformation> getAll();
}
