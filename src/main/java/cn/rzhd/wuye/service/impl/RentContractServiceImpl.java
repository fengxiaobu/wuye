package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.mapper.RentContractMapper;
import cn.rzhd.wuye.service.IRentContractService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.PactVO;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hasee on 2017/5/26.
 */
@Service
public class RentContractServiceImpl implements IRentContractService {

    @Autowired
    RentContractMapper mapper;

    @Override
    public List<PactVO> getRentContract(String billType, String companyId) {
        //创建请求载体对象
        RequesterVO requesterVO = new RequesterVO();
        //设置请求参数
        requesterVO.setKey("liando");
        requesterVO.setBilltype(billType);
        requesterVO.setPk_corp(companyId);
        //调用方法得到json字符串
        String data = WebService.getBaseData(requesterVO);
        //转为ResponseVO
        ResponseVO responseVO = JsonUtils.jsonToPojo(data, ResponseVO.class);
        //判断是否为空
        if (responseVO!=null){
            //判断获取数据是否成功
            if ("Y".equals(responseVO.getIssuccess())&& StringUtil.isEmpty(responseVO.getErrorinfo())){
                PactVO[] pactdata = responseVO.getPactdata();
                return Arrays.asList(pactdata);
            }
        }
        return null;
    }

    @Override
    public void addRentContract(PactVO pactVO) {
        mapper.add(pactVO);
    }

	@Override
	public List<PactVO> getRentContract(String pk_pact) {
		List<PactVO> byPkId = mapper.getByPkId(pk_pact);
		return byPkId;
	}

	
}
