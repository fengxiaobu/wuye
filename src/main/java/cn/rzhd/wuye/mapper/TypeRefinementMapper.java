package cn.rzhd.wuye.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.rzhd.wuye.bean.TypeDifferentiate;
import cn.rzhd.wuye.bean.TypeRefinement;

@Mapper
public interface TypeRefinementMapper {

    public Long findRefinementId();
    
    public TypeRefinement findTypeRefinementNameIsRepeat(@Param("typeRefinementName")String typeRefinementName);
    
    public TypeDifferentiate findTypeDifferentiateIdByName(@Param("typeDifferentiateName")String typeDifferentiateName);
    
    public void addTypeRefinementName(@Param("typeRefinement")TypeRefinement typeRefinement);
    
    public void updatetypeRefinementById(@Param("typeRefinement")TypeRefinement typeRefinement);
    
    /**
     * @param typeDifferentiateId
     * @return 获取数据字典
     */
    List<TypeRefinement> getDataList(Long typeDifferentiateId);
    
    TypeRefinement getOneData(Long typeRefinementId);

	void delete(Long typeRefinementId);
}
