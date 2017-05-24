package cn.rzhd.ldug.rzhdldugwuye.bean;

public class User {
	
	private String logo;
	private String clientName;
	private String phone;
	
	/**
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}

	/*
	@param logo the logo to set
	*/
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/*
	@param clientName the clientName to set
	*/
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/*
	@param phone the phone to set
	*/
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [logo=" + logo + ", clientName=" + clientName + ", phone=" + phone + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
}
