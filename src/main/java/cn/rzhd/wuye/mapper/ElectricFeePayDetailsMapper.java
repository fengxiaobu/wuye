package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.ElectricFeePayDetails;
import cn.rzhd.wuye.vo.UtilitiesQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hasee on 2017/6/2.
 */
@Mapper
public interface ElectricFeePayDetailsMapper {

    List<ElectricFeePayDetails> selectAll(UtilitiesQuery query);
}
