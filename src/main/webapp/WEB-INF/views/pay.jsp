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
<
<form action="http://newpayment-test.chinapay.com/CTITS/service/rest/forward/sta/000000000017/0/0/0/0/0" method="post">
<%--<form action="http://newpayment-test.chinapay.com/CTITS/service/rest/page/nref/000000000017/0/0/0/0/0" method="post">--%>
    <table>
        <tr>
            <td>版本号:</td>
            <td><input type="text" name="Version" value="20140728"/></td>
        </tr>
      <%--  <tr>
            <td>接入类型:</td>
            <td><input type="text" name="AccessType" value="0"/></td>
        </tr>--%>
        <%--<tr>
            <td>接入机构号:</td>
            <td><input type="text" name="InstuId"/></td>
        </tr>
        <tr>
            <td>收单机构号:</td>
            <td><input type="text" name="AcqCode"/></td>
        </tr>--%>
        <tr>
            <td>商户号:</td>
            <td><input type="text" name="MerId" value="000001705221343"/></td>
        </tr>
        <tr>
            <td>商户订单号:</td>
            <td><input type="text" name="MerOrderNo" value="195655"/></td>
        </tr>
        <tr>
            <td>商户交易日期:</td>
            <td><input type="text" name="TranDate" value="20171010"/></td>
        </tr>
        <tr>
            <td>商户交易时间:</td>
            <td><input type="text" name="TranTime" value="100000"/></td>
        </tr>
        <tr>
            <td>订单金额:</td>
            <td><input type="text" name="OrderAmt" value="10"/></td>
        </tr>
        <%--<tr>
            <td>交易类型:</td>
            <td><input type="text" name="TranType" value=""/></td>
        </tr>--%>
        <tr>
            <td>业务类型:</td>
            <td><input type="text" name="BusiType" value="0001"/></td>
        </tr>
        <%--<tr>
            <td>交易币种:</td>
            <td><input type="text" name="CurryNo" value="CNY"/></td>
        </tr>--%>
       <%-- <tr>
            <td>分账类型:</td>
            <td><input type="text" name="SplitType"/></td>
        </tr>
        <tr>
            <td>交易币种:</td>
            <td><input type="text" name="SplitMethod"/></td>
        </tr>
        <tr>
            <td>分账信息:</td>
            <td><input type="text" name="MerSplitMsg"/></td>
        </tr>
        <tr>
            <td>支付机构号:</td>
            <td><input type="text" name="BankInstNo"/></td>
        </tr>
        <tr>
            <td>商户前台通知地址:</td>
            <td><input type="text" name="MerPageUrl"/></td>
        </tr>--%>

        <tr>
            <td>商户后台通知地址:</td>
            <td><input type="text" name="MerBgUrl" value="http://www.fengxiaobu.com"/></td>
        </tr>
       <%-- <tr>
            <td>商品信息:</td>
            <td><input type="text" name="CommodityMsg"/></td>
        </tr>
        <tr>
            <td>商户私有域:</td>
            <td><input type="text" name="MerResv"/></td>
        </tr>
        <tr>
            <td>交易扩展域:</td>
            <td><input type="text" name="TranReserved"/></td>
        </tr>

        <tr>
            <td>有卡交易信息域:</td>
            <td><input type="text" name="CardTranData"/></td>
        </tr>
        <tr>
            <td>支付超时时间:</td>
            <td><input type="text" name="PayTimeOut"/></td>
        </tr>
        <tr>
            <td>防钓鱼时间戳:</td>
            <td><input type="text" name="TimeStamp"/></td>
        </tr>--%>
        <tr>
            <td>防钓鱼客户浏览器IP:</td>
            <td><input type="text" name="RemoteAddr" value="125.71.132.6"/></td>
        </tr>
       <%-- <tr>
            <td>风控数据:</td>
            <td><input type="text" name="RiskData"/></td>
        </tr>--%>
        <tr>
            <td>签名:</td>
            <td><input type="text" name="Signature" value="fdsafsadfsa"/></td>
        </tr>
    </table>
    <input type="submit" value="toPAy">
</form>
</body>
</html>
