package cn.rzhd.wuye.bean;

import java.io.Serializable;

/**
 * Created by hasee on 2017/7/1.
 * 权限
 */
public class Permission implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 权限主键
     */
    private Long permissionId;
    /**
     * 权限名称
     */
    private String name;
    /**
     * 权限URL
     */
    private String url;
    /**
     * 备注说明
     */
    private String note;
    /**
     * 权限代码
     */
    private String code;

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
