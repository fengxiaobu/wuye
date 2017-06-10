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

<form action="${pageContext.request.contextPath}/pay" method="post">
<%--<form action="http://newpayment-test.chinapay.com/CTITS/service/rest/page/nref/000000000017/0/0/0/0/0" method="post">--%>
    <table>
        <tr>
            <td>版本号:</td>
            <td><input type="text" name="Version" value="20140728"/></td>
        </tr>
        <tr>
            <td>商户号:</td>
            <td><input type="text" name="MerId" value="000001705221343"/></td>
        </tr>
        <tr>
            <td>商户订单号:</td>
            <td><input type="text" name="MerOrderNo" value="RZHD123456789"/></td>
        </tr>
        <tr>
            <td>商户交易日期:</td>
            <td><input type="text" name="TranDate" value="20170610"/></td>
        </tr>
        <tr>
            <td>商户交易时间:</td>
            <td><input type="text" name="TranTime" value="104033"/></td>
        </tr>
        <tr>
            <td>订单金额:</td>
            <td><input type="text" name="OrderAmt" value="10"/></td>
        </tr>

        <tr>
            <td>业务类型:</td>
            <td><input type="text" name="BusiType" value="0001"/></td>
        </tr>

        <tr>
            <td>商户后台通知地址:</td>
            <td><input type="text" name="MerBgUrl" value="http://www.fengxiaobu.com"/></td>
        </tr>

        <tr>
            <td>防钓鱼客户浏览器IP:</td>
            <td><input type="text" name="RemoteAddr" value="125.71.132.200"/></td>
        </tr>
        <tr>
            <td><input name="TranType" type="hidden" value="0001"></td>
        </tr>
    </table>
    <input type="submit" value="toPAy">
</form>
</body>
</html>
