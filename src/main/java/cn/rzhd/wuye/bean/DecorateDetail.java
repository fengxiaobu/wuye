package cn.rzhd.wuye.bean;

import java.io.Serializable;
/**
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: DecorateDetail
@Description: 描述：装修明细实体类
@author: an-wei.xie@rzhd.cn
@date: 2017年5月23日 上午11:18:46
@version: V1.0
 */
public class DecorateDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * 主键id
     */
    private Long DecorateDetailId;
    
    /**
     * 装修申请表id
     */
    private Long decorationApplyId;
    
    /**
     * 明细顺序
     */
    private Long detailOrder;
    
    /**
     * 明细内容
     */
    private String detailContent;

    public Long getDecorateDetailId() {
        return DecorateDetailId;
    }

    public void setDecorateDetailId(Long decorateDetailId) {
        DecorateDetailId = decorateDetailId;
    }

    public Long getDecorationApplyId() {
        return decorationApplyId;
    }

    public void setDecorationApplyId(Long decorationApplyId) {
        this.decorationApplyId = decorationApplyId;
    }

    public Long getDetailOrder() {
        return detailOrder;
    }

    public void setDetailOrder(Long detailOrder) {
        this.detailOrder = detailOrder;
    }

    public String getDetailContent() {
        return detailContent;
    }

    public void setDetailContent(String detailContent) {
        this.detailContent = detailContent;
    }

    @Override
    public String toString() {
        return "DecorateDetail{" +
                "DecorateDetailId=" + DecorateDetailId +
                ", decorationApplyId=" + decorationApplyId +
                ", detailOrder=" + detailOrder +
                ", detailContent='" + detailContent + '\'' +
                '}';
    }
}
