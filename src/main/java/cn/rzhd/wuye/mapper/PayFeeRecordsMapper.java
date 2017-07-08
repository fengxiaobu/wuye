package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.PayFeeRecords;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PayFeeRecordsMapper {
    int deleteByPrimaryKey(String recordsId);

    int insert(PayFeeRecords record);

    PayFeeRecords selectByPrimaryKey(String recordsId);

    List<PayFeeRecords> selectAll();

    int updateByPrimaryKey(PayFeeRecords record);
}