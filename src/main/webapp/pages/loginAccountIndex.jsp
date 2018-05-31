<%--
  Created by IntelliJ IDEA.
  User: Mioo
  Date: 18/05/10
  Time: 下午2:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Login</title>
  <link rel="stylesheet" type="text/css" href="css/Login.css"/>
</head>
<body background="img/index_background.png">
<div id="login">
  <h1>Login</h1>
  <form action="checkAccount" method="post">
    <input type="text" required oninvalid="setCustomValidity('用户名不能为空')" oninput="setCustomValidity('')" placeholder="登录名" name="name" />
    <input type="password" required oninvalid="setCustomValidity('密码不能为空')" oninput="setCustomValidity('')" placeholder="密码" name="password" />
    <button class="but" type="submit">登录</button>
  </form>
  <form action="addAccountIndex" method="post">
    <button class="but" type="submit">注册</button>
  </form>
</div>
</body>
</html>
