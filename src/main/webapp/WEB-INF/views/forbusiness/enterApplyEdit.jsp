<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
</head>
<body>

<!-- 路径导航 开始 -->
<div class="col-xs-12">
    <ol class="breadcrumb">
        <li><a href="#">首页</a></li>
        <li><a href="#">业务办理</a></li>
        <li class="active">入住申请列表</li>
    </ol>
</div>
<!-- 路径导航 结束 -->
<div class="col-xs-12">
    <div class="panel panel-default">
    </div>
    <div class="panel panel-default tudiqianyue">
        <form class="form-horizontal" action="" method="post" >
            <div style="margin-top: 50px"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">项目名称:</label>
                <div class="col-sm-10">
                    <label class="col-sm-2 control-label"></label>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">房产:</label>
                <div class="col-sm-10">
                    <label class="col-sm-2 control-label"></label>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">客户名称:</label>
                <div class="col-sm-10">
                    <label class="col-sm-2 control-label"></label>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">申请时间:</label>
                <div class="col-sm-10">
                    <label class="col-sm-2 control-label"></label>
                </div>
            </div>
            <div class="form-group">
                <label for="exampleInputFile" class="col-sm-2 control-label">入驻通知</label>
                <div class="col-sm-10">
                    <input type="file" id="exampleInputFile"/>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">开发费用:</label>
                <div class="col-sm-10" style="width: 700px">
                    <div class="panel-body">
                        <table class="table table-bordered tudiqianyue-table">
                            <thead>
                            <tr class="info">
                                <th rowspan="2">序号</th>
                                <th rowspan="2">费用类型<br/></th>
                                <th rowspan="2">费用金额</th>
                                <th rowspan="2">应缴款日期</th>
                                <th rowspan="2">开始日期</th>
                                <th rowspan="2">截止日期</th>
                            </tr>
                            </thead>
                            <tbody class="tudiqianyue-tbody">
                            <tr class="tudiqianyue-tdtr">
                                <td>1</td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            <tr class="tudiqianyue-tdtr">
                                <td>2</td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">物业费用:</label>
                <div class="col-sm-10" style="width: 700px">
                    <div class="panel-body">
                        <table class="table table-bordered tudiqianyue-table">
                            <thead>
                            <tr class="info">
                                <th rowspan="2">序号</th>
                                <th rowspan="2">费用类型<br/></th>
                                <th rowspan="2">费用金额</th>
                                <th rowspan="2">应缴款日期</th>
                                <th rowspan="2">开始日期</th>
                                <th rowspan="2">截止日期</th>
                            </tr>
                            </thead>
                            <tbody class="tudiqianyue-tbody">
                            <tr class="tudiqianyue-tdtr">
                                <td>1</td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            <tr class="tudiqianyue-tdtr">
                                <td>2</td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">审核状态:</label>
                <div class="col-sm-10 radio">
                    <label>
                        <input type="radio" name="optionsRadios" id="optionsRadios1"
                               value="option1"/>未审核
                    </label>
                    <label>
                        <input type="radio" name="optionsRadios" id="optionsRadios2"
                               value="option2"/>已通过
                    </label>
                    <label>
                        <input type="radio" name="optionsRadios" id="optionsRadios3"
                               value="option2"/>未通过
                    </label>
                </div>
            </div>
            <div class="form-group">
                    <label class="col-sm-2 control-label">审核信息:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label">
                            <textarea name="" cols="30" rows="10"></textarea>
                        </label>
                    </div>
                </div>
            <div class="form-group">
                    <button type="submit" class="btn btn-default">保存</button>
                </div>
        </form>
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