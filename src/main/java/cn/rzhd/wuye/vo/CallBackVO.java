package cn.rzhd.wuye.vo;

import java.io.Serializable;

/**
 * Created by hasee on 2017/6/26.
 * 用于银联支付成功回调接口中将json字段转为pojo
 */
public class CallBackVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String type;//费用类型(wuye-物业,kaifa-开发,shuidian-水电)
    private Long id;//缴费记录ID
    private Long applyId;//房产主键

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplyId() {
        return applyId;
    }

    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }
}
