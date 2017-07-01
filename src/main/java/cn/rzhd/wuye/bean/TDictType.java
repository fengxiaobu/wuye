package cn.rzhd.wuye.bean;

import java.math.BigDecimal;

public class TDictType {
    private String typeCode;

    private String typeName;

    private String remark;

    private BigDecimal typeSort;

    private String codeLength;

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getTypeSort() {
        return typeSort;
    }

    public void setTypeSort(BigDecimal typeSort) {
        this.typeSort = typeSort;
    }

    public String getCodeLength() {
        return codeLength;
    }

    public void setCodeLength(String codeLength) {
        this.codeLength = codeLength == null ? null : codeLength.trim();
    }
}