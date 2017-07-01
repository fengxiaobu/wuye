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
<div class="container-fluid">
    <!-- 路径导航 开始 -->
    <div class="col-xs-12">
        <ol class="breadcrumb">
            <li><a href="#">首页</a></li>
            <li><a href="#">房产信息</a></li>
            <li class="active">电费缴费记录明细</li>
        </ol>
    </div>
    <!-- 路径导航 结束 -->
    <div class="col-xs-12">

        <div class="panel panel-default tudiqianyue">
            <form class="form-horizontal" action="" method="post">
                <table>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">项目名称:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${projectName}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">房产编码:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${vhcode}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">客户名称:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${clientName}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">倍率:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${multiplyPower}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">电表号:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${ammeterNo}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">缴费金额:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${paidIn}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">度数:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${electricPower}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">收款公司:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${companyName}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">收款账户:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${account}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">费用类型:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${costType}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">单据号:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${voucherNumber}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">发票:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${invoice}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">开票类型:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${invoiceType}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">三方协议:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${tripleAgreement}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">代付证明:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${agencyPayCredential}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">缴费日期:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label">${payTime}</label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">开票明细:</label>
                        <table class="invoice">
                            <tr>
                                <th>序号</th>
                                <th>开票公司</th>
                                <th>开票金额</th>
                                <th>费用类型</th>
                                <th>发票号</th>
                                <th>发票备注</th>
                            </tr>

                            <c:forEach items="${invoices}" var="item">
                                <tr>
                                    <td>${item.id}</td>
                                    <td>${item.invoiceCompany}</td>
                                    <td>${item.invoiceAmount}</td>
                                    <td>${item.feeType}</td>
                                    <td>${item.invoiceNo}</td>
                                    <td>${item.note}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">写卡状态:</label>
                        <div class="col-sm-10">
                            <label class="col-sm-2 control-label"><input type="radio">已写</label>
                            <label class="col-sm-2 control-label"><input type="radio">未写</label>
                        </div>
                    </div>
                </table>
            </form>
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