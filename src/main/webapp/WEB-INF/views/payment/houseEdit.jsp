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
<div class="container-fluid">
<!-- 路径导航 开始 -->
    <div class="col-xs-12">
    <ol class="breadcrumb">
        <li><a href="#">首页</a></li>
        <li><a href="#">房产信息</a></li>
        <li class="active">编辑房产信息</li>
    </ol>
    </div>
<!-- 路径导航 结束 -->
    <div class="col-xs-12">

        <div class="panel panel-default tudiqianyue">
        <form class="form-horizontal" action="" method="post" >
            <table>
            <div class="form-group">
                <label class="col-sm-2 control-label">用户ID:</label>
                <div class="col-sm-10">
                    <label class="col-sm-2 control-label"></label>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">项目名称:</label>
                <div class="col-sm-10">
                    <label class="col-sm-2 control-label"></label>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">房产名称:</label>
                <div class="col-sm-10">
                    <label class="col-sm-2 control-label"></label>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">星级:</label>
                <div class="col-sm-10">
                    <label class="col-sm-2 control-label">AAAAAA</label>
                </div>
            </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">房产使用属性:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label">
                            <select class="form-control">
                                <option>自用</option>
                                <option>转租</option>
                                <option>自用+转租</option>
                            </select>
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">入驻企业成立时间:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"><input type="text" style="width: 300px"
                                                                     class="form-control"
                                                                     value="1970-1-1"></label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">注册资本金(万):</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"><input type="text" style="width: 300px"
                                                                     class="form-control"
                                                                     value="500"></label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">所属行业:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label">
                            <select class="form-control">
                                <option>互联网</option>
                                <option>服务业</option>
                                <option>机械</option>
                            </select>
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">主营或主导产品:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"><input type="text" style="width: 300px"
                                                                     class="form-control"
                                                                     value=""></label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">公司覆盖区域:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label">
                            <select class="form-control">
                                <option>全国</option>
                                <option>欧洲</option>
                                <option>美洲</option>
                            </select>
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">职工总人数:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"><input type="text" style="width: 300px"
                                                                     class="form-control"
                                                                     value="500"></label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">物业对接人:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"><input type="text" style="width: 300px"
                                                                     class="form-control"
                                                                     value="500"></label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">联系方式:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"><input type="text" style="width: 300px"
                                                                     class="form-control"
                                                                     value="500"></label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">紧急联系人:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"><input type="text" style="width: 300px"
                                                                     class="form-control"
                                                                     value="500"></label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">联系方式:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"><input type="text" style="width: 300px"
                                                                     class="form-control"
                                                                     value="500"></label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">是否高新:</label>
                <div class="col-sm-10 radio">
                    <label class="col-sm-1 control-label"> <label>
                        <input type="radio" name="optionsRadios" id="optionsRadios1"
                               value="option1"/>是
                    </label>
                        <label>
                            <input type="radio" name="optionsRadios" id="optionsRadios2"
                                   value="option2"/>否
                        </label></label>

                </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">高新类型:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label">
                            <select class="form-control">
                                <option>国家高新</option>
                                <option>市级高新</option>
                                <option>省级高新</option>
                            </select>
                    </label>
                </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">发证时间:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"><input type="text" style="width: 300px"
                                                                     class="form-control"
                                                                     value="500"></label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">专利类型:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label">
                            <select class="form-control">
                                <option>国家高新</option>
                                <option>市级高新</option>
                                <option>省级高新</option>
                            </select>
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">专利个数:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"><input type="text" style="width: 300px"
                                                                     class="form-control"
                                                                     value="500"></label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">是否上市:</label>
                    <div class="col-sm-10 radio">
                        <label class="col-sm-1 control-label">
                            <label>
                                <input type="radio" name="optionsRadios" id="optionsRadios3"
                                       value="option1"/>是
                            </label>
                            <label>
                                <input type="radio" name="optionsRadios" id="optionsRadios4"
                                       value="option2"/>否
                            </label>
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">上市类型:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label">
                            <select class="form-control">
                                <option>主板</option>
                                <option>创业板</option>
                                <option>中小板</option>
                            </select>
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">挂牌时间:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"><input type="text" style="width: 300px"
                                                                     class="form-control"
                                                                     value="500"></label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">股票代码:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"><input type="text" style="width: 300px"
                                                                     class="form-control"
                                                                     value="500"></label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">备注:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"><textarea class="form-control"
                                                                        rows="3"></textarea></label>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">更新时间:</label>
                    <div class="col-sm-10">
                        <label class="col-sm-2 control-label"></label>
                    </div>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-default">提交</button>
                    <button type="submit" class="btn btn-default">重置密码</button>
                </div>
            </table>
        </form>
    </div>
</div>
</div>
</body>
<script type="text/javascript" src="../js/libs/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="../js/libs/bootstrap/js/bootstrap.min.js"></script>
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