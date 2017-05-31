package cn.rzhd.wuye;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.IRentContractService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hasee on 2017/5/26.
 */
public class RentContractServiceTest extends BaseTest {
    @Autowired
    IRentContractService service;

    @Test
    public void getRentContractTest(){
        List<PactVO> rentContract = service.getRentContract(LiandoServiceConstant.DATA_TYPE_PACT, "1031");
        for (PactVO pactVO : rentContract) {
            System.out.println(pactVO);
        }

    }

    @Test
    public void getCompanyId(){
        RequesterVO vo = new RequesterVO();
        vo.setBilltype("CORP");
        String baseData = WebService.getBaseData(vo);
        System.out.println(baseData);
    }

    @Test
    public void addTest(){
        RequesterVO vo = new RequesterVO();
        vo.setKey("liando");
        vo.setBilltype("CORP");
        String baseData = WebService.getBaseData(vo);
        ResponseVO responseVO = JsonUtils.jsonToPojo(baseData, ResponseVO.class);
        if (responseVO!=null){
            if ("Y".equals(responseVO.getIssuccess())){
                for (CorpVO corpVO : responseVO.getCorpdata()) {
                    String pk_corp = corpVO.getPk_corp();
                    if (!pk_corp.isEmpty()){
                        List<PactVO> pactVOList = service.getRentContract(LiandoServiceConstant.DATA_TYPE_PACT, pk_corp);
                        if (pactVOList!=null) {
                            for (PactVO pactVO: pactVOList) {
                                service.addRentContract(pactVO);
                            }
                        }

                    }
                }

            }
        }
    }
}