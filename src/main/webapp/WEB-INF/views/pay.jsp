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

<form action="${pageContext.request.contextPath}/sendpay" method="post">
    <table>
        <tr>
            <td>商户订单号:</td>
            <td><input type="text" name="MerOrderNo" value="RZHD123456789"/></td>
        </tr>

        <tr>
            <td>订单金额:</td>
            <td><input type="text" name="OrderAmt" value="10"/></td>
        </tr>

    </table>
    <input type="submit" value="toPAy">
</form>
</body>
</html>
