
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>辣子两耳屎</title>

</head>
<body>
<h1 ></h1>
<div >文件上传测试 单文件</div>
     <form id="file_up" enctype="multipart/form-data">
     	<input type="file" name="file" id="file_upload"/>
     </form>
<!-- 图片上传 -->
<div id='up' class='up'>点我上传</div>

<!-- 图片预览 -->
<img alt="" src="${request.contextPath}/upload/file/1497349595438011.jpeg">

</body>
	<script type="text/javascript" src="${request.contextPath}/static/rzhd/js/libs/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="${request.contextPath}/static/rzhd/js/common.js"></script>
	<script type="text/javascript" src="${request.contextPath}/static/rzhd/js/file/uploadFile.js"></script>
<script type='text/javascript'>
$(".up").click(function(){
	hfu_ajax({
		success:function(data){
			console.info(data.data);
			},
			progress:function(a){
				if(a=100){	
	
				}
			},
		url:""+projectPath+"/admin/file/upload2"
	})
})

</script>
</html>​​