package cn.rzhd.wuye.bean;

import java.io.Serializable;

/**
 * © 2017 RZHD.CN
 *
 * @Package: cn.rzhd.ldug.bean
 * @ClassName: User
 * @Description: 描述：用户表
 * @author: zhongchaojie@rzhd.cn
 * @date: 2017年5月23日 下午2:13:53
 * @version: V1.0
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 正式姓名
	 */
	private String realname;
	/**
	 * 工号
	 */
	private String workNo;
	/**
	 * 所属项目
	 */
	private String projectBelong;
	/**
	 * 性别 (0--女,1--男)
	 */
	private Short gender;
	/**
	 * 性别 (0--女,1--男)
	 */
	private Short status;
	/**
	 * 备注
	 */
	private String note;
	/**
	 * 权限角色主键
	 */
	private Long role;

	private String password;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getWorkNo() {
		return workNo;
	}

	public void setWorkNo(String workNo) {
		this.workNo = workNo;
	}

	public String getProjectBelong() {
		return projectBelong;
	}

	public void setProjectBelong(String projectBelong) {
		this.projectBelong = projectBelong;
	}

	public Short getGender() {
		return gender;
	}

	public void setGender(Short gender) {
		this.gender = gender;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Long getRole() {
		return role;
	}

	public void setRole(Long role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", realname=" + realname + ", workNo=" + workNo
				+ ", projectBelong=" + projectBelong + ", gender=" + gender + ", status=" + status + ", note=" + note
				+ ", role=" + role + ", password=" + password + "]";
	}
}
