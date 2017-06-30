package cn.rzhd.wuye.vo;

import java.io.Serializable;

/**
 * 费用项目对应的银行账号VO
 * 
 * @author liudaoke
 * 
 */
public class FeeAccountVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pk_corp;// 公司主键
	private String pk_fee;// 费用项目主键
	private String pk_account;// 银行账号主键
	private String account;// 银行账号
	private String vdef1;// 收款公司主键
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

	public String getPk_fee() {
		return pk_fee;
	}

	public void setPk_fee(String pk_fee) {
		this.pk_fee = pk_fee;
	}

	public String getPk_account() {
		return pk_account;
	}

	public void setPk_account(String pk_account) {
		this.pk_account = pk_account;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
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
