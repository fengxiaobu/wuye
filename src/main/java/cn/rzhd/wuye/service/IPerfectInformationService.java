package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.PerfectInformation;

public interface IPerfectInformationService {
	
	PerfectInformation getByVccode(String perfectInformationId);

	void updateByVccode(PerfectInformation perfectInformation);
	
	void save(PerfectInformation perfectInformation);
	
	void updateFlow(String vccode);
}
