package cn.rzhd.wuye.vo.query;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.xiaoleilu.hutool.date.DateUtil;

/**
 * Created by hasee on 2017/6/2.
 */
public class AccountQuery extends BaseQuery {

	protected static final long serialVersionUID = 1L;

	/**
	 * 缴费类型
	 */
	private String type;

	/**
	 * 时间段起始时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate = null;
	/**
	 * 时间段截止时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate = null;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		if (startDate != null) {
			this.startDate = DateUtil.beginOfDay(startDate);
		}
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		if (endDate != null) {
			this.endDate = DateUtil.endOfDay(endDate);
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
