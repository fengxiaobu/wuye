package cn.rzhd.wuye.service.impl;

import java.util.List;

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
	public PerfectInformation getByHouseInfoId(String houseInfoId) {
		PerfectInformation perfectInformation = mapper.selectByHouseInfoId(houseInfoId);
		return perfectInformation;
	}

	@Override
	public void updateByHouseInfoId(PerfectInformation perfectInformation) {
		mapper.updateByPrimaryKey(perfectInformation);
	}

	@Override
	public void save(PerfectInformation perfectInformation) {
		mapper.insert(perfectInformation);
	}

	@Override
	public void updateFlow(String vccode) {
		mapper.updateFlow(vccode);
	}

	@Override
	public List<PerfectInformation> getAll() {
		List<PerfectInformation> perfectInformations = mapper.selectAll();
		return perfectInformations;
	}

}
