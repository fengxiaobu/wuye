<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>电表列表</title>
     <%@include file="/common/common.jsp" %>
</head>

<body>
	<!-- 路径导航 开始 -->
	<div class="col-xs-12">
	    <ol class="breadcrumb">
	        <li><a href="#">首页</a></li>
	        <li><a href="#">系统设置</a></li>
	        <li class="active">电表列表</li>
	    </ol>
	</div>
	<!-- 路径导航 结束 -->
		<div class="col-xs-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="col-xs-4">电表列表</div>
						<div class="col-xs-8 panel-oprerate">
								<a href="#"  class="btn btn-info" target="iframe_ch_ch">搜索	</a>
								<a href="#"  class="btn btn-success" target="iframe_ch_ch">导入	</a>
						</div>
						<div class="col-xs-12">
							<div class="form-inline">
								<div class="form-group">
								<label>项目名称：</label>
									 <select class="form-control">
									 	<option>北京联东U谷项目</option>
									 	<option>北京联东U谷项目</option>
									 	<option>北京联东金桥项目</option>
									</select>
								 </div>
								 <div class="form-group">
									<label>电表号：</label>
									<input type="text" class="form-control" placeholder="电表号">
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
			                    <th rowspan="2">房产</th>
			                    <th rowspan="2">更新时间</th>
			                    <th rowspan="2">操作</th>
			                </tr>
						</thead>
						<tbody class="tudiqianyue-tbody">
							<tr>
								<td>1</td>
								<td>2</td>
								<td>3</td>
								<td>4</td>
								<td>
									<a class="btn btn-info"  href="${basePath}/page/system/ammeter/ammeredit" role="button">编辑</a>
									<a class="btn btn-info"  href="#" role="button">查看电表</a>
								</td>
							</tr>
		                </tbody>
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
</script>
 
</html>
