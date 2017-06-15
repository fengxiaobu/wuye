package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.vo.PactVO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

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
    
    List<PactVO> getByPkId(String house);

    void add(PactVO pactVO);

<<<<<<< HEAD
    
    List<PactVO> getAll();

=======
    List<PactVO> getAll();
>>>>>>> 4f8b17e814637763d74f8a19872d8719dc4cb379
    /**
     * 通过客户ID查询租赁合同信息
     */
    List<PactVO> queryByCustomer(String customerId);
<<<<<<< HEAD

=======
>>>>>>> 4f8b17e814637763d74f8a19872d8719dc4cb379
}
