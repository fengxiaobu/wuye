<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>jQuery图片上传插件支持多图批量上传与多文件批量上传控件 - xw素材网</title>
 <%@include file="/common/common.jsp" %>

<link rel="stylesheet" type="text/css" href="${scriptsPath}/libs/diyUpload/css/webuploader.css">
<link rel="stylesheet" type="text/css" href="${scriptsPath}/libs/diyUpload/css/diyUpload.css">
<script type="text/javascript" src="${scriptsPath}/libs/diyUpload/js/webuploader.html5only.min.js"></script>
<script type="text/javascript" src="${scriptsPath}/libs/diyUpload/js/diyUpload.js"></script>

</head>
<style>
*{ margin:0; padding:0;}
</style>
<body>


<div id="box">
	<div id="test" ></div>
</div>
<div id="demo">
	<div id="as" ></div>
</div>
</body>
<script type="text/javascript">

/*
* 服务器地址,成功返回,失败返回参数格式依照jquery.ajax习惯;
* 其他参数同WebUploader
*/

$('#test').diyUpload({
	url:'${basePath}/test/uploadHeadPic',
	success:function( data ) {
		console.info( data );
	},
	error:function( err ) {
		console.info( err );	
	},
	//最大上传的文件数量, 总文件大小,单个文件大小(单位字节);
	fileNumLimit:3,
});
 
/* $('#as').diyUpload({
	url:'${basePath}/test/uploadHeadPic',
	success:function( data ) {
		console.info( data );
	},
	error:function( err ) {
		console.info( err );	
	},
	buttonText : '选择文件',
	chunked:true,
	// 分片大小
	chunkSize:512 * 1024,
	//最大上传的文件数量, 总文件大小,单个文件大小(单位字节);
	fileNumLimit:3,
	fileSizeLimit:500000 * 1024,
	fileSingleSizeLimit:50000 * 1024,
	accept: {}
}); */
 

</script>

</html>
