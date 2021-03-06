<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link href="/resources/css/cssstyle.css" rel="stylesheet" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
 

        * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: 'Noto Sans KR', sans-serif;
                
            }

        .logopadding {
            padding-left: 380px;
            padding-top: 50px;
            padding-bottom: 50px;
        }

        .logintext {
            font-family: 'Noto Sans KR', sans-serif;
            font-size: 80px;
            font-weight: 500;
        }

        .hremail {
            width: 595px;
            opacity: 100%;
            background-color: #6c6e72;
        }
        .padding107 {
            padding-left: 107px;
        }
        .paddingtop115 {
            padding-top: 115px;
        }

        .message_email {
            width: 540px;
            height: 50px;
            border: 0px solid #d6d6d6
        }
        .emailtext {
            font-family: 'Noto Sans KR', sans-serif;
            font-size: 22px;
            font-weight: 400;
            
        }
        .emailtextin {
            font-family: 'Noto Sans KR', sans-serif;
            font-size: 22px;
            font-weight: 400;
        }
        .paddingtop30 {
            padding-top: 30px;
        }
        .paddingright5 {
            padding-right: 5px;
        }

        .paddingtop109 {
            padding-top: 109px;
        }
        .boxlogin {
            font-family: 'Noto Sans KR', sans-serif;
            font-size: 24px;
            font-weight: 400;
            color: #0e7bd7;
        }

        .lingheight{
            line-height: 70px;
        }
        .paddingtop65 {
            padding-top: 65px;
        }
        .boxsignup {
            font-family: 'Noto Sans KR', sans-serif;
            font-size: 24px;
            font-weight: 300;
            color: white;
        }
        
        

        .marginbottom108 {
            margin-bottom: 108px;
        }
        .paddingbottom108 {
        	padding-bottom: 108px;
        }
        
        .logoutbox {
 			background-color: #0e7bd7;
            width: 130px; height: 50px;
            border-radius: 5px;
            
 		}
 		.logoutfont {
 			font-family: 'Noto Sans KR', sans-serif;
            font-size: 16px;
            font-weight: 300;
            color: white;
 		}
 		.loginbox {
            background-color: white;
            border: 1px solid #6c6e72;
            width: 809px; height: 758px;
            border-radius: 10px; /* ?????? ????????? ????????? ?????? */
           /*  ????????? ???????????? ???????????? ???????????? ???????????? ??? */  
           overflow:hidden;
        }
        .atagline {
        	text-decoration-line : none;
        	text-decoration : none;
        }
        .nav a{
            color: white;
            text-decoration: none;
           
        }
   
        .nav a {
            display : inline-block;
        }
        .signupbox {
        	width: 650px;
        	height: 75px;
        }
    </style>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
    $(function(){
    	let msg = '${msg}';
    	if(msg) {
    		alert(msg);
    	}
    })
    
function check_id_Sync() {
   const form = document.getElementById("login_form");
   
   const xhr = new XMLHttpRequest();
   
   xhr.open("GET", "checkId?id=" + form.id.value, false);
   //?????????????????? ?????? ???????????? ????????????
   xhr.send();
    }
        

    function login() {
    	const form = document.getElementById("login_form");
    	
    	if(form.email.value == "") {
            alert("???????????? ?????? ??? ?????????");
            form.email.focus();
            return;
         }
         
         if(form.passwd.value == "") {
            alert("??????????????? ?????? ??? ?????????");
            form.passwd.focus();
            return;
         }
         
         form.submit();//???????????? ??? ???????????? ?????? ??????????????? ????????? ????????? ????????????
    }
    function press(){ 
    	if(event.keyCode == 13){ //javascript????????? 13??? enter?????? ????????? 
    		
    		login();
    		//formname.submit(); //formname??? ???????????? ????????? form??? name?????? 
    	} 
    }
    /* $("#search input").on("keypress", function(event){
    	if(event.keyCode == 13) {
    		alert("Enter");
    	}
    });
 */
    	
   
    </script>
</head>
<body>
    <jsp:include page="include/header.jsp"></jsp:include>

    <div id = "logo" class="container logopadding">
        <a href="/" class=""><img src = "/resources/image/loginlogo.png"></a>
    </div>

    <div class="loginbox paddingbottom108 container">
		
	        <div>
	            <p class="logintext text-center">Login</p>
	        </div>
	
	<form id = "login_form" method="post" name = "formname">
	        <div class="paddingtop115 flex">
	
	            <div class="paddingright5">
	                    <img src="/resources/image/emailimg.png" class="padding107">
	            </div>
		            <div>
		                <input type="text" name="email" class="message_email emailtext" placeholder="Email" onkeypress="press()"></input>
		            </div>
		            
	        </div> 
	        <div>
	            <hr class="hremail container">
	        </div>
	
	        <div class="paddingtop30 flex">
	
	            <div class="paddingright5">
	                    <img src="/resources/image/passwordimg.png" class="padding107">
	            </div>
	            <div>
	                <input type="password" name="passwd" class="message_email emailtext" placeholder="Password" onkeypress="press()"></input>
	            </div>
	        </div> 
	        <div>
	            <hr class="hremail container">
	        </div>    
	        
			<div class = "flex-item-align-center text-center">
		        <div class="paddingtop109 ">
		
		            <button type = "button" onclick = "login()" class="buttonbox container">
		                <p class="boxlogin text-center lingheight">Login</p>
		            </button>
		            
		        </div>
		
		        <div class="paddingtop65 nav subtext">
		            <div class="buttonboxcolor container boxsignup text-center lingheight atagline">
		                <a href = "/signup" class = "signupbox">Sign up</a>
		            </div>
		        </div>
		   </div>
	    </form>    
        
    </div>
    <div class = "marginbottom108"></div>
    <jsp:include page="include/tfoot.jsp"></jsp:include>
    
</html>