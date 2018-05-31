<%--
  Created by IntelliJ IDEA.
  User: Mioo
  Date: 2018/5/11
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/Login.css"/>
    <script type="text/javascript">
        function checkpwd(){
            var p1=document.form.password.value;//获取密码框的值
            var p2=document.form.passwprd1.value;//获取重新输入的密码值
            if(p1==""){
                alert("请输入密码！");//检测到密码为空，提醒输入//
                document.form1.pwd1.focus();//焦点放到密码框
                return false;//退出检测函数
            }//如果允许空密码，可取消这个条件

            if(p1!=p2){//判断两次输入的值是否一致，不一致则显示错误信息
                document.getElementById("msg").innerHTML="两次输入密码不一致，请重新输入";//在div显示错误信息
                return false;
            }else{
                //密码一致，可以继续下一步操作
            }
        }
    </script>
</head>
<body background="img/index_background.png">
<div id="login">
    <h1>Login</h1>
    <form action="addAccount" method="post">
        <input type="text" required oninvalid="setCustomValidity('登陆名不能为空')" oninput="setCustomValidity('')" placeholder="登录名" name="name" />
        <input type="password" required oninvalid="setCustomValidity('密码不能为空')" oninput="setCustomValidity('')" placeholder="密码" name="password" />
        <input type="password" required oninvalid="setCustomValidity('密码不能为空')" oninput="setCustomValidity('')" placeholder="重复你的密码" name="password1" />
        <input type="text" required oninvalid="setCustomValidity('请输入用户名')" oninput="setCustomValidity('')" placeholder="用户名" name="netName"/>
        <input type="text" required oninvalid="setCustomValidity('请输入工作')" oninput="setCustomValidity('')" placeholder="工作"  name="job"/>
        <input type="text" required oninvalid="setCustomValidity('请输入手机号')" oninput="setCustomValidity('')" placeholder="手机号" name="TEL"/>
        <input type="text" required oninvalid="setCustomValidity('请输入邮箱')" oninput="setCustomValidity('')" placeholder="邮箱" name="email"/>
        <button class="but" type="submit" onclick="checkpwd()">注册</button>
    </form>
</div>
</body>
</html>
