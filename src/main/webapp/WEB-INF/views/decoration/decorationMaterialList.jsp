<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
    <%@include file="/common/common.jsp" %>
</head>
<body>

<!-- 路径导航 开始 -->
<div class="col-xs-12">
    <ol class="breadcrumb">
        <li><a href="#">首页</a></li>
        <li><a href="#">业务办理</a></li>
        <li class="active">裝修資料列表</li>
    </ol>
</div>
<!-- 路径导航 结束 -->
<div class="col-xs-12">
    <div class="panel panel-default">
    </div>
    <div class="panel panel-default tudiqianyue">

        <div class="panel-heading">
            <div class="col-xs-4">装修申请列表</div>
            <form action="${basePath}/dist/decoration/search" method="post">
                <div class="col-xs-8 panel-oprerate">
                    <!-- <a href="#"  class="btn btn-info" target="iframe_ch_ch">新增	</a> -->
                    <button id="query" type="submit" class="btn btn-info">搜索</button>
                </div>
                <div class="form-inline">
                    <div class="form-group">
                        <label>申请日期：</label>
                        <div id="form_datetime" class="input-group date form_datetime" data-date=""
                             data-date-format="yyyy-mm-dd" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
                            <input id="showdate1" class="form-control" size="16" type="text" value="${startDate}"
                                   readonly="readonly">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                        </div>
                        <input type="hidden" id="dtp_input1" name="startDate" value=""/>
                        至
                        <div id="form_datetime2" class="input-group date form_datetime" data-date=""
                             data-date-format="yyyy-mm-dd" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                            <input id="showdate2" class="form-control" size="16" type="text" value="${endDate}"
                                   readonly="readonly">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                        </div>
                        <input type="hidden" id="dtp_input2" name="endDate" value=""/>
                    </div>
                    <label>项目或用户名：</label>
                    <input type="text"
                           class="form-control quanxianmingcheng" name="clientName" value="${clientName}"
                           placeholder="项目名称、用户名">
                </div>
            </form>
        </div>
        <div class="panel-body">
            <table class="table table-bordered tudiqianyue-table">
                <thead>
                <tr class="info">
                    <th rowspan="2">选择</th>
                    <th rowspan="2">序号</th>
                    <th rowspan="2">项目名称<br/></th>
                    <th rowspan="2">資料名稱</th>
                    <th rowspan="2">客户名称</th>
                    <%--  <th rowspan="2">楼号</th>--%>
                    <th rowspan="2">申请日期</th>
                    <th rowspan="2">预计工期</th>
                    <th rowspan="2">操作</th>
                </tr>
                </thead>
                <tbody class="tudiqianyue-tbody">

                <c:forEach items="${decorationApply}" var="decora" varStatus="status">
                    <tr class="tudiqianyue-tdtr">
                        <td><input type="checkbox" value=""></td>
                        <td>${status.index+1}</td>
                        <td>${decora.houseInfoDetails.project}</td>
                        <td>${decora.houseInfoDetails.vhname}</td>
                        <td>${decora.clientName}</td>
                            <%--  <td>${decora.clientName}</td>--%>
                        <td><fmt:formatDate value="${decora.applyTime }" pattern="yyyy-MM-dd"/></td>
                        <td>${decora.antipateTime}&nbsp;天</td>
                        <td>${decora.localeCustodian}</td>
                        <td>${decora.localeCustodianPhone}</td>
                        <td>${decora.decorationParts}</td>
                        <td>${decora.decorateArea}</td>
                        <td>${decora.constructPeopleNumber}&nbsp;人</td>
                        <td>${decora.decorationCompany}</td>
                        <td>${decora.decorationLeader}</td>
                        <td>${decora.decorationLeaderPhone}&nbsp;</td>
                        <td>${decora.decorationDeposit}</td>
                        <td>${decora.decorationManagementCost}</td>
                        <td>${decora.passPapersCost}&nbsp;(元)</td>
                        <td>${decora.passPapersDeposit}&nbsp;(元)</td>
                        <td>
                            <c:if test="${decora.auditStatus eq 0}">未审核</c:if>
                            <c:if test="${decora.auditStatus eq 1}">已通过</c:if>
                            <c:if test="${decora.auditStatus eq 2}">未通过</c:if>
                        </td>
                        <td><a class="btn btn-info"
                               href="${pageContext.request.contextPath}/dist/deleteDecorationApplyByID?decorationApplyId=${decora.decorationApplyId}"
                               role="button">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
                                class="btn btn-info"
                                href="${pageContext.request.contextPath}/dist/toDecorationApply?decorationApplyId=${decora.decorationApplyId}"
                                role="button">编辑</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <%-- <div align="center">
                 <ul class="pagination">
                     <li><a href="${pageContext.request.contextPath}/dist/enterApply/enterApplyList?pageNum=1&pageSize=1"
                            target="main">&laquo;</a></li>
                     <c:forEach begin="1" end="${total/5}" step="1" varStatus="page">
                         <li>
                             <a href="${pageContext.request.contextPath}/dist/enterApply/enterApplyList?pageNum=1&pageSize=1">${page.count}</a>
                         </li>
                     </c:forEach>
                     <li><a href="#">&raquo;</a></li>
                 </ul>
             </div>--%>
        </div>
    </div>

</div>
</body>
<script>
    $(function () {
        formdate('#form_datetime');
        formdate('#form_datetime2');
    })

    function del(enterMaterialId) {
        layer.confirm('是否确认删除?', {icon: 3, title: '提示'}, function (index) {
            window.location.href = "${pageContext.request.contextPath}/dist/enterMaterial/delEnterMaterial?enterMaterialId=" + enterMaterialId + "";
            layer.close(index);
        });
    }
</script>
</html>