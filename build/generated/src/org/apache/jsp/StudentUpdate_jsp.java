package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DBConnection;

public final class StudentUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

        
        try{
         
         String sname=null;
         String squa=null;
         String sdob=null;
         String sgender=null;
         String saddr=null;
         String scity=null;
         String state=null;
         String pin=null;
         String scont=null;
         String email=null;
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
                
      out.write("\n");
      out.write("                <center>\n");
      out.write("                    <h1>Update Student</h1>\n");
      out.write("                        <form action=''>\n");
      out.write("                        <table width=400 height=400 border=1 bgcolor='lightblue'>\n");
      out.write("                        <tr><td width='200'>Email</td><td><input type=text value=");
      out.print(email);
      out.write(" name=email></td></tr>\n");
      out.write("                        <tr><td width='200'>Name</td><td><input type=text value=");
      out.print(sname);
      out.write(" name=sname></td></tr>\n");
      out.write("                        <tr><td width='200'>Qualification</td><td><input type=text value=");
      out.print(squa);
      out.write(" name=squa></td></tr>\n");
      out.write("                        +<tr><td width='200'>Date of Birth</td><td><input type=text value=");
      out.print(sdob);
      out.write(" name=sdob></td></tr>\n");
      out.write("                        <tr><td width='200'>Gender</td><td><input type=text value=");
      out.print(sgender);
      out.write(" name=sgender></td></tr>\n");
      out.write("                        <tr><td width='200'>Address</td><td><input type=text value=");
      out.print(saddr);
      out.write(" name=saddr></td></tr>\n");
      out.write("                        <tr><td width='200'>City</td><td><input type=text value=");
      out.print(scity);
      out.write(" name=scity></td></tr>\n");
      out.write("                        <tr><td width='200'>State</td><td><input type=text value=");
      out.print(state);
      out.write(" name=state></td></tr>\n");
      out.write("                        <tr><td width='200'>Pin</td><td><input type=text value=");
      out.print(pin);
      out.write(" name=pin></td></tr>\n");
      out.write("                        <tr><td width='200'>Pin</td><td><input type=text value=");
      out.print(pin);
      out.write(" name=pin></td></tr>\n");
      out.write("                        <tr><td width='200'>Contact</td><td><input type=text value=");
      out.print(scont);
      out.write(" name=scont></td></tr>\n");
      out.write("                        <tr><td width='200'><input type=submit value=Submit name=opr></td><td><input type=reset value=Reset name=qid></td></tr>\n");
      out.write("                        </table></form></center>\n");
      out.write("    ");

                    
            
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
                dbc.pstmt = dbc.con.prepareStatement("update stu_info set email=?,sname=?,squa=?,sdob=?,sgender=?,saddr=?,scity=?,state=?,pin=?,scount=? where email=?");
                dbc.pstmt.setString(1, emaill);
                dbc.pstmt.setString(2, snamee);
                dbc.pstmt.setString(3, squaa);
                dbc.pstmt.setString(4, sdobb);
                dbc.pstmt.setString(5, sgenderr);
                dbc.pstmt.setString(6, saddrr);
                dbc.pstmt.setString(7, scityy);
                dbc.pstmt.setString(8, statee);
                dbc.pstmt.setString(9, pinn);
                dbc.pstmt.setString(10, scontt);
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
