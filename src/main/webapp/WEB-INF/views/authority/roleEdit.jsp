<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
    <link rel="stylesheet" type="text/css" href="../js/libs/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="../css/reset.css">
</head>
<body>
<div class="col-xs-12">
    <div class="panel panel-default">
        <div class="panel-body">

            <form class="form-horizontal">

                <div class="form-group">
                    <label class="col-sm-2 control-label">人员姓名：</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">登录账户：</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">工号：</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">备注：</label>
                    <div class="col-sm-10">
                        <textarea class="form-control" rows="6"></textarea>
                    </div>
                </div>

                <div class="form-group">
                    <label  class="col-sm-2 control-label">性别：</label>
                    <div class="col-sm-3">
                        <select class="form-control">
                            <option>男</option>
                            <option>女</option>
                        </select>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">所属角色：</label>
                    <div class="col-sm-10">
                        <table>
                            <tr>
                                <td><input type="checkbox">系统管理员&nbsp;&nbsp;</td>
                                <td><input type="checkbox">项目经理&nbsp;&nbsp;</td>
                                <td><input type="checkbox">项目负责人&nbsp;&nbsp;</td>
                            </tr>
                            <tr>
                                <td><input type="checkbox">物业客服&nbsp;&nbsp;</td>
                                <td><input type="checkbox">开发客服&nbsp;&nbsp;</td>
                                <td><input type="checkbox">财务&nbsp;&nbsp;</td>
                            </tr>
                        </table>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">所属项目：</label>
                    <div class="col-sm-10">
                        <select name="#" id="1" multiple="multiple" >
                            <option value="1">test1</option>
                            <option value="2">test1</option>
                            <option value="3">test1</option>
                            <option value="4">test1</option>
                            <option value="5">test1</option>
                            <option value="6">test1</option>
                        </select>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">在职状态：</label>
                    <div class="col-sm-10">
                        <textarea class="form-control" rows="6"></textarea>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button class="btn btn-success" type="submit"><span class="glyphicon glyphicon-ok"></span>保存</button>
                        <button class="btn btn-success" type="submit"><span class="glyphicon glyphicon-ok"></span>重置密码</button>
                    </div>
                </div>

            </form>
        </div>
    </div>
</div>


</body>
<script type="text/javascript" src="../js/libs/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="../js/libs/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
</script>
</html>