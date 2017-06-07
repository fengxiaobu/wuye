package cn.rzhd.wuye.vo;

/**
 * luopa 在 2017/6/6 创建.
 *
 * 入驻申请
 */
public class EnterApplyQuery {
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 客户姓名
     */
    private String clientName;
    /**
     * 申请开始时间
     */
    private String startDate;
    /**
     * 申请结束时间
     */
    private String endDate;

    public String getProjectName() {
        return projectName.trim();
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getClientName() {
        return clientName.trim();
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getStartDate() {
        return startDate.trim();
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate.trim();
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "EnterApplyQuery{" +
                "projectName='" + projectName + '\'' +
                ", clientName='" + clientName + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
