package cn.rzhd.wuye.vo;

import java.io.Serializable;

/**
 * 公司数据VO
 * 
 * @author liudaoke
 * 
 */
public class CorpVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pk_corp;// 公司主键
	private String fathercorp;// 上级公司主键
	private String unitcode;// 公司编码
	private String unitname;// 公司名称
	private String unitshortname;// 公司简称
	private String foreignname;// 外文名称
	private String isseal;// 是否封存
	private String vdef1;// 备用字段1
	private String vdef2;// 备用字段2
	private String vdef3;// 备用字段3
	private String vdef4;// 备用字段4
	private String vdef5;// 备用字段5
	private String vdef6;// 备用字段6
	private String vdef7;// 备用字段7
	private String vdef8;// 备用字段8
	private String vdef9;// 备用字段9
	private String vdef10;// 备用字段10

	public String getPk_corp() {
		return pk_corp;
	}

	public void setPk_corp(String pk_corp) {
		this.pk_corp = pk_corp;
	}

	public String getFathercorp() {
		return fathercorp;
	}

	public void setFathercorp(String fathercorp) {
		this.fathercorp = fathercorp;
	}

	public String getUnitcode() {
		return unitcode;
	}

	public void setUnitcode(String unitcode) {
		this.unitcode = unitcode;
	}

	public String getUnitname() {
		return unitname;
	}

	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}

	public String getUnitshortname() {
		return unitshortname;
	}

	public void setUnitshortname(String unitshortname) {
		this.unitshortname = unitshortname;
	}

	public String getForeignname() {
		return foreignname;
	}

	public void setForeignname(String foreignname) {
		this.foreignname = foreignname;
	}

	public String getIsseal() {
		return isseal;
	}

	public void setIsseal(String isseal) {
		this.isseal = isseal;
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

	public String getVdef6() {
		return vdef6;
	}

	public void setVdef6(String vdef6) {
		this.vdef6 = vdef6;
	}

	public String getVdef7() {
		return vdef7;
	}

	public void setVdef7(String vdef7) {
		this.vdef7 = vdef7;
	}

	public String getVdef8() {
		return vdef8;
	}

	public void setVdef8(String vdef8) {
		this.vdef8 = vdef8;
	}

	public String getVdef9() {
		return vdef9;
	}

	public void setVdef9(String vdef9) {
		this.vdef9 = vdef9;
	}

	public String getVdef10() {
		return vdef10;
	}

	public void setVdef10(String vdef10) {
		this.vdef10 = vdef10;
	}

}
