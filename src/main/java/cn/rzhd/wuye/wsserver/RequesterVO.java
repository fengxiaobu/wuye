package cn.rzhd.wuye.wsserver;

import java.io.Serializable;
import java.util.List;

/*
 * ?????
 */
public class RequesterVO implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	//???????
	private String key ;//?????????? wuye ??????????????

	private String billtype;//????

	private List<Object> data;//????

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

	public List<Object> getData() {
		return data;
	}

	public void setData(List<Object> data) {
		this.data = data;
	}
}
