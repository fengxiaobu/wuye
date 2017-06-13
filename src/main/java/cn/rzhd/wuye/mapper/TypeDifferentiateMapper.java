package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.TypeDifferentiate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TypeDifferentiateMapper {
    
     void addTypeDifferentiate(@Param("typeDifferentiate")TypeDifferentiate typeDifferentiate );
    
     Long findTypeDifferentiateId();

     TypeDifferentiate findTypeDifferentiateNameIsRepeat(@Param("typeDifferentiateName")String typeDifferentiateName);
    
     void updateTypeDifferentiateById(@Param("typeDifferentiate")TypeDifferentiate typeDifferentiate);
}
