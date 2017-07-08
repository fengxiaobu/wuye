<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/layer/skin/layer.css">
    <title>新增功能权限</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath }/css/H-ui.reset.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath }/css/houtai-style.css">
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/calendar/WdatePicker.js"></script>

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

    .addclick-style {
        background-color: #5B99C7 !important;
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
        width: 90px;
        height: 30px;
        text-align: center;
        line-height: 30px;
        font-size: 12px;
        color: white;
        border-radius: 4px;
    }

    img {
        height: 150px;
        width: 400px;
    }
</style>
<body>
<section class="section">
    <p class="index-sectionheader">
        <span>当前位置 : </span> <span>首页 - 系统管理 - 新增功能权限</span>
    </p>
    <div class="addmes">
        <p class="addclick">
            <span x="1" class="addclick-style">新增功能权限</span>
        </p>
        <div class="addmes-cnt">
            <form method="POST" id='formproject' onsubmit="return false;">
                <!-- 户型信息 -->
                <div class="mestr">
                    <div class="firsttd"><span style="color: #fe0000;">* </span>权限名称:</div>
                    <div class="lasttd">
                        <input id="name" type="text" name="name">
                        <span id="name_ts" style="color:red;"></span>
                    </div>
                </div>
                <div class="mestr">
                    <div class="firsttd"><span style="color: #fe0000;">* </span>关键字:</div>
                    <div class="lasttd">
                        <input id="code" type="text" name="code">
                    </div>
                </div>
                <div class="mestr">
                    <div class="firsttd">访问路径:</div>
                    <div class="lasttd">
                        <input type="text" name="page">
                    </div>
                </div>
                <div class="mestr">
                    <div class="firsttd">是否生成菜单:</div>
                    <div class="lasttd">
                        <select name="generatemenu">
                            <option value="0">不生成</option>
                            <option value="1">生成</option>
                        </select>
                    </div>
                </div>
                <div class="mestr" id="yxj">
                    <div class="firsttd"><span style="color: #fe0000;">* </span>优先级:</div>
                    <div class="lasttd">
                        <input id="zindex" type="text" name="zindex"><span id="yxj_ts" style="color:#666666;"></span>
                    </div>
                </div>
                <div class="mestr">
                    <div class="firsttd">父功能点:</div>
                    <div class="lasttd">
                        <select name="pid" id="sel">
                            <option value=""></option>
                            <c:forEach items="${ authFunctionList}" var="fun">
                                <option value="${fun.id }">${fun.name }</option>
                            </c:forEach>
                        </select>
                        <span id="sel_ts" style="color:#666666;"></span>
                    </div>
                </div>
                <div class="mestr">
                    <div class="firsttd">描述:</div>
                    <div class="lasttd">
                        <textarea name="description" rows="4" cols="33"></textarea>
                    </div>
                </div>
            </form>
        </div>
        <div class="surebtn">
            <span onclick="history.back(-1)">返回</span><span id="btn_submit">确定</span>
        </div>
    </div>
</section>
</body>

<script src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<script src="${pageContext.request.contextPath }/js/layer/layer.js"></script>
<script>
    $(function () {


        $("#sel").mouseover(function () {
            $("#sel_ts").text("如果是顶级功能点，请选择为空")
        }).mouseout(function () {
            $("#sel_ts").text("")
        });
        $("#yxj").mouseover(function () {
            $("#yxj_ts").text("请输入0~9自然整数")
        }).mouseout(function () {
            $("#yxj_ts").text("")
        });


        //确定添加按钮
        $("#btn_submit").click(function () {

            if (checkHousetype()) {
                var name = $("#name").val();
                $.ajax({
                    type: "GET",//请求类型
                    url: "${pageContext.request.contextPath }/rest/sys/checkFunctionName/" + name,
                    statusCode: {
                        200: function (data) {
                            if (data) {
                                //$("#name_ts").text("权限名称已存在")
                                layer.msg('权限名称已存在', {time: 1500});
                                return false;
                            } else {
                                //提交后台
                                submitFrom()
                            }
                        },
                        500: function () {
                            layer.msg('网络异常，请稍后再试！', {time: 2000});
                            return false;
                        }
                    }
                });
            }
        });
    });


    //校验
    function checkHousetype() {

        var patrn = /^[0-9]$/;

        //名称
        if ($("#name").val() == '') {
            layer.msg('请输入名称', {time: 1500});
            return false;
        }

        //关键字
        if ($("#code").val() == '') {
            layer.msg('请输入关键字', {time: 1500});
            return false;
        }
        //优先级
        if (!($("#zindex").val().match(patrn))) {
            layer.msg('优先级只能是0~9整数', {time: 1500});
            return false;
        }
        return true;
    }
    function submitFrom() {
        //提交到后台的RESTful
        var formData = new FormData($("#formproject")[0]);
        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath }/rest/sys/addfunciton",
// 						data : $("#formproject").serialize(),
            data: formData,
            contentType: false,
            processData: false,
            statusCode: {
                201: function () {
                    layer.msg('新增功能权限成功!', {icon: 6, time: 1500}, function () {
                        location.href = "${pageContext.request.contextPath }/rest/sys/page/function";
                    })
                },
                400: function () {
                    layer.msg('提交的参数不合法', {time: 1500});
                },
                500: function () {
                    layer.msg('网络异常，请稍候再试!', {time: 1500});
                }
            }
        });
    }
</script>
</html>