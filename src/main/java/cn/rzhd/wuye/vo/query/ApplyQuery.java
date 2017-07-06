package cn.rzhd.wuye.vo.query;

import com.xiaoleilu.hutool.date.DateUtil;
import com.xiaoleilu.hutool.util.StrUtil;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * luopa 在 2017/6/6 创建.
 * <p>
 * 入驻申请
 */
public class ApplyQuery implements Serializable {
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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate = null;
    /**
     * 申请结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate = null;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        if (startDate != null) {
            this.startDate = DateUtil.beginOfDay(startDate);
        }
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        if (endDate != null) {
            this.endDate = DateUtil.endOfDay(endDate);
        }
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        if (StrUtil.isNotEmpty(projectName)) {
            this.projectName = projectName;
        }
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        if (StrUtil.isNotEmpty(clientName)) {
            this.clientName = clientName;
        }
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
