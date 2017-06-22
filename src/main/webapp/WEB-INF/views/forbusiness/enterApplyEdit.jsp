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
                <li class="active">入住申请列表</li>
            </ol>
        </div>
        <!-- 路径导航 结束 -->
        <div class="col-xs-12">
            <div class="panel panel-default tudiqianyue">
                <form class="form-horizontal"
                      action="${pageContext.request.contextPath}/dist/enterApply/updateEnterApply" method="post">
                    <div class="form-group" style="margin-top: 50px">
                        <input type="hidden" name="enterApplyId" value="${enterApply.enterApplyId}"/>
                        <input type="hidden" name="houseId" value="${enterApply.houseId}"/>
                        <label class="col-sm-2 control-label">项目名称:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${enterApply.houseInfo.projectInfo.projectName}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">房产:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${enterApply.houseInfo.houseProperty}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">客户名称:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${enterApply.clientName}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">申请时间:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${enterApply.applyTime}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">入住通知</label>
                        <div class="col-sm-10">
                            <img src="${enterApply.enterAdviceNote}" name="enterAdviceNote">
                            <a target="main" href="${pageContext.request.contextPath}/enterApply/toEnterApplyAdd"
                               class="btn btn-info" type="button"><span class="glyphicon glyphicon-arrow-down"></span>下载图片
                            </a>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">开发费用:</label>
                        <div class="col-sm-10" style="width: 700px">
                            <div class="panel-body">
                                <table class="table table-bordered tudiqianyue-table">
                                    <thead>
                                    <tr class="info">
                                        <th rowspan="2">序号</th>
                                        <th rowspan="2">费用类型<br/></th>
                                        <th rowspan="2">费用金额</th>
                                        <th rowspan="2">应缴款日期</th>
                                        <th rowspan="2">开始日期</th>
                                        <th rowspan="2">截止日期</th>
                                    </tr>
                                    </thead>
                                    <tbody class="tudiqianyue-tbody">
                                    <tr class="tudiqianyue-tdtr">
                                        <td>1</td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr class="tudiqianyue-tdtr">
                                        <td>2</td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">物业费用:</label>
                        <div class="col-sm-10" style="width: 700px">
                            <div class="panel-body">
                                <table class="table table-bordered tudiqianyue-table">
                                    <thead>
                                    <tr class="info">
                                        <th rowspan="2">序号</th>
                                        <th rowspan="2">费用类型<br/></th>
                                        <th rowspan="2">费用金额</th>
                                        <th rowspan="2">应缴款日期</th>
                                        <th rowspan="2">开始日期</th>
                                        <th rowspan="2">截止日期</th>
                                    </tr>
                                    </thead>
                                    <tbody class="tudiqianyue-tbody">
                                    <tr class="tudiqianyue-tdtr">
                                        <td>1</td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr class="tudiqianyue-tdtr">
                                        <td>2</td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">审核状态:</label>
                        <div class="col-sm-10 radio">
                            <label>
                                <input type="radio" name="auditStatus" id="optionsRadios1"
                                       <c:if test="${enterApply.auditStatus eq 0}">checked="checked"</c:if>
                                       value="0"/>未审核
                            </label>
                            <label>
                                <input type="radio" name="auditStatus" id="optionsRadios2"
                                       <c:if test="${enterApply.auditStatus eq 1}">checked="checked"</c:if>
                                       value="1"/>已通过
                            </label>
                            <label>
                                <input type="radio" name="auditStatus" id="optionsRadios3"
                                       <c:if test="${enterApply.auditStatus eq 2}">checked="checked"</c:if>
                                       value="2"/>未通过
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">审核信息:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">
                                <textarea name="notes" cols="30" rows="10">${enterApply.notes}</textarea>
                            </label>
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