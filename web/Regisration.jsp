<%-- 
    Document   : Regisration
    Created on : Mar 26, 2023, 2:43:52 PM
    Author     : hhp
--%>

<%@page import="DB.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
       

    <title>Document</title>
    <style>
         body {
            margin: 0px;
            padding: 0px;
            background: url(Images/Student7.jpg);
            background-repeat: no-repeat;
            background-size: 1550px 800px;
            color: white;
            /* font-family: 'Baloo Bhaina 2', cursive; */
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
            width: 730px;
            height: 600px;
            /* border: 2px solid orange ; */
            margin-left: 400px;
            background-color:rgba(0, 0, 0, 0.918);
           
        }
        .content{
            color:white;
            font-size: 25px;
            padding-left: 100px;
            
            
        }
        .content input{
            padding: 5px 27px;
            margin: 5px;
            border-radius: 5px;
            width: 44%;
            border-radius: 2px black;
            font-size: 19px;
            /* padding-left: 80px; */
            padding-top: 10px;
        }
        .content select{
            padding: 5px 20px;
            margin: 5px;
            border-radius: 5px;
            width: 63%;
            border-radius: 4px black;
            font-size: 20px;
            /* padding-left: 80px; */
            padding-top: 10px;
        }
        
        .btn {
            margin: 5px;
            color: white;
            font-size: 20px;
            padding: 14px 80px;
            border-radius: 20px;
            margin-left: 100px;
            background-color: rgb(255, 166, 0);
          
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
 <center><h1><u>Registeration FORM</u></h1></center>
<form action="">
 <table class="content">
    <tr><td>Email ID/User</td><td>Student Name:</td></tr>

    <tr><td><input type="email" name="email"></td><td><input type="text" name="sname"></td></tr>

      <tr><td> Qualification:</td><td>Date of Birth:</td></tr>

    <tr><td><select name="qua">
        <option value="BCA">BCA</option>
        <option value="B.Tech">B.Tech</option>
        <option value="B.COM">B.Com</option>
        <option value="BBA">BBA</option>
        <option value="BSC">BSC</option>
        <option value="Diploma">Diploma</option>
        <option value="MBA">MBA</option>
        <option value="B.Voc">B.Voc</option></select></td>
        

        <td><input type="date" name=dob></td></tr>
    <tr><td>Address</td><td>Gender:</td></tr>
    <td><input type="text" name="addr"></td>
    
    <td><input type="radio" name="gender" value="male">
        <label for="male">Male</label>
        <input type="radio" name="gender" value="female">
        <label for="female">Female</label></td></tr>
    
 <tr><td>Contact</td><td>City<input type="text" name="scity"></td></tr>

    <tr><td><input type="number" name="cont"></td><td>State</td>
        <td><select name="state" >
        <option value="Andhra Pradesh">Andhra Pradesh</option>
        <option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
        <option value="Arunachal Pradesh">Arunachal Pradesh</option>
        <option value="Assam">Assam</option>
        <option value="Bihar">Bihar</option>
        <option value="Chandigarh">Chandigarh</option>
        <option value="Chhattisgarh">Chhattisgarh</option>
        <option value="Dadar and Nagar Haveli">Dadar and Nagar Haveli</option>
        <option value="Daman and Diu">Daman and Diu</option>
        <option value="Delhi">Delhi</option>
        <option value="Lakshadweep">Lakshadweep</option>
        <option value="Puducherry">Puducherry</option>
        <option value="Goa">Goa</option>
        <option value="Gujarat">Gujarat</option>
        <option value="Haryana">Haryana</option>
        <option value="Himachal Pradesh">Himachal Pradesh</option>
        <option value="Jammu and Kashmir">Jammu and Kashmir</option>
        <option value="Jharkhand">Jharkhand</option>
        <option value="Karnataka">Karnataka</option>
        <option value="Kerala">Kerala</option>
        <option value="Madhya Pradesh">Madhya Pradesh</option>
        <option value="Maharashtra">Maharashtra</option>
        <option value="Manipur">Manipur</option>
        <option value="Meghalaya">Meghalaya</option>
        <option value="Mizoram">Mizoram</option>
        <option value="Nagaland">Nagaland</option>
        <option value="Odisha">Odisha</option>
        <option value="Punjab">Punjab</option>
        <option value="Rajasthan">Rajasthan</option>
        <option value="Sikkim">Sikkim</option>
        <option value="Tamil Nadu">Tamil Nadu</option>
        <option value="Telangana">Telangana</option>
        <option value="Tripura">Tripura</option>
        <option value="Uttar Pradesh">Uttar Pradesh</option>
        <option value="Uttarakhand">Uttarakhand</option>
        <option value="West Bengal">West Bengal</option>
        </select></tr> 
        <br>
</td><td>Pin <br><input type="text" name="pin"></td>

     <tr><td>Password:</td><td>Confirm Password:</td></tr>

    <tr><td><input type="password" name=pswd></td><td><input type="password" name=cpswd></td></tr>

    
    
</table><hr>
<input type=submit class="btn" value="SUBMIT"><input type=reset class="btn" value="Reset">
</form>
</div>
<div>
    <!--<img src="Images/Placement - Copy.png" alt="">-->
</div>

</body>
</html>
<%
     try{
           String email = request.getParameter("email");
           String sname = request.getParameter("sname");
           String qua = request.getParameter("qua");
           String dob = request.getParameter("dob");
           String gender = request.getParameter("gender");
           String addr = request.getParameter("addr");
           String city = request.getParameter("scity");
           String state = request.getParameter("state");
           String pin = request.getParameter("pin");
           String cont = request.getParameter("cont");
           String pswd = request.getParameter("pswd");
           String cpswd = request.getParameter("cpswd");
           
           DBConnection db = new DBConnection();
           db.pstmt = db.con.prepareStatement("insert into stu_info values (?,?,?,?,?,?,?,?,?,?)");
           db.pstmt.setString(1,email);
           db.pstmt.setString(2,sname);
           db.pstmt.setString(3,qua);
           db.pstmt.setString(4,dob);
           db.pstmt.setString(5,gender);
           db.pstmt.setString(6,addr);
           db.pstmt.setString(7,city);
           db.pstmt.setString(8,state);
           db.pstmt.setString(9,pin);
           db.pstmt.setString(10,cont);
           int i1 = db.pstmt.executeUpdate();
           db.pstmt = db.con.prepareStatement("insert into login values(?,?,'Student')");
           db.pstmt.setString(1, email);
           db.pstmt.setString(2, pswd);
           int i2 = db.pstmt.executeUpdate();
           if(i1>0 && i2>0){
               response.sendRedirect("index.html?msg=You are Registered Successfully");
           }
           else{
               response.sendRedirect("Regisration.html?msg=Error in Registered");
           }
        }
        catch(Exception e){
          
            e.printStackTrace();
        }
    %>