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
                <form class="form-horizontal"
                      action="${pageContext.request.contextPath}/messageManageBack/messageManageSave" method="post">
                    <input type="hidden" name="message_manage_id" value="${messageManage.message_manage_id}"/>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">通知名称：</label>
                        <div class="col-sm-3">
                            <input type="text" class="form-control renwushixiang" name="title"
                                   value="${messageManage.title}">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">通知类型：</label>
                        <div class="col-sm-10">
                            <select name="type" style="width:140px" class="form-control">
                                <option value="入驻通知" <c:if test="${'入驻通知' eq messageManage.type}">selected</c:if>>入驻通知
                                </option>
                                <option value="缴费通知" <c:if test="${'缴费通知' eq messageManage.type}">selected</c:if>>缴费通知
                                </option>
                                <option value="欠费通知" <c:if test="${'欠费通知' eq messageManage.type}">selected</c:if>>欠费通知
                                </option>
                                <option value="欠费通知" <c:if test="${'水费通知' eq messageManage.type}">selected</c:if>>水费通知
                                </option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">通知范围:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${messageManage.range}</label>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <div class="col-xs-4">通知内容：</div>
                        </div>
                        <div class="panel-body project_sign_box">
								<textarea id="contentqq" class="project_sign" rows="9"
                                          name="content" cols="150" style="visibility: hidden;">
                                    ${messageManage.content}
                                </textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">状态:</label>
                        <div class="col-sm-10 radio">
                            <label>
                                <input type="radio" name="status" id="status1"
                                       <c:if test="${messageManage.status eq 1}">checked="checked"</c:if>
                                       value="1"/>上架
                            </label>
                            <label>
                                <input type="radio" name="status" id="status2"
                                       <c:if test="${messageManage.status eq 0}">checked="checked"</c:if>
                                       value="0"/>下架
                            </label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">发布日期：</label>
                        <div class="col-sm-10">
                            <label class="control-label"><fmt:formatDate value="${messageManage.create_time}"
                                                                         pattern="yyyy-MM-dd hh:mm"/></label>
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
<script type="text/javascript">

    //加载插件
    qqEditor();


</script>
</html>