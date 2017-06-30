
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>辣子两耳屎</title>

</head>
<body>
<h1 ></h1>
<div >文件上传测试  多文件</div>
     <form id="file_up" enctype="multipart/form-data">
     	<input type="file" name="file" onchange="handleFiles(this.files,'image')" />
     	<input type="file" name="file" onchange="handleFiles(this.files,'image')" />
     	<input type="file" name="file" onchange="handleFiles(this.files,'image')" />
     </form>
<!-- 图片上传 -->
<div id='up' class='up'>点我上传</div>

<!-- 图片预览 -->
<div><a href="${request.contextPath}/admin/file/delete?fileName=upload/image/1497424635728289.png">删除文件</a></div>
<div><a href="${request.contextPath}/admin/file/down?fileName=upload/image/1497424635719452.png">下载文件</a></div>

</body>
	<script type="text/javascript" src="${request.contextPath}/static/rzhd/js/libs/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="${request.contextPath}/static/rzhd/js/common.js"></script>
	<script type="text/javascript" src="${request.contextPath}/static/rzhd/js/file/uploadFile.js"></script>
<script type='text/javascript'>
$(".up").click(function(){
	hfu_ajaxs({
		success:function(data){
			console.info(data.data);
			},
			progress:function(a){
				if(a=100){	
					
				}
			},
		url:""+projectPath+"/test/upload"
	})
})

</script>
</html>​​