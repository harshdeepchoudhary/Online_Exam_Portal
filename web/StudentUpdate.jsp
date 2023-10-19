<%-- 
    Document   : StudentUpdate
    Created on : Mar 27, 2023, 8:43:50 AM
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
        
        try{
         String email=null;
         String sname=null;
         String squa=null;
         String sdob=null;
         String sgender=null;
         String saddr=null;
         String scity=null;
         String state=null;
         String pin=null;
         String scont=null;
         
         String getemail = request.getParameter("email");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from stu_info where email=?");
            db.pstmt.setString(1, getemail);
            db.rst = db.pstmt.executeQuery();
            while(db.rst.next()){
                email=db.rst.getString(1);
                sname=db.rst.getString(2);
                squa=db.rst.getString(3);
                sdob=db.rst.getString(4);
                sgender=db.rst.getString(5);
                saddr=db.rst.getString(6);
                scity=db.rst.getString(7);
                state=db.rst.getString(8);
                pin=db.rst.getString(9);
                scont=db.rst.getString(10);
                %>
                <center>
                    <h1>Update Student</h1>
                        <form action=''>
                        <table width=400 height=400 border=1 bgcolor='lightblue'>
                        <tr><td width='200'>Email</td><td><input type=text value=<%=email%> name=email></td></tr>
                        <tr><td width='200'>Name</td><td><input type=text value=<%=sname%> name=sname></td></tr>
                        <tr><td width='200'>Qualification</td><td><input type=text value=<%=squa%> name=squa></td></tr>
                        +<tr><td width='200'>Date of Birth</td><td><input type=text value=<%=sdob%> name=sdob></td></tr>
                        <tr><td width='200'>Gender</td><td><input type=text value=<%=sgender%> name=sgender></td></tr>
                        <tr><td width='200'>Address</td><td><input type=text value=<%=saddr%> name=saddr></td></tr>
                        <tr><td width='200'>City</td><td><input type=text value=<%=scity%> name=scity></td></tr>
                        <tr><td width='200'>State</td><td><input type=text value=<%=state%> name=state></td></tr>
                        <tr><td width='200'>Pin</td><td><input type=text value=<%=pin%> name=pin></td></tr>
                        <tr><td width='200'>Scont</td><td><input type=text value=<%=scont%> name=scont></td></tr>
              
                        <tr><td width='200'><input type=submit value=Submit name=opr></td><td><input type=reset value=Reset name=email></td></tr>
                        </table></form></center>
    <%
                    
            
 }
            if(request.getParameter("opr")!=null){
                 String emaill  = request.getParameter("email");
                 String snamee  = request.getParameter("sname");
                 String squaa  = request.getParameter("squa");
                 String sdobb  = request.getParameter("sdob");
                String sgenderr  = request.getParameter("sgender");
                 String saddrr  = request.getParameter("saddr");
                 String scityy  = request.getParameter("scity");
                 String statee  = request.getParameter("state");
                String  pinn  = request.getParameter("pin");
                String scontt  = request.getParameter("scont");
                
               
                
                DBConnection dbc = new DBConnection();
                dbc.pstmt = dbc.con.prepareStatement("update stu_info set sname=?,squa=?,sdob=?,sgender=?,sadd=?,scity=?,state=?,pin=?,scont=? where email=?");
              
                dbc.pstmt.setString(1, snamee);
                dbc.pstmt.setString(2, squaa);
                dbc.pstmt.setString(3, sdobb);
                dbc.pstmt.setString(4, sgenderr);
                dbc.pstmt.setString(5, saddrr);
                dbc.pstmt.setString(6, scityy);
                dbc.pstmt.setString(7, statee);
                dbc.pstmt.setString(8, pinn);
                dbc.pstmt.setString(9, scontt);
                 dbc.pstmt.setString(10, emaill);
                int i = dbc.pstmt.executeUpdate();
                if(i>0){
                    response.sendRedirect("StudentList.jsp?updated");
                }
                
            }
            out.println("</body></html>");
        }
        catch(Exception e){
            e.printStackTrace();
        }
%>
    </body>
</html>
