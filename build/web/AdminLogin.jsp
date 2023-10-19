<%-- 
    Document   : AdminLogin
    Created on : Mar 26, 2023, 2:41:04 PM
    Author     : hhp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Document</title>
    <style>
        body{
            background-image: url(Images/Student6.jpg);
        }
        .box{
            background-color:black;
            
            width: 400px;
            height: 400px;
            border-radius: 5px;
            margin-top: 100px;
            box-shadow: 12px 12px yellow  ;
         }
         #login{
             color:yellow;
             padding-top: 20px;
             
         }
         .table{
             width: 300px;
             height: 180px;
            color: white;
            padding: 30px;
            font-size: 25px;
            padding: 10px;
            border: white;
                     }
                     #button{
                         width: 300px;
                         height:50px ;
                         background: yellow ;
                         border-radius: 13px;
                         font-size: 33px;
                          }
                          #td input
                          {
                         width: 300px;
                         height:43px ;
                         background: white;
                         border-radius: 13px;
                         font-size: 33px;

                          }
                        #td select
                        {
                         width: 305px;
                         height:43px ;
                         background: white;
                         border-radius: 13px;
                         font-size: 33px; 
                        }
                        
    </style>
</head> 
<body bgcolor="	#383838">
    
   <center><div class="box"><h1 id="login"> Admin Login </h1><hr>
<form action="AdminLoginConf"
    <table class="table" id="td">
      <td><select name="user"><option value="Admin">Admin</select></td></tr>
<tr><td><input type="text" name="email" placeholder="Email"></td></tr>
<tr><td><input type="password" name="pswd" placeholder="Password"></td></tr>
</table>
 <input type="submit" name="login" value="Login" id="button">
    <hr>
    <label style="color: white; margin-right: 120px; font-size: 17px;">
        <input type="checkbox" checked="checked" name="remember"> Remember me  </label> 
        <label style="color: white; font-size: 17px;">Forget Password?
      </label>
    Forget Password?
   
</form>
</div></center> </body>
</html>
