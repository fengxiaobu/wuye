package cn.rzhd.wuye.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.rzhd.wuye.bean.TypeDifferentiate;
import cn.rzhd.wuye.mapper.TypeDifferentiateMapper;
import cn.rzhd.wuye.service.ITypeDifferentiateService;

@Service
public class TypeDifferentiateServiceImpl implements ITypeDifferentiateService {

	@Autowired
	private TypeDifferentiateMapper mapper;

	@Override
	public TypeDifferentiate getDataName(Integer typeDifferentiateId) {
		TypeDifferentiate typeDifferentiate = mapper.getDataName(typeDifferentiateId);
		return typeDifferentiate;
	}

}
