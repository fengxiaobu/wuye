package cn.rzhd.wuye.bean.vo;

import cn.rzhd.wuye.common.PageQuery;

/**
 * @ClassName HouseInfoDetailsVo
 * @Description 房产信息查询条件
 * @author qinjuncai
 * @Date 2017年7月4日 下午8:19:38
 * @version 1.0.0
 */
public class AmmeQueryVo {

    /**
     * 分页参数
     */
    private PageQuery pageQuery;

    /**
     * 电表编号
     */
    private String ammeterNo;

    /**
     * 项目名称
     */
    private String projectName;
    
    
    public PageQuery getPageQuery() {
        return pageQuery;
    }

    
    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }


    


    
    
    public String getAmmeterNo() {
        return ammeterNo;
    }


    
    public void setAmmeterNo(String ammeterNo) {
        this.ammeterNo = ammeterNo;
    }


    public String getProjectName() {
        return projectName;
    }


    
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    
}
