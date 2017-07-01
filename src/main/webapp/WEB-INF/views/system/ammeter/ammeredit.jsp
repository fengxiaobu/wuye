<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>电表编辑</title>
	 <%@include file="/common/common.jsp" %>	
	 
</head>
<body>
		<!-- 路径导航 开始 -->
		<div class="col-xs-12">
			<ol class="breadcrumb">
				<li><a href="#">首页</a></li>
				<li><a href="#">系统设置</a></li>
				<li><a href="#">电表</a></li>
				<li class="active">编辑</li>
			</ol>
		</div>
		<!-- 路径导航 结束 -->
		<div class="col-xs-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="col-xs-4">电表编辑</div>
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
							<label class="col-sm-2 control-label ">房产：</label>
							<div class="col-sm-3">
								<input class="form-control" type="text" placeholder="北京联东U谷房产" readonly>
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


$(".image01_click").on("click","",function(){
	$(".tupian01").click();
})

$(".tupian01").on('change', function(){
	selFile(this.files,"image","file_up_image01","image01_click","image01_val");
});
$(".image02_click").on("click","",function(){
	$(".tupian02").click();
})
$(".tupian02").on('change', function(){
	selFile(this.files,"image","file_up_image02","image02_click","image02_val");
});
function selFile(files,fileType,fromId,image,inputClass){
	console.info('begin');
	var file = files[0];
	var fr = new FileReader();
	fr.readAsDataURL(file);
	var flagType = true;
	fr.onload = function () {
		//判断展示的文件类型
		if(file.type.indexOf("image") > -1){
			if(fileType=="image"){
				var imgSrc = fr.result;
				$("."+image).attr('src',imgSrc);
			}else{
				alert("请上传其他类型的文件");
				return ;
			}
		}else {
			if(fileType!="file"){
				alert("请上传图片类型的文件!");
				return ;
			}
				
		}
		 $('.message_span').text('上传中，请稍等...');
	  	 $('#message_before_send_show').css({'display':'block'});
	  	var fileName = $("."+inputClass).val();
	  	if(fileName != "" &&fileName.length > 0){
 	  		 $.ajax({  
 	 	        type:"POST",  
 	 	        url: ""+projectPath+"/admin/file/delete",  
 	 	        data:{fileName:fileName},
 	 	        success: function(data){
 	 	        	
 	 	        }  
 	 	    })
 		}
		 hfu_ajax({
			success:function(data){
				console.info(data.data);
				$("."+inputClass).val(data.data);
				$('#message_before_send_show').css({'display':'none'});
				},
				progress:function(a){
					if(a=100){	
						
					}
				},
			url:""+projectPath+"/admin/file/upload2",
			fromId:fromId
		})
	} 
}
</script>

</html>