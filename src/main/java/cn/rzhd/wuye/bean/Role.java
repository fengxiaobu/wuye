package cn.rzhd.wuye.bean;

import java.io.Serializable;

/**
 * Created by hasee on 2017/6/24.
 */
public class Role implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long roleId;
    private String name;
    private String note;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
