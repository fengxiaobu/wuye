<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
        <li><a href="#">用户管理</a></li>
        <li class="active">用户列表</li>
    </ol>
</div>
<!-- 路径导航 结束 -->
<div class="col-xs-12">
    <div class="panel panel-default">
    </div>
    <div class="panel panel-default tudiqianyue">
        <div class="panel-heading">
            <div class="col-xs-4">用户列表</div>
            <div class="col-xs-8 panel-oprerate">
                <div class="col-xs-12">
                    <span style="margin-right: 50px"><input style="height: 35px;width: 320px;" type="text"  id="exampleInputName" placeholder=""></span>
                    <button class="btn btn-info"  type="button"><span class="glyphicon glyphicon-search"></span>搜素</button>
                </div>
            </div>
        </div>
        <div class="panel-body">
            <table class="table table-bordered tudiqianyue-table">
                <thead>
                <tr class="info">
                    <th rowspan="2">序号</th>
                    <th rowspan="2">房产</th>
                    <th rowspan="2">业主类型</th>
                    <th rowspan="2">客户名称</th>
                    <th rowspan="2">绑定手机</th>
                    <th rowspan="2">更新日期</th>
                    <th rowspan="2">操作</th>
                </tr>
                </thead>
                <tbody class="tudiqianyue-tbody">
	               <c:forEach items="${customers}" var="customers" varStatus="status">
		                    <tr class="tudiqianyue-tdtr">
		                        <td>${status.index+1}</td>
		                        <td>${customers.pactVO.house}</td>
		                        <td>
			                        <c:if test="${customers.companyType eq 1}">企业</c:if>  
	                				<c:if test="${customers.companyType eq 0}">个人</c:if>  
	                			</td>
		                        <td>${customers.vcname}</td>
		                        <td>${customers.bindingPhone}</td>
		                        <td><fmt:formatDate value="${customers.updateData}" pattern="yyyy-MM-dd"/></td>
		                        <td><a class="btn btn-info" href="/user/customerEdit?vccode=${customers.vccode}" role="button">编辑</a><a class="btn btn-info" href="" role="button">删除</a></td>
		                    </tr>
		               </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
    var tableEdit = {
        content: function(option) {
            var _tableEdit = this;
            if($(".tudiqianyue").is(".tableedit")) {
                $(".tudiqianyue-tdtr").find("td").css({
                    "border": "",
                    "background": ""
                });
            }
            $(".tudiqianyue").addClass("tableedit");
            var tr = $(".tudiqianyue-tdtr").length;
            $(".tudiqianyue-tdtr").each(function(_index,_this) {
                var trIndex = _index;
                $(this).find("td").each(function(_index,_this) {
                    var tdIndex = _index;
                    // $(this).attr("contenteditable","true");
                    if(tdIndex == option.start) {
                        $(this).css({"border-left": "2px solid red"});
                    }
                    if(tdIndex == option.end) {
                        $(this).css({"border-right": "2px solid red"});
                    }
                    if(trIndex == 0 && tdIndex >= option.start && tdIndex <= option.end) {
                        $(this).css({"border-top": "3px solid red"})
                    }
                    if(trIndex == tr-1 && tdIndex >= option.start && tdIndex <= option.end) {
                        $(this).css({"border-bottom": "3px solid red"})
                    }
                    if(tdIndex >= option.start && tdIndex <= option.end) {
                        $(this).css({"background":"#fff"}).attr("contenteditable","true");
                    }
                });
            });
            if(option.cancel) {
                $(option.cancel).click(function() {
                    _tableEdit.close(option);
                });
            }
            if(typeof option.callback == "function") {
                option.callback();
            }
        },
        setTd: function(option) {},
        close: function(option) {
            $(".tudiqianyue").removeClass("tableedit");
            $(".tudiqianyue-tdtr").each(function(_index,_this) {
                var trIndex = _index;
                var tr = $(".tudiqianyue-tdtr").length;
                $(this).find("td").each(function(_index,_this) {
                    var tdIndex = _index;
                    if(tdIndex == option.start) {
                        $(this).css({"border-left": ""})
                    }
                    if(tdIndex == option.end) {
                        $(this).css({"border-right": ""})
                    }
                    if(trIndex == 0 && tdIndex >= option.start && tdIndex <= option.end) {
                        $(this).css({"border-top": ""})
                    }
                    if(trIndex == tr-1 && tdIndex >= option.start && tdIndex <= option.end) {
                        $(this).css({"border-bottom": ""})
                    }
                    if(tdIndex >= option.start && tdIndex <= option.end) {
                        $(this).css({"background":"#fff"}).attr("contenteditable","false");
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

    $("#edit-xieyi").click(function() {
        tableEdit.content({
            start: 1,
            end: 3,
            cancel: "#tudiqianyue-remove",
            callback: function(data) {
                console.log(111111)
            }
        })
    });
    $("#edit-hetong").click(function() {
        tableEdit.content({
            start: 3,
            end: 6,
            callback: function(data) {

            }
        })
    });
    $("#tudiqianyue-remove").click(function() {

    });
</script>
</html>