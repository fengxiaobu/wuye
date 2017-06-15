package cn.rzhd.wuye.service.impl;

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
        if (one!=null){
            mapper.updateByPrimaryKey(houseInfoDetails);
        }else{
            mapper.insert(houseInfoDetails);
        }
    }

<<<<<<< HEAD

=======
>>>>>>> 4f8b17e814637763d74f8a19872d8719dc4cb379
	@Override
	public List<HouseVO> getHouseInfoDetails(String vhname) {
		List<HouseVO> houseInfoNames = mapper.getHouseInfoByName(vhname);
		return houseInfoNames;
	}
<<<<<<< HEAD

=======
>>>>>>> 4f8b17e814637763d74f8a19872d8719dc4cb379
    @Override
    public HouseVO selectById(String pkHouse) {
        return mapper.selectByPrimaryKey(pkHouse);
    }
<<<<<<< HEAD

=======
>>>>>>> 4f8b17e814637763d74f8a19872d8719dc4cb379
}
