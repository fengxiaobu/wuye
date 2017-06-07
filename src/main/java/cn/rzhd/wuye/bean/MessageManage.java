package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.util.Date;

public class MessageManage implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    
    private Long messageManageId;
    
    private String title;
    
    private String content;
    
    private String note;
    
    private Date createTime;

    public Long getMessageManageId() {
        return messageManageId;
    }

    public void setMessageManageId(Long messageManageId) {
        this.messageManageId = messageManageId;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    
}
