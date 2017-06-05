package cn.rzhd.wuye.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.rzhd.wuye.bean.EnterMaterial;
import cn.rzhd.wuye.bean.PerfectInformation;

@Mapper
public interface UserDataPerfectionMapper {
    
    <T> T addUserDataPerfection(@Param("perfectInformation") PerfectInformation perfectInformation);
    
    <T> T addEnterTransactMaterial(@Param("enterMaterial") EnterMaterial enterMaterial);

}
