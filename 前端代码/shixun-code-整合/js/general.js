/**
 * Created by Think on 2017/8/7.
 */
//�����ص���ʾ
$(function(){
    /*��ർ����*/
    $("#main").find(".main-left>.first-list>li:not(:first-child):not(.sub-list)").click(function () {
        $(this).next().slideToggle();
    });

    $(".sub-list").find("ul>li>a").click(function () {
        var href = this.getAttribute("href");
        $(".main-right").load(href);
        return false;
    });

});
