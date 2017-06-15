package cn.rzhd.wuye.bean;

import java.io.Serializable;

public class Company implements Serializable{
    private static final long serialVersionUID = 1L;
    private String pkCorp;

    private String fathercorp;

    private String unitcode;

    private String unitname;

    private String unitshortname;

    private String foreignname;

    private String isseal;

    public String getPkCorp() {
        return pkCorp;
    }

    public void setPkCorp(String pkCorp) {
        this.pkCorp = pkCorp == null ? null : pkCorp.trim();
    }

    public String getFathercorp() {
        return fathercorp;
    }

    public void setFathercorp(String fathercorp) {
        this.fathercorp = fathercorp == null ? null : fathercorp.trim();
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode == null ? null : unitcode.trim();
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public String getUnitshortname() {
        return unitshortname;
    }

    public void setUnitshortname(String unitshortname) {
        this.unitshortname = unitshortname == null ? null : unitshortname.trim();
    }

    public String getForeignname() {
        return foreignname;
    }

    public void setForeignname(String foreignname) {
        this.foreignname = foreignname == null ? null : foreignname.trim();
    }

    public String getIsseal() {
        return isseal;
    }

    public void setIsseal(String isseal) {
        this.isseal = isseal == null ? null : isseal.trim();
    }
}