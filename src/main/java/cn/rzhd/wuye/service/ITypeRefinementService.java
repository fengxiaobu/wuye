package cn.rzhd.wuye.service;

import java.util.List;

import cn.rzhd.wuye.bean.TypeRefinement;

public interface ITypeRefinementService {

	List<TypeRefinement> getDataList(Long typeDifferentiateId);

	TypeRefinement getOneData(Long typeRefinementId);

	void delete(Long typeRefinementId);

	void save(TypeRefinement typerefinement);

	void update(TypeRefinement typerefinement);
}
