<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/H-ui.reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/houtai-style.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/js/layer/skin/layer.css">
<!--[if lte IE 9]>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/html5.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/PIE_IE678.js"></script>
<![endif]-->

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<style>
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

    span, a {
        color: white;
    }
</style>
<head>
    <meta charset="utf-8"/>
    <title>功能权限管理</title>
</head>
<body>
<section class="section">
    <p class="index-sectionheader">
        <span>当前位置 : </span>
        <span>系统管理-功能权限管理</span>
    </p>
    <div class="search">
        <div>
            <a href="${pageContext.request.contextPath }/rest/sys/funcitonAdd"><span class="">+ 新增权限</span></a>
        </div>
    </div>
    <div class="userlist">
        <table id="housetypeList" cellspacing="0">
            <tr>
                <td>序号</td>
                <td>名称</td>
                <td>描述</td>
                <td>是否生成菜单</td>
                <td>优先级</td>
                <td>路径</td>
                <td>操作</td>

            </tr>
            <tr></tr>
        </table>
        <div colspan="9">
            <ul class="pagination" id="pagination1"></ul>
        </div>
    </div>
</section>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jqPaginator.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/common/common.js"></script>
<script src="${pageContext.request.contextPath }/js/layer/layer.js"></script>
<script type="text/javascript">
    $(function () {
        var pageSize = 10;
        init.getData(1, pageSize);
    });

    var init = {
        //加载分页显示数据
        getData: function (num, pageSize) {
            $.ajax({
                url: "${pageContext.request.contextPath }/rest/sys/function_result",
                type: "GET",
                contentType: "text/json,html,xml;charset=utf-8",
                dataType: "json",
                data: {
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
            $("#housetypeList tr:not(:first)").remove();
            var results = data.rows;
            var totalPages = data.total % pageSize == 0 ? Math.floor(data.total / pageSize) : Math.floor(data.total / pageSize + 1);
            if (results.length != 0) {
                for (var i = 0; i < results.length; i++) {
                    var rowContent = "<tr>"
                        + "<td>" + (i + 1) + "</td>"
                        + "<td>"
                        + (results[i].name == null ? '' : results[i].name)
                        + "</td>"
                        + "<td>"
                        + (results[i].description == null ? '' : results[i].description)
                        + "</td>"
                        + "<td>"
                        + (results[i].generatemenu == '1' ? '是' : '否')
                        + "</td>"
                        + "<td>"
                        + (results[i].zindex == null ? '' : results[i].zindex)
                        + "</td>"
                        + "<td>"
                        + (results[i].page == null ? '' : results[i].page)
                        + "</td>"
                        + "<td class='handle'> "
                        + "<span id='edit'><a href='${pageContext.request.contextPath }/rest/sys/funedit/" + results[i].id + "'>编辑</a></span>"
                        + "<span id='select'><a href='javascript:void(0);' onclick=\"del('" + results[i].id + "')\">删除</a></span>"
                        + "</td>"
                        + "</tr>";
                    $("#housetypeList").append(rowContent);
                }
            } else {
                totalPages = totalPages <= 1 ? 1 : totalPages;

                $("#housetypeList").append("<tr><td colspan='11'>暂无数据</td></tr>");
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
                url: "${pageContext.request.contextPath }/rest/sys/delfun/" + id,
                statusCode: {
                    204: function (data) {
                        //location.href = "${pageContext.request.contextPath }/rest/build/buildlist"
                        layer.msg('删除成功!', {icon: 6, time: 1500}, function () {
                            init.getData(1, 10);
                        })
                    },
                    400: function () {
                        layer.msg('提交的参数不合法', {time: 2000});
                    },
                    500: function () {
                        layer.msg('出错', {time: 2000});
                    }
                }
            });
            layer.close(index);
        });
    }
</script>
</html>