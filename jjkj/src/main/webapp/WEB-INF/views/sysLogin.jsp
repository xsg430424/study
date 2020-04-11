<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>登录</title>
	<meta name="decorator" content="blank"/>
	<style type="text/css">
    </style>
</head>
<body>
	<form id="loginForm" class="form-signin" action="a/login" method="post">
		<label class="input-label" for="username">登录名</label>
		<input type="text" id="username" name="username" class="input-block-level required" value="${username}">
		<label class="input-label" for="password">密码</label>
		<input type="password" id="password" name="password" class="input-block-level required">
		<input class="btn btn-large btn-primary" type="submit" value="登 录"/>&nbsp;&nbsp;
		<label for="rememberMe" title="下次不需要再登录"><input type="checkbox" id="rememberMe" name="rememberMe" ${rememberMe ? 'checked' : ''}/> 记住我（公共场所慎用）</label>
	</form>
</body>
</html>