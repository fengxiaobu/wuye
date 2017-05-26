package cn.rzhd.wuye.vo;

import java.io.Serializable;

/*
 * 请求头信息
 */
public class RequesterVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//相关的请求信息
	private String key="liando" ;//秘钥，不能为空，值为 liando ，每次访问时都需要设置此字段
	
	private String billtype;//数据类型
	
	private String pk_corp;//公司主键
	
	private static String lastmaxtime;//上次获取中的最大时间
	
	private FeeVO [] feedata;//费用数据
	
	private InvoiceVO invoicedata;//发票信息
	
	private String pk_feetype;//费用项目id

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getBilltype() {
		return billtype;
	}

	public void setBilltype(String billtype) {
		this.billtype = billtype;
	}

	public String getPk_corp() {
		return pk_corp;
	}

	public void setPk_corp(String pk_corp) {
		this.pk_corp = pk_corp;
	}

	public String getLastmaxtime() {
		return lastmaxtime;
	}

	public void setLastmaxtime(String lastmaxtime) {
		this.lastmaxtime = lastmaxtime;
	}

	public FeeVO[] getFeedata() {
		return feedata;
	}

	public void setFeedata(FeeVO[] feedata) {
		this.feedata = feedata;
	}

	public InvoiceVO getInvoicedata() {
		return invoicedata;
	}

	public void setInvoicedata(InvoiceVO invoicedata) {
		this.invoicedata = invoicedata;
	}

	public String getPk_feetype() {
		return pk_feetype;
	}

	public void setPk_feetype(String pk_feetype) {
		this.pk_feetype = pk_feetype;
	}


	
	

}
