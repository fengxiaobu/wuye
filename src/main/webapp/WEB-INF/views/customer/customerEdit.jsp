<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>首页</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/reset.css">
<style type="text/css">
		.file {
			position: relative;
			display: inline-block;
			background: #D0EEFF;
			border: 1px solid #99D3F5;
			border-radius: 4px;
			padding: 4px 12px;
			overflow: hidden;
			color: #1E88C7;
			text-decoration: none;
			text-indent: 0;
			line-height: 20px;
		}
		
		.file input {
			position: absolute;
			font-size: 100px;
			right: 0;
			top: 0;
			opacity: 0;
		}
		
		.file:hover {
			background: #AADFFD;
			border-color: #78C3F3;
			color: #004974;
			text-decoration: none;
		}
</style>
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
		<div class="panel panel-default"></div>
		<div class="panel panel-default tudiqianyue">
			<form class="form-horizontal" action="" method="post">
				<div style="margin-top: 50px"></div>
				<div class="form-group">
					<label for="exampleInputFile" class="col-sm-2 control-label">LOGO</label>
					<div class="col-sm-10">
									<a href="javascript:;" class="file">选择文件
									    <input type="file" name="" id="" accept="image/png,image/gif,image/jpg">
									</a>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">业主类型:</label>
						<div class="col-sm-10">
						<label class="col-sm-1">
							<input type="radio" name="optionsRadios"
							id="optionsRadios1" value="option1" />企业
						</label>
						<label class="col-sm-1">
							<input type="radio" name="optionsRadios"
							id="optionsRadios2" value="option2" />个人
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">绑定手机号:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">客户名称:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control"><a style="color: red">注：租、售合同的签约主体 </a>
						</label>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">房产使用属性:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <select class="form-control">
								<!--v-for-start-->
								<option value="3">自用</option>
								<option value="1">转租</option>
								<option value="2">自用+转租</option>
								<!--v-for-end-->
							</select>
						</label>
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">入驻企业成立时间:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">注册资本金（万）:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">所属行业:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label"> 
							<select	class="form-control">
									<!--v-for-start-->
									<option value="10">服务</option>
									<option value="11">互联网</option>
									<option value="12">房地产</option>
									<option value="13">金融</option>
									<!--v-for-end-->
							</select>
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">主营或主导产品:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
								<select class="form-control">
										<!--v-for-start-->
										<option value="26">全国</option>
										<option value="27">海外</option>
										<option value="28">华北地区</option>
										<option value="29">北京地区</option>
										<option value="30">华东地区</option>
										<!--v-for-end-->
								</select>
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">公司覆盖区域:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				
				<div class="form-group">
					<label class="col-sm-2 control-label">职工总人数:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">物业对接人:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">联系方式:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">紧急联系人:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">联系方式:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">是否高新:</label>
					<div class="col-sm-2">
						<label class="col-sm-1">
							<input type="radio" name="shigaoxin"
							id="shigaoxin1" value="0"/>是
						</label>
						<label class="col-sm-1">
							<input type="radio" name="shigaoxin"
							id="shigaoxin2" value="1" />否
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">高新类型:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <select class="form-control">
			                    <option value="0" selected="">国家高新</option>
			                    <option value="1">省级高新</option>
			                    <option value="2">市级高新</option>
			                </select>
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">发证时间:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">专利类型:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							<select class="form-control">
								<!--v-for-start-->
								<option value="20">发明专利</option>
								<option value="21">实用新型专利</option>
								<option value="22">外观设计专利</option>
								<!--v-for-end-->
							</select>
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">专利个数:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">是否上市:</label>
					<div class="col-sm-2">
						<label class="col-sm-1">
							<input type="radio" name="shigaoxin"
							id="shigaoxin1" value="0"/>是
						</label>
						<label class="col-sm-1">
							<input type="radio" name="shigaoxin"
							id="shigaoxin2" value="1" />否
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">上市类型:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">专利个数:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label"> 
							<select class="form-control">
									<!--v-for-start-->
									<option value="14">主板</option>
									<option value="15">创业板</option>
									<option value="16">中小板</option>
									<option value="17">新三板</option>
									<option value="18">港交所</option>
									<option value="19">深交所</option>
									<!--v-for-end-->
							</select>
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">挂牌时间:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">股票代码:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">专利个数:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <input type="text" style="width: 300px" class="form-control">
						</label>
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">备注:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 <textarea cols="50" rows="10"></textarea>
						</label>
					</div>
				</div>
				
					<label class="col-sm-2 control-label">房产信息:</label>
						<div class="panel-body">
							<table class="table table-bordered tudiqianyue-table">
								<thead>
									<tr class="info">
										<th rowspan="2">序号</th>
										<th rowspan="2">项目名称<br /></th>
										<th rowspan="2">房产</th>
										<th rowspan="2">入驻状态</th>
										<th rowspan="2">星级</th>
									</tr>
								</thead>
								<tbody class="tudiqianyue-tbody">
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td>已入住</td>
										<td>A</td>
									</tr>
									<tr>
										<td></td>
										<td></td>
										<td></td>
										<td>未入住</td>
										<td>AA</td>
									</tr>
								</tbody>
							</table>
						</div>
					</label>
				
				<div class="form-group">
					<label class="col-sm-2 control-label">更新日期:</label>
					<div class="col-sm-10">
						<label class="col-sm-2 control-label">
							 
						</label>
					</div>
				</div>

				<div class="form-group" style="margin-left: 300px">
					<button type="submit" class="btn btn-default">提交</button>
					<button type="submit" style="margin-left: 32px"
						class="btn btn-default">重置密码</button>
				</div>
			</form>
		</div>
	</div>

</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/libs/jquery-1.11.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
	var tableEdit = {
		content : function(option) {
			var _tableEdit = this;
			if ($(".tudiqianyue").is(".tableedit")) {
				$(".tudiqianyue-tdtr").find("td").css({
					"border" : "",
					"background" : ""
				});
			}
			$(".tudiqianyue").addClass("tableedit");
			var tr = $(".tudiqianyue-tdtr").length;
			$(".tudiqianyue-tdtr").each(
					function(_index, _this) {
						var trIndex = _index;
						$(this).find("td").each(
								function(_index, _this) {
									var tdIndex = _index;
									// $(this).attr("contenteditable","true");
									if (tdIndex == option.start) {
										$(this).css({
											"border-left" : "2px solid red"
										});
									}
									if (tdIndex == option.end) {
										$(this).css({
											"border-right" : "2px solid red"
										});
									}
									if (trIndex == 0 && tdIndex >= option.start
											&& tdIndex <= option.end) {
										$(this).css({
											"border-top" : "3px solid red"
										})
									}
									if (trIndex == tr - 1
											&& tdIndex >= option.start
											&& tdIndex <= option.end) {
										$(this).css({
											"border-bottom" : "3px solid red"
										})
									}
									if (tdIndex >= option.start
											&& tdIndex <= option.end) {
										$(this).css({
											"background" : "#fff"
										}).attr("contenteditable", "true");
									}
								});
					});
			if (option.cancel) {
				$(option.cancel).click(function() {
					_tableEdit.close(option);
				});
			}
			if (typeof option.callback == "function") {
				option.callback();
			}
		},
		setTd : function(option) {
		},
		close : function(option) {
			$(".tudiqianyue").removeClass("tableedit");
			$(".tudiqianyue-tdtr").each(
					function(_index, _this) {
						var trIndex = _index;
						var tr = $(".tudiqianyue-tdtr").length;
						$(this).find("td").each(
								function(_index, _this) {
									var tdIndex = _index;
									if (tdIndex == option.start) {
										$(this).css({
											"border-left" : ""
										})
									}
									if (tdIndex == option.end) {
										$(this).css({
											"border-right" : ""
										})
									}
									if (trIndex == 0 && tdIndex >= option.start
											&& tdIndex <= option.end) {
										$(this).css({
											"border-top" : ""
										})
									}
									if (trIndex == tr - 1
											&& tdIndex >= option.start
											&& tdIndex <= option.end) {
										$(this).css({
											"border-bottom" : ""
										})
									}
									if (tdIndex >= option.start
											&& tdIndex <= option.end) {
										$(this).css({
											"background" : "#fff"
										}).attr("contenteditable", "false");
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
			start : 1,
			end : 3,
			cancel : "#tudiqianyue-remove",
			callback : function(data) {
				console.log(111111)
			}
		})
	});
	$("#edit-hetong").click(function() {
		tableEdit.content({
			start : 3,
			end : 6,
			callback : function(data) {

			}
		})
	});
	$("#tudiqianyue-remove").click(function() {

	});
</script>
</html>