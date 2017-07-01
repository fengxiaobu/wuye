<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>项目设置</title>
     <%@include file="/common/common.jsp" %>
</head>

<body>
	<!-- 路径导航 开始 -->
	<div class="col-xs-12">
	    <ol class="breadcrumb">
	        <li><a href="#">首页</a></li>
	        <li><a href="#">系统设置</a></li>
	        <li class="active">项目设置</li>
	    </ol>
	</div>
	<!-- 路径导航 结束 -->
		<div class="col-xs-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="col-xs-4">项目设置</div>
						<div class="col-xs-12">
								
							<div class="form-inline">
								<div class="form-group">
									<label>项目名称：</label>
									<input type="text" class="form-control quanxianmingcheng" placeholder="项目名称">
									<button id="query" type="submit" class="btn btn-info danxi_saixuan">搜索</button>
								</div>
							</div>
						</div>
				</div>
				
							
			<div class="panel-body">
					<table class="table table-bordered landReturn-table edit-tr">
						<thead>
							<tr class="info">
			                    <th rowspan="2">序号</th>
			                    <th rowspan="2">项目名称<br/></th>
			                    <th rowspan="2">项目地址</th>
			                    <th rowspan="2">水费单价</th>
			                    <th rowspan="2">电费单价</th>
			                    <th rowspan="2">客服电话</th>
			                    <th rowspan="2">开发项目电话</th>
			                    <th rowspan="2">更新日期</th>
			                    <th rowspan="2">物业缴费备注</th>
			                    <th rowspan="2">操作</th>
			                </tr>
						</thead>
						<tbody class="tudiqianyue-tbody">
							<tr>
								<td>1</td>
								<td>2</td>
								<td>3</td>
								<td>4</td>
								<td>5</td>
								<td>6</td>
								<td>7</td>
								<td>8</td>
								<td>9</td>
								<td>
									<a class="btn btn-info"  href="${basePath}/page/system/project/projectedit" role="button">编辑</a></td>
								</td>
							</tr>
		                </tbody>
		            </table>
		            
				</div>
			</div>
			</div>
			
		
</body>
<script type="text/javascript">

</script>
 
</html>
