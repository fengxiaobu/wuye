package cn.rzhd.wuye;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.service.IHouseInfoDetailsService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.*;
import com.github.pagehelper.StringUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hasee on 2017/6/5.
 */
public class HouseInfoDetailsServiceTest extends BaseTest {

    @Autowired
    IHouseInfoDetailsService service;

    @Test
    public void addHouseInfoDetailsTest(){
        RequesterVO req = new RequesterVO();
        req.setKey("liando");
        req.setBilltype(LiandoServiceConstant.DATA_TYPE_CORP);
        String corpStr = WebService.getBaseData(req);
        ResponseVO responseVO = JsonUtils.jsonToPojo(corpStr, ResponseVO.class);
        if ("Y".equals(responseVO.getIssuccess()) && StringUtil.isEmpty(responseVO.getErrorinfo())) {
            CorpVO[] corpdata = responseVO.getCorpdata();
            req.setBilltype(LiandoServiceConstant.DATA_TYPE_HOUSE);
            for (CorpVO vo : corpdata) {
                String pk_corp = vo.getPk_corp();
                req.setPk_corp(pk_corp);
                String houseInfoDetailsStr = WebService.getBaseData(req);
                ResponseVO houseInfoDetailsResult = JsonUtils.jsonToPojo(houseInfoDetailsStr, ResponseVO.class);
                if ("Y".equals(responseVO.getIssuccess()) && StringUtil.isEmpty(houseInfoDetailsResult.getErrorinfo())) {
                    HouseVO[] housedata = houseInfoDetailsResult.getHousedata();
                    for (HouseVO houseVO : housedata) {
                        service.addHouseInfoDetails(houseVO);
                    }
                }
            }
        }
    }
}

