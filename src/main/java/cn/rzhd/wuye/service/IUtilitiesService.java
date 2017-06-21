package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.UtilitiesDetails;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/20.
 */
public interface IUtilitiesService {

    Map<String,Object> getLastRecords(UtilitiesQuery query);

    List<UtilitiesDetails> queryAll(UtilitiesQuery query);

    void addDetails(UtilitiesDetails details);

    void changeStatus(UtilitiesDetails details);
}
