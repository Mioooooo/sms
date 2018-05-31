<%--
  Created by IntelliJ IDEA.
  User: Mioo
  Date: 2018/5/14
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <title>Blog</title>

    <link href="css/styles.css" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/animation.css" rel="stylesheet">
    <link href="css/view.css" rel="stylesheet">
    <!-- 返回顶部调用 begin -->
    <link href="css/lrtk.css" rel="stylesheet" />
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/js.js"></script>
    <!-- 返回顶部调用 end-->
    <!--[if lt IE 9]>
    <script src="js/modernizr.js"></script>
    <![endif]-->
</head>
<body background="img/index_background.png">
<header>
    <nav id="nav">
        <ul>
            <li><a href="/" >网站首页</a></li>
        </ul>
        <script src="js/silder.js"></script><!--获取当前页导航 高亮显示标题-->
    </nav>
</header>
<!--header end-->
<div id="mainbody">
    <div class="info">
        <figure> <img src="images/art.jpg"  alt="Panama Hat">
        </figure>
        <div class="card">
            <h1>我的名片</h1>
            <p>Name：${account.netName}</p>
            <p>Job：${account.job}</p>
            <p>TEL：${account.TEL}</p>
            <p>Email：${account.email}</p>
            <ul class="linkmore">
                <li><a href="blogIndex" class="address" title="主页"></a></li>
                <li><a href="editIndex" class="talk" title="记录每一天"></a></li>
                <li><a href="/" class="email" title="给我写信"></a></li>
                <li><a href="/" class="photos" title="生活照片"></a></li>
                <li><a href="/" class="heart" title="关注我"></a></li>
            </ul>
        </div>
    </div>
        <div class="blogs">
                <form action="addBlog" method="post" id="userform">
                    <input  type="text" placeholder="标题" name="title"/>
                    <button class="c2" type="submit">发表</button>
                </form>
            <textarea class="c1" name="mainText" form="userform" placeholder="请输入正文"></textarea>


        </div>
        </div>
</body>
</html>