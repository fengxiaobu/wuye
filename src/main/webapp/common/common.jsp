<%@ page isELIgnored="false" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
%>
<c:set var="basePath" value="<%=basePath %>" scope="session"/>

<c:set var="contextPath" value="${pageContext.request.contextPath}" scope="session"/>
<c:set var="imagesPath" value="${basePath}/imgs" scope="session"/>
<c:set var="stylesPath" value="${basePath}/css" scope="session"/>
<c:set var="scriptsPath" value="${basePath}/js" scope="session"/>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>

<script src="${scriptsPath}/browser-compatibility-js/html5shiv.min.js?now=${timestamp}"></script>
<script src="${scriptsPath}/browser-compatibility-js/respond.min.js?now=${timestamp}"></script>

<![endif]-->

<!-- constants variable -->
<script type="text/javascript">
    var basePath = '${basePath}';
    var contextPath = '${contextPath}';
    var imagesPath = '${imagesPath}';
    var stylesPath = '${stylesPath}';
    var scriptsPath = '${scriptsPath}';

    /**
     * 时间转换,传入值,得到转换后的yyyy-MM-dd格式
     * @param value
     * @returns {string}
     */
    function timeFormatter(value) {
        if(!value) {return;}
        var time = new Date(value);
        return time.getFullYear() + '-' + (Array(2).join(0)+(time.getMonth()+1)).slice(-2) + "-" + (Array(2).join(0)+time.getDate()).slice(-2);
    }
    /**
     * 0-不开票，1-暂不开票,2-业主开票,3-代付开票,4-已开票
     * @param value
     */
    function invoiceStatusFormatter(value){
        if(!value) {return;}
        if(value==0){
            return '不开票';
        }else if(value == 4){
            return '已开';
        }else{
            return '未开';
        }

    }
</script>

<link rel="stylesheet" type="text/css" href="${scriptsPath}/libs/bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${stylesPath}/reset.css">
<script type="text/javascript" src="${scriptsPath}/libs/jquery-1.11.3.min.js" charset="utf-8"></script>
<script type="text/javascript" src="${scriptsPath}/libs/bootstrap/js/bootstrap.min.js" charset="utf-8"></script>
<script type="text/javascript" src="${scriptsPath}/libs/zTree/js/jquery.ztree.all.min.js" charset="utf-8"></script>
<script type="text/javascript" src="${scriptsPath}/libs/layer/layer.js" charset="utf-8"></script>
<link href="${scriptsPath}/libs/datetimepicker/datetimepicker.min.css" rel="stylesheet" media="screen">
<link rel="stylesheet" type="text/css" href="${scriptsPath}/libs/zTree/css/zTreeStyle/demo.css">
<link rel="stylesheet" type="text/css" href="${scriptsPath}/libs/zTree/css/zTreeStyle/zTreeStyle.css">

<script type="text/javascript" src="${scriptsPath}/libs/datetimepicker/datetimepicker.min.js"></script>
<script type="text/javascript" src="${scriptsPath}/libs/datetimepicker/datetimepicker.zh-CN.js"
        charset="UTF-8"></script>
<script charset="utf-8" src="${scriptsPath}/libs/kindeditor/kindeditor-min.js"></script>
<script charset="utf-8" src="${scriptsPath}/libs/kindeditor/zh_CN.js"></script>
<script type="text/javascript" src="${scriptsPath}/libs/fileupload/js/uploadfile.js"></script>
<script type="text/javascript" src="${scriptsPath}/common.js" charset="utf-8"></script>
<script type="text/javascript" src="${scriptsPath}/libs/pageBar/jqPaginator.js"></script>

  
