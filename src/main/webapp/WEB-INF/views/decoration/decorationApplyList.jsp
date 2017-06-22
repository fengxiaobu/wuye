<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
</head>
<body>

<!-- 路径导航 开始 -->
<div class="col-xs-12">
    <ol class="breadcrumb">
        <li><a href="#">首页</a></li>
        <li><a href="#">业务办理</a></li>
        <li class="active">装修申请列表</li>
    </ol>
</div>
<!-- 路径导航 结束 -->
<div class="col-xs-12">
    <div class="panel panel-default">
    </div>
    <div class="panel panel-default tudiqianyue">
        <div class="panel-heading">
            <div class="col-xs-4">装修申请列表</div>
            <div class="col-xs-8 panel-oprerate">
                <div class="col-xs-6dd">
                    <form action="${pageContext.request.contextPath}/dist/enterApply/search" method="post">
                        <span>申请日期&nbsp;&nbsp;&nbsp;&nbsp;</span>
                        <span style="margin-right: 10px"><input style="height: 35px;width: 220px;" type="text"
                                                                name="startDate" placeholder="&nbsp;&nbsp;开始时间">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;到</span>

                        <span style="margin-right: 50px"><input style="height: 35px;width: 220px;" type="text"
                                                                name="endDate" placeholder="&nbsp;&nbsp;结束时间"></span>
                        <span style="margin-right: 50px"><input style="height: 35px;width: 120px;" type="text"
                                                                name="projectName"
                                                                placeholder="&nbsp;&nbsp;项目名称"></span>
                        <span style="margin-right: 50px"><input style="height: 35px;width: 120px;" name="clientName"
                                                                type="text" placeholder="&nbsp;&nbsp;用户名"></span>
                        <%--<a class="btn btn-info" type="button"><span class="glyphicon glyphicon-search"></span>搜素
                        </a>--%>
                        <button class="btn btn-default" style="background-color: #5bc0de" type="submit"><span
                                class="glyphicon glyphicon-search">搜素</span></button>
                    </form>
                    <%--<a target="main" href="${pageContext.request.contextPath}/enterApply/toEnterApplyAdd" class="btn btn-info" type="button"><span class="glyphicon glyphicon-plus"></span>新增
                    </a>--%>
                </div>
                <div class="col-xs-12">
                    <button class="btn btn-default" id="tudiqianyue-remove" type="button"><span
                            class="glyphicon glyphicon-remove"></span>取消
                    </button>
                    <button class="btn btn-success" id="tudiqianyue-ok" type="button"><span
                            class="glyphicon glyphicon-ok"></span>提交
                    </button>
                </div>
            </div>
        </div>
        <div class="panel-body">
            <table class="table table-bordered tudiqianyue-table">
                <thead>
                <tr class="info">
                    <th rowspan="2">选择</th>
                    <th rowspan="2">序号</th>
                    <th rowspan="2">项目名称<br/></th>
                    <th rowspan="2">房产</th>
                    <th rowspan="2">客户名称</th>
                  <%--  <th rowspan="2">楼号</th>--%>
                    <th rowspan="2">申请日期</th>
                    <th rowspan="2">预计工期</th>
                    <th rowspan="2">现场管理人</th>
                    <th rowspan="2">现场管理人联系方式</th>
                    <th rowspan="2">装修部位</th>
                    <th rowspan="2">装修面积</th>
                    <th rowspan="2">施工人数</th>
                    <th rowspan="2">装修公司</th>
                    <th rowspan="2">装修负责人</th>
                    <th rowspan="2">装修负责人联系方式</th>
                    <th rowspan="2">装修押金</th>
                    <th rowspan="2">装修管理费</th>
                    <th rowspan="2">出入证工本费</th>
                    <th rowspan="2">出入证押金</th>
                    <th rowspan="2">状态</th>
                    <th rowspan="2">操作</th>
                </tr>
                </thead>
                <tbody class="tudiqianyue-tbody">

                <c:forEach items="${decorationApply}" var="decora" varStatus="status">
                    <tr class="tudiqianyue-tdtr">
                        <td><input type="checkbox" value=""></td>
                        <td>${status.index+1}</td>
                        <td>${decora.houseInfo.projectInfo.projectName}</td>
                        <td>${decora.houseInfo.houseProperty}</td>
                        <td>${decora.clientName}</td>
                      <%--  <td>${decora.clientName}</td>--%>
                        <td><fmt:formatDate value="${decora.applyTime }" pattern="yyyy-MM-dd"/></td>
                        <td>${decora.antipateTime}&nbsp;天</td>
                        <td>${decora.localeCustodian}</td>
                        <td>${decora.localeCustodianPhone}</td>
                        <td>${decora.decorationParts}</td>
                        <td>${decora.decorateArea}</td>
                        <td>${decora.constructPeopleNumber}&nbsp;人</td>
                        <td>${decora.decorationCompany}</td>
                        <td>${decora.decorationLeader}</td>
                        <td>${decora.decorationLeaderPhone}&nbsp;人</td>
                        <td>${decora.decorationDeposit}</td>
                        <td>${decora.decorationManagementCost}</td>
                        <td>${decora.passPapersCost}&nbsp;人</td>
                        <td>${decora.passPapersDeposit}</td>
                        <td>
                            <c:if test="${decora.auditStatus eq 0}">未审核</c:if>
                            <c:if test="${decora.auditStatus eq 1}">已通过</c:if>
                            <c:if test="${decora.auditStatus eq 2}">未通过</c:if>
                        </td>
                        <td><a class="btn btn-info"
                               href="${pageContext.request.contextPath}/dist/enterApply/deleteEnterApply?decorationApplyId=${decora.decorationApplyId}"
                               role="button">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
                                class="btn btn-info"
                                href="${pageContext.request.contextPath}/dist/toDecorationApply?decorationApplyId=${decora.decorationApplyId}"
                                role="button">编辑</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <div align="center">
                <ul class="pagination">
                    <li><a href="${pageContext.request.contextPath}/dist/enterApply/enterApplyList?pageNum=1&pageSize=1"
                           target="main">&laquo;</a></li>
                    <c:forEach begin="1" end="${total/5}" step="1" varStatus="page">
                        <li>
                            <a href="${pageContext.request.contextPath}/dist/enterApply/enterApplyList?pageNum=1&pageSize=1">${page.count}</a>
                        </li>
                    </c:forEach>
                    <li><a href="#">&raquo;</a></li>
                </ul>
            </div>
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
    // function tableEdit(option) {
    // 	if($(".tudiqianyue").is(".tableedit")) {
    // 		$(".tudiqianyue-tdtr").find("td").css({
    // 			"border": "",
    // 			"background": ""
    // 		});
    // 	}
    // 	$(".tudiqianyue").addClass("tableedit");
    // 	var tr = $(".tudiqianyue-tdtr").length;
    // 	$(".tudiqianyue-tdtr").each(function(_index,_this) {
    // 		var trIndex = _index;
    // 		console.log(_index)
    // 		$(this).find("td").each(function(_index,_this) {
    // 			var tdIndex = _index;
    // 			// $(this).attr("contenteditable","true");
    // 			if(tdIndex == option.start) {
    // 				$(this).css({"border-left": "2px solid red"});
    // 			}
    // 			if(tdIndex == option.end) {
    // 				$(this).css({"border-right": "2px solid red"});
    // 			}
    // 			if(trIndex == 0 && tdIndex >= option.start && tdIndex <= option.end) {
    // 				$(this).css({"border-top": "3px solid red"})
    // 			}
    // 			if(trIndex == tr-1 && tdIndex >= option.start && tdIndex <= option.end) {
    // 				$(this).css({"border-bottom": "3px solid red"})
    // 			}
    // 			if(tdIndex >= option.start && tdIndex <= option.end) {
    // 				$(this).css({"background":"#fff"}).attr("contenteditable","true");
    // 			}
    // 		});
    // 	});

    // 	function close() {
    // 		$(".tudiqianyue").removeClass("tableedit");
    // 		$(".tudiqianyue-tdtr").each(function(_index,_this) {
    // 			var trIndex = _index;
    // 			console.log(_index)
    // 			$(this).find("td").each(function(_index,_this) {
    // 				var tdIndex = _index;
    // 				// $(this).attr("contenteditable","true");
    // 				if(tdIndex == option.start) {
    // 					$(this).css({"border-left": ""})
    // 				}
    // 				if(tdIndex == option.end) {
    // 					$(this).css({"border-right": ""})
    // 				}
    // 				if(trIndex == 0 && tdIndex >= option.start && tdIndex <= option.end) {
    // 					$(this).css({"border-top": ""})
    // 				}
    // 				if(trIndex == tr-1 && tdIndex >= option.start && tdIndex <= option.end) {
    // 					$(this).css({"border-bottom": ""})
    // 				}
    // 				if(tdIndex >= option.start && tdIndex <= option.end) {
    // 					$(this).css({"background":"#fff"}).attr("contenteditable","false");
    // 				}
    // 			});
    // 		});
    // 	};
    // 	return close;
    // }

    $("#edit-xieyi").click(function () {
        tableEdit.content({
            start: 1,
            end: 3,
            cancel: "#tudiqianyue-remove",
            callback: function (data) {
                console.log(111111)
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
    $("#tudiqianyue-remove").click(function () {

    });
</script>
</html>