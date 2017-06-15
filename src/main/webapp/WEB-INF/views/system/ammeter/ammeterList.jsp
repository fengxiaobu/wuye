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
        <li><a href="#">系统设置</a></li>
        <li class="active">电表列表</li>
    </ol>
</div>
<!-- 路径导航 结束 -->
<div class="col-xs-12">
    <div class="panel panel-default">
    </div>
    <div class="panel panel-default tudiqianyue">
        <div class="panel-heading">
            <div class="col-xs-4">电表列表</div>
            <div class="col-xs-8 panel-oprerate">
                <div class="col-xs-6dd">
                    <%--<form action="${pageContext.request.contextPath}/dist/enterApply/search" method="post">--%>
                    <%--<span>申请日期&nbsp;&nbsp;&nbsp;&nbsp;</span>--%>
                    <%--<span style="margin-right: 10px"><input style="height: 35px;width: 220px;" type="text"  name="startDate" placeholder="&nbsp;&nbsp;开始时间">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;到</span>--%>

                    <%--<span style="margin-right: 50px"><input style="height: 35px;width: 220px;" type="text"  name="endDate" placeholder="&nbsp;&nbsp;结束时间"></span>--%>
                    <%--<span style="margin-right: 50px"><input style="height: 35px;width: 120px;" type="text"  name="projectName" placeholder="&nbsp;&nbsp;项目名称"></span>--%>
                    <%--<span style="margin-right: 50px"><input style="height: 35px;width: 120px;" name="clientName" type="text" placeholder="&nbsp;&nbsp;用户名"></span>--%>
                    <%--&lt;%&ndash;<a class="btn btn-info" type="button"><span class="glyphicon glyphicon-search"></span>搜素--%>
                    <%--</a>&ndash;%&gt;--%>
                    <%--<button class="btn btn-default" style="background-color: #5bc0de" type="submit"><span class="glyphicon glyphicon-search">搜素</span></button>--%>
                    <%--</form>--%>
                    <a target="main" href="${pageContext.request.contextPath}/enterApply/toEnterApplyAdd"
                       class="btn btn-info" type="button"><span class="glyphicon glyphicon-plus"></span>新增
                    </a>
                </div>
            </div>
        </div>
        <div class="panel-body">
            <table class="table table-bordered tudiqianyue-table">
                <thead>
                <tr class="info">
                    <th rowspan="2"></th>
                    <th rowspan="2">序号</th>
                    <th rowspan="2">项目名称<br/></th>
                    <th rowspan="2">房产</th>
                    <th rowspan="2">电表号</th>
                    <th rowspan="2">倍率</th>
                    <th rowspan="2">更新时间</th>
                    <th rowspan="2">操作</th>
                </tr>
                </thead>
                <tbody class="tudiqianyue-tbody tbody">

                </tbody>
            </table>
            <div align="center">
                <ul class="pagination">
                    <li><a href="${pageContext.request.contextPath}/dist/enterApply/enterApplyList?pageNum=1&pageSize=1"
                           target="main">&laquo;</a></li>
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

    $(function () {
        $.get("${pageContext.request.contextPath}/system/ammeterList",function (data) {
            var html = "";
            for(var i=0;i<data.length;i++){
                html+="<tr>";
                html+="<td>"+data[i]["id"]+"</td>";
                html+="<td>"+data[i]["projectName"]+"</td>";
                html+="<td>"+data[i]["propertyName"]+"</td>";
                html+="<td>"+data[i]["ammeter_no"]+"</td>";
                html+="<td>"+data[i]["ammeter_name"]+"</td>";
                html+="<td>"+data[i]["multiply"]+"</td>";
                html=html+"</tr>";
            }
            $(".tbody").innerHTML=html;
        })
    })
</script>
</html>