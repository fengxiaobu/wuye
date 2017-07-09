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
        <li class="active">物业费用</li>
    </ol>
</div>
<!-- 路径导航 结束 -->
<div class="col-xs-12">
    <div class="panel panel-default">
    </div>
    <div class="panel panel-default tudiqianyue">
        <div class="panel-heading">
            <div class="col-xs-4">物业费用记录</div>
            <div class="col-xs-8 panel-oprerate">
                <div class="col-xs-12">
                    <span style="margin-right: 50px"><input id="startPicker"  type="text"></span>至
                    <span style="margin-right: 50px"><input id="endPicker"  type="text"></span>
                    <span style="margin-right: 50px"><input style="height: 35px;width: 320px;" type="text"
                                                            placeholder="项目名称,房产编码,客户名称" id="keyWords"></span>
                    <button class="btn btn-info" type="button"><span class="glyphicon glyphicon-search"></span>搜素
                    </button>
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
                    <th>欠费金额</th>
                    <th>缴费金额</th>
                    <th>单据号</th>
                    <th>支付方式</th>
                    <th>收款公司</th>
                    <th>收款账户</th>
                    <th>发票</th>
                    <th>开票状态</th>
                    <th>缴费日期</th>
                </tr>
                </thead>
                <tbody id="productList" class="tudiqianyue-tbody">
                </tbody>
            </table>
            <div id="pagination1" class="pagination"></div>
        </div>
    </div>

</body>
<jsp:include page="../../../common/common.jsp"></jsp:include>
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


    $(function () {
        var pageSize = 10;
        getData(1, pageSize);

        //查询
        $("#query").click(function () {
            getData(1, pageSize);
        });

        //回车搜索
        $(document).keydown(function (event) {
            if (event.keyCode == 13) {
                $("#query").click();
            }
        });
    });

    //加载分页显示数据
    function getData(num, pageSize, f) {
        var startDate = $("#startPicker").val();
        var endDate = $("#endPicker").val();
        var keyWords = $("#keyWords").val();
        console.log(JSON.stringify({
            startDate: startDate,
            endDate: endDate,
            keyWords: keyWords,
            startPage: num,//当前页
            pageSize: pageSize
        }))
        $.ajax({
                url: "${basePath}/propertyRecords/getPayFeeRecords",
                type: "GET",
                contentType: "application/json",
                dataType: "json",
                data: {
                    startDate: startDate,
                    endDate: endDate,
                    keyWords: keyWords,
                    startPage: num,//当前页
                    pageSize: pageSize
                },
                cache: false,
                statusCode: {
                    200: function (data) {
                        var result = data.data[0];
                        $("#productList tr").remove();
                        var total = data.data[1]['total'];
                        var pageSize = data.data[1]['pageSize'];
                        var totalPages = total % pageSize == 0 ? Math.floor(total / pageSize) : Math.floor(total / pageSize + 1);
                        for (var i = 0; i < result.length; i++) {
                            var rowContent =
                                "<tr>" + "<td>" + isnull(i + 1) +
                                "</td>" +
                                "<td>" + isnull(result[i].projectName) +
                                "</td>" +
                                "<td>" + isnull(result[i].houseCode) +
                                "</td>" +
                                "<td>" + isnull(result[i].clientName) +
                                "</td>" +
                                "<td>" + isnull(result[i].payable) +
                                "</td>" +
                                "<td>" + isnull(result[i].paidIn) +
                                "</td>" +
                                "<td>" + isnull(result[i].voucherNumber) +
                                "</td>" +
                                "<td>" + isnull(result[i].payManner) +
                                "</td>" +
                                "<td>" + isnull(result[i].collectingCompany) +
                                "</td>" +
                                "<td>" + isnull(result[i].collectingAccount) +
                                "</td>" +
                                "<td>" + isnull(result[i].invoice) +
                                "</td>" +
                                "<td>" + isnull(invoiceStatusFormatter(result[i].invoiceStatus)) +
                                "</td>" +
                                "<td>" + isnull(timeFormatter(result[i].payTime)) + "</td>" +
                                "</tr>";
                            $("#productList").append(rowContent);
                        }
                        $.jqPaginator('#pagination1', {
                            totalPages: totalPages,
                            visiblePages: pageSize,
                            currentPage: num,
                            onPageChange: function (num1,type) {
                                if (num1 != num) {
                                    getData(num1, pageSize);
                                }
                            }

                        })
                    },
                    500: function () {
                        layer.msg('网络异常，请稍后再试！', {icon: 5});
                    }

                }
            }
        );
    }
</script>
</html>