package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.mapper.SellContractMapper;
import cn.rzhd.wuye.service.ISellContractService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import cn.rzhd.wuye.vo.SignVO;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhongchaojie on 2017/5/26.
 * 获取所有销售合同
 */
@Service
public class SellContractServiceImpl implements ISellContractService {

    @Autowired
    SellContractMapper mapper;

    @Override
    public List<SignVO> getSellContract(String billType, String companyId) {
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
            if ("Y".equals(responseVO.getIssuccess()) && StringUtil.isEmpty(responseVO.getErrorinfo())){
                SignVO[] signdata = responseVO.getSigndata();
                return Arrays.asList(signdata);
            }
        }
        return null;
    }

    @Override
    public void addSellContract(SignVO signVO) {
        mapper.add(signVO);
    }


	@Override
	public List<SignVO> getSellContractByCustomer(String pk_customerid,String pk_sign){
		List<SignVO> signVOs = mapper.getById(pk_customerid,pk_sign);
		return signVOs;
	}

    @Override
    public List<SignVO> queryByCustomer(String customerId) {
        return mapper.queryByCustomer(customerId);
    }

	@Override
	public List<SignVO> getBackAll() {
		List<SignVO> signVOAll = mapper.getAll();
		return signVOAll;
	}

	@Override
	public List<String> getAllName(String pk_customerid) {
		List<String> houses = mapper.getAllHouse(pk_customerid);
		return houses;
	}

	@Override
	public List<SignVO> getByName(String house, String pk_customerid) {
		List<SignVO> signVOs = mapper.getByName(house, pk_customerid);
		return signVOs;
	}

	@Override
	public List<SignVO> getByVccode(String vccode) {
		List<SignVO> signVOs = mapper.getCusId(vccode);
		return signVOs;
	}


}
