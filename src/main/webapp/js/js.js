function b(){
	h = $(window).height();
	t = $(document).scrollTop();
	if(t > h){
		$('#gotop').show();
	}else{
		$('#gotop').hide();
	}

}
function formatJsonToSeries1(data) {

    for (x in data) {  //遍历JSON格式的数组取元素, x代表下标
        $("#title"+x).text(data[x].title);
        $("#mainText"+x).text(data[x].mainText);
        $("#browseCount"+x).text(data[x].browseCount);
        $("#time"+x).text(data[x].time);
        $("#comment"+x).text("0");
        $("#title"+x).attr("href","showMainTextById?id="+data[x].id);

    }

}
$(document).ready(function(e) {
        $.ajax({
            url:"showMainText",
            type : "post",
            ContentType:"application/json;charset=UTF-8",
            success : function(data) {
                formatJsonToSeries1(data);//对数据进行处理
            }
        });

    b();
    $('#gotop').click(function () {
        $(document).scrollTop(0);
    })
});

$(window).scroll(function(e){
	b();		
});
