<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>系统信息设置</title>
	 <%@include file="/common/common.jsp" %>	
	 
</head>
<body>
		<!-- 路径导航 开始 -->
		<div class="col-xs-12">
			<ol class="breadcrumb">
				<li><a href="#">首页</a></li>
				<li><a href="#">系统设置</a></li>
				<li class="active">系统信息设置</li>
			</ol>
		</div>
		<!-- 路径导航 结束 -->
		<div class="col-xs-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="col-xs-4">系统信息设置</div>
					<div class="col-xs-8 panel-oprerate">
							
					</div>
				</div>
				<div class="panel-body">
				
					<div class="form-horizontal">
						<div class="form-group">
							<label  class="col-sm-2 control-label">投诉电话：</label>
							<div class="col-sm-3">
								 <input class="form-control" type="text" >
							</div>
						</div>
						<div class="form-group">
							<div class="panel-heading">
								<label class="col-sm-2 control-label ">入驻通知书上传备注：</label>
							<div class="panel-body project_sign_box">
							<textarea class="project_sign" rows="3" name="progressContent" cols="50" ></textarea>
							</div>
							</div>
						</div>
						<div class="form-group">
							<div class="panel-heading">
								<label class="col-sm-2 control-label ">入驻办理提交备注：</label>
							<div class="panel-body project_sign_box">
							<textarea class="project_sign" rows="3" name="progressContent" cols="50" ></textarea>
							</div>
							</div>
						</div>
						<div class="form-group">
							<div class="panel-heading">
								<label class="col-sm-2 control-label ">支付金额温馨提示：</label>
							<div class="panel-body project_sign_box">
							<textarea class="project_sign" rows="3" name="progressContent" cols="50" ></textarea>
							</div>
							</div>
						</div>	
						<div class="form-group">
							<div class="panel-heading">
								<label class="col-sm-2 control-label ">物业欠费温馨提示：</label>
							<div class="panel-body project_sign_box">
							<textarea class="project_sign" rows="3" name="progressContent" cols="50" ></textarea>
							</div>
							</div>
						</div>
					 <div class="form-group">
						<label  class="col-sm-2 control-label">代付协议：</label>
						<div class="col-sm-3">
							 <input class="form-control" type="text" >
						</div>
					</div>
					<div class="form-group">
						<label  class="col-sm-2 control-label">三方协议：</label>
						<div class="col-sm-3">
							 <input class="form-control" type="text" >
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

 
</script>

</html>