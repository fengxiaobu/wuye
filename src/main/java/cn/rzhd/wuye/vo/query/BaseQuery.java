package cn.rzhd.wuye.vo.query;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 * Created by hasee on 2017/5/31.
 */

public class BaseQuery implements Serializable{
    protected static final long serialVersionUID = 1L;
    protected SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private String customerId;
    private Integer startPage = 1;
    private Integer pageSize = 10;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
