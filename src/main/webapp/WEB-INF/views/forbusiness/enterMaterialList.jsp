<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <li class="active">入住资料列表</li>
    </ol>
</div>
<!-- 路径导航 结束 -->
<div class="col-xs-12">
    <div class="panel panel-default">
    </div>
    <div class="panel panel-default tudiqianyue">
        <%-- <div class="panel-heading">
            <div class="col-xs-4">入住资料列表</div>
            <div class="col-xs-8 panel-oprerate">
                <div class="col-xs-6dd">
                    <form action="${pageContext.request.contextPath}/enterApply/search" method="post">
                        <span>更新日期&nbsp;&nbsp;&nbsp;&nbsp;</span>
                        <span style="margin-right: 10px"><input style="height: 35px;width: 220px;" type="text"  name="startDate" placeholder="&nbsp;&nbsp;开始时间">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;到</span>

                        <span style="margin-right: 50px"><input style="height: 35px;width: 220px;" type="text"  name="endDate" placeholder="&nbsp;&nbsp;结束时间"></span>
                        <span style="margin-right: 50px"><input style="height: 35px;width: 220px;" type="text"  name="projectName" placeholder="&nbsp;&nbsp;项目名称,资料包名称,用户名"></span>
                        <button class="btn btn-default" style="background-color: #5bc0de" type="submit"><span class="glyphicon glyphicon-search">搜素</span></button>
                        <a target="main" href="${pageContext.request.contextPath}/dist/enterMaterial/toEnterMaterialAdd" class="btn btn-info" type="button"><span class="glyphicon glyphicon-plus"></span>新增
                        </a>
                    </form>
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
        </div> --%>
        <div class="panel-heading">
            <div class="col-xs-4">入住资料列表</div>
            <form action="${pageContext.request.contextPath}/dist/enterMaterial/search" method="post">
                <div class="form-inline">
                    <div class="form-group">
                        <label>更新日期：</label>
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
                               class="form-control quanxianmingcheng" name="clientName" value="${clientName}"
                               placeholder="项目名称、用户名">
                        <button id="query" type="submit" class="btn btn-info danxi_saixuan">搜索</button>
                        <a href="${pageContext.request.contextPath}/dist/enterMaterial/toEnterMaterialAdd"
                           class="btn btn-info" target="main">新增 </a>
                    </div>

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
                    <th rowspan="2">资料包名称</th>
                    <th rowspan="2">更新用户</th>
                    <th rowspan="2">更新日期</th>
                    <th rowspan="2">操作</th>
                </tr>

                </thead>
                <tbody class="tudiqianyue-tbody">
                <c:forEach items="${enterMaterialList}" var="enterMaterial" varStatus="status">
                    <tr class="tudiqianyue-tdtr">
                        <td><input type="checkbox" value=""></td>
                        <td>${status.index+1}</td>
                        <td>${enterMaterial.projectInfo.projectName}</td>
                        <td>${enterMaterial.materialName}</td>
                        <td>${enterMaterial.user.username}</td>
                        <td><fmt:formatDate value="${enterMaterial.updateTime }" pattern="yyyy-MM-dd"/></td>
                        <td><a class="btn btn-warning" onclick="del('${enterMaterial.enterMaterialId}');" href="#"
                               role="button">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;
                                <%--<a
                                    class="btn btn-info"
                                    href="${pageContext.request.contextPath}/dist/enterMaterial/toEnterMaterial?enterMaterialId=${enterMaterial.enterMaterialId}"
                                    role="button">编辑</a>--%></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div align="center">
                <ul class="pagination">
                    <li><a href="${pageContext.request.contextPath}/enterApply/enterApplyList?pageNum=1&pageSize=1"
                           target="main">&laquo;</a></li>
                    <c:forEach begin="1" end="${pages}" step="1" varStatus="page">
                        <li>
                            <a href="${pageContext.request.contextPath}/enterApply/enterApplyList?pageNum=1&pageSize=1">${page.index}</a>
                        </li>
                    </c:forEach>
                    <li><a href="#">&raquo;</a></li>
                </ul>
            </div>
        </div>
    </div>

</div>
</body>
<script type="text/javascript">
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