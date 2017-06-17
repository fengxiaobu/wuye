package cn.rzhd.wuye.bean.vo;

import cn.rzhd.wuye.bean.DecorateDetail;
import cn.rzhd.wuye.bean.DecorationApply;
import cn.rzhd.wuye.bean.DecorationMaterial;

import java.io.Serializable;
import java.util.List;

/**
 * luopa 在 2017/6/16 创建.
 */
public class ResousVO implements Serializable {
    /**
     * 装修申请
     */
    private static final long serialVersionUID = 1L;
    private DecorationApply decorationApply;
    /**
     * 装修详情
     */
    private List<DecorateDetail> decorateDetailList;
    /**
     * 装修资料
     */
    private List<DecorationMaterial> decorationMaterialList;

    public DecorationApply getDecorationApply() {
        return decorationApply;
    }

    public void setDecorationApply(DecorationApply decorationApply) {
        this.decorationApply = decorationApply;
    }

    public List<DecorateDetail> getDecorateDetailList() {
        return decorateDetailList;
    }

    public void setDecorateDetailList(List<DecorateDetail> decorateDetailList) {
        this.decorateDetailList = decorateDetailList;
    }

    public List<DecorationMaterial> getDecorationMaterialList() {
        return decorationMaterialList;
    }

    public void setDecorationMaterialList(List<DecorationMaterial> decorationMaterialList) {
        this.decorationMaterialList = decorationMaterialList;
    }

    @Override
    public String toString() {
        return "ResousVO{" +
                "decorationApply=" + decorationApply +
                ", decorateDetailList=" + decorateDetailList +
                ", decorationMaterialList=" + decorationMaterialList +
                '}';
    }
}
