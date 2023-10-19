<%-- 
    Document   : ChangePassword
    Created on : Mar 27, 2023, 11:43:00 AM
    Author     : hhp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang='en'>
<head>
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <title>Document</title>
    <link href='https://fonts.googleapis.com/css2?family=Baloo+Bhai+2:wght@800&family=Baloo+Bhaina+2:wght@800&display=swap' rel='stylesheet'>
    <style>
      
        body{
            font-family: 'Baloo Bhai 2', cursive;
            margin: 0px;
            padding: 0px;
            background: url(Images/Student7.jpg);
            background-repeat:no-repeat ;
           background-size: 1550px 800px;  
           font-family: Baloo Bhai;  
           
        }
        .navbar
        {
         display: inline-block;
         border: 3px solid white;
        margin-left: 0%;
         margin-top: 25px;
         border-radius: 5px;
         color: red;
        }
        .navbar li{
            display: inline-block;
        }
        .navbar li a{
            color: black;
            font-size:23px;
            padding: 15px;
            text-decoration: none;
        }
        .navbar li a:hover{
         
           color: gold;
           font-size:23px;
           padding:15px;
           text-decoration: none; 
       }
     

    
    </style>
</head>
<body>
    <header>
        <div class='navbar'>
       <ul>
       <li><a href=''> Student List</a> </li>
       <li><a href=''>Add Question</a></li>
       <li><a href=''>Question List</a></li>
      <li> <a href=''>Update Question</a></li>
      <li><a href=''>Result</a></li>
       <li><a href=''>View Feedback</a></li>
    <li><a href='ChangePassword'>Change Password</a></li>
    <li><a href='LogOut'>Log Out</a></li>    </ul>
   </div><hr>
   </header>
         <form action='ChangePasswordConf'><center><h1>Change Password</h1></center><center>
            <table border=1 height=300 width=500 cellspacing=0 cellpadding=5 style='background-color: yellow; opacity:0.9;'>
                    <tr><th>Old Password</th><td><input type='password' name='opswd'></td></tr>
                    <tr><th>New Password</th><td><input type='password' name='npswd'></td></tr>
                    <tr><th>Confirm Password</th><td><input type='password' name='cpswd'></td></tr>
                    <tr><td><button style='background-color:yellowgreen; margin-left:50px; padding:5px; border-radius: 5px;'>Submit</button></td>
                    <td><button style='background-color:red; margin-left:50px; padding:5px; border-radius: 5px;'>Reset</button></td></tr>
           </table></center></form>");
            </body>
            </html>