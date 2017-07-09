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
						<form id="formquery" onsubmit="return false;">
						<div class="form-group">
							<label  class="col-sm-2 control-label">项目名称：</label>
							<div class="col-sm-3">
								 <input class="form-control" type="text" placeholder="${projectInfo.projectName }" readonly>
							</div>
						</div>
						
						<div class="form-group">
							<label class="col-sm-2 control-label ">首次限制开始日期：</label>
							 <div id="form_datetime" class="input-group date form_datetime col-sm-3" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
				                    <input class="form-control" size="16" type="text" value="<fmt:formatDate value='${projectInfo.startDate }' pattern='yyyy-MM-dd'/>" readonly>
				                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
									<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				              </div>
							  <input type="hidden" id="dtp_input1" name="startDate" value="<fmt:formatDate value='${projectInfo.startDate }' pattern='yyyy-MM-dd'/>" /> <br>
							
							<label class="col-sm-2 control-label ">首次限制截止日期：</label>
							 <div id="form_datetime2" class="input-group date form_datetime col-sm-3" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
				                    <input class="form-control" size="16" type="text" value="<fmt:formatDate value='${projectInfo.endDate }' pattern='yyyy-MM-dd'/>" readonly>
				                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
									<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
				              </div>
							  <input type="hidden" id="dtp_input2" name="endDate" value="<fmt:formatDate value='${projectInfo.endDate }' pattern='yyyy-MM-dd'/>" /> <br>
						</div>
						
						<div class="form-group">
						    <label class="col-sm-2 control-label ">每日限缴金额：</label>
						    <div class="input-group col-sm-3">
						      <div class="input-group-addon">￥</div>
						      <input type="text" class="form-control" id="exampleInputAmount" name="firstMoney" value="${projectInfo.firstMoney}">
						      <div class="input-group-addon">元</div>
						    </div>
						 </div>
						 <div class="form-group">
						    <label class="col-sm-2 control-label ">每月限缴金额：</label>
						    <div class="input-group col-sm-3">
						      <div class="input-group-addon">￥</div>
						      <input type="text" class="form-control" id="exampleInputAmount" name="everyMoney" value="${projectInfo.everyMoney }">
						      <div class="input-group-addon">元</div>
						    </div>
						 </div>
						  <div class="form-group">
						  	 <label class="col-sm-2 control-label ">状态：</label>
							 <label class="radio-inline">
							  <input type="radio" name="astrictStatus" id="inlineRadio1"  value="Y" ${projectInfo.astrictStatus=='Y'?'checked':''}> 启用
							</label>
							<label class="radio-inline">
							  <input type="radio" name="astrictStatus" id="inlineRadio2" value="N" ${projectInfo.astrictStatus=='N'?'checked':''}> 禁用
							</label>
						 </div>
						  <div class="form-group">
						    <label class="col-sm-2 control-label ">更新时间:</label>
						     <div class="col-sm-3">
						     	 
						     	 <input class="form-control" type="text" value="<fmt:formatDate value='${projectInfo.updateDate}' pattern='yyyy-MM-dd HH:mm'/>"readonly>
						    </div>
						   
						 </div>
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10 ">
								<button id="btn_submit" class="btn btn-success from_sub" type="submit"><span class="glyphicon glyphicon-ok"></span>保存</button>
								<button class="btn btn-success from_sub" type="submit" id="cancelBtn" onclick="history.back(-1)"><span class="glyphicon glyphicon-ok"></span>取消</button>
							</div>
						</div>
						<input type="hidden" name="pkProject" value="${projectInfo.pkProject}">
					</form>	
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
 /**
 * 提交编辑
 */
$("#btn_submit").click(function(){
	if(checkDate()){
		layer.confirm('请确认数据检查无误并提交?', {icon: 3, title:'提示'}, function(index){
			//提交到后台的RESTful
			$.ajax({
			   type: "POST",
			   url: "${basePath}/admin/sys/updateproject",
			   data: $("#formquery").serialize(),
			   statusCode :{
				   201 : function(){
						layer.alert('项目水电限制编辑成功!', {icon: 6,skin: 'layer-ext-moon'},function(){location.href = "${basePath}/page/system/waterele/projectlist" })
				   },
				   400 : function(){
					   layer.msg('提交的参数不合法!', {icon: 5,time:2000});
				   },
				   500 : function(){
					   layer.msg('操作异常，请稍后再试！', {icon: 5,time:2000});
				   }
			   }
			});
			});
	}
});
//表单校验
function checkDate(){
	//TODO
	return true;
}
</script>

</html>