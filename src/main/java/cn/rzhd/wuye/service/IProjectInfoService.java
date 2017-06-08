package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.ProjectInfo;
import cn.rzhd.wuye.vo.ProjectVO;

/**
 * Created by hasee on 2017/6/5.
 */
public interface IProjectInfoService {

    void addProjectInfo(ProjectVO projectVO);

    /**
     * 此方法用于处理ERP推送更新数据,可能update也可能insert,在此方法中进行判断后执行
     * @param projectVO
     */
    void saveProjectInfo(ProjectVO projectVO) throws Exception;

    /**
     * 根据ID查询项目信息
     * @param pkProject
     * @return
     */
    ProjectInfo selectByPrimaryKey(String pkProject);
}
