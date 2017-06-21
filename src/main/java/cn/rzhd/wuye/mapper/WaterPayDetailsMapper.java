package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.WaterRatePayDetails;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hasee on 2017/6/2.
 */
@Mapper
public interface WaterPayDetailsMapper {

    List<WaterRatePayDetails> getAllByQuery(UtilitiesQuery query);

    WaterRatePayDetails getLastRecords(UtilitiesQuery query);
}
