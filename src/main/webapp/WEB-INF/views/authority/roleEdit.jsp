<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>首页</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
</head>
<body>
<div class="col-xs-12">
    <div class="panel panel-default">
        <div class="panel-body">

            <form class="form-horizontal">

                <div class="form-group">
                    <label class="col-sm-2 control-label">角色名称：</label>
                    <div class="col-sm-10">
                        <input type="hidden" name="roleId" value="${role.roleId}">
                        <input type="text" class="form-control" name="name" value="${role.name}">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">描述：</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" name="note" value="${role.note}">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-2 control-label">系统权限：</label>
                    <div class="col-sm-10">

                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button class="btn btn-success" type="submit"><span class="glyphicon glyphicon-ok"></span>保存
                        </button>
                        <button class="btn btn-success" type="submit"><span class="glyphicon glyphicon-ok"></span>重置密码
                        </button>
                    </div>
                </div>

            </form>
        </div>
    </div>
</div>


</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/libs/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript">
</script>
</html>