package cn.rzhd.wuye.vo;

import cn.rzhd.wuye.bean.ProjectInfo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 房产数据VO
 * 
 * @author liudaoke
 * 
 */
public class HouseVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pk_corp;// 公司主键
	private String pk_house;// 房产资料主键
	private String pk_project;// 项目
	private String project;// 项目
	private String building;// 楼栋
	private String ifloor;// 楼层
	private String vhcell;// 单元
	private String vhnum;// 房号
	private String vhcode;// 房产编码
	private String vhname;// 房产名称
	private String otation;// 朝向
	private String room;// 户型
	private String situation;// 业态
	private String fsellmethod;// 销售方式
	private String managestate;// 运营状态
	private String nbuildarea;// 建筑面积
	private String ninarea;// 套内面积
	private String nleaseoutarea;// 租赁面积
	private String nmanagearea;// 物业面积
	private String nsellarea;// 销售面积
	private String npublicarea;// 公摊面积
	private String nunderlinearea;// 地下室面积
	private String ngardenarea;// 花园面积
	private String nrpublicarea;// 实测公摊面积
	private String nrinarea;// 实测套内面积
	private String nrbuildarea;// 实测建筑面积
	private String nrunderlinearea;// 实测地下室面积
	private String nrgardenarea;// 实测花园面积
	private Date startDate;// 限制缴费起始时间
	private Date endDate;// 限制缴费截止时间
	private BigDecimal firstMoney;// 首次限制缴费金额
	private BigDecimal everyMoney;// 每月限制缴费金额
	private String astrictStatus;// 限制缴费状态Y--启用,N--禁用
	private Date updateDate;// 更新时间
	private ProjectInfo projectInfo;//关联的项目信息
	private String vdef8;// 备用字段8
	private String vdef9;// 备用字段9
	private String vdef10;// 备用字段10
	
	private ProjectVO projectVO;
	
	public ProjectVO getProjectVO() {
		return projectVO;
	}
	
	public void setProjectVO(ProjectVO projectVO) {
		this.projectVO = projectVO;
	}

	public String getPk_corp() {
		return pk_corp;
	}


	public void setPk_corp(String pk_corp) {
		this.pk_corp = pk_corp;
	}

	public String getPk_house() {
		return pk_house;
	}

	public void setPk_house(String pk_house) {
		this.pk_house = pk_house;
	}

	public String getPk_project() {
		return pk_project;
	}

	public void setPk_project(String pk_project) {
		this.pk_project = pk_project;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getIfloor() {
		return ifloor;
	}

	public void setIfloor(String ifloor) {
		this.ifloor = ifloor;
	}

	public String getVhcell() {
		return vhcell;
	}

	public void setVhcell(String vhcell) {
		this.vhcell = vhcell;
	}

	public String getVhnum() {
		return vhnum;
	}

	public void setVhnum(String vhnum) {
		this.vhnum = vhnum;
	}

	public String getVhcode() {
		return vhcode;
	}

	public void setVhcode(String vhcode) {
		this.vhcode = vhcode;
	}

	public String getVhname() {
		return vhname;
	}

	public void setVhname(String vhname) {
		this.vhname = vhname;
	}

	public String getOtation() {
		return otation;
	}

	public void setOtation(String otation) {
		this.otation = otation;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public String getFsellmethod() {
		return fsellmethod;
	}

	public void setFsellmethod(String fsellmethod) {
		this.fsellmethod = fsellmethod;
	}

	public String getManagestate() {
		return managestate;
	}

	public void setManagestate(String managestate) {
		this.managestate = managestate;
	}

	public String getNbuildarea() {
		return nbuildarea;
	}

	public void setNbuildarea(String nbuildarea) {
		this.nbuildarea = nbuildarea;
	}

	public String getNinarea() {
		return ninarea;
	}

	public void setNinarea(String ninarea) {
		this.ninarea = ninarea;
	}

	public String getNleaseoutarea() {
		return nleaseoutarea;
	}

	public void setNleaseoutarea(String nleaseoutarea) {
		this.nleaseoutarea = nleaseoutarea;
	}

	public String getNmanagearea() {
		return nmanagearea;
	}

	public void setNmanagearea(String nmanagearea) {
		this.nmanagearea = nmanagearea;
	}

	public String getNsellarea() {
		return nsellarea;
	}

	public void setNsellarea(String nsellarea) {
		this.nsellarea = nsellarea;
	}

	public String getNpublicarea() {
		return npublicarea;
	}

	public void setNpublicarea(String npublicarea) {
		this.npublicarea = npublicarea;
	}

	public String getNunderlinearea() {
		return nunderlinearea;
	}

	public void setNunderlinearea(String nunderlinearea) {
		this.nunderlinearea = nunderlinearea;
	}

	public String getNgardenarea() {
		return ngardenarea;
	}

	public void setNgardenarea(String ngardenarea) {
		this.ngardenarea = ngardenarea;
	}

	public String getNrpublicarea() {
		return nrpublicarea;
	}

	public void setNrpublicarea(String nrpublicarea) {
		this.nrpublicarea = nrpublicarea;
	}

	public String getNrinarea() {
		return nrinarea;
	}

	public void setNrinarea(String nrinarea) {
		this.nrinarea = nrinarea;
	}

	public String getNrbuildarea() {
		return nrbuildarea;
	}

	public void setNrbuildarea(String nrbuildarea) {
		this.nrbuildarea = nrbuildarea;
	}

	public String getNrunderlinearea() {
		return nrunderlinearea;
	}

	public void setNrunderlinearea(String nrunderlinearea) {
		this.nrunderlinearea = nrunderlinearea;
	}

	public String getNrgardenarea() {
		return nrgardenarea;
	}

	public void setNrgardenarea(String nrgardenarea) {
		this.nrgardenarea = nrgardenarea;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getFirstMoney() {
		return firstMoney;
	}

	public void setFirstMoney(BigDecimal firstMoney) {
		this.firstMoney = firstMoney;
	}

	public BigDecimal getEveryMoney() {
		return everyMoney;
	}

	public void setEveryMoney(BigDecimal everyMoney) {
		this.everyMoney = everyMoney;
	}

	public String getAstrictStatus() {
		return astrictStatus;
	}

	public void setAstrictStatus(String astrictStatus) {
		this.astrictStatus = astrictStatus;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public ProjectInfo getProjectInfo() {
		return projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}

	public String getVdef8() {
		return vdef8;
	}

	public void setVdef8(String vdef8) {
		this.vdef8 = vdef8;
	}

	public String getVdef9() {
		return vdef9;
	}

	public void setVdef9(String vdef9) {
		this.vdef9 = vdef9;
	}

	public String getVdef10() {
		return vdef10;
	}

	public void setVdef10(String vdef10) {
		this.vdef10 = vdef10;
	}

	@Override
	public String toString() {
		return "HouseVO{" +
				"pk_corp='" + pk_corp + '\'' +
				", pk_house='" + pk_house + '\'' +
				", pk_project='" + pk_project + '\'' +
				", project='" + project + '\'' +
				", building='" + building + '\'' +
				", ifloor='" + ifloor + '\'' +
				", vhcell='" + vhcell + '\'' +
				", vhnum='" + vhnum + '\'' +
				", vhcode='" + vhcode + '\'' +
				", vhname='" + vhname + '\'' +
				", otation='" + otation + '\'' +
				", room='" + room + '\'' +
				", situation='" + situation + '\'' +
				", fsellmethod='" + fsellmethod + '\'' +
				", managestate='" + managestate + '\'' +
				", nbuildarea='" + nbuildarea + '\'' +
				", ninarea='" + ninarea + '\'' +
				", nleaseoutarea='" + nleaseoutarea + '\'' +
				", nmanagearea='" + nmanagearea + '\'' +
				", nsellarea='" + nsellarea + '\'' +
				", npublicarea='" + npublicarea + '\'' +
				", nunderlinearea='" + nunderlinearea + '\'' +
				", ngardenarea='" + ngardenarea + '\'' +
				", nrpublicarea='" + nrpublicarea + '\'' +
				", nrinarea='" + nrinarea + '\'' +
				", nrbuildarea='" + nrbuildarea + '\'' +
				", nrunderlinearea='" + nrunderlinearea + '\'' +
				", nrgardenarea='" + nrgardenarea + '\'' +
				'}';
	}
}
