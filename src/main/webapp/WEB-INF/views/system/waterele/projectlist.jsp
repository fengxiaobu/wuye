<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>项目水电限制</title>
     <%@include file="/common/common.jsp" %>
</head>

<body>
	<!-- 路径导航 开始 -->
	<div class="col-xs-12">
	    <ol class="breadcrumb">
	        <li><a href="#">首页</a></li>
	        <li><a href="#">系统设置</a></li>
	        <li class="active">项目水电限制</li>
	    </ol>
	</div>
	<!-- 路径导航 结束 -->
		<div class="col-xs-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="col-xs-4">项目电费限制</div>
						<div class="col-xs-12">
								
							<div class="form-inline">
								<div class="form-group">
									<label>项目名称：</label>
									<input type="text" id="projectName" class="form-control quanxianmingcheng" placeholder="项目名称">
									<button id="query" type="submit" class="btn btn-info danxi_saixuan">搜索</button>
								</div>
							</div>
						</div>
				</div>
				
							
			<div class="panel-body">
					<table class="table table-bordered landReturn-table edit-tr">
						<thead>
							<tr class="info">
			                    <th rowspan="2">序号</th>
			                    <th rowspan="2">项目名称<br/></th>
			                    <th rowspan="2">首次限制开始日期</th>
			                    <th rowspan="2">首次限制截止日期</th>
			                    <th rowspan="2">首次限制缴费金额</th>
			                    <th rowspan="2">当月限制缴费金额</th>
			                    <th rowspan="2">状态</th>
			                    <th rowspan="2">操作</th>
			                </tr>
						</thead>
						<tbody id="productList">
		                </tbody>
		            </table>
		            <div colspan="9">
		   				<ul class="pagination" id="pagination1"></ul>
					</div>
				</div>
			</div>
			</div>
			
		
</body>
<script type="text/javascript">
$(function(){	
	var pageSize = 10;
	getData(1,pageSize) ;
	
	//查询
	$("#query").click(function(){
		getData(1,pageSize) ;
	});
	
	//回车搜索
	$(document).keydown(function(event) {
		if (event.keyCode == 13) {
			$("#query").click();
		}
	});
	
});

//加载分页显示数据
function getData(num,pageSize,f){
	var projectName = $("#projectName").val();
	$.ajax({
		url:"${basePath}/admin/sys/queryProjectListByPage",
		type:"GET",
		contentType:"text/json,html,xml;charset=utf-8",
		dataType:"json",
		data : {
			projectName:projectName,//项目名称
             page : num,//当前页
             rows : pageSize
         },
		cache:false,
		statusCode : {
			200 : function(data) {
				 $("#productList tr").remove();
		          var results = data.rows;
		          var totalPages = data.total%pageSize==0?Math.floor(data.total/pageSize):Math.floor(data.total/pageSize+1);
		          if(results.length!=0){
		        	  console.log(results)
			          for (var i = 0; i < results.length; i++) {
			        	  /* <th rowspan="2">序号</th>
		                    <th rowspan="2">项目名称<br/></th>
		                    <th rowspan="2">首次限制开始日期</th>
		                    <th rowspan="2">首次限制截止日期</th>
		                    <th rowspan="2">首次限制缴费金额</th>
		                    <th rowspan="2">当月限制缴费金额</th>
		                    <th rowspan="2">状态</th>
		                    <th rowspan="2">操作</th> */
			        	  var rowContent = "<tr>"
		              		  + "<td>"+(i+1)+"</td>"
		                      + "<td>"+isnull(results[i].projectName)+"</td>"
		                      + "<td>"+isnull(results[i].startDate)+"</td>"
		                      + "<td>"+isnull(results[i].endDate)+"</td>"
		                      + "<td>"+isnull(results[i].firstMoney)+"</td>"
		                      + "<td>"+isnull(results[i].everyMoney)+"</td>"
		                      + "<td>"+(results[i].astrictStatus=='Y'?'启动':'禁用')+"</td>"
		                      + "<td>"  
		                      +"<a class='btn btn-info'  href='${basePath}/admin/sys/projectrestedit?pkProject="+results[i].pkProject+"' role='button'>编辑</a>"
		                      +"</td>"
					          + "</tr>";
		           		$("#productList").append(rowContent);
			          }
		          }else{
		 			  totalPages = totalPages<=1?1:totalPages;
		              
		              //$("#productList").append("<tr><td colspan=\""+$("#thead th").length+"\" style=\"text-align:center\">暂无数据.</td></tr>");
		 			 $("#productList").append("<tr><td colspan='11'>暂无数据</td></tr>");
		          }
					$.jqPaginator('#pagination1', {
						totalPages : totalPages,
						visiblePages : pageSize,
						currentPage : num,
						onPageChange : function(num1, type) {
							if(num1 !=num){
								getData(num1,pageSize) ;
							}	
						} 
					});	
			},
			500: function(){
				layer.msg('网络异常，请稍后再试！', {icon: 5});		
			}
			
		}
   });	
}
</script>
 
</html>
