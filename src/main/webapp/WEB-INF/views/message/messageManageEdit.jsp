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
                <li><a href="#">通知管理</a></li>
                <li class="active">发布通知</li>
            </ol>
        </div>
        <!-- 路径导航 结束 -->
        <div class="col-xs-12">
            <div class="panel panel-default tudiqianyue">
                <form class="form-horizontal" action="${pageContext.request.contextPath}/dist/enterApply/updateEnterApply" method="post">
                    <div class="form-group" style="margin-top: 50px">
                        <input type="hidden" name="message_manage_id" value="${messageManage.message_manage_id}"/>
                        <label class="col-sm-2 control-label">通知名称：</label>
                        <div class="col-sm-10">
                        	<input type="text" name="title" value="${messageManage.title}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">通知类型：</label>
                        <div class="col-sm-10">
                        	<select name="type" style="width:140px">
								<option value="入驻通知" <c:if test="${'入驻通知' eq messageManage.type}">selected</c:if>>入驻通知</option>
								<option value="缴费通知" <c:if test="${'缴费通知' eq messageManage.type}">selected</c:if>>缴费通知</option>
								<option value="停电通知" <c:if test="${'停电通知' eq messageManage.type}">selected</c:if>>停电通知</option>
								<option value="欠费通知" <c:if test="${'欠费通知' eq messageManage.type}">selected</c:if>>欠费通知</option>
								<option value="欠费通知" <c:if test="${'水费通知' eq messageManage.type}">selected</c:if>>水费通知</option>
								<option value="其他通知" <c:if test="${'其他通知' eq messageManage.type}">selected</c:if>>其他通知</option>
							</select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">通知范围:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${messageManage.range}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">通知图片:</label>
                        <div class="col-sm-10">
                            <img src="" name="messageManageSrc">
                            <button>上传图片</button>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">通知内容:</label>
                        <div class="col-sm-10">
                           	<textarea rows="" cols="">
                           	
                           	</textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">状态:</label>
                        <div class="col-sm-10 radio">
                            <label>
                                <input type="radio" name="auditStatus" id="optionsRadios1"
                                       <c:if test="${messageManage.status eq 1}">checked="checked"</c:if>
                                       value="0"/>上架
                            </label>
                            <label>
                                <input type="radio" name="auditStatus" id="optionsRadios2"
                                       <c:if test="${messageManage.status eq 0}">checked="checked"</c:if>
                                       value="1"/>下架
                            </label>
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label class="col-sm-2 control-label">发布日期：</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label"><fmt:formatDate value="${messageManage.create_time}" pattern="yyyy-MM-dd hh:mm"/></label>
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