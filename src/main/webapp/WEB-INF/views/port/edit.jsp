<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加接口</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/H-ui.reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/houtai-style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/libs/layer/skin/layer.css">
    <style>
        .button {
            display: inline-block;
            width: 90px;
            height: 34px;
            background-color: #333;
            text-align: center;
            line-height: 34px;
            font-size: 12px;
            color: white;
            margin-right: 10px;
            margin-bottom: 10px;
            border-radius: 4px;
            border: none;
        }
    </style>
</head>
<style>
    .search div {
        overflow: hidden;
    }

    .search span {
        background-color: #70c0f6;
        float: right;
        margin-right: 0;
    }

    .addclick {
        background-color: white;
        padding: 20px 0;
    }

    .addclick span {
        padding: 5px 10px;
        background-color: #70c0f6;
        margin-right: 10px;
        color: white;
        border-radius: 4px;
    }

    .addclick span:hover {
        background-color: #5B99C7;
        cursor: pointer;
    }

    .addmes-cnt {
        background-color: white;
        padding-top: 30px;
    }

    .mestr {
        width: 100%;
        padding-bottom: 25px;
        overflow: hidden;
    }

    .firsttd, .lasttd {
        float: left;
    }

    .anniu {
        float: right;
        margin-top: 9px;
        margin-right: 15px;
        background-color: #70c0f6;
        display: inline-block;
        padding: 0 5px;
        height: 30px;
        text-align: center;
        line-height: 30px;
        font-size: 12px;
        color: white;
        border-radius: 4px;
    }

</style>
<body>
<section class="section">
    <p class="index-sectionheader">
        <span>当前位置 : </span>
        <block name="liebiao"><span>接口管理-接口编辑</span></block>
    </p>
    <div class="addmes userinfo">
        <form method="post" id="formproject" action="return false;">
            <div class="addmes-cnt">
                <div class="mestr">
                    <div class="firsttd">标题</div>
                    <div class="lasttd">
                        <input type="text" name="title" maxlength="60" value="${port.title }">
                    </div>
                </div>
                <div class="mestr">
                    <div class="firsttd">接口地址</div>
                    <div class="lasttd">
                        <input type="text" name="addre" maxlength="60" value="${port.addre }">
                    </div>
                </div>
                <div class="mestr">
                    <div class="firsttd">请求方式</div>
                    <div class="lasttd">
                        <input type="radio" class="request_way" value="POST"
                               name="type" ${port.type=='POST'?'checked':''}>POST
                        <input type="radio" class="request_way" value="GET"
                               name="type" ${port.type=='GET'?'checked':''}>GET
                    </div>
                </div>
                <div class="mestr">
                    <div class="firsttd">请求参数</div>
                    <div class="lasttd">
                        <textarea name="param" cols="100" rows="20">${port.param }</textarea>
                    </div>
                </div>
                <div class="mestr">
                    <div class="firsttd">数据返回</div>
                    <div class="lasttd">
                        <textarea name="returnData" cols="100" rows="20">${port.returnData }</textarea>
                    </div>
                </div>
            </div>
            <div class="surebtn">
                <input type="hidden" name="id" value="${port.id}">
                <input type="hidden" name="addTime" value="${port.addTime}">
                <span id="btn_submit">确定</span><span onclick="history.back(-1)">返回</span>
            </div>
        </form>
    </div>

</section>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/layer/layer.js" charset="UTF-8"></script>
<script type="text/javascript">


    /**
     * 提交新增
     */
    $("#btn_submit").click(function () {
        layer.confirm('请确认数据检查无误并提交?', {icon: 3, title: '提示'}, function (index) {
            //提交到后台的RESTful
            $.ajax({
                type: "POST",
                url: "${pageContext.request.contextPath}/dist/port/save",
                data: $("#formproject").serialize(),
                statusCode: {
                    201: function () {
                        layer.alert('编辑成功!', {icon: 6, skin: 'layer-ext-moon'}, function () {
                            location.href = "/dist/port/index"
                        })
                    },
                    500: function () {
                        layer.msg('操作异常，请稍后再试！', {icon: 5, time: 2000});
                    }
                }
            });
        });
    });
</script>
</body>
</html>