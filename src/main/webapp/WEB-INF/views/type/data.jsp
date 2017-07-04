<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
</head>
<body>

<!-- 路径导航 开始 -->
<div class="col-xs-12">
    <ol class="breadcrumb">
        <li class="active">${name}</li>
    </ol>
</div>
<!-- 路径导航 结束 -->
<div class="col-xs-12">
<div class="panel panel-default">
    </div>
    <div class="panel panel-default tudiqianyue">
        <div class="panel-heading">
            <div class="col-xs-4"></div>
            <div class="col-xs-8 panel-oprerate">
                <div class="col-xs-6dd">
                       	<a href="${pageContext.request.contextPath}/typeRefinement/getTypeDataEdit?typeDifferentiateId=${typeDifferentiateId}" class="btn btn-info"><span
                            class="glyphicon glyphicon-plus"></span>新增
                    </a>
                </div>
            </div>
        </div>
    <div class="panel panel-default tudiqianyue">
        <div class="panel-body">
            <table class="table table-bordered tudiqianyue-table">
                <thead>
                <tr class="info">
                    <th rowspan="2">序号</th>
                    <th rowspan="2">${name}</th>
                    <th rowspan="2">状态</th>
                    <th rowspan="2">更新日期</th>
                    <th rowspan="2">操作</th>
                </tr>

                </thead>
                <tbody class="tudiqianyue-tbody">
                <c:forEach items="${typeRefinements}" var="typeRefinements" varStatus="status">
                    <tr class="tudiqianyue-tdtr">
                        <td>${status.index+1}</td>
                        <td>${typeRefinements.typeRefinementName}</td>
                        <td>
                        	<c:if test="${typeRefinements.status eq 1}">禁用</c:if>  
                			<c:if test="${typeRefinements.status eq 0}">启用</c:if>  
                        </td>
                        <td><fmt:formatDate value="${typeRefinements.updateTime}" pattern="yyyy-MM-dd hh:mm"/></td>
                        <td><a class="btn btn-info" href="${pageContext.request.contextPath}/typeRefinement/getTypeDataEdit?typeRefinementId=${typeRefinements.typeRefinementId}&typeDifferentiateId=${typeRefinements.typeDifferentiateId}" role="button">编辑</a>
                        <a class="btn btn-info" onclick="del('${typeRefinements.typeRefinementId}',this)" role="button">删除</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
var tableEdit = {
        content: function (option) {
            var _tableEdit = this;
            if ($(".tudiqianyue").is(".tableedit")) {
                $(".tudiqianyue-tdtr").find("td").css({
                    "border": "",
                    "background": ""
                });
            }
            $(".tudiqianyue").addClass("tableedit");
            var tr = $(".tudiqianyue-tdtr").length;
            $(".tudiqianyue-tdtr").each(function (_index, _this) {
                var trIndex = _index;
                $(this).find("td").each(function (_index, _this) {
                    var tdIndex = _index;
                    // $(this).attr("contenteditable","true");
                    if (tdIndex == option.start) {
                        $(this).css({"border-left": "2px solid red"});
                    }
                    if (tdIndex == option.end) {
                        $(this).css({"border-right": "2px solid red"});
                    }
                    if (trIndex == 0 && tdIndex >= option.start && tdIndex <= option.end) {
                        $(this).css({"border-top": "3px solid red"})
                    }
                    if (trIndex == tr - 1 && tdIndex >= option.start && tdIndex <= option.end) {
                        $(this).css({"border-bottom": "3px solid red"})
                    }
                    if (tdIndex >= option.start && tdIndex <= option.end) {
                        $(this).css({"background": "#fff"}).attr("contenteditable", "true");
                    }
                });
            });
            if (option.cancel) {
                $(option.cancel).click(function () {
                    _tableEdit.close(option);
                });
            }
            if (typeof option.callback == "function") {
                option.callback();
            }
        },
        setTd: function (option) {
        },
        close: function (option) {
            $(".tudiqianyue").removeClass("tableedit");
            $(".tudiqianyue-tdtr").each(function (_index, _this) {
                var trIndex = _index;
                var tr = $(".tudiqianyue-tdtr").length;
                $(this).find("td").each(function (_index, _this) {
                    var tdIndex = _index;
                    if (tdIndex == option.start) {
                        $(this).css({"border-left": ""})
                    }
                    if (tdIndex == option.end) {
                        $(this).css({"border-right": ""})
                    }
                    if (trIndex == 0 && tdIndex >= option.start && tdIndex <= option.end) {
                        $(this).css({"border-top": ""})
                    }
                    if (trIndex == tr - 1 && tdIndex >= option.start && tdIndex <= option.end) {
                        $(this).css({"border-bottom": ""})
                    }
                    if (tdIndex >= option.start && tdIndex <= option.end) {
                        $(this).css({"background": "#fff"}).attr("contenteditable", "false");
                    }
                });
            });
        },
    };
    
$("#edit-xieyi").click(function () {
    tableEdit.content({
        start: 1,
        end: 3,
        cancel: "#tudiqianyue-remove",
        callback: function (data) {
        }
    })
});
$("#edit-hetong").click(function () {
    tableEdit.content({
        start: 3,
        end: 6,
        callback: function (data) {

        }
    })
});
function del(id, e) {
    var r = confirm("你确定要删除这个用户吗?");
    if (r) {
        $.post("${pageContext.request.contextPath}/typeRefinement/delete", {"id": id}, function (data) {
            if (data.success) {
                $(e).closest("tr").remove();
            }
        })
    }
}
</script>
</html>