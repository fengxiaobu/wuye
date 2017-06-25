package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.KfFeePayDetails;
import cn.rzhd.wuye.vo.query.KfFeePayDetailsQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/1.
 */
@Mapper
public interface KfFeePayDetailsMapper {
    List<KfFeePayDetails> queryAll(KfFeePayDetailsQuery query);

    void insert(KfFeePayDetails details);

    void changeStatus(Long id);

    List<Map<String,Object>> getByProject(Long userId);
}
