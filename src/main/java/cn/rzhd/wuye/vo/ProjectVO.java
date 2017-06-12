package cn.rzhd.wuye.vo;

import java.io.Serializable;

/**
 * 项目数据
 * 
 * @author liudaoke
 * 
 */
public class ProjectVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pk_corp;// 公司主键
	private String pk_project;// 项目主键
	private String vcode;// 项目编码
	private String vname;// 项目名称
	private String vshortname;// 项目简称
	private String pk_responsecorp;// 责任公司
	private String vincode;// 内部编码
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
	
	private String project_address;
	private String object_phone;
	

	public String getProject_address() {
		return project_address;
	}

	public void setProject_address(String project_address) {
		this.project_address = project_address;
	}

	public String getObject_phone() {
		return object_phone;
	}

	public void setObject_phone(String object_phone) {
		this.object_phone = object_phone;
	}

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

	public String getVcode() {
		return vcode;
	}

	public void setVcode(String vcode) {
		this.vcode = vcode;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getVshortname() {
		return vshortname;
	}

	public void setVshortname(String vshortname) {
		this.vshortname = vshortname;
	}

	public String getPk_responsecorp() {
		return pk_responsecorp;
	}

	public void setPk_responsecorp(String pk_responsecorp) {
		this.pk_responsecorp = pk_responsecorp;
	}

	public String getVincode() {
		return vincode;
	}

	public void setVincode(String vincode) {
		this.vincode = vincode;
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

	@Override
	public String toString() {
		return "ProjectVO{" +
				"pk_corp='" + pk_corp + '\'' +
				", pk_project='" + pk_project + '\'' +
				", vcode='" + vcode + '\'' +
				", vname='" + vname + '\'' +
				", vshortname='" + vshortname + '\'' +
				", pk_responsecorp='" + pk_responsecorp + '\'' +
				", vincode='" + vincode + '\'' +
				'}';
	}
}
