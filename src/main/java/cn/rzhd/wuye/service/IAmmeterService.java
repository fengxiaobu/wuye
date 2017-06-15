package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.Ammeter;

import java.util.List;

/**
 * Created by hasee on 2017/6/14.
 */
public interface IAmmeterService {

    List<Ammeter> getAmmeters(String houseInfoId);

    List<Ammeter> getAllAmmeters();
}
