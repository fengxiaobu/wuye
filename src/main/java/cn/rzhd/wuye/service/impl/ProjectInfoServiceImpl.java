package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.mapper.ProjectInfoMapper;
import cn.rzhd.wuye.service.IProjectInfoService;
import cn.rzhd.wuye.vo.ProjectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/6/5.
 */
@Service
public class ProjectInfoServiceImpl implements IProjectInfoService {

    @Autowired
    ProjectInfoMapper mapper;
    @Override
    public void addProjectInfo(ProjectVO projectVO) {
        mapper.insert(projectVO);
    }

    @Override
    public void saveProjectInfo(ProjectVO projectVO) throws Exception{
        ProjectVO one = mapper.selectByPrimaryKey(projectVO.getPk_project());
        if(one!=null){
            mapper.updateByERP(projectVO);
        }else{
            mapper.insert(projectVO);
        }
    }


}
