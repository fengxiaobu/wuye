package cn.rzhd.wuye.service;

import cn.rzhd.wuye.vo.PactVO;

import java.util.List;

/**
 * Created by hasee on 2017/5/26.
 */
public interface IRentContractService {
    /**
     *
     * @param billType 数据类型,为Pact,查询租赁合同
     * @param companyId 公司主键,pk_corp
     * @return
     */
    List<PactVO> getRentContract(String billType, String companyId);
    
    
    List<PactVO> getRentContract(String house);
    

    /**
     *
     * @param pactVO 存入租赁合同信息
     */
    void addRentContract(PactVO pactVO);
    
    List<PactVO> getBackAll();
}
