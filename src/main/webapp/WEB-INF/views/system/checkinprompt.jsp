 <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>入住提示信息</title>
 <%@include file="/common/common.jsp" %>
</head>
<body>

</body>
<!-- 路径导航 开始 -->
<div class="col-xs-12">
	<ol class="breadcrumb">
		<li><a href="#">首页</a></li>
		<li><a href="#">系统设置</a></li>
		<li class="active">入住提示信息</li>
	</ol>
</div>

<!-- 路径导航 结束 -->
<div class="col-xs-12">
<form method="POST" id='formproject' onsubmit="return false;" class="form-horizontal">
	<div class="panel panel-default">
		<div class="panel-heading">
			<div class="col-xs-4">入住提示信息</div>
		</div>
		<div class="panel-body project_sign_box">
		<textarea id="contentqq" class="project_sign" rows="9" name="info" cols="150" style="visibility:hidden;">${dictInfo.info }</textarea>
		<!-- <p>
				剩余可输入 <span class="word_count1">0</span> 个文字。
		</p> -->
		</div>
	</div>
	<div class="form-group">
		<label class="col-sm-2 control-label ">上次更新时间：${dictInfo.updateTime }</label>
			
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10 ">
			<button id="btn_submit" class="btn btn-success from_sub" type="submit"><span class="glyphicon glyphicon-ok"></span>保存</button>
		</div>
	</div>
		<input type="hidden" name="id" value="${dictInfo.id }">
		<input type="hidden" name="typeCode" value="${dictInfo.typeCode }">
		<input type="hidden" name="isEnable" value="${dictInfo.isEnable }">
	</form>
</div>
<input type="hidden" id="count" value="">
<script type="text/javascript">
//加载插件
qqEditor();

$("#btn_submit").click(function(){
	/* var editor = K.create('textarea[name="info"]', options);
	editor.sync();
	var html = $('#contentqq').val(); */
	var html = $("#contentqq").val();
	$("#contentqq").html(html);
	var count = $("#count").val();
	if(count<2000){
		$.ajax({
			   type: "POST",
			   url: "${basePath}/admin/sys/editrename",
			   data: $("#formproject").serialize(),
			   statusCode :{
				   201 : function(){
						layer.alert('入住提示信息编辑成功!', {icon: 6,skin: 'layer-ext-moon'},function(){location.href = "${basePath}/admin/sys/rename/3"  })
				   },
				   400 : function(){
					   layer.msg('提交的参数不合法!', {icon: 5,time:2000});
				   },
				   500 : function(){
					   layer.msg('操作异常，请稍后再试！', {icon: 5,time:2000});
				   }
			   }
			});
	}else{
		layer.msg('内容过多,请删除部分后重试!', {icon: 5,time:2000});
	}
})
</script>
</html>
