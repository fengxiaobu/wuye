<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <li><a href="#">快捷缴费</a></li>
        <li class="active">物业</li>
    </ol>
</div>
<!-- 路径导航 结束 -->
<div class="col-xs-12">
    <div class="panel panel-default">
    </div>
    <div class="panel panel-default tudiqianyue">
        <div class="panel-heading">
            <div class="col-xs-4">物业缴费记录</div>
            <div class="col-xs-8 panel-oprerate">
                <div class="col-xs-12">
                    <form action="${pageContext.request.contextPath}/propertyRecords/index" method="post">
                        <span style="margin-right: 50px"><input id="startPicker"  type="text" name="startDate" value="${query.startDate}"></span>至
                        <span style="margin-right: 50px"><input id="endPicker"  type="text" name="endDate" ${query.endDate}></span>
                        <span style="margin-right: 50px"><input style="height: 35px;width: 320px;" type="text"
                                                                placeholder="项目名称,房产编码,客户名称" name="keyWords" value="${query.keyWords}"></span>
                        <button class="btn btn-info"><span class="glyphicon glyphicon-search"></span>搜素
                        </button>
                    </form>
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
                    <th>序号</th>
                    <th>项目名称</th>
                    <th>房产编码</th>
                    <th>客户名称</th>
                    <th>费用类型</th>
                    <th>更新日期</th>
                    <th>支付方式</th>
                    <th>缴费月份</th>
                    <th>开始日期</th>
                    <th>截止日期</th>
                    <th>应缴</th>
                    <th>已缴</th>
                    <th>单据号</th>
                    <th>发票</th>
                    <th>发票号</th>
                    <th>发票备注</th>
                    <th>开票状态</th>
                    <th>收款公司</th>
                    <th>收款账户</th>
                    <th>开票单位</th>
                    <th>缴费日期</th>
                </tr>
                </thead>
                <tbody class="tudiqianyue-tbody">
                <c:forEach items="${propertyRecords}" var="item">
                    <tr class="tudiqianyue-tdtr">

                        <td>${item.detailsId}</td>
                        <td>${item.projectName}</td>
                        <td>${item.houseCode}</td>
                        <td>${item.clientName}</td>
                        <td>${item.costType}</td>
                        <td>${item.updateTime}</td>
                        <td>${item.payManner}</td>
                        <td>${item.payMonth}</td>
                        <td>${item.startDate}</td>
                        <td>${item.endDate}</td>
                        <td>${item.payable}</td>
                        <td>${item.paidIn}</td>
                        <td>${item.voucherNumber}</td>
                        <td>${item.invoice}</td>
                        <td>${item.invoiceNumber}</td>
                        <td>${item.invoiceNotes}</td>
                        <td>
                            <c:choose>
                                <c:when test="${item.invoiceStatus==0}">
                                    已开
                                </c:when>
                                <c:when test="${item.invoiceStatus==1}">
                                    需要
                                </c:when>
                                <c:when test="${item.invoiceStatus==2}">
                                    不需要
                                </c:when>
                            </c:choose>
                        </td>
                        <td>${item.collectingCompany}</td>
                        <td>${item.collectingAccount}</td>
                        <td>${item.invoiceCompany}</td>
                        <td>${item.payTime}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</body>
<jsp:include page="../../../common/common.jsp"/>

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
    $('#startPicker').datetimepicker();
    $('#endPicker').datetimepicker();
</script>
</html>