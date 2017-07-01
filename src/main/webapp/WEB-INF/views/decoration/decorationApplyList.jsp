<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
	<%@include file="/common/common.jsp" %>
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
				<form action="${basePath}/dist/enterApply/search" method="post">
				<div class="col-xs-8 panel-oprerate">
						<!-- <a href="#"  class="btn btn-info" target="iframe_ch_ch">新增	</a> -->
						<button id="query" type="submit" class="btn btn-info">搜索</button>
				</div>
				
				
				<div class="form-inline">
					<div class="form-group">
							<label>申请日期：</label>
							<div id="form_datetime" class="input-group date form_datetime" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
			                    <input id="showdate1" class="form-control" size="16" type="text" value="" readonly="readonly">
			                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
			              </div>
						  <input type="hidden" id="dtp_input1" name="nextReturnTime" value="" />
						  至
							<div id="form_datetime2" class="input-group date form_datetime" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input1" data-link-format="yyyy-mm-dd">
			                    <input id="showdate2" class="form-control" size="16" type="text" value="" readonly="readonly">
			                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
								<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
			              </div>
						  
							
					</div>
					<div class="form-group">
							<label>项目或用户名：</label>
							<input type="hidden" id="dtp_input2" name="nextReturnTime" value="" /> 
							<input type="text"
								class="form-control quanxianmingcheng" placeholder="项目名称、用户名">
					</div>
				</div>
				</form>
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
                        <td>${decora.houseInfoDetails.project}</td>
                        <td>${decora.houseInfoDetails.vhname}</td>
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
                        <td>${decora.decorationLeaderPhone}&nbsp;</td>
                        <td>${decora.decorationDeposit}</td>
                        <td>${decora.decorationManagementCost}</td>
                        <td>${decora.passPapersCost}&nbsp;(元)</td>
                        <td>${decora.passPapersDeposit}&nbsp;(元)</td>
                        <td>
                            <c:if test="${decora.auditStatus eq 0}">未审核</c:if>
                            <c:if test="${decora.auditStatus eq 1}">已通过</c:if>
                            <c:if test="${decora.auditStatus eq 2}">未通过</c:if>
                        </td>
                        <td><a class="btn btn-info"
                               href="${pageContext.request.contextPath}/dist/deleteDecorationApplyByID?decorationApplyId=${decora.decorationApplyId}"
                               role="button">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;<a
                                class="btn btn-info"
                                href="${pageContext.request.contextPath}/dist/toDecorationApply?decorationApplyId=${decora.decorationApplyId}"
                                role="button">编辑</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
           <%-- <div align="center">
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
            </div>--%>
        </div>
    </div>

</div>
</body>
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