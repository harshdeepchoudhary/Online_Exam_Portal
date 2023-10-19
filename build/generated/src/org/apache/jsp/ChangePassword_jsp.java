package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ChangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang='en'>\n");
      out.write("<head>\n");
      out.write("    <meta charset='UTF-8'>\n");
      out.write("    <meta name='viewport' content='width=device-width, initial-scale=1.0'>\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link href='https://fonts.googleapis.com/css2?family=Baloo+Bhai+2:wght@800&family=Baloo+Bhaina+2:wght@800&display=swap' rel='stylesheet'>\n");
      out.write("    <style>\n");
      out.write("      \n");
      out.write("        body{\n");
      out.write("            font-family: 'Baloo Bhai 2', cursive;\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 0px;\n");
      out.write("            background: url(Images/Student7.jpg);\n");
      out.write("            background-repeat:no-repeat ;\n");
      out.write("           background-size: 1550px 800px;  \n");
      out.write("           font-family: Baloo Bhai;  \n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        .navbar\n");
      out.write("        {\n");
      out.write("         display: inline-block;\n");
      out.write("         border: 3px solid white;\n");
      out.write("        margin-left: 0%;\n");
      out.write("         margin-top: 25px;\n");
      out.write("         border-radius: 5px;\n");
      out.write("         color: red;\n");
      out.write("        }\n");
      out.write("        .navbar li{\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("        .navbar li a{\n");
      out.write("            color: black;\n");
      out.write("            font-size:23px;\n");
      out.write("            padding: 15px;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        .navbar li a:hover{\n");
      out.write("         \n");
      out.write("           color: gold;\n");
      out.write("           font-size:23px;\n");
      out.write("           padding:15px;\n");
      out.write("           text-decoration: none; \n");
      out.write("       }\n");
      out.write("     \n");
      out.write("\n");
      out.write("    \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class='navbar'>\n");
      out.write("       <ul>\n");
      out.write("       <li><a href=''> Student List</a> </li>\n");
      out.write("       <li><a href=''>Add Question</a></li>\n");
      out.write("       <li><a href=''>Question List</a></li>\n");
      out.write("      <li> <a href=''>Update Question</a></li>\n");
      out.write("      <li><a href=''>Result</a></li>\n");
      out.write("       <li><a href=''>View Feedback</a></li>\n");
      out.write("    <li><a href='ChangePassword'>Change Password</a></li>\n");
      out.write("    <li><a href='LogOut'>Log Out</a></li>    </ul>\n");
      out.write("   </div><hr>\n");
      out.write("   </header>\n");
      out.write("         <form action='ChangePasswordConf'><center><h1>Change Password</h1></center><center>\n");
      out.write("            <table border=1 height=300 width=500 cellspacing=0 cellpadding=5 style='background-color: yellow; opacity:0.9;'>\n");
      out.write("                    <tr><th>Old Password</th><td><input type='password' name='opswd'></td></tr>\n");
      out.write("                    <tr><th>New Password</th><td><input type='password' name='npswd'></td></tr>\n");
      out.write("                    <tr><th>Confirm Password</th><td><input type='password' name='cpswd'></td></tr>\n");
      out.write("                    <tr><td><button style='background-color:yellowgreen; margin-left:50px; padding:5px; border-radius: 5px;'>Submit</button></td>\n");
      out.write("                    <td><button style='background-color:red; margin-left:50px; padding:5px; border-radius: 5px;'>Reset</button></td></tr>\n");
      out.write("           </table></center></form>\");\n");
      out.write("            </body>\n");
      out.write("            </html>");
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
