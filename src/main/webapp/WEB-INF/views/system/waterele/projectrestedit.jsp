<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>项目限制编辑</title>
	 <%@include file="/common/common.jsp" %>	
	 
</head>
<body>
		<!-- 路径导航 开始 -->
		<div class="col-xs-12">
			<ol class="breadcrumb">
				<li><a href="#">首页</a></li>
				<li><a href="#">系统设置</a></li>
				<li><a href="#">项目限制</a></li>
				<li class="active">编辑</li>
			</ol>
		</div>
		<!-- 路径导航 结束 -->
		<div class="col-xs-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="col-xs-4">项目限制编辑</div>
					<div class="col-xs-8 panel-oprerate">
							
					</div>
				</div>
				<div class="panel-body">
				
					<div class="form-horizontal">
						<div class="form-group">
							<label  class="col-sm-2 control-label">项目名称：</label>
							<div class="col-sm-3">
								 <input class="form-control" type="text" placeholder="北京联东U谷项目" readonly>
							</div>
						</div>
						
						<div class="form-group">
							<label class="col-sm-2 control-label ">首次限制开始日期：</label>
							 <div id="form_datetime" class="input-group date form_datetime col-sm-3" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
				                    <input class="form-control" size="16" type="text" value="" readonly>
				                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
									<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				              </div>
							  <input type="hidden" id="dtp_input1" name="" value="" /> <br>
							
							<label class="col-sm-2 control-label ">首次限制截止日期：</label>
							 <div id="form_datetime2" class="input-group date form_datetime col-sm-3" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
				                    <input class="form-control" size="16" type="text" value="" readonly>
				                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
									<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				              </div>
							  <input type="hidden" id="dtp_input2" name="" value="" /> <br>
						</div>
						
						<div class="form-group">
						    <label class="col-sm-2 control-label ">每日限缴金额：</label>
						    <div class="input-group col-sm-3">
						      <div class="input-group-addon">￥</div>
						      <input type="text" class="form-control" id="exampleInputAmount">
						      <div class="input-group-addon">元</div>
						    </div>
						 </div>
						 <div class="form-group">
						    <label class="col-sm-2 control-label ">每月限缴金额：</label>
						    <div class="input-group col-sm-3">
						      <div class="input-group-addon">￥</div>
						      <input type="text" class="form-control" id="exampleInputAmount">
						      <div class="input-group-addon">元</div>
						    </div>
						 </div>
						  <div class="form-group">
						  	 <label class="col-sm-2 control-label ">状态：</label>
							 <label class="radio-inline">
							  <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 启用
							</label>
							<label class="radio-inline">
							  <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 禁用
							</label>
						 </div>
						  <div class="form-group">
						    <label class="col-sm-2 control-label ">更新时间:</label>
						     <div class="input-group col-sm-3">
						     	 
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