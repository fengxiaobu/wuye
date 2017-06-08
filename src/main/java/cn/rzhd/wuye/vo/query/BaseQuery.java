package cn.rzhd.wuye.vo.query;

import java.text.SimpleDateFormat;

/**
 * Created by hasee on 2017/5/31.
 */

public class BaseQuery {
    protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private Long id;
    private Integer startPage;
    private Integer pageSize;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
