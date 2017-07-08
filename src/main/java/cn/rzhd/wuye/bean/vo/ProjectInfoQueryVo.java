package cn.rzhd.wuye.bean.vo;

import cn.rzhd.wuye.common.PageQuery;

/**
 * @ClassName HouseInfoDetailsVo
 * @Description 房产信息查询条件
 * @author qinjuncai
 * @Date 2017年7月4日 下午8:19:38
 * @version 1.0.0
 */
public class ProjectInfoQueryVo {

    /**
     * 分页参数
     */
    private PageQuery pageQuery;

    /**
     * 房产名称
     */
    private String projectName;

    
    public PageQuery getPageQuery() {
        return pageQuery;
    }

    
    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }


    
    public String getProjectName() {
        return projectName;
    }


    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }




    

    
  
    
}
