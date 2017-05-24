<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="../js/libs/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../css/reset.css">
</head>
<body>

<div class="col-xs-12">

    <div class="panel panel-default tudiqianyue">
        <div class="panel-heading">
            <div class="col-xs-4">管理用户列表</div>
            <div class="col-xs-8 panel-oprerate">
                <div class="col-xs-12">
                    <span style="margin-right: 50px">
                    项目名称: <select name="#" id="#">
                                <option value="ldug">联东U谷项目</option>
                                <option value="ldug">联东永乐项目</option>
                             </select>
                    </span>
                    <span style="margin-right: 50px"><input type="text" placeholder="姓名,账户" style="text-align: center;width: 400px;height: 30px"></span>
                    <span style="margin-right: 10px"><button class="btn btn-info" id="edit-hetong" type="button"><span
                            class="glyphicon glyphicon-pencil"></span>查询</button></span>
                    <span style="margin-right: 10px"><button class="btn btn-info" type="button"><span class="glyphicon glyphicon-pencil"></span>新增</button></span>
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
                    <th rowspan="2">分期</th>
                    <th rowspan="2">签约面积</th>
                    <th rowspan="2">签约单价<br/>（万元/亩）</th>
                    <th rowspan="2">土地返款条件</th>
                    <th colspan="5">供地进展</th>

                    <th rowspan="2">实际摘牌时间</th>
                    <th rowspan="2">实际摘牌面积<br/>（亩）</th>
                    <th rowspan="2">实际土地价格</th>
                    <th rowspan="2">付款金额</th>
                    <th rowspan="2">付款时间</th>
                </tr>
                <tr class="info">
                    <th>基准摘牌时间</th>
                    <th>已延期天数</th>
                    <th>预计摘牌时间</th>
                    <th>预计延期天数</th>
                    <th>详情</th>
                </tr>
                </thead>
                <tbody class="tudiqianyue-tbody">
                <tr class="tudiqianyue-tdtr">
                    <td>1#地</td>
                    <td>357.00</td>
                    <td></td>
                    <td title="土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示">
                        <div class="text">
                            土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示
                        </div>
                    </td>
                    <td>2013.01.10</td>
                    <td>102</td>
                    <td>2013.01.10</td>
                    <td>98</td>
                    <td>查看</td>
                    <td>2013.01.10</td>
                    <td>13256</td>
                    <td>13256</td>
                    <td>13256</td>
                    <td>2013.01.10</td>
                </tr>
                <tr class="tudiqianyue-tdtr">
                    <td>1#地</td>
                    <td>357.00</td>
                    <td></td>
                    <td title="土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示">
                        <div class="text">
                            土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示土地返款条件这里文字可能会很多，只显示
                        </div>
                    </td>
                    <td>2013.01.10</td>
                    <td>102</td>
                    <td>2013.01.10</td>
                    <td>98</td>
                    <td>查看</td>
                    <td>2013.01.10</td>
                    <td>13256</td>
                    <td>13256</td>
                    <td>13256</td>
                    <td>2013.01.10</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <div class="panel panel-default">
        <div class="panel-heading">
            <div class="col-xs-4 text-danger">项目位置</div>
            <div class="col-xs-8 panel-oprerate">
                <div class="col-xs-12">
                    <button class="btn btn-info" type="button"><span class="glyphicon glyphicon-pencil"></span>填报
                    </button>
                </div>
            </div>
        </div>
        <div class="panel-body">
            <div class="col-xs-12">
                项目介绍：<br/>
                1、本案位于郑州经济开发区，项目临近京港澳高速、陇海铁路、七里河。<br/>
                2、项目用地位于市区东南距市区中心约18.5公里。<br/><br/><br/><br/>
            </div>
            <div class="col-xs-6">
                <div class="col-xs-12">
                    项目图片：
                </div>
                <div class="col-xs-12">
                    【此处放地图...】
                </div>
            </div>
            <div class="col-xs-6">
                <div class="col-xs-12">
                    地图位置：
                </div>
                <div class="col-xs-12">
                    【此处放地图...】
                </div>
            </div>
        </div>
    </div>
</div>
<div class="col-xs-12">
    备注：<br/>1、签约单价来自土地协议&emsp;&emsp;2、付款金额数据来源土地出让合同&emsp;&emsp;3、签约情况来自土地协议&emsp;&emsp;4、供地进展代表当月供地的推动情况&emsp;&emsp;5、供地进展：已延期天数（为负数和0时不显示）时＝系统当前时间－基准摘牌时间&emsp;&emsp;6、供地进展：预计延期天数（为负数和0时不显示）＝预计摘牌时间－基准摘牌时间&emsp;&emsp;7、供地进展中的预计摘牌时间取自供地进展填报的最新预计摘牌时间&emsp;&emsp;8、项目位置限传一张图片<br/><br/>
</div>


</body>
<script type="text/javascript" src="../../../../src/main/resources/static/js/libs/jquery-1.11.3.min.js"></script>
<script type="text/javascript"
        src="../../../../src/main/resources/static/js/libs/bootstrap/js/bootstrap.min.js"></script>
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