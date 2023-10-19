<%@page import="DB.DBConnection"%>
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
    <form action="">
    <center>Questions</center>
    <h1>Question ID :<input type="text" name="id"></h1>
    <h1>Question : <input type="textarea" name="ques"></h1>
    <h2>Option 1 : <input type="text" name="opt"></h2>
    <h2>Option 1 : <input type="text" name="opt1"></h2>
    <h2>Option 2 : <input type="text" name="opt2"></h2>
    <h2>Option 3 : <input type="text" name="opt3"></h2>
    <h2>Option 4 : <input type="text" name="opt4"></h2>
    <h2>Answer : <input type="text" name="ans"></h2>
    <button name="bt1">submit</button>
    <button name="bt2">submit</button>
</form>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>
<%
    try{
            String ques_id=request.getParameter("id");
            String ques=request.getParameter("ques");
            String opt1=request.getParameter("opt1");
            String opt2=request.getParameter("opt2");
            String opt3=request.getParameter("opt3");
            String opt4=request.getParameter("opt4");
            String ans=request.getParameter("ans");
            DBConnection db=new DBConnection();
 db.pstmt=db.con.prepareStatement("insert into ques_mstr values(?,?,?,?,?,?,?)");
 db.pstmt.setString(1,ques_id);
 db.pstmt.setString(2,ques);
 db.pstmt.setString(3,opt1);
 db.pstmt.setString(4,opt2);
 db.pstmt.setString(5,opt3);
 db.pstmt.setString(6,opt4);
  db.pstmt.setString(7,ans);
  int i=db.pstmt.executeUpdate();
            if(i>0)
            {
              out.print("added");
               
            }
            else{
               out.print("Error");
            }
        
        
        }
         catch(Exception e)
         {
             e.printStackTrace();
         }

%>