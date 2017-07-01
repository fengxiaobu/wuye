<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
                <li class="active">续租</li>
            </ol>
        </div>
        <!-- 路径导航 结束 -->
        <div class="col-xs-12">
            <div class="panel panel-default tudiqianyue">
                <form class="form-horizontal"
                      action="${pageContext.request.contextPath}/dist/reletApply/updateEnterApply" method="post">
                    <div class="form-group" style="margin-top: 50px">
                        <input type="hidden" name="reletApplyId" value="${reletApply.reletApplyId}"/>
                        <label class="col-sm-2 control-label">项目名称:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${reletApply.houseInfoDetails.project}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">房产信息:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${reletApply.houseInfoDetails.vhname}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">租赁面积:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${reletApply.houseAcreage}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">客户名称:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${reletApply.customer.vcname}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">租赁结束时间:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label"><fmt:formatDate
                                    value="${reletApply.leaseEndTime}" pattern="yyyy-MM-dd HH:dd:ss"/></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">续租开始时间:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label"><fmt:formatDate
                                    value="${reletApply.retreaEndTime}" pattern="yyyy-MM-dd HH:dd:ss"/></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">续租结束时间:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label"><fmt:formatDate
                                    value="${reletApply.retreaEndTime}" pattern="yyyy-MM-dd HH:dd:ss"/></label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">XXX年租赁单价:</label>
                        <div class="col-sm-10">
                            <%--    <input class="col-sm-2 control-label" type="text" name="subtotal"
                                       value="${subtotal.subtotal}">--%>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">小计:</label>
                        <div class="col-sm-10">
                            <input class="col-sm-2 control-label" type="text" name="subtotal"
                                   value="${reletApply.subtotal}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">优惠金额:</label>
                        <div class="col-sm-10">
                            <input class="col-sm-2 control-label" type="text" name="privilegeSum"
                                   value="${reletApply.privilegeSum}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">租赁保证金:</label>
                        <div class="col-sm-10">
                            <input class="col-sm-2 control-label" type="text" name="leaseDeposit"
                                   value="${reletApply.leaseDeposit}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">总计:</label>
                        <div class="col-sm-10">
                            <input class="col-sm-2 control-label" type="text" name="" value="${reletApply.total}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">提交时间:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label"><fmt:formatDate
                                    value="${reletApply.creationTime}" pattern="yyyy-MM-dd HH:dd:ss"/></label>
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