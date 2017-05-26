package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.TypeDifferentiate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TypeDifferentiateMapper {
    
    public void addTypeDifferentiate(@Param("typeDifferentiate")TypeDifferentiate typeDifferentiate );
    
    public Long findTypeDifferentiateId();
    
    public TypeDifferentiate findTypeDifferentiateNameIsRepeat(@Param("typeDifferentiateName")String typeDifferentiateName);
    
    public void updateTypeDifferentiateById(@Param("typeDifferentiate")TypeDifferentiate typeDifferentiate);
}
