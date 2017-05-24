package cn.rzhd.wuye.bean;

import java.io.Serializable;

/**
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: DecorationMaterial
@Description: 描述：装修资料
@author: an-wei.xie@rzhd.cn
@date: 2017年5月23日 下午1:50:27
@version: V1.0
 */
public class DecorationMaterial implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    /**
     * 主键
     */
    private Long decorationMaterialId;
    
    /**
     * 装修申请表id
     */
    private Long decorationApplyId;
    
    /**
     * 资料名称
     */
    private String materialName;
    
    /**
     * 资料地址
     */
    private String materialAddress;

    public Long getDecorationMaterialId() {
        return decorationMaterialId;
    }

    public void setDecorationMaterialId(Long decorationMaterialId) {
        this.decorationMaterialId = decorationMaterialId;
    }

    public Long getDecorationApplyId() {
        return decorationApplyId;
    }

    public void setDecorationApplyId(Long decorationApplyId) {
        this.decorationApplyId = decorationApplyId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getMaterialAddress() {
        return materialAddress;
    }

    public void setMaterialAddress(String materialAddress) {
        this.materialAddress = materialAddress;
    }
    
    

}
