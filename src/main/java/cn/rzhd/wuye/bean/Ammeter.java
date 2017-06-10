package cn.rzhd.wuye.bean;

import java.io.Serializable;

/**
 * Created by hasee on 2017/6/10.
 */
public class Ammeter implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String pk_project;
    private String pk_house;
    private String ammeter_no;
    private String ammeter_name;
    private Integer multiply;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPk_project() {
        return pk_project;
    }

    public void setPk_project(String pk_project) {
        this.pk_project = pk_project;
    }

    public String getPk_house() {
        return pk_house;
    }

    public void setPk_house(String pk_house) {
        this.pk_house = pk_house;
    }

    public String getAmmeter_no() {
        return ammeter_no;
    }

    public void setAmmeter_no(String ammeter_no) {
        this.ammeter_no = ammeter_no;
    }

    public String getAmmeter_name() {
        return ammeter_name;
    }

    public void setAmmeter_name(String ammeter_name) {
        this.ammeter_name = ammeter_name;
    }

    public Integer getMultiply() {
        return multiply;
    }

    public void setMultiply(Integer multiply) {
        this.multiply = multiply;
    }
}
