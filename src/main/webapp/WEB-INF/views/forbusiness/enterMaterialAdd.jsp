<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

<!-- 路径导航 开始 -->
<div class="col-xs-12">
    <ol class="breadcrumb">
        <li><a href="#">首页</a></li>
        <li><a href="#">业务办理</a></li>
        <li class="active">新增资料</li>
    </ol>
</div>
<!-- 路径导航 结束 -->
<div class="col-xs-12">
    <div class="panel panel-default">
    </div>
    <div class="panel panel-default tudiqianyue">
        <form class="form-horizontal" action="" method="post" enctype="multipart/form-data">
            <div style="margin-top: 50px"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">项目名称:</label>
                <div class="col-sm-10">
                    <select name="pkProject" style="width: 100px">
                        <c:forEach items="${projectInfos}" var="pro">
                            <option value="${pro.pkProject}">${pro.projectName}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">资料包名称:</label>
                <div class="col-sm-10">
                    <input type="text" name="materialName"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">请选择上传的资料包:</label>
                <div class="col-sm-10">
                    <input type="hidden" name="materialAddress"/>
                    <input type="file" name="file" id="file"/>
                    <button type="button" id="submitId"/>
                    点击上传
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">基本信息:</label>
                <div class="col-sm-10">
                    <textarea name="basicInfo" rows="3"></textarea>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">备注:</label>
                <div class="col-sm-10">
                    <textarea name="notes" rows="3"></textarea>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">更新用户:</label>
                <div class="col-sm-10">
                    <label class="col-sm-2 control-label"><shiro:principal property="realname"/></label>
                </div>
            </div>
           <%-- <div class="form-group">
                <label class="col-sm-2 control-label">更新日期:</label>
                <div class="col-sm-10">
                    <input type="datetime-local">
                </div>
            </div>--%>
            <div class="form-group">
                <button type="submit" style="margin-left: 250px;width: 100px" class="btn btn-default">保存</button>
            </div>
        </form>
    </div>
</div>

</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.4.js"></script>
<%--<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/fileupload/js/uploadfile.js"></script>--%>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>

</html>