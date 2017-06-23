package cn.rzhd.wuye.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.rzhd.wuye.bean.PerfectInformation;
import cn.rzhd.wuye.mapper.PerfectInformationMapper;
import cn.rzhd.wuye.service.IPerfectInformationService;

@Service
public class PerfectInformationServiceImpl implements IPerfectInformationService {
	@Autowired
	PerfectInformationMapper mapper;

	@Override
	public PerfectInformation getByVccode(String perfectInformationId) {
		PerfectInformation perfectInformation = mapper.selectByPrimaryKey(perfectInformationId);
		return perfectInformation;
	}

	@Override
	public void updateByVccode(PerfectInformation perfectInformation) {
		mapper.updateByPrimaryKey(perfectInformation);
	}

	@Override
	public void save(PerfectInformation perfectInformation) {
		mapper.insert(perfectInformation);
	}

}
