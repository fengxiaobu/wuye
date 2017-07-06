package cn.rzhd.wuye.utils;

import java.util.ArrayList;
import java.util.List;

public class PageDataGridResult {

    private long total;
    private List<?> rows = new ArrayList<>();
    private String data;

    public PageDataGridResult() {
    }

    public PageDataGridResult(long total, List<?> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }


}
