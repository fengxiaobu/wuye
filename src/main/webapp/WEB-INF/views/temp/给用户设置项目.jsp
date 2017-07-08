<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="<%=basePath%>/css/H-ui.reset.css">
    <link rel="stylesheet" href="<%=basePath%>/css/houtai-style.css">
    <link rel="stylesheet" href="<%=basePath%>/css/div_table.css">
    <link rel="stylesheet" href="<%=basePath%>/js/ztree/zTreeStyle.css" type="text/css"/>
    <!--[if lte IE 9]>
    <script type="text/javascript" src="js/html5.js"></script>
    <script type="text/javascript" src="js/PIE_IE678.js"></script>
    <![endif]-->

    <title>设置项目</title>
    <style type="text/css">
        * {
            margin: 0;
            padding: 0;
            list-style-type: none;
            outline: none;
        }

        a, img {
            border: 0;
        }

        .selectbox {
            width: 500px;
            height: 220px;
            margin: 100px auto;
        }

        .selectbox div {
            float: left;
        }

        .selectbox .select-bar {
            padding: 0 20px;
        }

        .selectbox .select-bar select {
            width: 150px;
            height: 200px;
            border: 1px #A0A0A4 solid;
            padding: 4px;
            font-size: 14px;
            font-family: "microsoft yahei";
        }

        .btn-bar {

        }

        .btn-bar p {
            margin-top: 16px;
        }

        .btn-bar p .btn {
            width: 50px;
            height: 30px;
            cursor: pointer;
            font-family: simsun;
            font-size: 14px;
        }
    </style>
</head>
<base href="<%=basePath%>">
<body>
<section class="section">
    <p class="index-sectionheader">
        <span>当前位置 : </span>
        <span>首页 - 用户列表 - 设置项目</span>
    </p>
    <input type="hidden" value="${sessionScope.user.deptId}" id="loginDeptId">
    <div class="addmes">
        <div class="addmes-cnt">
            <div class="mestr">
                <div class="firsttd">用户姓名:</div>
                <div class="lasttd">
                    <span id="userName"> ${user.userName}</span>
                </div>
            </div>
            <div class="mestr">
                <div class="firsttd">手机号码:</div>
                <div class="lasttd">
                    <span id="movePhone">${user.movePhone }</span>
                </div>
            </div>
            <div class="mestr">
                <div class="firsttd"><span style="color:#fe0000;">* </span>选择部门:</div>
                <div class="lasttd">
                    <ul id="tree" class="ztree"></ul>
                </div>
            </div>

            <div class="selectbox">
                <div class="select-bar">
                    <select multiple="multiple" id="select1">
                    </select>
                </div>

                <div class="btn-bar">
                    <p>
						<span id="add"><input type="button" class="btn" value=">"
                                              title="移动选择项到右侧"/></span>
                    </p>
                    <p>
						<span id="add_all"><input type="button" class="btn"
                                                  value=">>" title="全部移到右侧"/></span>
                    </p>
                    <p>
						<span id="remove"><input type="button" class="btn"
                                                 value="<" title=" 移动选择项到左侧"/></span>
                    </p>
                    <p>
						<span id="remove_all"><input type="button" class="btn"
                                                     value="<<" title=" 全部移到左侧"/></span>
                    </p>
                </div>
                <form method="POST" id='formproject' onsubmit="return false;">
                    <input type="hidden" name="userId" value="${user.userId}"/>
                    <input type="hidden" name="projectIds" id="projectIds"/>
                    <div class="select-bar">
                        <select multiple="multiple" id="select2">
                            <c:forEach items="${projectList}" var="pro">
                                <option selected="selected" value="${pro.projectId }">${pro.projectName }</option>
                            </c:forEach>
                        </select>
                    </div>
                </form>
            </div>
            <div class="surebtn">
                <a href="javascript:history.go(-1)"><span>返回</span></a>
                <span id="btn_submit">确定</span>
            </div>
        </div>
    </div>

</section>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<script src="${pageContext.request.contextPath }/js/ztree/jquery.ztree.all-3.5.js"></script>
<script src="${pageContext.request.contextPath }/js/layer/layer.js"></script>
<script type="text/javascript">
    var zTree;
    var treeNodes;
    var setting = {
        data: {
            keep: {parent: "parent"},
            key: {name: "deptName"},
            simpleData: {enable: true, idKey: "deptId", pIdKey: "pid"}
        },
        callback: {
            onClick: onClick,
            beforeClick: beforeClick
        },
        view: {
            showIcon: false,
            showLine: true,
            selectedMulti: false
        }

    };
    function beforeClick(treeId, treeNode, clickFlag) {
        var id = $("#loginDeptId").val();
        var zTree = $.fn.zTree.getZTreeObj("tree");
        var node = zTree.getNodeByParam("deptId", id, null);
        var level = node.level;  //用户的level
        var levelclick = treeNode.level;  //点击的 level
        if (levelclick < level) return false;
        else return true;
    }

    function onClick(event, treeId, treeNode, clickFlag) {
        var value = treeNode.deptName;
        var id = treeNode.deptId;

        //根据所选的部门加载部门下的项目名称
        loadPro(id);
    }
    $(function () {
        //加载部门组织结构
        $.ajax({
            async: false,
            cache: false,
            type: 'GET',
            dataType: "json",
            url: "${pageContext.request.contextPath }/rest/dept/allDeptDefault",//请求的action路径
            error: function () {//请求失败处理函数
                layer.msg('操作失败', {time: 2000});
            },
            success: function (data) { //请求成功后处理函数。
                treeNodes = data; //把后台封装好的简单Json格式赋给treeNodes
                $.fn.zTree.init($("#tree"), setting, treeNodes);
            }
        });

        //提交
        $("#btn_submit").click(function () {
            var projectIds = [];
            $("#select2 option").each(function () {
                var projectId = $(this).val();
                projectIds.push(projectId);
            });
            $("#projectIds").val(projectIds);
            submit_pro();
        })
    })

    //根据所选的部门加载部门下的项目名称
    function loadPro(did) {
        $.ajax({
            async: false,
            cache: false,
            type: 'GET',
            dataType: "json",
            url: "${pageContext.request.contextPath }/rest/project/queryProByDeptId/" + did,//请求的action路径
            error: function () {//请求失败处理函数
                layer.msg('获取部门信息失败', {time: 1000});
            },
            success: function (data) { //请求成功后处理函数。
                if (data != null) {
                    $("#select1").html("");
                    $("#select2").html("");
                    var options = "";
                    for (var i = 0; i < data.length; i++) {
                        options += "<option value=\"" + data[i].projectId + "\">"
                            + data[i].projectName
                            + "</option>";
                    }
                    $("#select1").html(options);
                }
            }
        });
    }
    ////////////////////////////////////////////项目选择框  左右移动  开始/////////////////////////////////////////////////////////////////
    //移到右边
    $('#add').click(function () {
        //先判断是否有选中
        if (!$("#select1 option").is(":selected")) {
            layer.msg('请选择需要移动的选项', {time: 1000});
        }
        //获取选中的选项，删除并追加给对方
        else {
            $('#select1 option:selected').appendTo('#select2');
        }
    });

    //移到左边
    $('#remove').click(function () {
        //先判断是否有选中
        if (!$("#select2 option").is(":selected")) {
            layer.msg('请选择需要移动的选项', {time: 1000});
        } else {
            $('#select2 option:selected').appendTo('#select1');

        }
    });

    //全部移到右边
    $('#add_all').click(function () {
        //获取全部的选项,删除并追加给对方
        $('#select1 option').appendTo('#select2');

    });

    //全部移到左边
    $('#remove_all').click(function () {
        $('#select2 option').appendTo('#select1');

    });

    //双击选项
    $('#select1').dblclick(function () { //绑定双击事件
        //获取全部的选项,删除并追加给对方
        $("option:selected", this).appendTo('#select2'); //追加给对方

    });

    //双击选项
    $('#select2').dblclick(function () {
        $("option:selected", this).appendTo('#select1');

    });


    //提交绑定
    function submit_pro() {
        layer.confirm('请确认数据检查无误并提交?', {icon: 3, title: '提示'}, function (index) {
            //do something
            //提交到后台的RESTful
            $.ajax({
                type: "POST",
                url: "${pageContext.request.contextPath }/rest/user/userproject",
                data: $("#formproject").serialize(),
                statusCode: {
                    201: function () {
// 								layer.alert('用户绑定项目成功!', {icon: 6,skin: 'layer-ext-moon'},function(){ location.href = "${pageContext.request.contextPath }/rest/user/touserlist" ; })
                        layer.alert('用户绑定项目成功!', {icon: 6, skin: 'layer-ext-moon'}, function () {
                            history.go(-1);
                        })
                    },
                    400: function () {
                        layer.alert('提交的参数不合法！', {icon: 5, skin: 'layer-ext-moon'})
                    },
                    402: function () {
                        layer.alert('登录信息已过期，请重新登录！', {icon: 5, skin: 'layer-ext-moon'}, function () {
                            window.parent.location.href = "${pageContext.request.contextPath }/login.jsp";
                        })
                    },
                    500: function () {
                        layer.alert('网络异常，请稍后再试', {icon: 5, skin: 'layer-ext-moon'})
                    }
                }
            });
            layer.close(index);
        });
    }
</script>
</html>