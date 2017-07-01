<%--
  Created by IntelliJ IDEA.
  User: luopa
  Date: 2017/5/24
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
    
<script type="text/javascript">
	function logout() {
		location.href="/loginOut";
	}
</script>
</head>
<body>

<nav class="navbar navbar-default navbar-fixed-top" id="header">
    <div class="container">
        <div class="col-md-4 col-xs-4">
            <img class="logo-img" src="${pageContext.request.contextPath}/imgs/logo02.png">
        </div>
        <div class="col-md-8 col-xs-8">
            <div class="col-xs-12">
                <div class="nav-group">
                    <div class="user-container">
                        <div class="user-photo-wrap"><img src="${pageContext.request.contextPath}/imgs_test/timg.jpg" alt="..."
                                                          class="img-circle user-photo"></div>
                        <div class="user-name">${user.realname}</div>
                    </div>
                    <button class="btn btn-default" type="button"><span
                            class="glyphicon glyphicon-bullhorn"></span><span class="badge">4</span>消息
                    </button>
                    <button class="btn btn-default" type="button" onclick="logout()"><span class="glyphicon glyphicon-off"></span>退出
                    </button>
                </div>
            </div>

        </div>
    </div>
</nav>

<aside class="aside" id="aside1">
    <div class="navbar-collapse bs-example-js-navbar-collapse collapse" aria-expanded="false">
        <aside id="aside2">
            <ul class="panel-group level01" id="aside_one_01" role="tablist">
                <li class="panel" role="tab" id="panel_one_01">
                    <div class="panel-header">
                        <a data-toggle="collapse" data-parent="#aside_one_01" href="#collapse_one_01">
                            <span class="icon glyphicon glyphicon-home"></span>
                            用户管理
                            <div class="arrow"><span class="glyphicon glyphicon-menu-left"></span></div>
                        </a>
                    </div>
                    <div class="collapse panel-collapse" id="collapse_one_01" role="tablist">
                        <ul class="panel-group level02" id="aside_one_02">
                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/user/getAllUser?pageNum=1&pageSize=10" target="main">用户列表</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </li>

                <li class="panel" role="tab" id="panel_two_01">
                    <div class="panel-header">
                        <a data-toggle="collapse" data-parent="#aside_two_01" href="#collapse_two_01">
                            <span class="icon glyphicon glyphicon-home"></span>
                            快捷缴费
                            <div class="arrow"><span class="glyphicon glyphicon-menu-left"></span></div>
                        </a>
                    </div>
                    <div class="collapse panel-collapse" id="collapse_two_01" role="tablist">
                        <ul class="panel-group level02" id="aside_two_02">
                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="#">物业费用</a>
                                </div>
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/propertyRecords/index" target="main">物业缴费记录</a>
                                </div>
                                <div class="panel-header">
                                    <a data-toggle="collapse" data-parent="#"
                                       href="#">收费清单</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="#">开发费用</a>
                                </div>
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/kfRecords/index" target="main">开发缴费记录</a>
                                </div>
                                <div class="panel-header">
                                    <a data-toggle="collapse" data-parent="#aside_two_02"
                                       href="#">收费清单</a>
                                </div>
                            </li>
                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/utilitiesRecords/electricIndex" target="main">电费缴费记录表</a>
                                </div>

                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/utilitiesRecords/waterIndex" target="main">水费缴费记录表</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </li>

                <li class="panel" role="tab" id="panel_three_01">
                    <div class="panel-header">
                        <a data-toggle="collapse" data-parent="#aside_three_01" href="#collapse_three_011">
                            <span class="icon glyphicon glyphicon-home"></span>
                            房屋及合同
                            <div class="arrow"><span class="glyphicon glyphicon-menu-left"></span></div>
                        </a>
                    </div>
                    <div class="collapse panel-collapse" id="collapse_three_011" role="tablist">
                        <ul class="panel-group level02" id="aside_three_011">
                        	<li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/dist/houseInfoDetailsBack/getHouseInfoDetailsList?pageNum=1&pageSize=10" target="main">房产信息</a>
                                </div>
                            </li>
                        
                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/dist/sellContractBack/getSellContractList?pageNum=1&pageSize=10" target="main">销售合同表</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/dist/rentContractBack/getRentContractList?pageNum=1&pageSize=10" target="main">租赁合同表</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </li>

                <li class="panel" role="tab" id="panel_four_01">
                    <div class="panel-header">
                        <a data-toggle="collapse" data-parent="#aside_four_01" href="#collapse_four_01">
                            <span class="icon glyphicon glyphicon-home"></span>
                            业务办理
                            <div class="arrow"><span class="glyphicon glyphicon-menu-left"></span></div>
                        </a>
                    </div>
                    <div class="collapse panel-collapse" id="collapse_four_01" role="tablist">
                        <ul class="panel-group level02" id="aside_four_02">
                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/dist/enterApply/enterApplyList?pageNum=1&pageSize=500" target="main">入住申请</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a target="main" href="${pageContext.request.contextPath}/dist/enterMaterial/findEnterMaterialList?pageNum=1&pageSize=500">入住资料列表</a>
                                </div>

                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a target="main" href="${pageContext.request.contextPath}/dist/toDecorationApplyList">装修申请</a>
                                </div>

                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a data-toggle="collapse" target="main" href="#">装修附件与资料</a>
                                </div>
                            </li>


                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a target="main" target="main" href="${pageContext.request.contextPath}/findRetreatLeaseApply">退租申请</a>
                                </div>

                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a target="main" href="${pageContext.request.contextPath}/findReletApply">续租申请</a>
                                </div>

                            </li>
                        </ul>
                    </div>
                </li>

                <li class="panel" role="tab" id="panel_five_01">
                    <div class="panel-header">
                        <a data-toggle="collapse" data-parent="#aside_four_01" href="#collapse_five_01">
                            <span class="icon glyphicon glyphicon-home"></span>
                            系统设置
                            <div class="arrow"><span class="glyphicon glyphicon-menu-left"></span></div>
                        </a>
                    </div>
                    <div class="collapse panel-collapse" id="collapse_five_01" role="tablist">
                        <ul class="panel-group level02" id="aside_five_02">
                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a data-toggle="collapse" target="main"  href="#">更名</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a data-toggle="collapse" target="main"  href="#">装修须知</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a data-toggle="collapse" target="main"  href="#">单个房产电费购买限制</a>
                                </div>

                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a data-toggle="collapse" data-parent="#aside_five_02" href="#">项目电费购买限制</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a data-toggle="collapse" target="main" href="#">系统设置</a>
                                </div>
                                <div class="panel-header">
                                    <a data-toggle="collapse" target="main"  href="#">入住完成-提示信息</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a data-toggle="collapse" target="main"  href="#">项目设置</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a data-toggle="collapse" target="main"  href="#">物业开票列表</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a data-toggle="collapse" target="main"  href="#">开发开票列表</a>
                                </div>
                            </li>
                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a target="main" href="${pageContext.request.contextPath}/system/ammeterIndex">电表</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </li>

                <li class="panel" role="tab" id="panel_six_01">
                    <div class="panel-header">
                        <a data-toggle="collapse" data-parent="#aside_six_01" href="#collapse_six_011">
                            <span class="icon glyphicon glyphicon-home"></span>
                            通知管理
                            <div class="arrow"><span class="glyphicon glyphicon-menu-left"></span></div>
                        </a>
                    </div>
                    <div class="collapse panel-collapse" id="collapse_six_011" role="tablist">
                        <ul class="panel-group level02" id="aside_six_011">
                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/dist/messageManageBack/getMessageManageList?pageNum=1&pageSize=10" target="main">通知列表</a>
                                </div>
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/dist/messageManageBack/messageManageEdit" target="main">发布通知</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </li>

                <li class="panel" role="tab" id="panel_seven_01">
                    <div class="panel-header">
                        <a data-toggle="collapse" data-parent="#aside_four_01" href="#collapse_seven_01">
                            <span class="icon glyphicon glyphicon-home"></span>
                            数据字典
                            <div class="arrow"><span class="glyphicon glyphicon-menu-left"></span></div>
                        </a>
                    </div>
                    <div class="collapse panel-collapse" id="collapse_seven_01" role="tablist">
                        <ul class="panel-group level02" id="aside_seven_02">
                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a data-toggle="collapse" data-parent="#aside_seven_02" href="#">通知类型</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/typeRefinement/getTypeData?pageNum=1&pageSize=10&typeDifferentiateId=1" target="main">房产使用属性</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/typeRefinement/getTypeData?pageNum=1&pageSize=10&typeDifferentiateId=2" target="main">企业在U谷中的属性</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/typeRefinement/getTypeData?pageNum=1&pageSize=10&typeDifferentiateId=3" target="main">所属行业</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/typeRefinement/getTypeData?pageNum=1&pageSize=10&typeDifferentiateId=4" target="main">上市类型</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/typeRefinement/getTypeData?pageNum=1&pageSize=10&typeDifferentiateId=5" target="main">专利类型</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/typeRefinement/getTypeData?pageNum=1&pageSize=10&typeDifferentiateId=6" target="main">退租类型</a>
                                </div>

                            </li>
                        </ul>
                    </div>
                </li>

                <li class="panel" role="tab" id="panel_eight_01">
                    <div class="panel-header">
                        <a data-toggle="collapse" data-parent="#aside_four_01" href="#collapse_eight_01">
                            <span class="icon glyphicon glyphicon-home"></span>
                            权限
                            <div class="arrow"><span class="glyphicon glyphicon-menu-left"></span></div>
                        </a>
                    </div>
                    <div class="collapse panel-collapse" id="collapse_eight_01" role="tablist">
                        <ul class="panel-group level02" id="aside_eight_02">
                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/user/index" target="main">管理用户列表</a>
                                </div>
                            </li>

                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="/roleList" target="main">角色列表</a>
                                </div>
                            </li>
                            <li class="panel" role="tab">
                                <div class="panel-header">
                                    <a href="${pageContext.request.contextPath}/topay" target="main">支付</a>
                                </div>
                            </li>
                        </ul>
                    </div>
                </li>
            </ul>
        </aside>
    </div>
</aside>
<article class="container article" id="article">
    <!-- 正文部分 -->
    <!--<iframe class="my-iframe" id="main" src="./index-level2.html"></iframe>-->
    <iframe class="my-iframe" id="main" src="about:blank" name="main"></iframe>
</article>

</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/main.js"></script>
<script type="text/javascript">


    $(".aside-more").click(function () {
        $("body").toggleClass("aside-on");
    });
    $(function () {
        $("[data-toggle='collapse']").click(function () {
            var value = $(this).attr("href");
            if (value === "#") {
                $("#main-lv2").attr("src", "userlist.jsp");
            }
        })
    })
    function changeTitle(title) {
        $("#main-lv2").attr("src", "${pageContext.request.contextPath}/html_page/page/" + title);
    }

</script>
</html>
