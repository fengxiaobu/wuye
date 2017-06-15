package cn.rzhd.wuye.vo;

import java.io.Serializable;

/**
 * 租赁合同VO
 * 
 * @author liudaoke
 * 
 */
public class PactVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pk_corp;// 公司主键
	private String pk_customerid;// 客户主键
	private String pk_project;// 项目主键
	private String pk_pact;// 合同主键
	private String pk_house;// 房产主键
	private String house;// 房产信息
	private String nrentarea;// 租赁面积
	private String dpactend;// 合同终止日
	private String dpactstart;// 合同起始日
	private String nzlbzjmny;// 租赁保证金
	private String nhtysmny;// 合同应收总金额
	private String nhtssmny;// 合同已收总金额
	private String dysdate;// 首笔租金应收款日期
	private String nsbzjyjmny;// 首笔租金应交金额
	private String projectName;// 项目名称
	private String vdef2;// 备用文本字段2
	private String vdef3;// 备用文本字段3
	private String vdef4;// 备用文本字段4
	private String vdef5;// 备用文本字段5
	private String ndef1;// 备用字段1
	private String ndef2;// 备用字段2
	private String ndef3;// 备用字段3
	private String ndef4;// 备用字段4
	private String ndef5;// 备用字段5

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

	public String getPk_pact() {
		return pk_pact;
	}

	public void setPk_pact(String pk_pact) {
		this.pk_pact = pk_pact;
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

	public String getNrentarea() {
		return nrentarea;
	}

	public void setNrentarea(String nrentarea) {
		this.nrentarea = nrentarea;
	}

	public String getDpactend() {
		return dpactend;
	}

	public void setDpactend(String dpactend) {
		this.dpactend = dpactend;
	}

	public String getDpactstart() {
		return dpactstart;
	}

	public void setDpactstart(String dpactstart) {
		this.dpactstart = dpactstart;
	}

	public String getNzlbzjmny() {
		return nzlbzjmny;
	}

	public void setNzlbzjmny(String nzlbzjmny) {
		this.nzlbzjmny = nzlbzjmny;
	}

	public String getNhtysmny() {
		return nhtysmny;
	}

	public void setNhtysmny(String nhtysmny) {
		this.nhtysmny = nhtysmny;
	}

	public String getNhtssmny() {
		return nhtssmny;
	}

	public void setNhtssmny(String nhtssmny) {
		this.nhtssmny = nhtssmny;
	}

	public String getDysdate() {
		return dysdate;
	}

	public void setDysdate(String dysdate) {
		this.dysdate = dysdate;
	}

	public String getNsbzjyjmny() {
		return nsbzjyjmny;
	}

	public void setNsbzjyjmny(String nsbzjyjmny) {
		this.nsbzjyjmny = nsbzjyjmny;
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
		return "PactVO{" + "pk_corp='" + pk_corp + '\'' + ", pk_customerid='" + pk_customerid + '\'' + ", pk_project='"
				+ pk_project + '\'' + ", pk_pact='" + pk_pact + '\'' + ", pk_house='" + pk_house + '\'' + ", house='"
				+ house + '\'' + ", nrentarea='" + nrentarea + '\'' + ", dpactend='" + dpactend + '\''
				+ ", dpactstart='" + dpactstart + '\'' + ", nzlbzjmny='" + nzlbzjmny + '\'' + ", nhtysmny='" + nhtysmny
				+ '\'' + ", nhtssmny='" + nhtssmny + '\'' + ", dysdate='" + dysdate + '\'' + ", nsbzjyjmny='"
				+ nsbzjyjmny + '\'' + '}';
	}
}
