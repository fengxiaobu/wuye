package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: EnterAccomplishHint
@Description: 描述：入驻完成提示
@author: zhongchaojie@rzhd.cn
@date: 2017年5月23日 下午5:12:34
@version: V1.0
 */
public class EnterAccomplishHint implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 入驻完成提示id
	 */
	private Long enteraccomplishHintId;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 创建时间
	 */
	private Date creationTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/*
	@param title the title to set
	*/
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/*
	@param content the content to set
	*/
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the creationTime
	 */
	public Date getCreationTime() {
		return creationTime;
	}
	/*
	@param creationTime the creationTime to set
	*/
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/*
	@param updateTime the updateTime to set
	*/
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @return the enteraccomplishHintId
	 */
	public Long getEnteraccomplishHintId() {
		return enteraccomplishHintId;
	}
	/*
	@param enteraccomplishHintId the enteraccomplishHintId to set
	*/
	public void setEnteraccomplishHintId(Long enteraccomplishHintId) {
		this.enteraccomplishHintId = enteraccomplishHintId;
	}

}
