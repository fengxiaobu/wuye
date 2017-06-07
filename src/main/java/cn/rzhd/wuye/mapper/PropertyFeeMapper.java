package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.PropertyFee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PropertyFeeMapper {
    int insert(PropertyFee record);

    List<PropertyFee> selectAll();
}