package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.util.Date;

/**
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: DecorationNotice
@Description: 描述：装修须知
@author: an-wei.xie@rzhd.cn
@date: 2017年5月23日 下午2:10:35
@version: V1.0
 */
public class DecorationNotice implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * 主键
     */
    private Long decorationNoticeId;

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

    public Long getDecorationNoticeId() {
        return decorationNoticeId;
    }

    public void setDecorationNoticeId(Long decorationNoticeId) {
        this.decorationNoticeId = decorationNoticeId;
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

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
}
