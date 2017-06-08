package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.PropertyFee;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.FeeDataQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PropertyFeeMapper {

    int insert(FeeVO record);

    List<PropertyFee> selectAll(FeeDataQuery query);

    List<PropertyFee> selectAllArrears(ArrearsQuery query);
}