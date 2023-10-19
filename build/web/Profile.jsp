<%-- 
    Document   : Profile
    Created on : Mar 27, 2023, 11:56:39 AM
    Author     : hhp
--%>

<%@page import="DB.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try
            {
         String sname = request.getParameter("sname");
                        DBConnection db = new DBConnection();
          db.pstmt = db.con.prepareStatement("select sname from stu_info");
          db.rst = db.pstmt.executeQuery();
          while(db.rst.next()){
              out.println(db.rst.getString(1));
               
          } }
         
       catch(Exception e)
       {
            e.printStackTrace();
        }
           
      
    %>
    </body>
</html>
