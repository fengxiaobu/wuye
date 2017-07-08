<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
    <%@include file="/common/common.jsp" %>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
</head>
<body>

<!-- 路径导航 开始 -->
<div class="col-xs-12">
    <ol class="breadcrumb">
        <li><a href="#">首页</a></li>
        <li><a href="#">业务办理</a></li>
        <li class="active">退租申请列表</li>
    </ol>
</div>
<!-- 路径导航 结束 -->
<div class="col-xs-12">
    <div class="panel panel-default">
    </div>
    <div class="panel panel-default tudiqianyue">
        <div class="panel-heading">
            <div class="col-xs-4">退租申请列表</div>
            <div class="col-xs-8 panel-oprerate">
                <div class="col-xs-6dd">
                    <form action="${pageContext.request.contextPath}/dist/enterApply/search" method="post">
                        <div class="form-inline">
                            <div class="form-group">
                                <label>申请日期：</label>
                                <div id="form_datetime" class="input-group date form_datetime col-sm-3" data-date=""
                                     data-date-format="yyyy-mm-dd" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
                                    <input id="showdate1" class="form-control" size="16" type="text" value="${startDate}"
                                           readonly="readonly">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                                </div>
                                <input type="hidden" id="dtp_input1" name="startDate" value=""/>
                                至
                                <div id="form_datetime2" class="input-group date form_datetime col-sm-3" data-date=""
                                     data-date-format="yyyy-mm-dd" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                                    <input id="showdate2" class="form-control" size="16" type="text" value="${endDate}"
                                           readonly="readonly">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                                </div>
                                <input type="hidden" id="dtp_input2" name="endDate" value=""/>
                                <input type="text"
                                       class="form-control" name="clientName" placeholder="项目名称、用户名" value="${clientName}"/>
                                <button id="query" type="submit" class="btn btn-info danxi_saixuan">搜索</button>
                            </div>
                        </div>
                    </form>
                    <%--<a target="main" href="${pageContext.request.contextPath}/enterApply/toEnterApplyAdd" class="btn btn-info" type="button"><span class="glyphicon glyphicon-plus"></span>新增
                    </a>--%>
                </div>
                <div class="col-xs-12">
                    <button class="btn btn-default" id="tudiqianyue-remove" type="button"><span
                            class="glyphicon glyphicon-remove"></span>取消
                    </button>
                    <button class="btn btn-success" id="tudiqianyue-ok" type="button"><span
                            class="glyphicon glyphicon-ok"></span>提交
                    </button>
                </div>
            </div>
        </div>
        <div class="panel-body">
            <table class="table table-bordered tudiqianyue-table">
                <thead>
                <tr class="info">
                    <th rowspan="2">选择</th>
                    <th rowspan="2">序号</th>
                    <th rowspan="2">项目名称<br/></th>
                    <th rowspan="2">房产信息</th>
                    <th rowspan="2">客户名称</th>
                    <th rowspan="2">房产面积</th>
                    <th rowspan="2">租赁开始时间</th>
                    <th rowspan="2">租赁结束日期</th>
                    <th rowspan="2">退租日期</th>
                    <th rowspan="2">退租类型</th>
                    <th rowspan="2">欠缴租金</th>
                    <th rowspan="2">租赁保证金</th>
                    <th rowspan="2">准推租赁保证金</th>
                    <th rowspan="2">提交时间</th>
                    <th rowspan="2">操作</th>
                </tr>
                </thead>
                <tbody class="tudiqianyue-tbody">

                <c:forEach items="${retreatLeaseApplies}" var="retreatLeaseApply" varStatus="status">
                    <tr class="tudiqianyue-tdtr">
                        <td><input type="checkbox" value=""></td>
                        <td>${status.index+1}</td>
                        <td>${retreatLeaseApply.houseInfoDetails.project}</td>
                        <td>${retreatLeaseApply.houseInfoDetails.vhname}</td>
                        <td>${retreatLeaseApply.customer.vcname}</td>
                        <td>${retreatLeaseApply.houseAcreage}</td>
                        <td><fmt:formatDate value="${retreatLeaseApply.leaseStartTime}" pattern="yyyy-MM-dd"/></td>
                        <td><fmt:formatDate value="${retreatLeaseApply.leaseEndTime}" pattern="yyyy-MM-dd"/></td>
                        <td><fmt:formatDate value="${retreatLeaseApply.retreatLeaseTime}" pattern="yyyy-MM-dd"/></td>
                        <td>${retreatLeaseApply.retreatLeaseType}正常退租</td>
                        <td>${retreatLeaseApply.arrearsRent}</td>
                        <td>${retreatLeaseApply.leaseDeposit}</td>
                        <td>${retreatLeaseApply.permitRetreatLeaseDeposit}</td>
                        <td><fmt:formatDate value="${retreatLeaseApply.creationTime}" pattern="yyyy-MM-dd"/></td>
                        <td><a class="btn btn-info"
                               href="${pageContext.request.contextPath}/reletApply/deleteReletApplyLeaseDeatail?retreatLeaseApplyId=${retreatLeaseApply.retreatLeaseApplyId}"
                               role="button">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
                                class="btn btn-info"
                                href="${pageContext.request.contextPath}/reletApply/toRetreatLeaseDeatail?retreatLeaseApplyId=${retreatLeaseApply.retreatLeaseApplyId}"
                                role="button">编辑</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <%--<div align="center">
                <ul class="pagination">
                    <li><a href="${pageContext.request.contextPath}/dist/enterApply/enterApplyList?pageNum=1&pageSize=1"
                           target="main">&laquo;</a></li>
                    <c:forEach begin="1" end="${total>5?total/5:1}" step="1" varStatus="page">
                        <li>
                            <a href="${pageContext.request.contextPath}/dist/enterApply/enterApplyList?pageNum=1&pageSize=5">${page.count}</a>
                        </li>
                    </c:forEach>
                    <li><a href="#">&raquo;</a></li>
                </ul>
            </div>--%>
        </div>
    </div>

</div>
</body>
<script type="text/javascript">
    $(function () {
        formdate('#form_datetime');
        formdate('#form_datetime2');
    })

    function del(enterApplyId, pkHouse) {
        layer.confirm('是否确认删除?', {icon: 3, title: '提示'}, function (index) {
            //do something
            window.location.href = "${pageContext.request.contextPath}/dist/enterApply/deleteEnterApply?enterApplyId=" + enterApplyId + "&pkHouse=" + pkHouse + "";
            layer.close(index);
        });
    }
</script>
</html>