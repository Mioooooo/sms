function formatJsonToSeries(data) {
    var s="";
    for (x in data) {  //遍历JSON格式的数组取元素, x代表下标
        // $("#title"+x).text(data[x].title);
        // $("#mainText"+x).text(data[x].mainText);
        // $("#browseCount"+x).text(data[x].browseCount);
        // $("#time"+x).text(data[x].time);
        // $("#comment"+x).text("0");
        // $("#title"+x).attr("href","showMainTextById?id="+data[x].id);
        // alert(data[x].lastCommentsId);
        if(data[x].lastCommentView==null){
            s=s+"  <p class=\"box\" id=\"time\">评论时间："+data[x].time+"评论人 ：<span id=\"accountName\">"+data[x].accountName+"</span></p>\n" +
                "                    <div id=\"index_view_1\">\n" +
                "                        <p>"+data[x].mainText+"</p>\n" +
                "                    </div>\n"+
                "  <a href=\"/\" onclick=\"doSomething()\">链接</a>"
        }else{
            s=s+"<p class=\"box\" id=\"time\">评论时间："+data[x].time+"评论人 ：<span id=\"accountName\">"+data[x].accountName+"</span></p>\n" +
                "                    <div id=\"index_view_1\">\n" +
                "                        <p>"+data[x].mainText+"</p>\n" +
                "                    </div>\n" +
                "                    <p id=\"index_view_3\">回复</p>\n" +
                "                    <div id=\"index_view_2\">\n" +
                "                        <p>"+data[x].lastCommentView.mainText+"</p>\n" +
                "                    </div>\n"
        }

    }
    $("#mydiv").append(s);
}
$(document).ready(function(e) {
    $.ajax({
        url:"commentTextById",
        type : "post",
        ContentType:"application/json;charset=UTF-8",
        success : function(data) {
            formatJsonToSeries(data);//对数据进行处理
        }
    });
});