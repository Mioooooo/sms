<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
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
    <title>Blog</title>
    <link href="css/styles.css" rel="stylesheet">
    <link href="css/animation.css" rel="stylesheet">
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
    <!--info end-->
    <div class="blank"></div>
    <div class="blogs">
        <ul class="bloglist">
            <li>
                <div class="arrow_box">
                    <div class="ti"></div>
                    <!--三角形-->
                    <div class="ci"></div>
                    <!--圆形-->
                    <h2 class="title">
                        <a href="/" target="_blank" id="title1"></a>
                    </h2>
                    <ul class="textinfo">
                        <p id="mainText1"></p>
                    </ul>
                    <ul class="details">
                        <li class="likes"><a href="#" id="browseCount1"></a></li>
                        <li class="comments"><a href="#" id="comments1">1</a></li>
                        <li class="icon-time"><a href="#" id="time1"></a></li>
                    </ul>
                </div>
                <!--arrow_box end-->
            </li>
            <li>
                <div class="arrow_box">
                    <div class="ti"></div>
                    <!--三角形-->
                    <div class="ci"></div>
                    <!--圆形-->
                    <h2 class="title"><a href="/" target="_blank" id="title2"></a></h2>
                    <ul class="textinfo">
                        <p id="mainText2"></p>
                    </ul>
                    <ul class="details">
                        <li class="likes"><a href="#" id="browseCount2"></a></li>
                        <li class="comments"><a href="#" id="comments2"></a></li>
                        <li class="icon-time"><a href="#" id="time2"></a></li>
                    </ul>
                </div>
                <!--arrow_box end-->
            </li>
            <li>
                <div class="arrow_box">
                    <div class="ti"></div>
                    <!--三角形-->
                    <div class="ci"></div>
                    <!--圆形-->
                    <h2 class="title"><a href="/" target="_blank" id="title3"></a></h2>
                    <ul class="textinfo">
                        <p id="mainText3"></p>
                    </ul>
                    <ul class="details">
                        <li class="likes"><a href="#" id="browseCount3"></a></li>
                        <li class="comments"><a href="#" id="comments3"></a></li>
                        <li class="icon-time"><a href="#" id="time3"></a></li>
                    </ul>
                </div>
                <!--arrow_box end-->
            </li>
            <li>
                <div class="arrow_box">
                    <div class="ti"></div>
                    <!--三角形-->
                    <div class="ci"></div>
                    <!--圆形-->
                    <h2 class="title"><a href="/" target="_blank" id="title4"></a></h2>
                    <ul class="textinfo">
                        <p id="mainText4"></p>
                    </ul>
                    <ul class="details">
                        <li class="likes"><a href="#" id="browseCount4"></a></li>
                        <li class="comments"><a href="#" id="comments4"></a></li>
                        <li class="icon-time"><a href="#" id="time4"></a></li>
                    </ul>
                </div>
                <!--arrow_box end-->
            </li>
        </ul>
        <!--bloglist end-->
        <%--<aside>--%>
            <%--<div class="tuijian">--%>
                <%--<h2>推荐文章</h2>--%>
                <%--<ol>--%>
                    <%--<li><span><strong>1</strong></span><a href="/">有一种思念，是淡淡的幸福,一个心情一行文字</a></li>--%>
                    <%--<li><span><strong>2</strong></span><a href="/">励志人生-要做一个潇洒的女人</a></li>--%>
                    <%--<li><span><strong>3</strong></span><a href="/">女孩都有浪漫的小情怀――浪漫的求婚词</a></li>--%>
                    <%--<li><span><strong>4</strong></span><a href="/">Green绿色小清新的夏天-个人博客模板</a></li>--%>
                    <%--<li><span><strong>5</strong></span><a href="/">女生清新个人博客网站模板</a></li>--%>
                    <%--<li><span><strong>6</strong></span><a href="/">Wedding-婚礼主题、情人节网站模板</a></li>--%>
                    <%--<li><span><strong>7</strong></span><a href="/">Column 三栏布局 个人网站模板</a></li>--%>
                    <%--<li><span><strong>8</strong></span><a href="/">时间煮雨-个人网站模板</a></li>--%>
                    <%--<li><span><strong>9</strong></span><a href="/">花气袭人是酒香―个人网站模板</a></li>--%>
                <%--</ol>--%>
            <%--</div>--%>
            <%--<div class="toppic">--%>
                <%--<h2>图文并茂</h2>--%>
                <%--<ul>--%>
                    <%--<li><a href="/"><img src="images/k01.jpg">腐女不可怕，就怕腐女会画画！--%>
                        <%--<p>伤不起</p>--%>
                    <%--</a></li>--%>
                    <%--<li><a href="/"><img src="images/k02.jpg">问前任，你还爱我吗？无限戳中泪点~--%>
                        <%--<p>感兴趣</p>--%>
                    <%--</a></li>--%>
                    <%--<li><a href="/"><img src="images/k03.jpg">世上所谓幸福，就是一个笨蛋遇到一个傻瓜。--%>
                        <%--<p>喜欢</p>--%>
                    <%--</a></li>--%>
                <%--</ul>--%>
            <%--</div>--%>
            <%--<div class="clicks">--%>
                <%--<h2>热门点击</h2>--%>
                <%--<ol>--%>
                    <%--<li><span><a href="/">慢生活</a></span><a href="/">有一种思念，是淡淡的幸福,一个心情一行文字</a></li>--%>
                    <%--<li><span><a href="/">爱情美文</a></span><a href="/">励志人生-要做一个潇洒的女人</a></li>--%>
                    <%--<li><span><a href="/">慢生活</a></span><a href="/">女孩都有浪漫的小情怀――浪漫的求婚词</a></li>--%>
                    <%--<li><span><a href="/">博客模板</a></span><a href="/">Green绿色小清新的夏天-个人博客模板</a></li>--%>
                    <%--<li><span><a href="/">女生个人博客</a></span><a href="/">女生清新个人博客网站模板</a></li>--%>
                    <%--<li><span><a href="/">Wedding</a></span><a href="/">Wedding-婚礼主题、情人节网站模板</a></li>--%>
                    <%--<li><span><a href="/">三栏布局</a></span><a href="/">Column 三栏布局 个人网站模板</a></li>--%>
                    <%--<li><span><a href="/">个人网站模板</a></span><a href="/">时间煮雨-个人网站模板</a></li>--%>
                    <%--<li><span><a href="/">古典风格</a></span><a href="/">花气袭人是酒香―个人网站模板</a></li>--%>
                <%--</ol>--%>
            <%--</div>--%>
            <%--<div class="search">--%>
                <%--<form class="searchform" method="get" action="#">--%>
                    <%--<input type="text" name="s" value="Search" onfocus="this.value=''" onblur="this.value='Search'">--%>
                <%--</form>--%>
            <%--</div>--%>
            <%--<div class="viny">--%>
                <%--<dl>--%>
                    <%--<dt class="art"><img src="images/artwork.png" alt="专辑"></dt>--%>
                    <%--<dd class="icon-song"><span></span>南方姑娘</dd>--%>
                    <%--<dd class="icon-artist"><span></span>歌手：赵雷</dd>--%>
                    <%--<dd class="icon-album"><span></span>所属专辑：《赵小雷》</dd>--%>
                    <%--<dd class="icon-like"><span></span><a href="/">喜欢</a></dd>--%>
                    <%--<dd class="music">--%>
                        <%--<audio src="images/nf.mp3" controls></audio>--%>
                    <%--</dd>--%>
                    <%--<!--也可以添加loop属性 音频加载到末尾时，会重新播放-->--%>
                <%--</dl>--%>
            <%--</div>--%>
        <%--</aside>--%>
    </div>
    <!--blogs end-->
</div>
<!--mainbody end-->
<%--<footer>--%>
    <%--<div class="footer-mid">--%>
        <%--<div class="links">--%>
            <%--<h2>友情链接</h2>--%>
            <%--<ul>--%>
                <%--<li><a href="/">杨青个人博客</a></li>--%>
                <%--<li><a href="http://www.3dst.com">3DST技术服务中心</a></li>--%>
            <%--</ul>--%>
        <%--</div>--%>
        <%--<div class="visitors">--%>
            <%--<h2>最新评论</h2>--%>
            <%--<dl>--%>
                <%--<dt><img src="images/s8.jpg">--%>
                <%--<dt>--%>
                <%--<dd>DanceSmile--%>
                    <%--<time>49分钟前</time>--%>
                <%--</dd>--%>
                <%--<dd>在 <a href="http://www.yangqq.com/jstt/bj/2013-07-28/530.html" class="title">如果要学习web前端开发，需要学习什么？ </a>中评论：</dd>--%>
                <%--<dd>文章非常详细，我很喜欢.前端的工程师很少，我记得几年前yahoo花高薪招聘前端也招不到</dd>--%>
            <%--</dl>--%>
            <%--<dl>--%>
                <%--<dt><img src="images/s7.jpg">--%>
                <%--<dt>--%>
                <%--<dd>yisa--%>
                    <%--<time>2小时前</time>--%>
                <%--</dd>--%>
                <%--<dd>在 <a href="http://www.yangqq.com/news/s/2013-07-31/533.html" class="title">芭蕾女孩的心事儿</a>中评论：</dd>--%>
                <%--<dd>我手机里面也有这样一个号码存在</dd>--%>
            <%--</dl>--%>
            <%--<dl>--%>
                <%--<dt><img src="images/s6.jpg">--%>
                <%--<dt>--%>
                <%--<dd>小林博客--%>
                    <%--<time>8月7日</time>--%>
                <%--</dd>--%>
                <%--<dd>在 <a href="http://www.yangqq.com/jstt/bj/2013-06-18/285.html" class="title">如果个人博客网站再没有价值，你还会坚持吗？ </a>中评论：</dd>--%>
                <%--<dd>博客色彩丰富，很是好看</dd>--%>
            <%--</dl>--%>
        <%--</div>--%>
        <%--<section class="flickr">--%>
            <%--<h2>摄影作品</h2>--%>
            <%--<ul>--%>
                <%--<li><a href="/"><img src="images/01.jpg"></a></li>--%>
                <%--<li><a href="/"><img src="images/02.jpg"></a></li>--%>
                <%--<li><a href="/"><img src="images/03.jpg"></a></li>--%>
                <%--<li><a href="/"><img src="images/04.jpg"></a></li>--%>
                <%--<li><a href="/"><img src="images/05.jpg"></a></li>--%>
                <%--<li><a href="/"><img src="images/06.jpg"></a></li>--%>
                <%--<li><a href="/"><img src="images/07.jpg"></a></li>--%>
                <%--<li><a href="/"><img src="images/08.jpg"></a></li>--%>
                <%--<li><a href="/"><img src="images/09.jpg"></a></li>--%>
            <%--</ul>--%>
        <%--</section>--%>
    <%--</div>--%>
    <%--<div class="footer-bottom">--%>
        <%--<p>Copyright 2013 Design by <a href="http://www.yangqq.com">DanceSmile</a></p>--%>
    <%--</div>--%>
<%--</footer>--%>
<!-- jQuery仿腾讯回顶部和建议 代码开始 -->
<div id="tbox"> <a id="togbook" href="/e/tool/gbook/?bid=1"></a> <a id="gotop" href="javascript:void(0)"></a> </div>
<!-- 代码结束 -->
</body>
</html>