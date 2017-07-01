 <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>更名</title>
 <%@include file="/common/common.jsp" %>
</head>
<body>

</body>
<!-- 路径导航 开始 -->
<div class="col-xs-12">
	<ol class="breadcrumb">
		<li><a href="#">首页</a></li>
		<li><a href="#">系统设置</a></li>
		<li class="active">更名</li>
	</ol>
</div>

<!-- 路径导航 结束 -->
<div class="col-xs-12">
	<div class="panel panel-default">
		<div class="panel-heading">
			<div class="col-xs-4">更名须知</div>
		</div>
		<div class="panel-body project_sign_box">
		<textarea id="contentqq" class="project_sign" rows="9" name="risk_content" cols="150" style="visibility:hidden;"></textarea>
		<!-- <p>
				剩余可输入 <span class="word_count1">0</span> 个文字。
		</p> -->
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label ">上次更新时间：2017-06-05</label>
			
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10 ">
			<button id="btn_submit" class="btn btn-success from_sub" type="submit"><span class="glyphicon glyphicon-ok"></span>保存</button>
		</div>
	</div>
</div>

<script type="text/javascript">
qqEditor();
</script>
</html>
