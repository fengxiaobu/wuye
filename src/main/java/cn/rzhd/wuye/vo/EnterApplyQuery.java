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
        if (projectName != null) {
            return projectName;
        }
        return null;

    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getClientName() {
        if (clientName != null) {
            return clientName;
        }
        return null;

    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getStartDate() {
        if (startDate != null) {
            return startDate;
        }
        return null;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        if (endDate != null) {
            return endDate;
        }
        return null;

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
