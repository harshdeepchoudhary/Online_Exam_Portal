<%-- 
    Document   : Contact
    Created on : Mar 26, 2023, 2:41:31 PM
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
         body {
            margin: 0px;
            padding: 0px;
            background: url(Images/Student7.jpg);
            background-repeat: no-repeat;
            background-size: 1550px 800px;
            color: white;
            font-family: 'Baloo Bhaina 2', cursive;
            background-color: rgba(0, 0, 0, 0.329);


        }
        .navbar {
            display: inline-block;
            /* border: 3px solid white; */
            margin-left: 25%;
            margin-top: 25px;
            border-radius: 5px;
        }

        .navbar li {
            display: inline-block;
        }

        .navbar li a {
            color: white;
            font-size: 23px;
            padding: 33px 50px;
            text-decoration: none;
        }

        .navbar li a:hover {

            color: rgb(97, 7, 7);
            font-size: 23px;
            padding: 0px 50px;
            text-decoration: none;
            border-bottom: 2px solid orange;
        }
        .container{
            width: 600px;
            height: 500px;
            border:orange;
            border-radius: 5px solid orange;
            margin-top: 100px;
            margin-left: 500px;
            margin-bottom: 100px;
            /* background-color:red; */
            font-size: 40px;
           
           display: inline-block;
        }
        
    </style>
</head>
<body>
    <header style=" background-color: rgb(0,0,0); /* Fallback color */
background-color: rgba(0, 0, 0, 0.26);">
    <div class="navbar">
        <ul>
            <li><a href="index.html"> Home</a> </li>
            <li> <a href="Course.jsp">Courses</a></li>
            <li><a href="Regisration.jsp">Registeration</a></li>
            <li><a href="Contact.jsp">Contact Us</a></li>
        </ul>
</header>
<div class="container">
 <center><h1>Contact us</h1></center>
 
</div>
<div>
    <img src="Images/Placement - Copy.png" alt="">
</div>

</body>
</html>