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
    private Integer startNum;
    private Integer endNum;

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

    public Integer getStartNum() {
        return (startPage-1)*pageSize;
    }

    public void setStartNum(Integer startNum) {
        this.startNum = startNum;
    }

    public Integer getEndNum() {
        return startPage*pageSize;
    }

    public void setEndNum(Integer endNum) {
        this.endNum = endNum;
    }

}
