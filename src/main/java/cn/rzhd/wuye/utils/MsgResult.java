package cn.rzhd.wuye.utils;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MsgResult {

    private boolean flag;
    private String msg;
    private Object data;

    private MsgResult() {

    }

    private static MsgResult mr = null;

    private static MsgResult getInstant() {
        if (null == mr) {
            mr = new MsgResult();
        }
        return mr;
    }


    public static MsgResult result(boolean flag, String msg, Object data) {
        MsgResult mResult = MsgResult.getInstant();
        mResult.setFlag(flag);
        mResult.setMsg(msg);
        mResult.setData(data);
        return mResult;
    }

    public static MsgResult nodata(boolean flag, String msg) {
        MsgResult mResult = MsgResult.getInstant();
        mResult.setFlag(flag);
        mResult.setMsg(msg);
        mResult.setData(null);
        return mResult;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static void getLogger(Class t, String msg) {
        Logger logger = Logger.getLogger(t);
        logger.info(msg);
    }

    @Override
    public String toString() {
        return "MsgResult [flag=" + flag + ", msg=" + msg + ", data=" + data
                + "]";
    }

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));

    }

}
