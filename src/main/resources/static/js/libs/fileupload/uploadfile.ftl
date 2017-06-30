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
<style>
        body {
            font-family: "Arial", "Microsoft YaHei", "黑体", "宋体", sans-serif;
            background-color: #EBF5F3;
        }

        * {
            margin: 0;
        }

        html, body {
            height: 100%;
        }

        .navbar-custom {
            /*color: #FFFFFF;*/
            background-color: #56b9ab;

        }

        .navbar-brand,
        .navbar-nav li a {
            line-height: 55px;
            height: 55px;
            padding-top: 0px;
            font-family: "Arial", "Microsoft YaHei", "黑体", "宋体", sans-serif;

        }

        .navbar-default .navbar-nav > li > a {
            color: #ffffff;
        }

        .navbar-default .navbar-nav > li > a:hover {
            color: #175A94;
        }

        .page-header {
            font-family: "Arial", "Microsoft YaHei", "黑体", "宋体", sans-serif;
            /* border-bottom: 1px solid #bbb;*/
        }

        hr {
            border-bottom: 1px solid #bbb;
        }

        .img_border {
            border: 1px solid #bbb;
        }

        @media screen and (min-width: 800px) {
            .container {
                width: 800px;
            }
        }

        @media screen and (min-width: 800px) {
            .center_toaster {
                right: 35%;
                width: 30%;
            }
        }

        @media screen and (min-width: 400px) and (max-width: 799px) {
            .center_toaster {
                right: 25%;
                width: 50%;
            }
        }

        @media screen and (min-width: 200px ) and (max-width: 399px) {
            .center_toaster {
                right: 10%;
                width: 80%;
            }
        }

        .row a {
            text-decoration: none;
        }

        .row a:hover {
            text-decoration: none;
        }

        .addMaigin {
            margin-bottom: 30px;
        }

        .change_font {
            font-size: 1.5em;
        }

        .button_width {
            width: 4em;
        }

        .button_width2 {
            width: 4em;
        }

        .wrapper {
            min-height: 100%;
            height: auto !important;
            height: 100%;
            margin: 0 auto -6em;
        }

        .push {
            height: 6em;
        }

        .footer, {
            height: 4em;
        }

        .color_white{
            background: #ffffff;
        }

    </style>

</head>
<body>

<div class="wrapper">
    <div class="navbar navbar-default navbar-custom" role="navigation">
        <div class="navbar-header">
            <a class="navbar-brand" href="http://zhangjikai.com/">
                <!--<img alt="zjk" src="../bootstrap/images/logo.png" height="50">-->
            </a>
        </div>

        <!--<div>
            <ul class="nav navbar-nav" style="float: right">
                <li><a href="#">IE9及以下请访问</a></li>
            </ul>
        </div>-->
    </div>

    <!-- Page Content -->

    <div class="container kv-main">
        <div class="row ">
            <div style="padding:10px; ">
                <form enctype="multipart/form-data">
                    <input id="file-0a" class="file" name="file" type="file" multiple data-min-file-count="1">
                    <br>
                </form>
            </div>
        </div>


    </div>
    <div class="push"></div>
</div>
</body>
<!-- Footer -->
<footer class="footer">
    <div class=" col-lg-12 text-center">
        <hr>
         <p>Copyright &copy; zhangjk 2015</p>
    </div>
    <!-- /.col-lg-12 -->
    <!-- /.row -->
</footer>

<script>
    $('#file-0a').fileinput({
        language: 'zh',
        uploadUrl: 'uploadMultipleFile',
        allowedPreviewTypes : ['image', 'html', 'text', 'video', 'audio', 'flash']

    });

    $('#file-0a').on('fileuploaderror', function(event, data, previewId, index) {
        var form = data.form, files = data.files, extra = data.extra,
                response = data.response, reader = data.reader;
        console.log(data);
        console.log('File upload error');
    });

    $('#file-0a').on('fileerror', function(event, data) {
        console.log(data.id);
        console.log(data.index);
        console.log(data.file);
        console.log(data.reader);
        console.log(data.files);
    });

    $('#file-0a').on('fileuploaded', function(event, data, previewId, index) {
        var form = data.form, files = data.files, extra = data.extra,
                response = data.response, reader = data.reader;
        console.log('File uploaded triggered');
    });
</script>
</body>
</html>