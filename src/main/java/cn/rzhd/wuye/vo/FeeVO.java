package cn.rzhd.wuye.vo;

import java.io.Serializable;

/**
 * 费用数据VO
 * 
 * @author liudaoke
 * 
 */
public class FeeVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pk_corp;// 公司主键
	private String pk_project;// 项目主键
	private String pk_house;// 房产主键
	private String house;// 房产
	private String pk_customerid;// 客户主键
	private String pk_course_b;// 销售进程主键
	private String pk_receivablesid;// 收费清单主键
	private String dbilldate;//单据日期
	private String pk_feetype;// 收费项目主键
	private String feetype;// 收费项目
	private String nyshouldmny;// 应收费用
	private String nmny;// 实收费用
	private String vdef1;// 备用文本字段1
	private String vdef2;// 备用文本字段2
	private String vdef3;// 备用文本字段3
	private String vdef4;// 备用文本字段4
	private String vdef5;// 备用文本字段5
	private String ndef1;// 备用数值字段1
	private String ndef2;// 备用数值字段2
	private String ndef3;// 备用数值字段3
	private String ndef4;// 备用数值字段4
	private String ndef5;// 备用数值字段5

	public String getPk_corp() {
		return pk_corp;
	}

	public void setPk_corp(String pk_corp) {
		this.pk_corp = pk_corp;
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

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getPk_customerid() {
		return pk_customerid;
	}

	public void setPk_customerid(String pk_customerid) {
		this.pk_customerid = pk_customerid;
	}

	public String getPk_course_b() {
		return pk_course_b;
	}

	public void setPk_course_b(String pk_course_b) {
		this.pk_course_b = pk_course_b;
	}

	public String getPk_receivablesid() {
		return pk_receivablesid;
	}

	public void setPk_receivablesid(String pk_receivablesid) {
		this.pk_receivablesid = pk_receivablesid;
	}

	public String getDbilldate() {
		return dbilldate;
	}

	public void setDbilldate(String dbilldate) {
		this.dbilldate = dbilldate;
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

	public String getNyshouldmny() {
		return nyshouldmny;
	}

	public void setNyshouldmny(String nyshouldmny) {
		this.nyshouldmny = nyshouldmny;
	}

	public String getNmny() {
		return nmny;
	}

	public void setNmny(String nmny) {
		this.nmny = nmny;
	}

	public String getVdef1() {
		return vdef1;
	}

	public void setVdef1(String vdef1) {
		this.vdef1 = vdef1;
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

}
