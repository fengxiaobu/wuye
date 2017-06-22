package cn.rzhd.wuye.service;

import java.util.List;

import cn.rzhd.wuye.bean.TypeRefinement;

public interface ITypeRefinementService {
    
    // void addTypeRefinement(TypeRefinementVo typeRefinementVo);

	List<TypeRefinement> getDataList(Integer typeDifferentiateId);
}
