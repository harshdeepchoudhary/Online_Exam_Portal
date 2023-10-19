<%-- 
    Document   : StudentResult
    Created on : Mar 27, 2023, 11:12:33 AM
    Author     : hhp
--%>

<%@page import="DB.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
      body {
          margin: 0px;
          padding: 0px;
          background: url(Images/1.png);
          background-repeat: no-repeat;
          background-size: 1550px 800px;
          color: white;
          font-family: 'Baloo Bhaina 2', cursive;
           background-color: rgba(0, 0, 0, 0.329);
           }

                </style>
    </head>
   
        <body><center>");
          <h1>Marksheet Statement</h1>
          <%
              try{
              HttpSession s = request.getSession();
            String user = ""+s.getAttribute("user");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("SELECT stu_info.sname,stu_info.sdob,stu_info.sgender,stu_info.squa,result.edate,result.max,result.obt FROM stu_info,result WHERE stu_info.email=result.sid AND stu_info.email=?");
            db.pstmt.setString(1, user);
            db.rst = db.pstmt.executeQuery();
            %>
            <table width=500 height=500 bgcolor=blue border=1>
                <%
            if(db.rst.next()){ 
                %>
            <tr><td width=250>Student Name</td><td><%=db.rst.getString(1)%></td></tr>
                <tr><td width=250>DOB</td><td><%=db.rst.getString(2)%></td></tr>
               <tr><td width=250>Gender</td><td><%=db.rst.getString(3)%></td></tr>
              <tr><td width=250>Qualification</td><td><%=db.rst.getString(4)%></td></tr>
              <tr><td width=250>Exam Date</td><td><%=db.rst.getString(5)%></td></tr>
              <tr><td width=250>Maximum Marks</td><td><%=db.rst.getString(6)%></td></tr>
             <tr><td width=250>Obtained Marks</td><td><%=db.rst.getString(7)%></td></tr>
        </table></center></body>
      </html>
             <%
            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
              %>
    </body>
</html>
