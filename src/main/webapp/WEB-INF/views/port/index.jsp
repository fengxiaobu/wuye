<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>接口管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/H-ui.reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/houtai-style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/js/libs/bootstrap/css/bootstrap.css">
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/libs/calendar/WdatePicker.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/libs/layer/skin/layer.css">
    <style>
        .delete {
            display: inline-block;
            width: 90px !important;
            height: 34px !important;
            background-color: #ff9600;
            text-align: center;
            line-height: 34px;
            font-size: 12px;
            color: white;
            margin-right: 10px !important;
            /*margin-bottom:10px!important;*/
            border-radius: 4px;
            border: none !important;
            padding: 0 !important;
        }
    </style>
</head>
<body>
<section class="section">
    <p class="index-sectionheader">
        <span>当前位置 : </span>
        <span>接口管理-接口列表</span>
    </p>
    <div class="search">
        <form id="formquery" onsubmit="return false;">
            <div>
                <img src="${pageContext.request.contextPath }/imgs/yhlist_03.png" alt="">
                <input type="text" placeholder="接口标题" id="title">
                <label>更新时间：</label>
                <input id="d5221" class="Wdate" type="text" readonly="readonly"
                       onFocus="var d5222=$dp.$('d5222');WdatePicker({onpicked:function(){d5222.focus();},maxDate:'#F{$dp.$D(\'d5222\')}'})"/>
                至
                <input id="d5222" class="Wdate" type="text" readonly="readonly"
                       onFocus="WdatePicker({minDate:'#F{$dp.$D(\'d5221\')}'})"/>
                <a><span id="query">查询</span></a>
                <a href='${pageContext.request.contextPath }/dist/port/add'><span class="addbtn">+ 新增</span></a>
            </div>

        </form>
    </div>
    <div class="userlist">
        <table cellspacing="0" id="pagelist">
            <tr>
                <td width="60px">序号</td>
                <td>接口地址</td>
                <td>请求方式</td>
                <td>标题</td>
                <td>新增时间</td>
                <td>更新时间</td>
                <td>操作</td>
            </tr>
        </table>
        <div>
            <ul class="pagination" id="pagination1"></ul>
        </div>
    </div>

</section>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jqPaginator.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/layer/layer.js" charset="UTF-8"></script>
<script type="text/javascript">
    //每页显示10条
    var pageSize = 10;

    $(function () {
        init.getData(1, pageSize);

    })
    $("#query").click(function () {
        init.getData(1, pageSize);
    })
    var init = {
        //加载分页显示数据
        getData: function (num, pageSize) {
            var title = $("#title").val();
            var startTime = $("#d5221").val();
            var endTime = $("#d5222").val();

            $.ajax({
                url: "${pageContext.request.contextPath}/dist/port/queryListByPage",
                type: "GET",
                contentType: "text/json,html,xml;charset=utf-8",
                dataType: "json",
                data: {
                    title: title,
                    startTime: startTime,
                    endTime: endTime,
                    page: num,//当前页
                    rows: pageSize
                },
                cache: false,
                success: function (data) {
                    init.pagedata(num, data, pageSize);
                },
                error: function () {
                    // 失败处理的回调函数
                }
            });
        },
        //将分页信息显示在页面
        pagedata: function (num, data, pageSize) {
            $("#pagelist tr:not(:first)").remove();
            var results = data.rows;
            var totalPages = data.total % pageSize == 0 ? Math.floor(data.total / pageSize) : Math.floor(data.total / pageSize + 1);
            if (results.length != 0) {
                for (var i = 0; i < results.length; i++) {
                    var rowContent = "<tr>"
                        + "<td align='center'>" + (i + 1) + "</td>"
                        + "<td>" + results[i].addre + "</td>"
                        + "<td>" + results[i].type + "</td>"
                        + "<td>" + results[i].title + "</td>"
                        + "<td>" + results[i].addTime + "</td>"
                        + "<td>" + results[i].updateTime + "</td>"
                        + "<td align='center'>"
                        + "<a href='${pageContext.request.contextPath }/dist/port/edit/" + results[i].id + "' title='编辑'>编辑</a>|"
                        + "<a class='ajax-get' href='javascript:void(0);' onclick=\"del('" + results[i].id + "')\" title='移除'>移除</a>"
                        + "</td>"
                        + "</tr>";

                    $("#pagelist").append(rowContent);
                }
            } else {
                totalPages = totalPages <= 1 ? 1 : totalPages;

                // $("#pagelist").append("<td colspan='6'>暂无数据</td>");
            }
            $.jqPaginator('#pagination1', {
                totalPages: totalPages,
                visiblePages: pageSize,
                currentPage: num,
                onPageChange: function (num1, type) {
                    if (num1 != num) {
                        init.getData(num1, pageSize);
                    }
                }
            });
        }
    }
    //删除
    function del(id) {
        layer.confirm('是否确认删除?', {icon: 3, title: '提示'}, function (index) {
            //do something
            $.ajax({
                type: "POST",//请求类型
                url: "${pageContext.request.contextPath}/dist/port/del/" + id,
                statusCode: {
                    204: function (data) {
                        layer.msg('删除成功!', {time: 2000});
                        init.getData(1, 10);
                    },
                    500: function () {
                        layer.msg('操作异常，请稍后再试！', {time: 2000});
                    }
                }
            });
            layer.close(index);
        });

    }
</script>
</body>
</html>
