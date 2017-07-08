<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/js/libs/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">

    <style type="text/css">

        body {
            background: url(${pageContext.request.contextPath}/imgs/login_bg.jpg);
        }

        .login-container01 .popup-content,
        .login-container02 .popup-content,
        .login-container03 .popup-content {
            background-color: transparent;
        }

        /*登录-v2*/
        .login-container02 .popup-content {
            text-align: left;
            width: 972px;
        }

        .login-container02 .label-line {
            position: relative;
            margin-bottom: 26px;
        }

        .login-container02 .checkbox {
            margin-bottom: 48px;
        }

        .login-container02 .label-line label {
            position: absolute;
            line-height: 40px;
            margin-left: 10px;
            font-size: 20px;
            font-weight: normal;
        }

        .login-container02 .label-line .glyphicon {
            color: #999;
        }

        .login-container02 .label-line input {
            padding-left: 5em;
            height: 40px;
            border: none;
            border-bottom: 1px solid #009af8;
            border-radius: 0;

            box-shadow: none;
        }

        .forgetpwd {
            float: right;
        }

        .btn-login {
            width: 100%;
            color: #fff;
            background-color: #009af8;
        }

        .btn-login:active,
        .btn-login:hover {
            color: #fff;
            box-shadow: 0 0 10px #009af8;
            background-color: #009af8;
        }

        .login-left,
        .login-right {
            display: table-cell;
        }

        .login-left {
            width: 546px;
            /* 			height: 542px; */
            background: rgba(0, 154, 248, 0.3) url(${pageContext.request.contextPath}/imgs/logo02.png) no-repeat center center;
        }

        .login-right {
            width: 427px;
            height: 542px;
            padding: 0 72px;
            box-sizing: border-box;
            background-color: #fff;
        }

        .login-title {
            font-variant: small-caps;
            text-align: center;
            font-size: 30px;
            padding-top: 90px;
            padding-bottom: 30px;
        }

        #validatecode {
            padding-right: 85px;
        }

        .validate-code {
            position: absolute;
            right: 0;
            top: 0;
            width: 83px;
            height: 35px;
        }

        .validate-code img {
            width: 100%;
            height: 100%;
        }
    </style>
    <script type="text/javascript">
        if (window != top) {
            top.location.href = window.location.href;
        }


        function changeCode(img) {
            img.src = "/kaptcha.jpg?code=" + Math.random();
        }
    </script>
</head>
<body>
<!-- 登录-v2 开始 -->
<div class="popup-container popup-msg login-container02">
    <div class="popup-main">
        <div class="popup-section">
            <div class="popup-content popup-anim-scale container">
                <div>
                    <div class="login-left"></div>
                    <div class="login-right">
                        <form action="${pageContext.request.contextPath}/login" method="post">
                            <div class="login-title">login</div>
                            <div class="form-group label-line">
                                <!-- <label for="username">用户名：</label> -->
                                <label for="username"><span class="glyphicon glyphicon-user"></span></label>
                                <input type="text" class="form-control" id="username" name="username"
                                       placeholder="请输入用户名">
                            </div>
                            <div class="form-group label-line">
                                <!-- <label class="form-label" for="userpwd">密&emsp;码：</label> -->
                                <label class="form-label" for="userpwd"><span
                                        class="glyphicon glyphicon-lock"></span></label>
                                <input type="password" class="form-control" id="password" name="password"
                                       placeholder="请输入密码">
                            </div>
                            <div class="form-group label-line">
                                <label class="form-label" for="validatecode"></label>
                                <label class="form-label" for="validatecode"><span
                                        class="glyphicon glyphicon-phone"></span></label>
                                <input type="text" class="form-control" id="validatecode" placeholder="请输入验证码"
                                       name="validatecode">
                                <div class="validate-code">
                                    <img src="kaptcha.jpg" width="200" id="kaptchaImage" onclick="changeCode(this)"
                                         title="看不清，点击换一张"/>
                                </div>
                            </div>
                            <!-- <div class="form-group label-line">
                                <div class="row">
                                    <div class="col-xs-8">
                                        <label class="form-label" for="validatecode">验证码：</label>
                                        <input type="text" class="form-control" id="validatecode" placeholder="请输入验证码">
                                    </div>
                                      <div class="col-xs-4">
                                          <div class="validate-code"><img src="../imgs_test/validate-code.png"></div>
                                      </div>
                                </div>
                            </div> -->
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox">记住密码
                                </label>
                                <a class="forgetpwd">忘记密码</a>
                            </div>
                            <div class="text-center">
                                <button type="submit" class="btn btn-login">登录</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 登录-v2 结束 -->
</body>
</html>