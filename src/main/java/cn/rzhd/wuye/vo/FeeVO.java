package cn.rzhd.wuye.vo;

import java.io.Serializable;

/**
 * 费用数据VO
 * 
 * @author liudaoke
 * 
 */
public class FeeVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pk_corp;// 公司主键
	private String pk_project;// 项目主键
	private String pk_house;// 房产主键
	private String house;// 房产
	private String pk_customerid;// 客户主键
	private String pk_course_b;// 销售进程主键
	private String pk_receivablesid;// 收费清单主键
	private String dbilldate;//单据日期
	private String pk_feetype;// 收费项目主键
	private String feetype;// 收费项目
	private String nyshouldmny;// 应收费用
	private String nmny;// 实收费用
    private String actmonth;//会计月
	/**
	 * 缴费区间起始月
	 */
	private String dbegin;
	/**
	 * 缴费区间截止月
	 */
	private String dend;
	/**
	 * 应付款日期
	 */
	private String dshpay;

	private String vmemo;

	private String nyjmny;

	public String getPk_corp() {
		return pk_corp;
	}

	public void setPk_corp(String pk_corp) {
		this.pk_corp = pk_corp;
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

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getPk_customerid() {
		return pk_customerid;
	}

	public void setPk_customerid(String pk_customerid) {
		this.pk_customerid = pk_customerid;
	}

	public String getPk_course_b() {
		return pk_course_b;
	}

	public void setPk_course_b(String pk_course_b) {
		this.pk_course_b = pk_course_b;
	}

	public String getPk_receivablesid() {
		return pk_receivablesid;
	}

	public void setPk_receivablesid(String pk_receivablesid) {
		this.pk_receivablesid = pk_receivablesid;
	}

	public String getDbilldate() {
		return dbilldate;
	}

	public void setDbilldate(String dbilldate) {
		this.dbilldate = dbilldate;
	}

	public String getPk_feetype() {
		return pk_feetype;
	}

	public void setPk_feetype(String pk_feetype) {
		this.pk_feetype = pk_feetype;
	}

	public String getFeetype() {
		return feetype;
	}

	public void setFeetype(String feetype) {
		this.feetype = feetype;
	}

	public String getNyshouldmny() {
		return nyshouldmny;
	}

	public void setNyshouldmny(String nyshouldmny) {
		this.nyshouldmny = nyshouldmny;
	}

	public String getNmny() {
		return nmny;
	}

	public void setNmny(String nmny) {
		this.nmny = nmny;
	}

	public String getDbegin() {
		return dbegin;
	}

	public void setDbegin(String dbegin) {
		this.dbegin = dbegin;
	}

	public String getDend() {
		return dend;
	}

	public void setDend(String dend) {
		this.dend = dend;
	}

	public String getDshpay() {
		return dshpay;
	}

	public void setDshpay(String dshpay) {
		this.dshpay = dshpay;
	}

    public String getActmonth() {
        return actmonth;
    }

    public void setActmonth(String actmonth) {
        this.actmonth = actmonth;
    }

    public String getVmemo() {
        return vmemo;
    }

    public void setVmemo(String vmemo) {
        this.vmemo = vmemo;
    }

	public String getNyjmny() {
		return nyjmny;
	}

	public void setNyjmny(String nyjmny) {
		this.nyjmny = nyjmny;
	}
}
