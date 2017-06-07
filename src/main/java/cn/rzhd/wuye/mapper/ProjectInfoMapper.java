package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.vo.ProjectVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ProjectInfoMapper {
    int deleteByPrimaryKey(String pkProject);

    int insert(ProjectVO record);

    ProjectVO selectByPrimaryKey(String pkProject);

    List<ProjectVO> selectAll();

    void updateByPrimaryKey(ProjectVO record);

    void updateByERP(ProjectVO record);
}