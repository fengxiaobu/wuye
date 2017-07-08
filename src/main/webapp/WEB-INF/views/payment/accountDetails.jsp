<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
    <script src="${pageContext.request.contextPath}/js/libs/jquery-1.11.3.min.js"></script>
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
            <form action="" method="post">
                <div class="form-inline">
                    <div class="form-group">
						<label>缴费类型：</label>
						<select class="form-control">
						 	<option>全部</option>
						 	<option>开发</option>
						 	<option>物业</option>
						</select>
                        <label>日期：</label>
                        <div id="form_datetime" class="input-group date form_datetime col-sm-3" data-date=""
                             data-date-format="yyyy-mm-dd" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
                            <input id="showdate1" class="form-control" size="16" type="text" value=""
                                   readonly="readonly">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                        </div>
                        <input type="hidden" id="dtp_input1" name="startDate" value=""/>
                        至
                        <div id="form_datetime2" class="input-group date form_datetime col-sm-3" data-date=""
                             data-date-format="yyyy-mm-dd" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                            <input id="showdate2" class="form-control" size="16" type="text" value=""
                                   readonly="readonly">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
                            <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
                        </div>
                        
                        <input type="hidden" id="dtp_input2" name="endDate" value=""/>
						<input type="text" class="form-control" placeholder="收款公司模糊搜索">
                        <button id="query" type="submit" class="btn btn-info danxi_saixuan">查询</button>
                        <a id="daochu" type="button" onclick="" class="btn btn-info danxi_saixuan">导出</a>
                    </div>
                </div>
            </form>
        </div>

        <div class="panel-body">
            <table class="table table-bordered landReturn-table edit-tr">
                <thead>
                <tr class="info">
                    <th rowspan="2">序号</th>
                    <th rowspan="2">项目名称</th>
                    <th rowspan="2">房产</th>
                    <th rowspan="2">客户名称</th>
                    <th rowspan="2">缴费类型</th>
                    <th rowspan="2">收款账户</th>
                    <th rowspan="2">收款公司</th>
                    <th rowspan="2">缴费金额</th>
                    <th rowspan="2">费用类型</th>
                    <th rowspan="2">交费时间</th>
                </tr>
                </thead>
					<tbody class="tudiqianyue-tbody">

							<tr>
								<td>1</td>
								<td>2</td>
								<td>3</td>
								<td>4</td>
								<td>5</td>
								<td>1</td>
								<td>2</td>
								<td>3</td>
								<td>4</td>
								<td>5</td>
							</tr>
					</tbody>
				</table>

        </div>
    </div>
</div>

</body>
</html>