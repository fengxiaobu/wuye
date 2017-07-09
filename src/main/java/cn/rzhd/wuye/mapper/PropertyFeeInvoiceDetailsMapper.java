package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.Invoice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PropertyFeeInvoiceDetailsMapper {
    int deleteByPrimaryKey(String proFeeInvoiceDetailsId);

    int insert(Invoice record);

    Invoice selectByPrimaryKey(String proFeeInvoiceDetailsId);

    List<Invoice> selectAll();

    int updateByPrimaryKey(Invoice record);

    void changeStatusByRecordsId(String id);
}