package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.PayFeeRecords;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PayFeeRecordsMapper {
    int deleteByPrimaryKey(String recordsId);

    int insert(PayFeeRecords record);

    PayFeeRecords selectByPrimaryKey(String recordsId);

    List<PayFeeRecords> selectAll();

    int updateByPrimaryKey(PayFeeRecords record);

    String getTypeById(String id);

    List<Map<String,Object>> getByProject(PropertyRecordsQuery query);
}