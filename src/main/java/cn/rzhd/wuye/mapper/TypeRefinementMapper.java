package cn.rzhd.wuye.mapper;


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
    
}
