<%-- 
    Document   : QuestionList
    Created on : Mar 26, 2023, 2:42:47 PM
    Author     : hhp
--%>

<%@page import="DB.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Document</title>
</head>
<body>
    <center><h1>Student list</h1></center>
    <div style="width: 1500px;height: 800px;background-color: white;border: 2px solid red;">
    <table width="1200" border="1px" cellspacing="0" cellpadding="0">
        <tr bgcolor="cyan"><th>email</th><th>sname</th><th>squa</th><th>sdob</th><th>sgender</th><th>saddr</th><th>scity/th><th>state</th><th>pin</th><th>scont</th>
        <%
             try{
         DBConnection db = new DBConnection();
          db.pstmt = db.con.prepareStatement("select * from stu_info");
          db.rst = db.pstmt.executeQuery();
          while(db.rst.next()){
              out.println("<tr><td>"+db.rst.getString(1)+"</td><td>"+db.rst.getString(2)+"</td><td>"+db.rst.getString(3)+"</td>");
               out.println("<td>"+db.rst.getString(4)+"</td><td>"+db.rst.getString(5)+"</td>");
                out.println("<td>"+db.rst.getString(6)+"</td><td>"+db.rst.getString(7)+"</td><td>"+db.rst.getString(8)+"</td><td>"+db.rst.getString(9)+"</td><td>"+db.rst.getString(10)+"</td></tr>");
          }
        }
        catch(Exception e){
            e.printStackTrace();
        }%>
    
    </table></div>
   
    
</body>
</html>
