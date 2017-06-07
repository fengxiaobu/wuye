package cn.rzhd.wuye.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasee on 2017/6/1.
 */
public class JsonResult {
    private Boolean isSuccess;
    private String msg;
    private List<Object> data = new ArrayList<>();

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JsonResult(String msg) {
        this.isSuccess = false;
        this.msg = msg;
    }

    public JsonResult() {
        this.isSuccess = true;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }
}
