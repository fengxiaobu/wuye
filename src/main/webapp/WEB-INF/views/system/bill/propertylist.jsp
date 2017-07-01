<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>物业开票列表</title>
     <%@include file="/common/common.jsp" %>
</head>

<body>
	<!-- 路径导航 开始 -->
	<div class="col-xs-12">
	    <ol class="breadcrumb">
	        <li><a href="#">首页</a></li>
	        <li><a href="#">系统设置</a></li>
	        <li class="active">物业开票</li>
	    </ol>
	</div>
	<!-- 路径导航 结束 -->
		<div class="col-xs-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="col-xs-4">物业开票列表</div>
						<div class="col-xs-8 panel-oprerate">
								<a href="#"  class="btn btn-info" target="iframe_ch_ch">搜索	</a>
						</div>
						<div class="col-xs-12">
							<div class="form-inline">
								 <div class="form-group">
										<label>开票日期：</label>
										<div id="form_datetime" class="input-group date form_datetime " data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
						                    <input id="showdate1" class="form-control" size="16" type="text" value="" readonly="readonly">
						                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
											<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
						              </div>
									  <input type="hidden" id="dtp_input1" name="nextReturnTime" value="" />
									  至
										<div id="form_datetime2" class="input-group date form_datetime " data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
						                    <input id="showdate2" class="form-control" size="16" type="text" value="" readonly="readonly">
						                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
											<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
						              </div>
								  </div>
								  <div class="form-group">
								  		<label>开票状态：</label>
										 <select class="form-control">
										 	<option>全部</option>
										 	<option>已开</option>
										 	<option>未开</option>
										</select>
									</div>
								<div class="form-group">
								<label>项目名称：</label>
									 <select class="form-control">
									 	<option>北京联东U谷项目</option>
									 	<option>北京联东U谷项目</option>
									 	<option>北京联东金桥项目</option>
									</select>
								 </div>
								 <div class="form-group">
									<label>客户名称：</label>
									<input type="text" class="form-control" placeholder="客户名称">
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
			                    <th rowspan="2">客户名称</th>
			                    <th rowspan="2">缴费类型</th>
			                    <th rowspan="2">开票日期</th>
			                    <th rowspan="2">单据号</th>
			                    <th rowspan="2">开票状态</th>
			                    <th rowspan="2">开票类型</th>
			                    <th rowspan="2">提交日期</th>
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
								<td>10</td>
								<td>
									<a class="btn btn-info"  href="${basePath}/page/system/bill/propertyedit" role="button">编辑</a>
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
