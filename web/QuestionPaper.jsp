<%-- 
    Document   : QuestionPaper
    Created on : Mar 26, 2023, 11:36:18 PM
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
          <form action=SubmitAnswer><table width = 600 border=1 cellpadding=5>
                  <%
                      
                    
                      try{
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from ques_mstr");
            db.rst = db.pstmt.executeQuery();
            int count = 1;
            while(db.rst.next()){
                %>
                 <tr bgcolor=yellow><td colspan=2><b>Ques : <%=db.rst.getString(1)%> -</b><%=db.rst.getString(2)%></td></tr>
                 <tr bgcolor=lightgrey><td><input type=radio name=opt <%=count%> value=><%=db.rst.getString(3)%></td><td><input type=radio name=opt <%=count%> value=><%=db.rst.getString(4)%></td></tr>
              <tr bgcolor=lightgrey><td><input type=radio name=opt <%=count%>  value=><%=db.rst.getString(5)%></td><td><input type=radio name=opt <%=count%>  value=><%=db.rst.getString(6)%></td></tr>
            <input type=hidden value=<%=db.rst.getString(1)%> name=qid <%=count%> >
            <%           count++;
            }
%>
           <tr bgcolor= cyan><th colspan=2><input type=submit value=SUBMIT style='width:200px; height:50px; background-color:red; color:white; font-size:32px; border-radius:8px;'></th></tr>
          </table></form></center>
<%         
        }

        catch(Exception e){
            e.printStackTrace();
        }
%>
    </body>
</html>
