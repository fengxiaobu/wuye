package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.HouseInfo;
import cn.rzhd.wuye.common.WebService;
import cn.rzhd.wuye.mapper.HouseInfoMapper;
import cn.rzhd.wuye.service.IHouseInfoService;
import cn.rzhd.wuye.utils.JsonUtils;
import cn.rzhd.wuye.vo.CorpVO;
import cn.rzhd.wuye.vo.RequesterVO;
import cn.rzhd.wuye.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by hasee on 2017/5/25.
 */
@Service
public class HouseInfoServiceImpl implements IHouseInfoService {

    @Autowired
    HouseInfoMapper houseInfoMapper;

    @Override
    public HouseInfo getById(Long id) {
        return houseInfoMapper.getById(id);
    }

    @Override
    public List<HouseInfo> getAll() {
        List<HouseInfo> list = houseInfoMapper.getAll();
       /* RequesterVO vo = new RequesterVO();
        vo.setKey("liando");
        vo.setBilltype("CORP");
        String data = WebService.getBaseData(vo);
        ResponseVO responseVO = JsonUtils.jsonToPojo(data, ResponseVO.class);
        if (responseVO != null) {
            if ("Y".equals(responseVO.getIssuccess())) {
                List<CorpVO> corpVOList = Arrays.asList(responseVO.getCorpdata());

            }
        }*/

        return list;
    }


    @Override
    public void add(HouseInfo houseInfo) {
        houseInfo.setCreationTime(new Date());
        houseInfoMapper.add(houseInfo);
    }

    @Override
    public void update(HouseInfo houseInfo) {
        houseInfo.setUpdateTime(new Date());
        houseInfoMapper.update(houseInfo);
    }

    @Override
    public void delete(Long id) {
        houseInfoMapper.delete(id);
    }

    /**
     * 获取客户房产
     *
     * @param customerid 客户ID
     * @return
     */
    @Override
    public List<HouseInfo> selectByQuery(String customerid) {
        return houseInfoMapper.selectByQuery(customerid);
    }
}
