package cn.rzhd.wuye.bean;

public class Account {
	/**
	 * 对账表主键
	 */
	private Long id;
	/**
	 * 收款公司
	 */
	private String collecting_company;
	/**
	 * 收款账户
	 */
	private String collecting_account;
	/**
	 * 费用类型
	 */
	private String feetype;
	/**
	 * 应缴（总）
	 */
	private String payable;
	/**
	 * 已缴（总）
	 */
	private String paid_in;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCollecting_company() {
		return collecting_company;
	}

	public void setCollecting_company(String collecting_company) {
		this.collecting_company = collecting_company;
	}

	public String getCollecting_account() {
		return collecting_account;
	}

	public void setCollecting_account(String collecting_account) {
		this.collecting_account = collecting_account;
	}

	public String getFeetype() {
		return feetype;
	}

	public void setFeetype(String feetype) {
		this.feetype = feetype;
	}

	public String getPayable() {
		return payable;
	}

	public void setPayable(String payable) {
		this.payable = payable;
	}

	public String getPaid_in() {
		return paid_in;
	}

	public void setPaid_in(String paid_in) {
		this.paid_in = paid_in;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", collecting_company=" + collecting_company + ", collecting_account="
				+ collecting_account + ", feetype=" + feetype + ", payable=" + payable + ", paid_in=" + paid_in + "]";
	}

}
