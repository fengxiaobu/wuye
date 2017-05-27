package cn.rzhd.wuye.service;

/**
 * Created by hasee on 2017/5/26.
 */
public interface ISellContractService {
    /**
     *
     * @param billType 数据类型,从LiandoServiceConstant中调用
     * @param companyId 通过查询所有公司,根据公司主键查询
     * @return  暂时返回json字符串
     */
    String getSellContract(String billType,String companyId);
}
