package cn.rzhd.wuye.service;

import cn.rzhd.wuye.vo.SignVO;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * Created by hasee on 2017/5/26.
 */
public interface ISellContractService {
    /**
     *
     * @param billType 数据类型,从LiandoServiceConstant中调用
     * @param companyId 通过查询所有公司,根据公司主键查询
     * @return  返回元素为SignVO的List
     */
    List<SignVO> getSellContract(String billType, String companyId);
    
    List<SignVO> getSellContractByCustomer(@Param("pk_customerid")String pk_customerid,@Param("pk_sign")String pk_sign);

    /**
     *
     * @param signVO 通过Webservice获取并处理得到的销售合同对象
     */
    void addSellContract(SignVO signVO);
    /**
     * 通过客户ID查询合同信息
     */
    List<SignVO> queryByCustomer(String customerId);
    
    /**
     * 后台展示列表
     */
    List<SignVO> getBackAll();
}
