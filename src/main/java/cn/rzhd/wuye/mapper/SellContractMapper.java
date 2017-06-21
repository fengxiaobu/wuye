package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.vo.SignVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hasee on 2017/5/27.
 */
@Mapper
public interface SellContractMapper {
    /**
     * 通过销售合同主键获得销售合同,因销售进程设计如此,返回的可能是多条相同主键的记录
     * @param pk_sign ERP系统中销售合同主键
     * @return  返回销售合同载体对象
     */
    List<SignVO> getById(@Param("pk_customerid")String pk_customerid,@Param("pk_sign")String pk_sign);

    /**
     * 将销售合同对象存入本地数据库
     * @param signVO 获取数据后得到的销售合同载体对象
     */
    void add(SignVO signVO);
    /**
     * 通过客户ID查询销售合同
     */
    List<SignVO> queryByCustomer(String customerId);
    
    List<SignVO> getAll();
    
    List<String> getAllHouse(String pk_customerid);
    
    List<SignVO> getByName(@Param("house")String house,@Param("pk_customerid")String pk_customerid);
}
