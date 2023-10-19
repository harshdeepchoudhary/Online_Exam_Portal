<%-- 
    Document   : QuestionUpdate
    Created on : Mar 26, 2023, 3:19:27 PM
    Author     : hhp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DB.DBConnection"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <%
        
        try{
         String id=null;
         String ques=null;
         String opt1=null;
         String opt2=null;
         String opt3=null;
         String opt4=null;
         String ans=null;
         String qid = request.getParameter("qid");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("select * from ques_mstr where qid=?");
            db.pstmt.setString(1, qid);
            db.rst = db.pstmt.executeQuery();
            while(db.rst.next()){
                id=db.rst.getString(1);
                ques=db.rst.getString(2);
                opt1=db.rst.getString(3);
                opt2=db.rst.getString(4);
                opt3=db.rst.getString(5);
                opt4=db.rst.getString(6);
                ans=db.rst.getString(7);
                %>
                <center>
                    <h1>Update Question</h1>
                        <form action=''>
                        <table width=400 height=400 border=1 bgcolor='lightblue'>
                        <tr><td width='200'>Question ID</td><td><input type=text value=<%=id%> name=qid></td></tr>
                        <tr><td width='200'>Question</td><td><input type=text value=<%=ques%> name=ques></td></tr>
                        <tr><td width='200'>Option 1</td><td><input type=text value=<%=opt1%> name=opt1></td></tr>
                        +<tr><td width='200'>Option 2</td><td><input type=text value=<%=opt2%> name=opt2></td></tr>
                        <tr><td width='200'>Option 3</td><td><input type=text value=<%=opt3%> name=opt3></td></tr>
                        <tr><td width='200'>Option 4</td><td><input type=text value=<%=opt4%> name=opt4></td></tr>
                        <tr><td width='200'>Answer</td><td><input type=text value=<%=ans%> name=ans></td></tr>
                        <tr><td width='200'><input type=submit value=Submit name=opr></td><td><input type=reset value=Reset name=qid></td></tr>
                        </table></form></center>
                <%
                    
            
 }
            if(request.getParameter("opr")!=null){
                String idd  = request.getParameter("qid");
                String quess = request.getParameter("ques");
                String opt11 = request.getParameter("opt1");
                String opt22 = request.getParameter("opt2");
                String opt33 = request.getParameter("opt3");
                String opt44 = request.getParameter("opt4");
                String anss = request.getParameter("ans");
               
                
                DBConnection dbc = new DBConnection();
                dbc.pstmt = dbc.con.prepareStatement("update ques_mstr set ques=?,opt1=?,opt2=?,opt3=?,opt4=?,ans=? where qid=?");
                dbc.pstmt.setString(1, quess);
                dbc.pstmt.setString(2, opt11);
                dbc.pstmt.setString(3, opt22);
                dbc.pstmt.setString(4, opt33);
                dbc.pstmt.setString(5, opt44);
                dbc.pstmt.setString(6, anss);
                dbc.pstmt.setString(7, idd);
                int i = dbc.pstmt.executeUpdate();
                if(i>0){
                    response.sendRedirect("QuestionList.jsp");
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