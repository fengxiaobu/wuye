package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.KfFeePayDetails;
import cn.rzhd.wuye.common.UpdateToERP;
import cn.rzhd.wuye.mapper.KfFeePayDetailsMapper;
import cn.rzhd.wuye.service.IKfFeePayDetailsService;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.LiandoServiceConstant;
import cn.rzhd.wuye.vo.query.KfFeePayDetailsQuery;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/1.
 */
@Service
public class KfFeePayDetailsServiceImpl implements IKfFeePayDetailsService {
    @Autowired
    KfFeePayDetailsMapper mapper;

    @Override
    public List<KfFeePayDetails> queryAll(KfFeePayDetailsQuery query) {
        if (StringUtil.isNotEmpty(query.getStartDate()) && StringUtil.isNotEmpty(query.getEndDate())){
            return mapper.queryAll(query);
        }
        return null;
    }

    @Override
    public void addDetails(KfFeePayDetails details) {
        mapper.insert(details);
    }

    @Override
    public void changeStatus(Long id) {
        mapper.changeStatus(id);
    }

    @Override
    public List<Map<String, Object>> getByProject(PropertyRecordsQuery query) {
        return mapper.getByProject(query);
    }

    @Override
    public String getCompanyAccount(String feecode, String pk_corp) {
        return mapper.getCompanyAccount(feecode,pk_corp);
    }

    @Override
    public String getCompanyAccount(String pk_feeType) {
        return mapper.getCompanyAccountByPkFeeType(pk_feeType);
    }

    @Override
    public String getCostType(String feecode, String pk_corp) {
        return mapper.getCostType(feecode,pk_corp);
    }

    @Override
    public String getCompanyName(String feecode, String pk_corp) {
        return mapper.getCompanyName(feecode,pk_corp);
    }

    @Override
    public String getCompanyName(String pk_feeType) {
        return mapper.getCompanyNameByPkFeeType(pk_feeType);
    }

    @Override
    public Integer countByQuery(PropertyRecordsQuery query) {
        return mapper.countByQuery(query);
    }

    @Override
    public void changeStatusByRecordsId(String id) {
        mapper.changeStatusByRecordsId(id);
    }

    @Override
    public void updateToERP(String id) {
        List<FeeVO> list = mapper.getFeeDataByRecordsId(id);
        Map<String, String> map = UpdateToERP.updateToERP(list,LiandoServiceConstant.DATA_TYPE_KF_FEE);
        String billid = map.get("billid");
        String billno = map.get("billno");
        mapper.updateBillIdByRecordsId(id, billid, billno);
    }
}
