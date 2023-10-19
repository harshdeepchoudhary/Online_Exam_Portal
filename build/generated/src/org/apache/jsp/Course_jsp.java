package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Course_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <title>Document</title>\n");
      out.write("    <style>\n");
      out.write("         body {\n");
      out.write("            margin: 0px;\n");
      out.write("            padding: 0px;\n");
      out.write("            background: url(Images/Student7.jpg);\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-size: 1550px 800px;\n");
      out.write("            color: white;\n");
      out.write("            font-family: 'Baloo Bhaina 2', cursive;\n");
      out.write("            background-color: rgba(0, 0, 0, 0.329);\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .navbar {\n");
      out.write("            display: inline-block;\n");
      out.write("            /* border: 3px solid white; */\n");
      out.write("            margin-left: 25%;\n");
      out.write("            margin-top: 25px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar li {\n");
      out.write("            display: inline-block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar li a {\n");
      out.write("            color: white;\n");
      out.write("            font-size: 23px;\n");
      out.write("            padding: 33px 50px;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar li a:hover {\n");
      out.write("\n");
      out.write("            color: rgb(97, 7, 7);\n");
      out.write("            font-size: 23px;\n");
      out.write("            padding: 0px 50px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border-bottom: 2px solid orange;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header style=\" background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("background-color: rgba(0, 0, 0, 0.26);\">\n");
      out.write("    <div class=\"navbar\">\n");
      out.write("        <ul>\n");
      out.write("             <li><a href=\"index.html\"> Home</a> </li>\n");
      out.write("            <li> <a href=\"Course.jsp\">Courses</a></li>\n");
      out.write("            <li><a href=\"Regisration.jsp\">Registeration</a></li>\n");
      out.write("            <li><a href=\"Contact.jsp\">Contact Us</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("        <img src=\"Images/Placement - Copy (2).png\" style=\"width: 1550px; height: 720px;\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("<div>\n");
      out.write("    <img src=\"Images/Placement - Copy.png\" alt=\"\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
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
