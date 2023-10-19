package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DBConnection;

public final class StudentResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("      body {\n");
      out.write("          margin: 0px;\n");
      out.write("          padding: 0px;\n");
      out.write("          background: url(Images/1.png);\n");
      out.write("          background-repeat: no-repeat;\n");
      out.write("          background-size: 1550px 800px;\n");
      out.write("          color: white;\n");
      out.write("          font-family: 'Baloo Bhaina 2', cursive;\n");
      out.write("           background-color: rgba(0, 0, 0, 0.329);\n");
      out.write("           }\n");
      out.write("\n");
      out.write("                </style>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("        <body><center>\");\n");
      out.write("          <h1>Marksheet Statement</h1>\n");
      out.write("          ");

              try{
              HttpSession s = request.getSession();
            String user = ""+s.getAttribute("user");
            DBConnection db = new DBConnection();
            db.pstmt = db.con.prepareStatement("SELECT stu_info.sname,stu_info.sdob,stu_info.sgender,stu_info.squa,result.edate,result.max,result.obt FROM stu_info,result WHERE stu_info.email=result.sid AND stu_info.email=?");
            db.pstmt.setString(1, user);
            db.rst = db.pstmt.executeQuery();
            
      out.write("\n");
      out.write("            <table width=500 height=500 bgcolor=blue border=1>\n");
      out.write("                ");

            if(db.rst.next()){ 
                
      out.write("\n");
      out.write("            <tr><td width=250>Student Name</td><td>");
      out.print(db.rst.getString(1));
      out.write("</td></tr>\n");
      out.write("                <tr><td width=250>DOB</td><td>");
      out.print(db.rst.getString(2));
      out.write("</td></tr>\n");
      out.write("               <tr><td width=250>Gender</td><td>");
      out.print(db.rst.getString(3));
      out.write("</td></tr>\n");
      out.write("              <tr><td width=250>Qualification</td><td>");
      out.print(db.rst.getString(4));
      out.write("</td></tr>\n");
      out.write("              <tr><td width=250>Exam Date</td><td>");
      out.print(db.rst.getString(5));
      out.write("</td></tr>\n");
      out.write("              <tr><td width=250>Maximum Marks</td><td>");
      out.print(db.rst.getString(6));
      out.write("</td></tr>\n");
      out.write("             <tr><td width=250>Obtained Marks</td><td>");
      out.print(db.rst.getString(7));
      out.write("</td></tr>\n");
      out.write("        </table></center></body>\n");
      out.write("      </html>\n");
      out.write("             ");

            
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
              
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
