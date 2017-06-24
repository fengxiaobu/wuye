<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
        <li><a href="#">用户管理</a></li>
        <li class="active">编辑用户</li>
    </ol>
</div>
<!-- 路径导航 结束 -->
<div class="col-xs-12">
    <div class="panel panel-default">
    </div>
    <div class="panel panel-default tudiqianyue">
        <form class="form-horizontal" action="${pageContext.request.contextPath}/user/save" method="post" id="myform">
            <div style="margin-top: 50px"></div>
            <input type="hidden" name="userId" value="${user.userId}" >
            <div class="form-group">
                <label class="col-sm-2 control-label">人员姓名:</label>
                <div class="col-sm-10">
                    <input type="text" name="realname" value="${user.realname}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">登录账号:</label>
                <div class="col-sm-10">
                    <input type="text" name="username" value="${user.username}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">工号:</label>
                <div class="col-sm-10">
                    <input type="text" name="workNo" value="${user.workNo}">
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">性别:</label>
                <div class="col-sm-10">
                    <select name="gender">
                        <option value="1" <c:if test="${user.gender==1}">selected="selected"</c:if>>男</option>
                        <option value="0" <c:if test="${user.gender==0}">selected="selected"</c:if>>女</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">所属角色:</label>
                <div class="col-sm-10">
                    <table>
                        <tr>
                            <td><input class="checkboxs" type="checkbox" name="role" value="1"></td>
                            <td>系统管理员</td>
                            <td><input class="checkboxs" type="checkbox" name="role" value="2"></td>
                            <td>项目经理</td>
                            <td><input class="checkboxs" type="checkbox" name="role" value="3"></td>
                            <td>项目负责人</td>
                        </tr>
                        <tr>
                            <td><input class="checkboxs" type="checkbox" name="role" value="4"></td>
                            <td>物业客服</td>
                            <td><input class="checkboxs" type="checkbox" name="role" value="5"></td>
                            <td>开发客服</td>
                            <td><input class="checkboxs" type="checkbox" name="role" value="6"></td>
                            <td>财务</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">所属项目:</label>
                <div class="col-sm-10">
                    <table>
                        <tr>
                            <td colspan="4">项目列表</td>
                            <td colspan="2"></td>
                            <td colspan="4">所属项目</td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <select id="select1" multiple="multiple"
                                        style="width: 150px;height: 200px;margin-right: 10px">
                                    <c:forEach items="${all}" var="project">
                                        <option value="${project.pk_managementsecid}">${project.vmanagementsecname}</option>
                                    </c:forEach>
                                </select>
                            </td>
                            <td colspan="2">
                                <button id="add" type="button">&gt;</button>
                                <br>
                                <button id="add_all" type="button">&gt;&gt;</button>
                                <br>
                                <button id="remove" type="button">&lt;</button>
                                <br>
                                <button id="remove_all" type="button">&lt;&lt;</button>
                            </td>
                            <td colspan="4">
                                <select id="select2" multiple="multiple"
                                        style="width: 150px;height: 200px;margin-left: 10px" name="projectId">
                                    <c:forEach items="${my}" var="project">
                                        <option value="${project.pk_managementsecid}">${project.vmanagementsecname}</option>
                                    </c:forEach>
                                </select>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-2 control-label">在职状态:</label>
                <input type="radio" name="status" value="0" <c:if test="${user.status==0}">checked="checked"</c:if>>离职
                <input type="radio" name="status" value="1" <c:if test="${user.status==1}">checked="checked"</c:if>>在职
            </div>

            <div class="form-group">
                <label class="col-sm-2 control-label">备注:</label>
                <div class="col-sm-10">
                    <textarea name="note" cols="40" rows="10">${user.note}</textarea>
                </div>
            </div>
            <div class="form-group" style="margin-left: 300px">
                <button type="submit" class="btn btn-default" id="submit">保存</button>
                <button type="submit" style="margin-left: 320px" class="btn btn-default">重置密码</button>
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
    //回显checkbox
    $(function () {
        var roles = JSON.parse('${myRole}');
        var checkboxs = $(".checkboxs");
        for (var i = 0; i < checkboxs.length; i++) {
            for (var j = 0; j < roles.length; j++) {
                if (roles[j]['roleId'] == $(checkboxs[i]).attr("value")) {
                    $(checkboxs[i]).prop("checked", true);
                }
            }
        }
    })

    //移到右边
    $('#add').click(function () {
        //先判断是否有选中
        if (!$("#select1 option").is(":selected")) {
            layer.msg('请选择需要移动的选项', {time: 1000});
        }
        //获取选中的选项，删除并追加给对方
        else {
            $('#select1 option:selected').appendTo('#select2');
        }
    });

    //移到左边
    $('#remove').click(function () {
        //先判断是否有选中
        if (!$("#select2 option").is(":selected")) {
            layer.msg('请选择需要移动的选项', {time: 1000});
        } else {
            $('#select2 option:selected').appendTo('#select1');
        }
    });

    //全部移到右边
    $('#add_all').click(function () {
        //获取全部的选项,删除并追加给对方
        $('#select1 option').appendTo('#select2');
    });

    //全部移到左边
    $('#remove_all').click(function () {
        $('#select2 option').appendTo('#select1');
    });
    //提交时将所有选择的项目变为已选
    $("#myform").submit(function () {
        $("#select2 option").prop("selected", true);
    });
</script>


</html>