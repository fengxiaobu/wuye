package cn.rzhd.wuye.vo;

import java.io.Serializable;

/*
 * 请求返回信息
 */
public class ResponseVO  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String issuccess;//操作是否成功
	
	private String errorinfo;//错误信息
	
	private String maxtime;//数据中的最大时间
	
	private String billid;//推式生成成功的单子的id，回传给外系统，以便外系统能够以此回传发票号
	
	private String billno;//推式生成成功的单子的单据号
	
	private CorpVO [] corpdata;//公司数据
	
	private ProjectVO [] projectdata;//项目数据

	private ManageVO [] managedata;//管理处数据
	
	private HouseVO [] housedata;//房产数据
	
	private CustomerVO [] customerdata;//客户数据
	
	private FeeVO [] feedata;//费用数据
	
	private SignVO [] signdata;//销售合同数据
	
	private PactVO [] pactdata;//租赁合同数据
	
	private FeeitemVO [] feeitemdata;//费用项目数据
	
	private FeeAccountVO feeaccountdata;//费用项目与银行账号对照数据
	
	private RevfareVO [] revfaredata;//运营收款单数据
	

	public String getIssuccess() {
		return issuccess;
	}

	public void setIssuccess(String issuccess) {
		this.issuccess = issuccess;
	}

	public String getBillid() {
		return billid;
	}

	public void setBillid(String billid) {
		this.billid = billid;
	}

	public String getBillno() {
		return billno;
	}

	public void setBillno(String billno) {
		this.billno = billno;
	}

	public String getErrorinfo() {
		return errorinfo;
	}

	public void setErrorinfo(String errorinfo) {
		this.errorinfo = errorinfo;
	}

	public String getMaxtime() {
		return maxtime;
	}

	public void setMaxtime(String maxtime) {
		this.maxtime = maxtime;
	}

	public CorpVO[] getCorpdata() {
		return corpdata;
	}

	public ProjectVO[] getProjectdata() {
		return projectdata;
	}

	public void setProjectdata(ProjectVO[] projectdata) {
		this.projectdata = projectdata;
	}

	public void setCorpdata(CorpVO[] corpdata) {
		this.corpdata = corpdata;
	}

	public HouseVO[] getHousedata() {
		return housedata;
	}

	public void setHousedata(HouseVO[] housedata) {
		this.housedata = housedata;
	}

	public CustomerVO[] getCustomerdata() {
		return customerdata;
	}

	public void setCustomerdata(CustomerVO[] customerdata) {
		this.customerdata = customerdata;
	}

	public FeeVO[] getFeedata() {
		return feedata;
	}

	public void setFeedata(FeeVO[] feedata) {
		this.feedata = feedata;
	}

	public SignVO[] getSigndata() {
		return signdata;
	}

	public void setSigndata(SignVO[] signdata) {
		this.signdata = signdata;
	}

	public PactVO[] getPactdata() {
		return pactdata;
	}

	public void setPactdata(PactVO[] pactdata) {
		this.pactdata = pactdata;
	}

	public FeeAccountVO getFeeaccountdata() {
		return feeaccountdata;
	}

	public void setFeeaccountdata(FeeAccountVO feeaccountdata) {
		this.feeaccountdata = feeaccountdata;
	}

	public FeeitemVO[] getFeeitemdata() {
		return feeitemdata;
	}

	public void setFeeitemdata(FeeitemVO[] feeitemdata) {
		this.feeitemdata = feeitemdata;
	}

	public RevfareVO[] getRevfaredata() {
		return revfaredata;
	}

	public void setRevfaredata(RevfareVO[] revfaredata) {
		this.revfaredata = revfaredata;
	}

	public ManageVO[] getManagedata() {
		return managedata;
	}

	public void setManagedata(ManageVO[] managedata) {
		this.managedata = managedata;
	}
}
