<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
     <%@include file="/common/common.jsp" %>
</head>
<body>

<div class="col-xs-12">
    <ol class="breadcrumb">
        <li><a href="#">快捷缴费</a></li>
        <li class="active">对账表</li>
    </ol>
</div>
<!-- 路径导航 结束 -->
<div class="col-xs-12">
    <div class="panel panel-default">
        <div class="panel-heading">
            <div class="col-xs-4">对账表</div>
            <form action="${basePath}/account/accountData" method="post" id="domainForm">
                <div class="form-inline">
                    <div class="form-group">
						<label>缴费类型：</label>
						<select class="form-control" name="type">
						 	<option value="全部" <c:if test="${'全部' eq query.type}">selected</c:if>>全部</option>
						 	<option value="开发" <c:if test="${'开发' eq query.type}">selected</c:if>>开发</option>
						 	<option value="物业" <c:if test="${'物业' eq query.type}">selected</c:if>>物业</option>
						</select>
                        <label>日期：</label>
								<div id="form_datetime" class="input-group date form_datetime " data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
				                    <input id="showdate1" name="startDate" class="form-control" size="16" type="text" value="<fmt:formatDate value="${query.startDate}" pattern="yyyy-MM-dd"/> " readonly="readonly">
				                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
									<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				              </div>
							  <input type="hidden" id="dtp_input1" name="startDate" value="${query.startDate}" />
							  至
							  <div id="form_datetime2" class="input-group date form_datetime " data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
				                    <input id="showdate2" name="endDate" class="form-control" size="16" type="text" value="<fmt:formatDate value="${query.endDate}" pattern="yyyy-MM-dd"/> " readonly="readonly">
				                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
									<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				              </div>
                        	  <input type="hidden" id="dtp_input2" name="endDate" value="${query.endDate}"/>
                        <button id="query" type="submit" class="btn btn-info danxi_saixuan">查询</button>
                        <a id="daochu" type="button" href="${pageContext.request.contextPath}/account/exportExcel" class="btn btn-info danxi_saixuan">导出</a>
                    </div>
                </div>
            </form>
        </div>

        <div class="panel-body">
            <table class="table table-bordered landReturn-table edit-tr">
                <thead>
	                <tr class="info">
	                    <th rowspan="2">收款公司</th>
	                    <th rowspan="2">收款账号</th>
	                    <th rowspan="2">缴费类型</th>
	                    <th rowspan="2">应缴（总）</th>
	                    <th rowspan="2">已缴（总）</th>
	                </tr>
                </thead>
                 <c:forEach items="${accounts}" var="accounts">
					<tbody class="tudiqianyue-tbody">
							<tr>
								<td>${accounts.collecting_company}</td>
								<td>${accounts.collecting_account}</td>
								<td>${accounts.feetype}</td>
								<td>${accounts.payable}</td>
								<td>${accounts.paid_in}</td>
							</tr>
					</tbody>
                 </c:forEach>
				</table>

        </div>
    </div>
</div>

</body>
<script type="text/javascript">
$(function(){
 	formdate('#form_datetime');
 	formdate('#form_datetime2');
 })
 
 
// $(document).ready(function(){
//   $("#daochu").click(function(){
// 	     $.post("${pageContext.request.contextPath}/account/exportExcel",
// 	    {
// 	      type:"123456"
// 	    }
//     );
//  });

// });
</script>
 
</html>