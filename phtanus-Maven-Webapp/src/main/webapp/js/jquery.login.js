/*!
 * jQuery login v1.0
 *
 * Copyright (c) 2015 Phtanus
 * http://www.phtanus.com/
 *
 * Licensed under the MIT license:
 */

$("#loginForm").submit(function(){
	var name = $("#username").val();
    console.log(name)
   
    var passwd = $(".password").val();
   

    var url = 'user/login.do'
    var data = {
      username: name,
      password: passwd
    }
    $.ajax({
        type: "POST",
        url: url,
        data: $("#loginForm").serialize(),
        dataType:'json',
        success: function(data){
            console.log(data);
            if (data['status']=='0'){
            	console.log("success");
            	//window.location.href="index.html";
            }
        }
    });

	return false;
});
/*

function checkForm(){
    var name = $("#username").val();
    //var name = $("input:[name]").val();
	alert(name)
}

 function checkFor(){
    var name = $("#username").val();
    console.log(name)
    if(name.length<=0 || name=="username"){
        alert("empty username");
    }
    var passwd = $(".password").val();
    if(passwd.length<=0 || passwd=="password"){
         alert("empty password");
    }

    var url = '/phtanus/user/login.do'
    var data = {
      username: name,
      password: passwd
    }
    $.ajax({
        type:"POST",
        url:url,
        data:data,
        success:function(data){
            console.log(data);
        }
    });
}
*/
