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
</head>
<body>
<%--<form action="${pageContext.request.contextPath}/pay" method="post">--%>
<h2>正在前往银联....</h2>
<form action="http://newpayment-test.chinapay.com/CTITS/service/rest/page/nref/000000000017/0/0/0/0/0" method="post">
    <table  style="display: none">
        <tr>
            <td>版本号:</td>
            <td><input type="text" name="Version" value="${Version}"/></td>
        </tr>
        <tr>
            <td>商户号:</td>
            <td><input type="text" name="MerId" value="${MerId}"/></td>
        </tr>
        <tr>
            <td>商户订单号:</td>
            <td><input type="text" name="MerOrderNo" value="${MerOrderNo}"/></td>
        </tr>
        <tr>
            <td>商户交易日期:</td>
            <td><input type="text" name="TranDate" value="${TranDate}"/></td>
        </tr>
        <tr>
            <td>商户交易时间:</td>
            <td><input type="text" name="TranTime" value="${TranTime}"/></td>
        </tr>
        <tr>
            <td>订单金额:</td>
            <td><input type="text" name="OrderAmt" value="${OrderAmt}"/></td>
        </tr>

        <tr>
            <td>业务类型:</td>
            <td><input type="text" name="BusiType" value="${BusiType}"/></td>
        </tr>

        <tr>
            <td>商户后台通知地址:</td>
            <td><input type="text" name="MerBgUrl" value="${MerBgUrl}"/></td>
        </tr>

        <tr>
            <td>防钓鱼客户浏览器IP:</td>
            <td><input type="text" name="RemoteAddr" value="${RemoteAddr}"/></td>
        </tr>
        <tr>
            <td>签名:</td>
            <td><input name="Signature" type="hidden" value="${Signature}"></td>
        </tr>
        <tr>
            <td>交易类型:</td>
            <td><input name="TranType" type="hidden" value="${TranType}"></td>
        </tr>
        <tr>
            <td>商户前台通知地址:</td>
            <td><input name="MerPageUrl" type="hidden" value="${MerPageUrl}"></td>
        </tr>
        <tr>
            <td>接入类型:</td>
            <td><input name="AccessType" type="hidden" value="${AccessType}"></td>
        </tr>
        <tr>
            <td>PayTimeOut:</td>
            <td><input name="PayTimeOut" type="hidden" value="${PayTimeOut}"></td>
        </tr>
        <tr>
            <td>CurryNo:</td>
            <td><input name="CurryNo" type="hidden" value="${CurryNo}"></td>
        </tr>
       <%-- <tr>
            <td>AcqCode:</td>
            <td><input name="AcqCode" type="hidden" value="${AcqCode}"></td>
        </tr>--%>
        <tr>
            <td>BankInstNo:</td>
            <td><input name="BankInstNo" type="hidden" value="${BankInstNo}"></td>
        </tr>
        <tr>
            <td>CommodityMsg:</td>
            <td><input name="CommodityMsg" type="hidden" value="${CommodityMsg}"></td>
        </tr>
        <tr>
            <td>MerResv:</td>
            <td><input name="MerResv" type="hidden" value="${MerResv}"></td>
        </tr>
        <tr>
            <td>TimeStamp:</td>
            <td><input name="TimeStamp" type="hidden" value="${TimeStamp}"></td>
        </tr>

    </table>
    <input type="submit" style="display: none" id="toCHinaPay" value="toPAy">
</form>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/jquery-1.11.3.min.js">

</script>
<script>
    $("form:first").submit();
</script>
</html>
