package cn.rzhd.wuye.bean;

import java.io.Serializable;

/**
 * 物业费详情
 */
public class PropertyFee implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String pk_corp;//公司主键

    private String pk_customerid;//客户主键

    private String pk_project;//项目主键

    private String pk_house;//房产主键

    private String pk_receivablesid;//收费清单主键

    private String pk_feetype;//收费项目主键

    private String feetype;//收费项目

    private String actmonth;//会计月

    private String dbegin;//缴费区间开始日期

    private String dend;//缴费区间截止日期

    private String dshpay;//应付款日期

    private String vmemo;//备注

    private String nyshouldmny;//应收金额

    private String account;//收款账号

    private String companyName;//收款公司

    public String getPk_corp() {
        return pk_corp;
    }

    public void setPk_corp(String pk_corp) {
        this.pk_corp = pk_corp;
    }

    public String getPk_customerid() {
        return pk_customerid;
    }

    public void setPk_customerid(String pk_customerid) {
        this.pk_customerid = pk_customerid;
    }

    public String getPk_project() {
        return pk_project;
    }

    public void setPk_project(String pk_project) {
        this.pk_project = pk_project;
    }

    public String getPk_house() {
        return pk_house;
    }

    public void setPk_house(String pk_house) {
        this.pk_house = pk_house;
    }

    public String getPk_receivablesid() {
        return pk_receivablesid;
    }

    public void setPk_receivablesid(String pk_receivablesid) {
        this.pk_receivablesid = pk_receivablesid;
    }

    public String getPk_feetype() {
        return pk_feetype;
    }

    public void setPk_feetype(String pk_feetype) {
        this.pk_feetype = pk_feetype;
    }

    public String getFeetype() {
        return feetype;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype;
    }

    public String getActmonth() {
        return actmonth;
    }

    public void setActmonth(String actmonth) {
        this.actmonth = actmonth;
    }

    public String getDbegin() {
        return dbegin;
    }

    public void setDbegin(String dbegin) {
        this.dbegin = dbegin;
    }

    public String getDend() {
        return dend;
    }

    public void setDend(String dend) {
        this.dend = dend;
    }

    public String getDshpay() {
        return dshpay;
    }

    public void setDshpay(String dshpay) {
        this.dshpay = dshpay;
    }

    public String getVmemo() {
        return vmemo;
    }

    public void setVmemo(String vmemo) {
        this.vmemo = vmemo;
    }

    public String getNyshouldmny() {
        return nyshouldmny;
    }

    public void setNyshouldmny(String nyshouldmny) {
        this.nyshouldmny = nyshouldmny;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
