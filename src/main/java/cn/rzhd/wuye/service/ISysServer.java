package cn.rzhd.wuye.service;

import java.util.List;

import cn.rzhd.wuye.bean.HouseInfoDetails;
import cn.rzhd.wuye.bean.ProjectInfo;
import cn.rzhd.wuye.bean.TSys;
import cn.rzhd.wuye.bean.vo.HouseInfoDetailsQueryVo;
import cn.rzhd.wuye.bean.vo.ProjectInfoQueryVo;
import cn.rzhd.wuye.utils.PageDataGridResult;

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

    
    /**
     * @Description 查询房产列表总记录数
     * @param queryVo
     * @return
     */
    int findHouseCount(HouseInfoDetailsQueryVo queryVo);

    /**
     * @Description 分页查找房产数据
     * @param queryVo
     * @return
     */
    List<HouseInfoDetails> findHouseListPage(HouseInfoDetailsQueryVo queryVo);
    
    /**
     * @Description 查询项目列表总记录数
     * @param queryVo
     * @return
     */
    int findProjectCount(ProjectInfoQueryVo queryVo);

    /**
     * @Description 分页查找项目数据
     * @param queryVo
     * @return
     */
    List<ProjectInfo> findProjectListPage(ProjectInfoQueryVo queryVo);


}
