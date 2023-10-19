package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DBConnection;

public final class AddQuestion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form action=\"\">\n");
      out.write("    <center>Questions</center>\n");
      out.write("    <h1>Question ID :<input type=\"text\" name=\"id\"></h1>\n");
      out.write("    <h1>Question : <input type=\"textarea\" name=\"ques\"></h1>\n");
      out.write("    <h2>Option 1 : <input type=\"text\" name=\"opt\"></h2>\n");
      out.write("    <h2>Option 1 : <input type=\"text\" name=\"opt1\"></h2>\n");
      out.write("    <h2>Option 2 : <input type=\"text\" name=\"opt2\"></h2>\n");
      out.write("    <h2>Option 3 : <input type=\"text\" name=\"opt3\"></h2>\n");
      out.write("    <h2>Option 4 : <input type=\"text\" name=\"opt4\"></h2>\n");
      out.write("    <h2>Answer : <input type=\"text\" name=\"ans\"></h2>\n");
      out.write("    <button name=\"bt1\">submit</button>\n");
      out.write("    <button name=\"bt2\">submit</button>\n");
      out.write("</form>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.slim.min.js\" integrity=\"sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js\" integrity=\"sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");

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


    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
