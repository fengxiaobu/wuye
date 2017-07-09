package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.HouseInfoDetails;
import cn.rzhd.wuye.mapper.HouseInfoDetailsMapper;
import cn.rzhd.wuye.service.IHouseInfoDetailsService;
import cn.rzhd.wuye.vo.HouseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hasee on 2017/6/5.
 */
@Service
public class HouseInfoDetailsServiceImpl implements IHouseInfoDetailsService {

    @Autowired
    HouseInfoDetailsMapper mapper;

    @Override
    public void addHouseInfoDetails(HouseVO houseInfoDetails) {
        mapper.insert(houseInfoDetails);
    }

    @Override
    public void saveHouseInfoDetails(HouseVO houseInfoDetails) throws Exception {
        HouseVO one = mapper.selectByPrimaryKey(houseInfoDetails.getPk_house());
        if (one != null) {
            mapper.updateByPrimaryKey(houseInfoDetails);
        } else {
            mapper.insert(houseInfoDetails);
        }
    }


    @Override
    public List<HouseVO> getHouseInfoDetails(String pk_house) {
        List<HouseVO> houseInfoNames = mapper.getHouseInfoByName(pk_house);
        return houseInfoNames;
    }

    @Override
    public HouseVO selectById(String pkHouse) {
        return mapper.selectByPrimaryKey(pkHouse);
    }

    @Override
    public List<HouseVO> getBackAll() {
        List<HouseVO> houseVOs = mapper.getAll();
        return houseVOs;
    }

    @Override
    public void updateHouseInfoDetails(HouseVO houseVO) {
        mapper.updateByPrimaryKey(houseVO);
    }

    @Override
    public void updateHouse(String pkHouse, String enterApplyState,String decorationapplystate) {
        mapper.updateHouse(pkHouse, enterApplyState,decorationapplystate);
    }

    @Override
    public HouseInfoDetails selectByPkHouse(String pkHouse) {
        return mapper.selectByPkHouse(pkHouse);
    }

    @Override
    public List<HouseVO> selectAll() {
        List<HouseVO> houseVOs = mapper.selectAll();
        return houseVOs;
    }
    
    @Override
    public void updadteState(String alreadyFinish, String houseInfoId) {
        mapper.updadteState(alreadyFinish,houseInfoId);
    }

    @Override
    public void updatehouse(HouseInfoDetails houseInfoDetails) {
        mapper.updatehouseByPkHouse(houseInfoDetails);
    }

    @Override
    public HouseInfoDetails selectHouseInfoDetailsById(String pkHouse) {
        return mapper.selectHouseInfoDetailsById(pkHouse);
    }

    @Override
    public List<HouseInfoDetails> selectByPkProject(String pkProject) {
        return mapper.selectByPkProject(pkProject);
    }

}
