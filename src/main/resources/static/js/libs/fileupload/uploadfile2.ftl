<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>fileupload</title>
    <link href="${request.contextPath}/static/fileupload/bootstrap.min.css" media="all" rel="stylesheet" type="text/css"/>
    <link href="${request.contextPath}/static/fileupload/fileinput.css" media="all" rel="stylesheet" type="text/css"/>
    <script src="${request.contextPath}/static/fileupload/jquery-1.11.3.min.js"></script>
    <script src="${request.contextPath}/static/fileupload/bootstrap.min.js"></script>
    <script src="${request.contextPath}/static/fileupload/fileinput.js" type="text/javascript"></script>
    <script src="${request.contextPath}/static/fileupload/zh.js" type="text/javascript"></script>
</head>
<body>
<div class="container-fluid">
    <form id="form" action="upload/insert" method="post" enctype="multipart/form-data">
         <div class="row form-group">
            <label class="col-md-4">图片上传:</label>
            <div class="col-sm-12">
                <input id="input-id" name="file" multiple type="file" data-show-caption="true">
            </div>
        </div>
    </form>
</div>
</body>
<script>
$(function () {
    initFileInput("input-id");
})

function initFileInput(ctrlName) {
    var control = $('#' + ctrlName);
    control.fileinput({
        language: 'zh', //设置语言
        uploadUrl: "upload/insert", //上传的地址
        allowedFileExtensions: ['jpg', 'gif', 'png'],//接收的文件后缀
        //uploadExtraData:{"id": 1, "fileName":'123.mp3'},
        uploadAsync: true, //默认异步上传
        showUpload: true, //是否显示上传按钮
        showRemove : true, //显示移除按钮
        showPreview : true, //是否显示预览
        showCaption: false,//是否显示标题
        browseClass: "btn btn-primary", //按钮样式
        //dropZoneEnabled: true,//是否显示拖拽区域
        //minImageWidth: 50, //图片的最小宽度
        //minImageHeight: 50,//图片的最小高度
        //maxImageWidth: 1000,//图片的最大宽度
        //maxImageHeight: 1000,//图片的最大高度
        //maxFileSize: 0,//单位为kb，如果为0表示不限制文件大小
        //minFileCount: 0,
        //maxFileCount: 10, //表示允许同时上传的最大文件个数
        enctype: 'multipart/form-data',
        validateInitialCount:true,
        previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
        msgFilesTooMany: "选择上传的文件数量({n}) 超过允许的最大数值{m}！",

    }).on('filepreupload', function(event, data, previewId, index) {     //上传中
        var form = data.form, files = data.files, extra = data.extra,
        response = data.response, reader = data.reader;
        console.log('文件正在上传');
    }).on("fileuploaded", function (event, data, previewId, index) {    //一个文件上传成功
        console.log('文件上传成功！'+data.id);

    }).on('fileerror', function(event, data, msg) {  //一个文件上传失败
        console.log('文件上传失败！'+data.id);


    })
}
</script>
</html>