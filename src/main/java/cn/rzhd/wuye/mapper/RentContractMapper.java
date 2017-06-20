package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.vo.PactVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hasee on 2017/5/28.
 */
@Mapper
public interface RentContractMapper {
    /**
     * 通过租赁合同主键获得对应的租赁合同记录
     * @param pk_pact 租赁合同主键
     * @return 租赁合同载体对象
     */
    PactVO getById(String pk_pact);
    
    List<PactVO> getByPkId(String pk_pact);

    void add(PactVO pactVO);

    List<PactVO> getAll();

    /**
     * 通过客户ID查询租赁合同信息
     */
    List<PactVO> queryByCustomer(@Param("customerId") String customerId);
}
