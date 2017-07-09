<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>电表新增</title>
	 <%@include file="/common/common.jsp" %>	
	 
</head>
<body>
		<!-- 路径导航 开始 -->
		<div class="col-xs-12">
			<ol class="breadcrumb">
				<li><a href="#">首页</a></li>
				<li><a href="#">系统设置</a></li>
				<li><a href="#">电表</a></li>
				<li class="active">新增</li>
			</ol>
		</div>
		<!-- 路径导航 结束 -->
		<div class="col-xs-12">
			<div class="panel panel-default">
			 <form method="post" id='formproject' onsubmit="return false;" >
				<div class="panel-heading">
					<div class="col-xs-4">电表新增</div>
					<div class="col-xs-8 panel-oprerate">
							
					</div>
				</div>
				<div class="panel-body">
				
					<div class="form-horizontal">
						<div class="form-group">
							<label  class="col-sm-2 control-label">项目名称：</label>
							<div class="col-sm-3">
								<select class="form-control" id="projectName" name="pk_project">
									<option>选择项目</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label ">房产编号：</label>
							<div class="col-sm-3">
								<select class="form-control" id="house" name="pk_house">
									<option>选择房产</option>
								</select>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label ">电表号：</label>
							<div class="col-sm-3">
								<input class="form-control" type="text" name="ammeter_no">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label ">倍率：</label>
							<div class="col-sm-3">
								<input class="form-control" type="text" name="multiply">
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
			</form>
			</div>
		</div>
		<div id="message_before_send_show" style="display:none;position: fixed;z-index:5000;top:0px;left:0px;width: 100%;height: 100%;background-color: rgba(0,0,0,0.1);text-align: center;line-height: 100vh;"><i class="fa fa-spinner fa-spin"></i><span class="message_span" ></span></div>
</body>



<script type="text/javascript">
$(function(){
	init.project();
})
$("#btn_submit").click(function(){
	layer.confirm('请确认数据检查无误并提交?', {icon: 3, title:'提示'}, function(index){
		//提交到后台的RESTful
		$.ajax({
		   type: "POST",
		   url: "${basePath}/admin/sys/ammeadd",
		   data: $("#formproject").serialize(),
		  
		   statusCode :{
			   201 : function(){
					layer.alert('新增成功!', {icon: 6,skin: 'layer-ext-moon'},function(){window.location.href = "${basePath}/admin/sys/ammelist"})
			   },
			   400 : function(){
				   layer.msg('参数错误，请稍后再试！', {icon: 5,time:2000});
				   
			   },
			   500 : function(){
				   layer.msg('操作异常，请稍后再试！', {icon: 5,time:2000});
			   }
			   
		   }
		   
	         
		});
		});
		
});

var init = {
		//项目
		project : function(){
			//
            $.ajax({
                type: "GET",
                contentType: "application/json",
                url: "${basePath}/admin/sys/findallproject",
                beforeSend: function () {
   	        	 $('.message_span').text('加载中，请稍等...');
   	        	 $('#message_before_send_show').css({'display':'block'});
   	         	},
                statusCode :{
                	200:function(result){
                		var op = "";
                        for (var i = 0; i < result.length; i++) {
                            op += '<option value=' + result[i].pkProject + '>';
                            op += result[i].projectName;
                            op += '</option>';
                        }
                        $("#projectName").append(op);
                	}
                },
                complete : function(){
     			   $('#message_before_send_show').css({'display':'none'});
     		   }
            });
			//加载房产
			init.house('#projectName','#house');
		},
		house : function(d1,d2){
			 $(d1).change(function () {
				 $("#house").find("option").remove(); 
				 $("#house").append("<option value=''>选择房产</option>");
				 if($(this).val() !=''){
					 $.ajax({
		                   type: "GET",
		                   contentType: "application/json",
		                   url: "${basePath}/admin/sys/findallhouse?pkProject="+$(this).val(),
		                   beforeSend: function () {
		         	        	 $('.message_span').text('加载中，请稍等...');
		         	        	 $('#message_before_send_show').css({'display':'block'});
		         	         	},
		                   statusCode :{
		                   	200:function(result){
		                       var stroarea = '';
		                       for (var i = 0; i < result.length; i++) {
		                           stroarea += '<option value=' + result[i].pkHouse + '>';
		                           stroarea += result[i].vhcode;
		                           stroarea += '</option>';
		                       }
		                       $(d2).append(stroarea);
		                   }
		                   },
		                   complete : function(){
		         			   $('#message_before_send_show').css({'display':'none'});
		         		   }
		                 })
		                
				 }else{
					 $("#classify2").find("option").remove(); 
					 $("#classify2").append("<option value=''>选择房产</option>");
				 }
	             
             }); 
		}
}
</script>

</html>