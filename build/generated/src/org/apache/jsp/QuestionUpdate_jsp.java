package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DBConnection;

public final class QuestionUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");

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
                
      out.write("\n");
      out.write("                <center>\n");
      out.write("                    <h1>Update Question</h1>\n");
      out.write("                        <form action=''>\n");
      out.write("                        <table width=400 height=400 border=1 bgcolor='lightblue'>\n");
      out.write("                        <tr><td width='200'>Question ID</td><td><input type=text value=");
      out.print(id);
      out.write("\"' name=qid></td></tr>\n");
      out.write("                        <tr><td width='200'>Question</td><td><input type=text value='\"+db.rst.getString(2)+\"' name=ques></td></tr>\n");
      out.write("                        <tr><td width='200'>Option 1</td><td><input type=text value='\"+db.rst.getString(3)+\"' name=opt1></td></tr>\n");
      out.write("                        +<tr><td width='200'>Option 2</td><td><input type=text value='\"+db.rst.getString(4)+\"' name=opt2></td></tr>\n");
      out.write("                        <tr><td width='200'>Option 3</td><td><input type=text value='\"+db.rst.getString(5)+\"' name=opt3></td></tr>\n");
      out.write("                        <tr><td width='200'>Option 4</td><td><input type=text value='\"+db.rst.getString(6)+\"' name=opt4></td></tr>\n");
      out.write("                        <tr><td width='200'>Answer</td><td><input type=text value='\"+db.rst.getString(7)+\"' name=ans></td></tr>\n");
      out.write("                        <tr><td width='200'><input type=submit value=Submit name=opr></td><td><input type=reset value=Reset name=qid></td></tr>\n");
      out.write("                        </table></form></center>\n");
      out.write("                ");

            
 }
            if(request.getParameter("opr")!=null){
               
                
                DBConnection dbc = new DBConnection();
                dbc.pstmt = db.con.prepareStatement("update ques_mstr set ques=?,opt1=?,opt2=?,opt3=?,opt4=?,ans=? where qid=?");
                dbc.pstmt.setString(1, ques);
                dbc.pstmt.setString(2, opt1);
                dbc.pstmt.setString(3, opt2);
                dbc.pstmt.setString(4, opt3);
                dbc.pstmt.setString(5, opt4);
                dbc.pstmt.setString(6, ans);
                dbc.pstmt.setString(7, id);
                int i = dbc.pstmt.executeUpdate();
                if(i>0){
                    response.sendRedirect("QuestionList");
                }
                
            }
            out.println("</body></html>");
        }
        catch(Exception e){
            e.printStackTrace();
        }

      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
