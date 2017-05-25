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
     * LOGO
     */
    private String logo;
    /**
     * 企业类型(0-个人，1-企业)
     */
    private Integer companyType;
    /**
     * 客户名称
     */
    private String clientName;
    /**
     * 绑定手机号
     */
    private String phone;

    /**
     * @return the logo
     */
    public String getLogo() {
        return logo;
    }

    /*
    @param logo the logo to set
    */
    public void setLogo(String logo) {
        this.logo = logo;

    }


    /**
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /*
    @param clientName the clientName to set
    */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /*
    @param phone the phone to set
    */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the userId
     */
    public Long getUserId() {
        return userId;
    }

    /*
    @param userId the userId to set
    */
    public void setUserId(Long userId) {
        this.userId = userId;
    }


}
