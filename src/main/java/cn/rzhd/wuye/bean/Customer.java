package cn.rzhd.wuye.bean;

import java.util.List;

/**
 * Created by hasee on 2017/6/1.
 */
public class Customer {
    /**
     * 公司主键
     */
    private String pk_corp;
    /**
     * 客户主键
     */
    private String pk_customerid;
    /**
     * 客户性质(0-销售客户,1-租赁客户)
     */
    private String fccategory;
    /**
     * 客户编码
     */
    private String vccode;
    /**
     * 客户名称
     */
    private String vcname;
    /**
     * 拼音代码
     */
    private String vpcnamespell;
    /**
     * 首选联系电话
     */
    private String vpreferredtel;
    /**
     * 证件号码
     */
    private String vccardnum;
    /**
     * 通讯地址
     */
    private String vcaddress;
    /**
     * 邮政编码
     */
    private String ccpostalcode;
    /**
     * 登记日期
     */
    private String dregdate;
    /**
     * 登记地点
     */
    private String vregplace;
    /**
     * 会员卡号
     */
    private String vmemcardno;
    /**
     * 电子邮件
     */
    private String vpcemail;
    /**
     * 产权比率（%）
     */
    private String nproperty;
    /**
     * LOGO路径
     */
    private String LOGO;
    /**
     * 公司类型
     */
    private String companyType;
    /**
     * 密码,MD5加密,默认为加密后的123456
     */
    private String password;
    /**
     * 绑定手机号码
     */
    private String bindingPhone;

    private List<Long> houseInfos;

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

    public String getFccategory() {
        return fccategory;
    }

    public void setFccategory(String fccategory) {
        this.fccategory = fccategory;
    }

    public String getVccode() {
        return vccode;
    }

    public void setVccode(String vccode) {
        this.vccode = vccode;
    }

    public String getVcname() {
        return vcname;
    }

    public void setVcname(String vcname) {
        this.vcname = vcname;
    }

    public String getVpcnamespell() {
        return vpcnamespell;
    }

    public void setVpcnamespell(String vpcnamespell) {
        this.vpcnamespell = vpcnamespell;
    }

    public String getVpreferredtel() {
        return vpreferredtel;
    }

    public void setVpreferredtel(String vpreferredtel) {
        this.vpreferredtel = vpreferredtel;
    }

    public String getVccardnum() {
        return vccardnum;
    }

    public void setVccardnum(String vccardnum) {
        this.vccardnum = vccardnum;
    }

    public String getVcaddress() {
        return vcaddress;
    }

    public void setVcaddress(String vcaddress) {
        this.vcaddress = vcaddress;
    }

    public String getCcpostalcode() {
        return ccpostalcode;
    }

    public void setCcpostalcode(String ccpostalcode) {
        this.ccpostalcode = ccpostalcode;
    }

    public String getDregdate() {
        return dregdate;
    }

    public void setDregdate(String dregdate) {
        this.dregdate = dregdate;
    }

    public String getVregplace() {
        return vregplace;
    }

    public void setVregplace(String vregplace) {
        this.vregplace = vregplace;
    }

    public String getVmemcardno() {
        return vmemcardno;
    }

    public void setVmemcardno(String vmemcardno) {
        this.vmemcardno = vmemcardno;
    }

    public String getVpcemail() {
        return vpcemail;
    }

    public void setVpcemail(String vpcemail) {
        this.vpcemail = vpcemail;
    }

    public String getNproperty() {
        return nproperty;
    }

    public void setNproperty(String nproperty) {
        this.nproperty = nproperty;
    }

    public String getLOGO() {
        return LOGO;
    }

    public void setLOGO(String LOGO) {
        this.LOGO = LOGO;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBindingPhone() {
        return bindingPhone;
    }

    public void setBindingPhone(String bindingPhone) {
        this.bindingPhone = bindingPhone;
    }

    public List<Long> getHouseInfos() {
        return houseInfos;
    }

    public void setHouseInfos(List<Long> houseInfos) {
        this.houseInfos = houseInfos;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "pk_corp='" + pk_corp + '\'' +
                ", pk_customerid='" + pk_customerid + '\'' +
                ", fccategory='" + fccategory + '\'' +
                ", vccode='" + vccode + '\'' +
                ", vcname='" + vcname + '\'' +
                ", vpcnamespell='" + vpcnamespell + '\'' +
                ", vpreferredtel='" + vpreferredtel + '\'' +
                ", vccardnum='" + vccardnum + '\'' +
                ", vcaddress='" + vcaddress + '\'' +
                ", ccpostalcode='" + ccpostalcode + '\'' +
                ", dregdate='" + dregdate + '\'' +
                ", vregplace='" + vregplace + '\'' +
                ", vmemcardno='" + vmemcardno + '\'' +
                ", vpcemail='" + vpcemail + '\'' +
                ", nproperty='" + nproperty + '\'' +
                ", LOGO='" + LOGO + '\'' +
                ", companyType='" + companyType + '\'' +
                ", password='" + password + '\'' +
                ", bindingPhone='" + bindingPhone + '\'' +
                '}';
    }

}
