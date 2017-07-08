<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/layer/skin/layer.css">
    <title>新增角色</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath }/css/H-ui.reset.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath }/css/houtai-style.css">
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/calendar/WdatePicker.js"></script>
    <!-- 导入ztree类库 -->
    <link rel="stylesheet"
          href="${pageContext.request.contextPath }/js/ztree/zTreeStyle.css"
          type="text/css"/>
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
        <span>当前位置 : </span> <span>首页 - 系统管理 - 新增角色</span>
    </p>
    <div class="addmes">
        <p class="addclick">
            <span x="1" class="addclick-style">角色信息</span>
        </p>
        <div class="addmes-cnt">
            <form method="POST" id='formproject' onsubmit="return false;">
                <input type="hidden" name="funcitonIds">
                <div class="mestr">
                    <div class="firsttd"><span style="color: #fe0000;">* </span>角色名称:</div>
                    <div class="lasttd">
                        <input id="name" type="text" name="name">
                    </div>
                </div>
                <div class="mestr">
                    <div class="firsttd"><span style="color: #fe0000;">* </span>关键字:</div>
                    <div class="lasttd">
                        <input id="code" type="text" name="code">
                    </div>
                </div>
                <div class="mestr">
                    <div class="firsttd">描述:</div>
                    <div class="lasttd">
                        <textarea name="description" rows="4" cols="33"></textarea>
                    </div>
                </div>
                <div class="mestr">
                    <div class="firsttd">授权:</div>
                    <div class="lasttd">
                        <ul id="functionTree" class="ztree"></ul>
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
<script src="${pageContext.request.contextPath }/js/ztree/jquery.ztree.all-3.5.js"></script>
<script src="${pageContext.request.contextPath }/js/layer/layer.js"></script>
<script>
    $(function () {
        // 授权树初始化
        var setting = {
            data: {
                key: {
                    title: "t"
                },
                simpleData: {
                    enable: true
                }
            },
            check: {//使用ztree选中效果
                enable: true,
            }
        };
        $.ajax({
            url: '${pageContext.request.contextPath}/rest/sys/getAllFunction',//发送ajax请求加载权限数据
            //url:'${pageContext.request.contextPath}/menu.json',
            type: 'get',
            dataType: 'json',
            success: function (data) {//data就是服务端返回的权限数据
                //var zNodes = eval("(" + data + ")");
                //使用权限数据初始化ztree
                $.fn.zTree.init($("#functionTree"), setting, data);
            },
            error: function (msg) {
                alert('树加载异常!');
            }
        });

        //确定添加按钮
        $("#btn_submit").click(function () {
            if (checkHousetype()) {
                //获得ztree对象
                var treeObj = $.fn.zTree.getZTreeObj("functionTree");
                //获得当前ztree对象选中的节点数组
                var nodes = treeObj.getCheckedNodes(true);//在提交表单之前将选中的checkbox收集
                //循环数组，获得节点的ID，拼接成字符串使用逗号分隔
                var array = new Array();
                for (var i = 0; i < nodes.length; i++) {
                    array.push(nodes[i].id);
                }
                var ids = array.join(",");
                $("input[name=funcitonIds]").val(ids);

                var formData = new FormData($("#formproject")[0]);
                $.ajax({
                    type: "POST",
                    url: "${pageContext.request.contextPath }/rest/sys/addRole",
// 						data : $("#formproject").serialize(),
                    data: formData,
                    contentType: false,
                    processData: false,
                    statusCode: {
                        201: function () {
                            layer.msg('新增角色成功!', {icon: 6, time: 1500}, function () {
                                location.href = "${pageContext.request.contextPath }/rest/sys/page/rolelist";
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
        });
    });


    //校验
    function checkHousetype() {
        var flag = true;
        //关键字
        if ($("#code").val() == '') {
            flag = false;
            layer.msg('请输入关键字', {time: 1500});
            return flag;
        }
        //名称
        if ($("#name").val() == '') {
            flag = false;
            layer.msg('请输入角色名称', {time: 1500});
            return flag;
        }

        return flag;
    }
</script>
</html>