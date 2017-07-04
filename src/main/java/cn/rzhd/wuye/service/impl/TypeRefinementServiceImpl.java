package cn.rzhd.wuye.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.rzhd.wuye.bean.TypeRefinement;
import cn.rzhd.wuye.mapper.TypeDifferentiateMapper;
import cn.rzhd.wuye.mapper.TypeRefinementMapper;
import cn.rzhd.wuye.service.ITypeRefinementService;

@Service
public class TypeRefinementServiceImpl implements ITypeRefinementService {

    @Autowired
    private TypeRefinementMapper mapper;
    
    @Autowired
    private TypeDifferentiateMapper difMapper;

	@Override
	public List<TypeRefinement> getDataList(Long typeDifferentiateId) {
		List<TypeRefinement> typeRefinements = mapper.getDataList(typeDifferentiateId);
		return typeRefinements;
	}

	@Override
	public TypeRefinement getOneData(Long typeRefinementId) {
		TypeRefinement typeRefinement = mapper.getOneData(typeRefinementId);
		return typeRefinement;
	}

	@Override
	public void delete(Long typeRefinementId) {
		mapper.delete(typeRefinementId);
	}

	@Override
	public void save(TypeRefinement typerefinement) {
		mapper.addTypeRefinementName(typerefinement);
	}

	@Override
	public void update(TypeRefinement typerefinement) {
		mapper.updatetypeRefinementById(typerefinement);
	}
    

}
