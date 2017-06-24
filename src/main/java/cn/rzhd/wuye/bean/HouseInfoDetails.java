package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HouseInfoDetails implements Serializable {
    private String pkHouse;

    private String pkCorp;

    private String pkProject;

    private String project;

    private String building;

    private String ifloor;

    private String vhcell;

    private String vhnum;

    private String vhcode;

    private String vhname;

    private String otation;

    private String room;

    private String situation;

    private String fsellmethod;

    private String managestate;

    private String nbuildarea;

    private String ninarea;

    private String nleaseoutarea;

    private String nmanagearea;

    private String nsellarea;

    private String npublicarea;

    private String nunderlinearea;

    private String ngardenarea;

    private String nrpublicarea;

    private String nrinarea;

    private String nrbuildarea;

    private String nrunderlinearea;

    private String nrgardenarea;

    private Date startdate;

    private Date enddate;

    private BigDecimal firstmny;

    private BigDecimal everymny;

    private String astrictstatus;

    private Date updatedate;

    private String enterapplyState;

    private String decorationapplystate;

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
}