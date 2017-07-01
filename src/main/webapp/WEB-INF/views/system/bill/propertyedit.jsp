<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>物业开票编辑</title>
	 <%@include file="/common/common.jsp" %>	
	 
</head>
<body>
		<!-- 路径导航 开始 -->
		<div class="col-xs-12">
			<ol class="breadcrumb">
				<li><a href="#">首页</a></li>
				<li><a href="#">系统设置</a></li>
				<li><a href="#">物业开票</a></li>
				<li class="active">编辑</li>
			</ol>
		</div>
		<!-- 路径导航 结束 -->
		<div class="col-xs-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="col-xs-4">物业开票编辑</div>
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
							<label class="col-sm-2 control-label ">客户名称：</label>
							<div class="col-sm-3">
								<input class="form-control" type="text" placeholder="张三" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label ">缴费类型：</label>
							<div class="col-sm-3">
								<input class="form-control" type="text" placeholder="物业" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label ">提交时间：</label>
							<div class="col-sm-3">
								<input class="form-control" type="text" placeholder="2017-07-01" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label ">单据号：</label>
							<div class="col-sm-3">
								<input class="form-control" type="text" placeholder="123" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label ">开票单位：</label>
							<div class="col-sm-3">
								<input class="form-control" type="text" placeholder="北京锐智互动" readonly>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label ">开票类型：</label>
							<div class="col-sm-3">
								<input class="form-control" type="text" placeholder="代付开票" readonly>
							</div>
						</div>
						<div class="form-group">
						  	 <label class="col-sm-2 control-label ">开票状态：</label>
							 <label class="radio-inline">
							  <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 已开
							</label>
							<label class="radio-inline">
							  <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 未开
							</label>
						 </div>
						<div class="form-group">
							<label class="col-sm-2 control-label">三方协议：</label>
							<div class="col-sm-3">
								<form id="file_up_image01" enctype="multipart/form-data">
									<input style="display:none" type="file" value="11" name="file" class="tupian01">
								</form>
							</div>
							<input type="hidden"   class="image01_val">
							<div class="col-sm-10">
								<dl class="upload-img">
									<dd><img src="${imagesPath}/timg.jpg" alt="..." class="img-rounded img140 image01_click" style="margin-bottom:10px;"></dd>
								</dl>
							</div>
							<label class="col-sm-2 control-label">代付证明</label>
							<div class="col-sm-3">
								<form id="file_up_image02" enctype="multipart/form-data">
									<input style="display:none" type="file" value="11" name="file" class="tupian02">
								</form>
							</div>
								<input type="hidden"   class="image02_val">
							<div class="col-sm-10">
								<dl class="upload-img">
									<dd><img src="${imagesPath}/timg.jpg" alt="..." class="img-rounded img140 image02_click" style="margin-bottom:10px;"></dd>
								</dl>
							</div>
						</div>
					  <div class="form-group">
					    <label class="col-sm-2 control-label ">更新时间:</label>
					     <div class="col-sm-3">
					     	 
					     	 <input class="form-control" type="text" placeholder="2017-07-1" readonly>
					    </div>
					 </div>
					 
					<div class="col-xs-10">	
						<div class="panel panel-default">	
							<div class="panel-heading">
								<div class="col-xs-4">开票明细</div>
							</div>
							<div class="panel-body">
							<table class="table table-bordered landReturn-table edit-tr">
								<thead>
									<tr class="info">
					                    <th rowspan="2">序号</th>
					                    <th rowspan="2">开票公司</th>
					                    <th rowspan="2">费用类型</th>
					                    <th rowspan="2">开票金额</th>
					                    <th rowspan="2">发票号</th>
					                    <th rowspan="2">发票备注</th>
					                    <th rowspan="2">开票日期</th>
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
									</tr>
				                </tbody>
				            </table>
						</div>
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