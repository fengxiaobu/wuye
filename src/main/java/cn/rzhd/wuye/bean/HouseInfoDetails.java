package cn.rzhd.wuye.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HouseInfoDetails implements Serializable {
    /**
     * 房产主键
     */
    private String pkHouse;
    /**
     * 公司主键
     */
    private String pkCorp;
    /**
     * 项目主键
     */
    private String pkProject;
    /**
     * 项目名称
     */
    private String project;
    /**
     * 楼栋
     */
    private String building;
    /**
     * 楼层
     */
    private String ifloor;
    /**
     * 单元
     */
    private String vhcell;
    /**
     * 房号
     */
    private String vhnum;
    /**
     * 房产编码
     */
    private String vhcode;
    /**
     * 房产名称
     */
    private String vhname;
    /**
     * 朝向
     */
    private String otation;
    /**
     * 业态
     */
    private String room;
    /**
     * 销售方式
     */
    private String situation;
    /**
     * 运营状态
     */
    private String fsellmethod;
    /**
     * 运营状态
     */
    private String managestate;
    /**
     * 建筑面积
     */
    private String nbuildarea;
    /**
     * 套内面积
     */
    private String ninarea;
    /**
     * 租赁面积
     */
    private String nleaseoutarea;
    /**
     * 物业面积
     */
    private String nmanagearea;
    /**
     * 销售面积
     */
    private String nsellarea;
    /**
     * 公摊面积
     */
    private String npublicarea;
    /**
     * 地下室面积
     */
    private String nunderlinearea;
    /**
     * 花园面积
     */
    private String ngardenarea;
    /**
     * 实测公摊面积
     */
    private String nrpublicarea;
    /**
     * 实测套内面积
     */
    private String nrinarea;
    /**
     * 实测建筑面积
     */
    private String nrbuildarea;
    /**
     * 实测地下室面积
     */
    private String nrunderlinearea;
    /**
     * 实测花园面积
     */
    private String nrgardenarea;
    /**
     * 首次限制开始日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date startdate;
    /**
     * 首次限制结束日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date enddate;
    /**
     * 首次限缴金额
     */
    private BigDecimal firstmny;
    /**
     * 每月限制金额
     */
    private BigDecimal everymny;
    /**
     * 缴费限制状态(Y--启用,N--禁用)
     */
    private String astrictstatus;
    /**
     * 缴费限制更新时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date updatedate;
    /**
     * 入住申请状态
     */
    private String enterapplyState;
    /**
     * 装修申请状态
     */
    private String decorationapplystate;
    /**
     * 是否第一次完善资料(1--是,0--否)
     */
    private String alreadyFinish;

    private ProjectInfo projectInfo;
    
    

    public ProjectInfo getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(ProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
    }

    public String getPkHouse() {
        return pkHouse;
    }

    public void setPkHouse(String pkHouse) {
        this.pkHouse = pkHouse == null ? null : pkHouse.trim();
    }

    public String getPkCorp() {
        return pkCorp;
    }

    public void setPkCorp(String pkCorp) {
        this.pkCorp = pkCorp == null ? null : pkCorp.trim();
    }

    public String getPkProject() {
        return pkProject;
    }

    public void setPkProject(String pkProject) {
        this.pkProject = pkProject == null ? null : pkProject.trim();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project == null ? null : project.trim();
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building == null ? null : building.trim();
    }

    public String getIfloor() {
        return ifloor;
    }

    public void setIfloor(String ifloor) {
        this.ifloor = ifloor == null ? null : ifloor.trim();
    }

    public String getVhcell() {
        return vhcell;
    }

    public void setVhcell(String vhcell) {
        this.vhcell = vhcell == null ? null : vhcell.trim();
    }

    public String getVhnum() {
        return vhnum;
    }

    public void setVhnum(String vhnum) {
        this.vhnum = vhnum == null ? null : vhnum.trim();
    }

    public String getVhcode() {
        return vhcode;
    }

    public void setVhcode(String vhcode) {
        this.vhcode = vhcode == null ? null : vhcode.trim();
    }

    public String getVhname() {
        return vhname;
    }

    public void setVhname(String vhname) {
        this.vhname = vhname == null ? null : vhname.trim();
    }

    public String getOtation() {
        return otation;
    }

    public void setOtation(String otation) {
        this.otation = otation == null ? null : otation.trim();
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation == null ? null : situation.trim();
    }

    public String getFsellmethod() {
        return fsellmethod;
    }

    public void setFsellmethod(String fsellmethod) {
        this.fsellmethod = fsellmethod == null ? null : fsellmethod.trim();
    }

    public String getManagestate() {
        return managestate;
    }

    public void setManagestate(String managestate) {
        this.managestate = managestate == null ? null : managestate.trim();
    }

    public String getNbuildarea() {
        return nbuildarea;
    }

    public void setNbuildarea(String nbuildarea) {
        this.nbuildarea = nbuildarea == null ? null : nbuildarea.trim();
    }

    public String getNinarea() {
        return ninarea;
    }

    public void setNinarea(String ninarea) {
        this.ninarea = ninarea == null ? null : ninarea.trim();
    }

    public String getNleaseoutarea() {
        return nleaseoutarea;
    }

    public void setNleaseoutarea(String nleaseoutarea) {
        this.nleaseoutarea = nleaseoutarea == null ? null : nleaseoutarea.trim();
    }

    public String getNmanagearea() {
        return nmanagearea;
    }

    public void setNmanagearea(String nmanagearea) {
        this.nmanagearea = nmanagearea == null ? null : nmanagearea.trim();
    }

    public String getNsellarea() {
        return nsellarea;
    }

    public void setNsellarea(String nsellarea) {
        this.nsellarea = nsellarea == null ? null : nsellarea.trim();
    }

    public String getNpublicarea() {
        return npublicarea;
    }

    public void setNpublicarea(String npublicarea) {
        this.npublicarea = npublicarea == null ? null : npublicarea.trim();
    }

    public String getNunderlinearea() {
        return nunderlinearea;
    }

    public void setNunderlinearea(String nunderlinearea) {
        this.nunderlinearea = nunderlinearea == null ? null : nunderlinearea.trim();
    }

    public String getNgardenarea() {
        return ngardenarea;
    }

    public void setNgardenarea(String ngardenarea) {
        this.ngardenarea = ngardenarea == null ? null : ngardenarea.trim();
    }

    public String getNrpublicarea() {
        return nrpublicarea;
    }

    public void setNrpublicarea(String nrpublicarea) {
        this.nrpublicarea = nrpublicarea == null ? null : nrpublicarea.trim();
    }

    public String getNrinarea() {
        return nrinarea;
    }

    public void setNrinarea(String nrinarea) {
        this.nrinarea = nrinarea == null ? null : nrinarea.trim();
    }

    public String getNrbuildarea() {
        return nrbuildarea;
    }

    public void setNrbuildarea(String nrbuildarea) {
        this.nrbuildarea = nrbuildarea == null ? null : nrbuildarea.trim();
    }

    public String getNrunderlinearea() {
        return nrunderlinearea;
    }

    public void setNrunderlinearea(String nrunderlinearea) {
        this.nrunderlinearea = nrunderlinearea == null ? null : nrunderlinearea.trim();
    }

    public String getNrgardenarea() {
        return nrgardenarea;
    }

    public void setNrgardenarea(String nrgardenarea) {
        this.nrgardenarea = nrgardenarea == null ? null : nrgardenarea.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public BigDecimal getFirstmny() {
        return firstmny;
    }

    public void setFirstmny(BigDecimal firstmny) {
        this.firstmny = firstmny;
    }

    public BigDecimal getEverymny() {
        return everymny;
    }

    public void setEverymny(BigDecimal everymny) {
        this.everymny = everymny;
    }

    public String getAstrictstatus() {
        return astrictstatus;
    }

    public void setAstrictstatus(String astrictstatus) {
        this.astrictstatus = astrictstatus == null ? null : astrictstatus.trim();
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getEnterapplyState() {
        return enterapplyState;
    }

    public void setEnterapplyState(String enterapplyState) {
        this.enterapplyState = enterapplyState == null ? null : enterapplyState.trim();
    }

    public String getDecorationapplystate() {
        return decorationapplystate;
    }

    public void setDecorationapplystate(String decorationapplystate) {
        this.decorationapplystate = decorationapplystate == null ? null : decorationapplystate.trim();
    }

	public String getAlreadyFinish() {
		return alreadyFinish;
	}

	public void setAlreadyFinish(String alreadyFinish) {
		this.alreadyFinish = alreadyFinish;
	}

    
}