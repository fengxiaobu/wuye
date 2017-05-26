package cn.rzhd.wuye.vo;

import java.io.Serializable;

/**发票信息VO
 * @author liudaoke
 *
 */
public class InvoiceVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String billtype ;//是物业收款单还是开发公司的收款单
	
	private String billid ;//收款单id
	
	private String invocecode;//发票号

	public String getBilltype() {
		return billtype;
	}

	public void setBilltype(String billtype) {
		this.billtype = billtype;
	}

	public String getBillid() {
		return billid;
	}

	public void setBillid(String billid) {
		this.billid = billid;
	}

	public String getInvocecode() {
		return invocecode;
	}

	public void setInvocecode(String invocecode) {
		this.invocecode = invocecode;
	}
	
	
	

}
