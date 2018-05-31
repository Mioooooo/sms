<%--
  Created by IntelliJ IDEA.
  User: Mioo
  Date: 2018/5/14
  Time: 2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <meta charset="gb2312">
    <title>Blog</title>
    <%--<meta name="keywords" content="黑色模板,个人网站模板,个人博客模板,博客模板,css3,html5,网站模板" />--%>
    <%--<meta name="description" content="这是一个有关黑色时间轴的css3 html5 网站模板" />--%>
    <link href="css/styles.css" rel="stylesheet">
    <link href="css/animation.css" rel="stylesheet">
    <link href="css/view.css" rel="stylesheet">
    <!-- 返回顶部调用 begin -->
    <link href="css/lrtk.css" rel="stylesheet" />
    <script type="text/javascript" src="js/jquery.js"></script>
    <%--<script type="text/javascript" src="js/js.js"></script>--%>
    <script type="text/javascript" src="js/viewIndexjs.js"></script>

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
    <div id="mainbody">
        <div class="blogs">
            <div id="index_view">
                <p>${blogView.id}</p>
                <h1 class="c_titile">${blogView.title}</h1>
                <p class="box" id="time">发布时间：${blogView.time} 编辑人：<span id="accountName">${blogView.accountName}</span><span id="browseCount">阅读（${blogView.browseCount})</span></p>
                <ul id="mainText">
                    <pre>${blogView.mainText}</pre>
                </ul>
            </div>
            <div id="index_view">
                <h1 class="box">评论区</h1>
                <div id="mydiv">

                </div>
            </div>
<!-- jQuery仿腾讯回顶部和建议 代码开始 -->
<div id="tbox"> <a id="togbook" href="/e/tool/gbook/?bid=1"></a> <a id="gotop" href="javascript:void(0)"></a> </div>
<!-- 代码结束 -->
        </div>
    </div>
</div>
</body>
</html>