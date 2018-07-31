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
