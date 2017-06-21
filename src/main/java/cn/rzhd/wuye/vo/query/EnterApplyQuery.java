package cn.rzhd.wuye.vo.query;

/**
 * luopa 在 2017/6/6 创建.
 *
 * 入驻申请
 */
public class  EnterApplyQuery {
    /**
     * 项目名称
     */
    private String projectName = null;
    /**
     * 客户姓名
     */
    private String clientName = null;
    /**
     * 申请开始时间
     */
    private String startDate = null;
    /**
     * 申请结束时间
     */
    private String endDate = null;

    public String getProjectName() {
        if (projectName == null || "" == projectName) {
            return null;
        }
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getClientName() {
        if (clientName == null || "" == clientName) {
            return null;
        }
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getStartDate() {
        if (startDate == null || "" == startDate) {
            return null;
        }
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        if (endDate == null || "" == endDate) {
            return null;
        }
        return endDate;
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
