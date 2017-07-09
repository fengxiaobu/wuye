<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
</head>
<body>
<div class="container">
    <div class="row">
        <!-- 路径导航 开始 -->
        <div class="col-xs-12">
            <ol class="breadcrumb">
                <li><a href="#">首页</a></li>
                <li><a href="#">业务办理</a></li>
                <li class="active">退租</li>
            </ol>
        </div>
        <!-- 路径导航 结束 -->
        <div class="col-xs-12">
            <div class="panel panel-default tudiqianyue">
                <form class="form-horizontal"
                      action="${pageContext.request.contextPath}/reletApply/updateReletApplyLeaseDeatail" method="post">
                    <div class="form-group" style="margin-top: 50px">
                        <input type="hidden" name="retreatLeaseApplyId"
                               value="${retreatLeaseApply.retreatLeaseApplyId}"/>
                        <label class="col-sm-2 control-label">项目名称:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${retreatLeaseApply.houseInfoDetails.project}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">房产信息:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">
                                <td>${retreatLeaseApply.houseInfoDetails.vhname}</td>
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">租赁面积:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${retreatLeaseApply.houseAcreage}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">客户名称:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">
                                <td>${retreatLeaseApply.customer.vcname}</td>
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">租赁开始时间:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label"><fmt:formatDate
                                    value="${retreatLeaseApply.leaseStartTime}" pattern="yyyy-MM-dd"/></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">退租时间:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label"><fmt:formatDate
                                    value="${retreatLeaseApply.leaseEndTime}" pattern="yyyy-MM-dd"/></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">退租类型:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">
                                <td>
                                    <c:if test="${retreatLeaseApply.retreatLeaseType  eq 2}">正常退租</c:if>
                                    <c:if test="${retreatLeaseApply.retreatLeaseType  eq 1}">提前退租</c:if>
                                </td>
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">欠缴租金:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${retreatLeaseApply.arrearsRent}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">租赁保证金:</label>
                        <div class="col-sm-10">
                            <input class="col-sm-2 control-label" type="text" name="leaseDeposit"
                                   value="${retreatLeaseApply.leaseDeposit}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">准退租赁保证金:</label>
                        <div class="col-sm-10">
                            <input class="col-sm-2 control-label" type="text" name="permitRetreatLeaseDeposit"
                                   value="${retreatLeaseApply.permitRetreatLeaseDeposit}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">提交日期:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label"><fmt:formatDate
                                    value="${retreatLeaseApply.creationTime}" pattern="yyyy-MM-dd"/></label>
                        </div>
                    </div>
                    <div class="form-group" style="margin-left:360px">
                        <button type="submit" class="btn btn-default">保存</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">

</script>
</html>