package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

public class MessageManage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long message_manage_id;

	private String title;

	private String content;

	private String note;

	private Date create_time;

	private String type;
	private String name;
	private String range;
	private String status;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getMessage_manage_id() {
		return message_manage_id;
	}

	public void setMessage_manage_id(Long message_manage_id) {
		this.message_manage_id = message_manage_id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	@Override
	public String toString() {
		return "MessageManage [message_manage_id=" + message_manage_id + ", title=" + title + ", content=" + content
				+ ", note=" + note + ", create_time=" + create_time + ", type=" + type + ", name=" + name + ", range="
				+ range + ", status=" + status + "]";
	}

}
