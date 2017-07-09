<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>电表列表</title>
     <%@include file="/common/common.jsp" %>
</head>

<body>
	<!-- 路径导航 开始 -->
	<div class="col-xs-12">
	    <ol class="breadcrumb">
	        <li><a href="#">首页</a></li>
	        <li><a href="#">系统设置</a></li>
	        <li class="active">电表列表</li>
	    </ol>
	</div>
	<!-- 路径导航 结束 -->
		<div class="col-xs-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<div class="col-xs-4">电表列表</div>
						<div class="col-xs-8 panel-oprerate">
								<button id="query" type="submit" class="btn btn-info">搜索</button>
								<button id="add" type="submit" class="btn btn-primary">新增</button>
						</div>
						<div class="col-xs-12">
							<div class="form-inline">
								<div class="form-group">
								<label>项目名称：</label>
									 <%-- <select class="form-control" id="projectName">
									 	<option value="">选择项目</option>
									 	<c:forEach items="${projectList}" var="p">
			                			<option  value="${p.projectName}">${p.projectName}</option>
			                		</c:forEach>
									</select>
									 <c:forEach items="${projectList}" var="list">  
									 
									 </c:forEach> --%>
									<input type="text" id="projectName" value="" class="form-control" placeholder="项目名称">
									 
								 </div>
								 <div class="form-group">
									<label>电表号：</label>
									<input type="text" id="ammeter_no" value="" class="form-control" placeholder="电表号">
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
			                    <th rowspan="2">房产编号</th>
			                    <th rowspan="2">电表号</th>
			                    <th rowspan="2">倍率</th>
			                    <th rowspan="2">更新时间</th>
			                    <th rowspan="2">操作</th>
			                </tr>
						</thead>
						<tbody id="productList">
		                </tbody>
		            </table>
		            <div colspan="7">
		   				<ul class="pagination" id="pagination1"></ul>
					</div>
		            
				</div>
			</div>
			</div>
			
		
</body>
<script type="text/javascript">
 
 $(function(){	
	formdate('#form_datetime');
	formdate('#form_datetime2');
	
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
	var ammeter_no = $("#ammeter_no").val();
	$.ajax({
		url:"${basePath}/admin/sys/queryAmmeByPage",
		type:"GET",
		contentType:"text/json,html,xml;charset=utf-8",
		dataType:"json",
		data : {
			projectName:projectName,//项目名称
			ammeterNo:ammeter_no, //电表号
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
		                    /* <th rowspan="2">房产编号</th>
		                    <th rowspan="2">电表号</th>
		                    <th rowspan="2">倍率</th>
		                    <th rowspan="2">更新时间</th>
		                    <th rowspan="2">操作</th> */
			        	  var rowContent = "<tr>"
		              		  + "<td>"+(i+1)+"</td>"
		                      + "<td>"+isnull(results[i].projectName)+"</td>"
		                      + "<td>"+isnull(results[i].vhcode)+"</td>"
		                      + "<td>"+isnull(results[i].ammeter_no)+"</td>"
		                      + "<td>"+isnull(results[i].multiply)+"</td>"
		                      + "<td>"+isnull(results[i].updateTime)+"</td>"
		                      + "<td>" 
		                      +"<a style=\"text-decoration:none;\" class='btn btn-info'  href='${basePath}/admin/sys/ammeedit?id="+results[i].id+"' role='button'>编辑</a>&nbsp;" 
		                      +"<button class='btn btn-warning'  onclick=\"del('"+results[i].id+"')\" >删除</button>"
		                      +"</td>"
					          + "</tr>";
		           		$("#productList").append(rowContent);
			          }
		          }else{
		 			  totalPages = totalPages<=1?1:totalPages;
		              
		              //$("#productList").append("<tr><td colspan=\""+$("#thead th").length+"\" style=\"text-align:center\">暂无数据.</td></tr>");
		 			 $("#productList").append("<tr><td colspan='7'>暂无数据</td></tr>");
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

$("#add").click(function(){
	window.location.href ="${basePath}/page/system/ammeter/ammeradd";
})
function del(id){
	layer.confirm('是否确认删除?', {icon: 3, title:'提示'}, function(index){
		  //do something
		  $.ajax({
			type:"POST",//请求类型
			url:"${basePath}/admin/sys/ammeter/del/"+id,
	        statusCode : {
	        	204 : function(data){
	        		layer.msg('删除成功!', {time:2000});
	        		getData(1,10) ; 
	        	},
	        	500 : function(){layer.msg('操作异常，请稍后再试！', {time:2000});}
	        }
		});
		  layer.close(index);
		});
}
</script>
 
</html>
