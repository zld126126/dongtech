function checklogin(){
    $("#logincheckbtn").change(function() {
        //alert(333);
        var	isChecked = $("#logincheckbtn").prop("checked");
        alert(isChecked);
        if(isChecked){
            $("#logincheckremember").val("1");
        }else{
            $("#logincheckremember").val("0");
        }
    });
}

function login() {
    $.ajax({
        //几个参数需要注意一下
        type: "POST",//方法类型
        dataType: "json",//预期服务器返回的数据类型
        url: "/logincheck" ,//url
        data: $('#logincheck').serialize(),
        success: function (result) {
            console.log(result);//打印服务端返回的数据(调试用)
            if (result.status == 0) {
                alert(result.msg);
                window.location.href="/menu/index";
            }
            ;
        },
        error : function() {
            alert(result.msg);
        }
    });
}


