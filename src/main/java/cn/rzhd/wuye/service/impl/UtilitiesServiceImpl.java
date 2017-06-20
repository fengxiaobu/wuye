package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.UtilitiesDetails;
import cn.rzhd.wuye.mapper.UtilitiesDetailsMapper;
import cn.rzhd.wuye.service.IUtilitiesService;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/20.
 */
@Service
public class UtilitiesServiceImpl implements IUtilitiesService {
    @Autowired
    UtilitiesDetailsMapper mapper;
    @Override
    public Map<String,Object> getLastRecords(UtilitiesQuery query) {
        Map<String,Object> map = new HashMap<>();
        map.put("electric",mapper.getLastElectric(query));
        map.put("water",mapper.getLastWater(query));
        return map;
    }

    @Override
    public List<UtilitiesDetails> queryAll(UtilitiesQuery query) {
        if (StringUtil.isNotEmpty(query.getStartDate()) && StringUtil.isNotEmpty(query.getEndDate())){
            return mapper.selectAll(query);
        }
        return null;
    }

    @Override
    public void addDetails(UtilitiesDetails details) {
        mapper.insert(details);
    }

    @Override
    public void changeStatus(UtilitiesDetails details) {
        mapper.changeStatus(details);
    }
}
