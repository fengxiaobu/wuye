<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>项目设置编辑</title>
	 <%@include file="/common/common.jsp" %>	
	 
</head>
<body>
		<!-- 路径导航 开始 -->
		<div class="col-xs-12">
			<ol class="breadcrumb">
				<li><a href="#">首页</a></li>
				<li><a href="#">系统设置</a></li>
				<li><a href="#">项目设置</a></li>
				<li class="active">编辑</li>
			</ol>
		</div>
		<!-- 路径导航 结束 -->
		<div class="col-xs-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="col-xs-4">项目设置编辑</div>
					<div class="col-xs-8 panel-oprerate">
							
					</div>
				</div>
				<div class="panel-body">
				
					<div class="form-horizontal">
						<div class="form-group">
							<label  class="col-sm-2 control-label">项目名称：</label>
							<div class="col-sm-3">
								 <select class="form-control zhibao_dk_class" name="massifId">
								 	<option>北京联东U谷项目</option>
								 	<option>北京联东金桥项目</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label ">项目地址：</label>
							<div class="col-sm-3">
								<input type="text" name="createTime" class="form-control" value="" >
							</div>
						</div>
						<div class="form-group">
						    <label class="col-sm-2 control-label ">水费单价：</label>
						    <div class="input-group col-sm-3">
						      <div class="input-group-addon">￥</div>
						      <input type="text" class="form-control" id="exampleInputAmount">
						      <div class="input-group-addon">元/吨</div>
						    </div>
						 </div>
						 <div class="form-group">
						    <label class="col-sm-2 control-label ">电费单价：</label>
						    <div class="input-group col-sm-3">
						      <div class="input-group-addon">￥</div>
						      <input type="text" class="form-control" id="exampleInputAmount">
						      <div class="input-group-addon">元/度</div>
						    </div>
						 </div>
						<div class="form-group">
							<label class="col-sm-2 control-label ">项目电话：</label>
							<div class="col-sm-3">
								<input type="text" name="createTime" class="form-control" value="" >
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label ">客户电话：</label>
							<div class="col-sm-3">
								<input type="text" name="createTime" class="form-control" value="" >
							</div>
						</div>
						<div class="form-group">
							<div class="panel-heading">
								<label class="col-sm-2 control-label ">物业缴费备注：</label>
							<div class="panel-body project_sign_box">
							<textarea class="project_sign" rows="3" name="progressContent" cols="50" ></textarea>
							</div>
							</div>
						</div>
						 <div class="form-group">
						    <label class="col-sm-2 control-label ">装修管理费：</label>
						    <div class="input-group col-sm-3">
						      <div class="input-group-addon">￥</div>
						      <input type="text" class="form-control" id="exampleInputAmount">
						      <div class="input-group-addon">元/平方米</div>
						    </div>
						 </div>
						<div class="form-group">
						    <label class="col-sm-2 control-label ">出入证押金：</label>
						    <div class="input-group col-sm-3">
						      <div class="input-group-addon">￥</div>
						      <input type="text" class="form-control" id="exampleInputAmount">
						      <div class="input-group-addon">元/人</div>
						    </div>
						 </div>
						 <div class="form-group">
						    <label class="col-sm-2 control-label ">出入证工本费：</label>
						    <div class="input-group col-sm-3">
						      <div class="input-group-addon">￥</div>
						      <input type="text" class="form-control" id="exampleInputAmount">
						      <div class="input-group-addon">元/个</div>
						    </div>
						 </div>
						  <div class="form-group">
						  	<label class="col-sm-2 control-label ">装修押金公式：</label>
						  	<div class="input-group col-sm-3">
						  		<div class="input-group-addon">小于</div>
						    	<input type="text" class="form-control" id="exampleInputName2">
						    	 <div class="input-group-addon">平方米，收费</div>
						    	 <input type="text" class="form-control" id="exampleInputName2">
						    	 <div class="input-group-addon">元</div>
						     </div>
						  </div>
						 <div class="form-group">
						 	<label class="col-sm-2 control-label "></label>
						 	<div class="input-group col-sm-3">
						     	<div class="input-group-addon">大于等于</div>
						    	<input type="text" class="form-control" id="exampleInputName2">
						    	 <div class="input-group-addon">平方米，收费</div>
						    	 <input type="text" class="form-control" id="exampleInputName2">
						    	 <div class="input-group-addon">元</div>
						     </div>
						 </div>
						
						
						  <div class="form-group">
						    <label class="col-sm-2 control-label ">更新时间:</label>
						     <div class="col-sm-3">
						     	 
						     	 <input class="form-control" type="text" placeholder="2017-07-1" readonly>
						    </div>
						 </div>
						
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10 ">
								<button id="btn_submit" class="btn btn-success from_sub" type="submit"><span class="glyphicon glyphicon-ok"></span>保存</button>
								<button class="btn btn-success from_sub" type="submit" id="cancelBtn" onclick="history.back(-1)"><span class="glyphicon glyphicon-ok"></span>取消</button>
							</div>
						</div>
						
				</div>
				
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