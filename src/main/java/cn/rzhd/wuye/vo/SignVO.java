package cn.rzhd.wuye.vo;

import java.io.Serializable;

/**
 * 销售合同VO
 * 
 * @author liudaoke
 * 
 */
public class SignVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pk_corp;// 公司主键
	private String pk_customerid;// 客户主键
	private String pk_project;// 项目主键
	private String pk_sign;// 销售合同主键
	private String pk_house;// 房产主键
	private String house;// 房产信息
	private String nsellarea;// 销售面积
	private String nprice;// 单价
	private String nythisdiscountmny;// 折扣金额
	private String nytotalmnysign;// 签约总价
	private String fpmcourse;// 购房进程
	private String dbefinishdate;// 应完成日期
	private String nyshouldmny;// 应收金额
	private String nyfactmny;// 实收金额
	private String nyshouldinterestmny;// 应收利息
	private String nyfactinterestmny;// 实收利息
	private String projectName;//项目名称
	private String vdef2;// 备用文本字段2
	private String vdef3;// 备用文本字段3
	private String vdef4;// 备用文本字段4
	private String vdef5;// 备用文本字段5
	private String ndef1;// 备用数值字段1
	private String ndef2;// 备用数值字段2
	private String ndef3;// 备用数值字段3
	private String ndef4;// 备用数值字段4
	private String ndef5;// 备用数值字段5
	
	private CustomerVO customerVO;
	private ProjectVO projectVO;

	public CustomerVO getCustomerVO() {
		return customerVO;
	}

	public void setCustomerVO(CustomerVO customerVO) {
		this.customerVO = customerVO;
	}

	public ProjectVO getProjectVO() {
		return projectVO;
	}

	public void setProjectVO(ProjectVO projectVO) {
		this.projectVO = projectVO;
	}

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

	public String getPk_sign() {
		return pk_sign;
	}

	public void setPk_sign(String pk_sign) {
		this.pk_sign = pk_sign;
	}

	public String getPk_house() {
		return pk_house;
	}

	public void setPk_house(String pk_house) {
		this.pk_house = pk_house;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getNsellarea() {
		return nsellarea;
	}

	public void setNsellarea(String nsellarea) {
		this.nsellarea = nsellarea;
	}

	public String getNprice() {
		return nprice;
	}

	public void setNprice(String nprice) {
		this.nprice = nprice;
	}

	public String getNythisdiscountmny() {
		return nythisdiscountmny;
	}

	public void setNythisdiscountmny(String nythisdiscountmny) {
		this.nythisdiscountmny = nythisdiscountmny;
	}

	public String getNytotalmnysign() {
		return nytotalmnysign;
	}

	public void setNytotalmnysign(String nytotalmnysign) {
		this.nytotalmnysign = nytotalmnysign;
	}

	public String getFpmcourse() {
		return fpmcourse;
	}

	public void setFpmcourse(String fpmcourse) {
		this.fpmcourse = fpmcourse;
	}

	public String getDbefinishdate() {
		return dbefinishdate;
	}

	public void setDbefinishdate(String dbefinishdate) {
		this.dbefinishdate = dbefinishdate;
	}

	public String getNyshouldmny() {
		return nyshouldmny;
	}

	public void setNyshouldmny(String nyshouldmny) {
		this.nyshouldmny = nyshouldmny;
	}

	public String getNyfactmny() {
		return nyfactmny;
	}

	public void setNyfactmny(String nyfactmny) {
		this.nyfactmny = nyfactmny;
	}

	public String getNyshouldinterestmny() {
		return nyshouldinterestmny;
	}

	public void setNyshouldinterestmny(String nyshouldinterestmny) {
		this.nyshouldinterestmny = nyshouldinterestmny;
	}

	public String getNyfactinterestmny() {
		return nyfactinterestmny;
	}

	public void setNyfactinterestmny(String nyfactinterestmny) {
		this.nyfactinterestmny = nyfactinterestmny;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getVdef2() {
		return vdef2;
	}

	public void setVdef2(String vdef2) {
		this.vdef2 = vdef2;
	}

	public String getVdef3() {
		return vdef3;
	}

	public void setVdef3(String vdef3) {
		this.vdef3 = vdef3;
	}

	public String getVdef4() {
		return vdef4;
	}

	public void setVdef4(String vdef4) {
		this.vdef4 = vdef4;
	}

	public String getVdef5() {
		return vdef5;
	}

	public void setVdef5(String vdef5) {
		this.vdef5 = vdef5;
	}

	public String getNdef1() {
		return ndef1;
	}

	public void setNdef1(String ndef1) {
		this.ndef1 = ndef1;
	}

	public String getNdef2() {
		return ndef2;
	}

	public void setNdef2(String ndef2) {
		this.ndef2 = ndef2;
	}

	public String getNdef3() {
		return ndef3;
	}

	public void setNdef3(String ndef3) {
		this.ndef3 = ndef3;
	}

	public String getNdef4() {
		return ndef4;
	}

	public void setNdef4(String ndef4) {
		this.ndef4 = ndef4;
	}

	public String getNdef5() {
		return ndef5;
	}

	public void setNdef5(String ndef5) {
		this.ndef5 = ndef5;
	}

	@Override
	public String toString() {
		return "SignVO{" +
				"pk_corp='" + pk_corp + '\'' +
				", pk_customerid='" + pk_customerid + '\'' +
				", pk_project='" + pk_project + '\'' +
				", pk_sign='" + pk_sign + '\'' +
				", pk_house='" + pk_house + '\'' +
				", house='" + house + '\'' +
				", nsellarea='" + nsellarea + '\'' +
				", nprice='" + nprice + '\'' +
				", nythisdiscountmny='" + nythisdiscountmny + '\'' +
				", nytotalmnysign='" + nytotalmnysign + '\'' +
				", fpmcourse='" + fpmcourse + '\'' +
				", dbefinishdate='" + dbefinishdate + '\'' +
				", nyshouldmny='" + nyshouldmny + '\'' +
				", nyfactmny='" + nyfactmny + '\'' +
				", nyshouldinterestmny='" + nyshouldinterestmny + '\'' +
				", nyfactinterestmny='" + nyfactinterestmny + '\'' +
				'}';
	}
}
