package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.TSys;

public interface ISysServer {

    /**
     * @Description 根据id查询系统设置信息
     * @param id
     * @return
     */
    TSys findSysByid(String id);

    /**
     * @Description 查询唯一一条系统设置信息
     * @return
     */
    TSys findSysOnlyOne();
    
    /**
     * 新增或编辑系统设置信息
     */
    void saveOrUpdate(TSys sys);

}
