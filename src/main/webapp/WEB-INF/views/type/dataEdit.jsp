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
		<div class="col-xs-12">
			<div class="panel panel-default">
				<div class="panel-body">
				  <form class="form-horizontal" action="${pageContext.request.contextPath}/typeRefinement/addOrUpdate" method="post">
					<div class="form-horizontal">
						<input type="hidden" name="typeRefinementId" value="${typeRefinement.typeRefinementId}">
						<input type="hidden" name="typeDifferentiateId" value="${typeRefinement.typeDifferentiateId}">
						<div class="form-group">
							<label class="col-sm-2 control-label">
								<c:if test="${typeRefinement.typeDifferentiateId=='1'}" >
					　			房产使用属性：
								</c:if>
								<c:if test="${typeRefinement.typeDifferentiateId=='2'}" >
								　　属性：
								</c:if>
								<c:if test="${typeRefinement.typeDifferentiateId=='3'}" >
								　　行业：
								</c:if>
								<c:if test="${typeRefinement.typeDifferentiateId=='4'}" >
								　　上市类型：
								</c:if>
								<c:if test="${typeRefinement.typeDifferentiateId=='5'}" >
								　　类型名称：
								</c:if>
								<c:if test="${typeRefinement.typeDifferentiateId=='6'}" >
								　　退租类型：
								</c:if>
								<c:if test="${typeRefinement.typeDifferentiateId=='9'}" >
								　　通知类型：
								</c:if>
							</label>
							<div class="col-sm-3">
								<input type="text" class="form-control renwushixiang" name="typeRefinementName" value="${typeRefinement.typeRefinementName }">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">状态：</label>
							<div class="col-sm-3">
								<input type="radio" name="status" value="0" <c:if test="${typeRefinement.status eq 0}">checked="checked"</c:if>/>启用
								<input type="radio" name="status" value="1" <c:if test="${typeRefinement.status eq 1}">checked="checked"</c:if>/>禁用
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">更新日期：</label>
							<div class="col-sm-3">
								<fmt:formatDate value="${typeRefinement.updateTime}" type="both" pattern="yyyy-MM-dd hh:mm"/>
							</div>

						</div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<button class="btn btn-success from_sub" type="submit"><span class="glyphicon glyphicon-ok"></span>保存</button>
							</div>
						</div>
					</div>
					</form>
				</div>
			</div>
		</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/datetimepicker/datetimepicker.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/datetimepicker/datetimepicker.zh-CN.js" charset="UTF-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/creditList/update.js"></script>

</script>
</html>