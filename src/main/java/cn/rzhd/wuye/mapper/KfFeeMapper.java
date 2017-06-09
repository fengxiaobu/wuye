package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.KfFee;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.FeeDataQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hasee on 2017/6/8.
 */
@Mapper
public interface KfFeeMapper {

    void insert(FeeVO kfFee);

    List<KfFee> selectAll(FeeDataQuery query);

    List<KfFee> selectAllArrears(ArrearsQuery query);
}
