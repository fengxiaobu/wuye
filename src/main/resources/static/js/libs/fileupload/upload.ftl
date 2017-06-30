<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>uploadfile</title>
	<link rel="stylesheet" type="text/css" href="${request.contextPath}/static/rzhd/css/upload.css">
	
</head>
<body>
	<div class="up_load_file">
	</div>
	<script type="text/javascript" src="${request.contextPath}/static/rzhd/js/libs/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="${request.contextPath}/static/rzhd/js/common.js"></script>
	<script type="text/javascript" src="${request.contextPath}/static/rzhd/js/file/uploadFile.js"></script>
	<script>
		$('.up_load_file').uploadfile({
			url : ""+projectPath+"/test/upload",
			width : 500,
			height : 50,
			canDrag : false,
			canMultiple : false,
			fileType : "all",
			Maximum:1,
			success: function (fileName) {
				alert(fileName + '上传成功');
			},
			error: function (fileName) {
				alert(fileName + '上传失败');
			},
			complete : function () {
				alert('所有文件上传完毕');
			}
		});
	</script>
</body>
</html>