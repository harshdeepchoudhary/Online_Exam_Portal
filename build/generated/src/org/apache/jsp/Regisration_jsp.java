package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DBConnection;

public final class Regisration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("       \n");
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
      out.write("            /* font-family: 'Baloo Bhaina 2', cursive; */\n");
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
      out.write("        .container{\n");
      out.write("            width: 730px;\n");
      out.write("            height: 600px;\n");
      out.write("            /* border: 2px solid orange ; */\n");
      out.write("            margin-left: 400px;\n");
      out.write("            background-color:rgba(0, 0, 0, 0.918);\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        .content{\n");
      out.write("            color:white;\n");
      out.write("            font-size: 25px;\n");
      out.write("            padding-left: 100px;\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .content input{\n");
      out.write("            padding: 5px 27px;\n");
      out.write("            margin: 5px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            width: 44%;\n");
      out.write("            border-radius: 2px black;\n");
      out.write("            font-size: 19px;\n");
      out.write("            /* padding-left: 80px; */\n");
      out.write("            padding-top: 10px;\n");
      out.write("        }\n");
      out.write("        .content select{\n");
      out.write("            padding: 5px 20px;\n");
      out.write("            margin: 5px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            width: 63%;\n");
      out.write("            border-radius: 4px black;\n");
      out.write("            font-size: 20px;\n");
      out.write("            /* padding-left: 80px; */\n");
      out.write("            padding-top: 10px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .btn {\n");
      out.write("            margin: 5px;\n");
      out.write("            color: white;\n");
      out.write("            font-size: 20px;\n");
      out.write("            padding: 14px 80px;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            margin-left: 100px;\n");
      out.write("            background-color: rgb(255, 166, 0);\n");
      out.write("          \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header style=\" background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("background-color: rgba(0, 0, 0, 0.26);\">\n");
      out.write("    <div class=\"navbar\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"Home.html\"> Home</a> </li>\n");
      out.write("            <li> <a href=\"Course.html\">Courses</a></li>\n");
      out.write("            <li><a href=\"Registeration.html\">Registeration</a></li>\n");
      out.write("            <li><a href=\"Contact.html\">Contact Us</a></li>\n");
      out.write("        </ul>\n");
      out.write("</header>\n");
      out.write("<div class=\"container\">\n");
      out.write(" <center><h1><u>Registeration FORM</u></h1></center>\n");
      out.write("<form action=\"\">\n");
      out.write(" <table class=\"content\">\n");
      out.write("    <tr><td>Email ID/User</td><td>Student Name:</td></tr>\n");
      out.write("\n");
      out.write("    <tr><td><input type=\"email\" name=\"email\"></td><td><input type=\"text\" name=\"sname\"></td></tr>\n");
      out.write("\n");
      out.write("      <tr><td> Qualification:</td><td>Date of Birth:</td></tr>\n");
      out.write("\n");
      out.write("    <tr><td><select name=\"qua\">\n");
      out.write("        <option value=\"BCA\">BCA</option>\n");
      out.write("        <option value=\"B.Tech\">B.Tech</option>\n");
      out.write("        <option value=\"B.COM\">B.Com</option>\n");
      out.write("        <option value=\"BBA\">BBA</option>\n");
      out.write("        <option value=\"BSC\">BSC</option>\n");
      out.write("        <option value=\"Diploma\">Diploma</option>\n");
      out.write("        <option value=\"MBA\">MBA</option>\n");
      out.write("        <option value=\"B.Voc\">B.Voc</option></select></td>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <td><input type=\"date\" name=dob></td></tr>\n");
      out.write("    <tr><td>Address</td><td>Gender:</td></tr>\n");
      out.write("    <td><input type=\"text\" name=\"addr\"></td>\n");
      out.write("    \n");
      out.write("    <td><input type=\"radio\" name=\"gender\" value=\"male\">\n");
      out.write("        <label for=\"male\">Male</label>\n");
      out.write("        <input type=\"radio\" name=\"gender\" value=\"female\">\n");
      out.write("        <label for=\"female\">Female</label></td></tr>\n");
      out.write("    \n");
      out.write(" <tr><td>Contact</td><td>City<input type=\"text\" name=\"scity\"></td></tr>\n");
      out.write("\n");
      out.write("    <tr><td><input type=\"number\" name=\"cont\"></td><td>State</td>\n");
      out.write("        <td><select name=\"state\" >\n");
      out.write("        <option value=\"Andhra Pradesh\">Andhra Pradesh</option>\n");
      out.write("        <option value=\"Andaman and Nicobar Islands\">Andaman and Nicobar Islands</option>\n");
      out.write("        <option value=\"Arunachal Pradesh\">Arunachal Pradesh</option>\n");
      out.write("        <option value=\"Assam\">Assam</option>\n");
      out.write("        <option value=\"Bihar\">Bihar</option>\n");
      out.write("        <option value=\"Chandigarh\">Chandigarh</option>\n");
      out.write("        <option value=\"Chhattisgarh\">Chhattisgarh</option>\n");
      out.write("        <option value=\"Dadar and Nagar Haveli\">Dadar and Nagar Haveli</option>\n");
      out.write("        <option value=\"Daman and Diu\">Daman and Diu</option>\n");
      out.write("        <option value=\"Delhi\">Delhi</option>\n");
      out.write("        <option value=\"Lakshadweep\">Lakshadweep</option>\n");
      out.write("        <option value=\"Puducherry\">Puducherry</option>\n");
      out.write("        <option value=\"Goa\">Goa</option>\n");
      out.write("        <option value=\"Gujarat\">Gujarat</option>\n");
      out.write("        <option value=\"Haryana\">Haryana</option>\n");
      out.write("        <option value=\"Himachal Pradesh\">Himachal Pradesh</option>\n");
      out.write("        <option value=\"Jammu and Kashmir\">Jammu and Kashmir</option>\n");
      out.write("        <option value=\"Jharkhand\">Jharkhand</option>\n");
      out.write("        <option value=\"Karnataka\">Karnataka</option>\n");
      out.write("        <option value=\"Kerala\">Kerala</option>\n");
      out.write("        <option value=\"Madhya Pradesh\">Madhya Pradesh</option>\n");
      out.write("        <option value=\"Maharashtra\">Maharashtra</option>\n");
      out.write("        <option value=\"Manipur\">Manipur</option>\n");
      out.write("        <option value=\"Meghalaya\">Meghalaya</option>\n");
      out.write("        <option value=\"Mizoram\">Mizoram</option>\n");
      out.write("        <option value=\"Nagaland\">Nagaland</option>\n");
      out.write("        <option value=\"Odisha\">Odisha</option>\n");
      out.write("        <option value=\"Punjab\">Punjab</option>\n");
      out.write("        <option value=\"Rajasthan\">Rajasthan</option>\n");
      out.write("        <option value=\"Sikkim\">Sikkim</option>\n");
      out.write("        <option value=\"Tamil Nadu\">Tamil Nadu</option>\n");
      out.write("        <option value=\"Telangana\">Telangana</option>\n");
      out.write("        <option value=\"Tripura\">Tripura</option>\n");
      out.write("        <option value=\"Uttar Pradesh\">Uttar Pradesh</option>\n");
      out.write("        <option value=\"Uttarakhand\">Uttarakhand</option>\n");
      out.write("        <option value=\"West Bengal\">West Bengal</option>\n");
      out.write("        </select></tr> \n");
      out.write("        <br>\n");
      out.write("</td><td>Pin <br><input type=\"text\" name=\"pin\"></td>\n");
      out.write("\n");
      out.write("     <tr><td>Password:</td><td>Confirm Password:</td></tr>\n");
      out.write("\n");
      out.write("    <tr><td><input type=\"password\" name=pswd></td><td><input type=\"password\" name=cpswd></td></tr>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</table><hr>\n");
      out.write("<input type=submit class=\"btn\" value=\"SUBMIT\"><input type=reset class=\"btn\" value=\"Reset\">\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("    <!--<img src=\"Images/Placement - Copy.png\" alt=\"\">-->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");

     try{
           String email = request.getParameter("email");
           String sname = request.getParameter("sname");
           String qua = request.getParameter("qua");
           String dob = request.getParameter("dob");
           String gender = request.getParameter("gender");
           String addr = request.getParameter("addr");
           String city = request.getParameter("scity");
           String state = request.getParameter("state");
           String pin = request.getParameter("pin");
           String cont = request.getParameter("cont");
           String pswd = request.getParameter("pswd");
           String cpswd = request.getParameter("cpswd");
           
           DBConnection db = new DBConnection();
           db.pstmt = db.con.prepareStatement("insert into stu_info values (?,?,?,?,?,?,?,?,?,?)");
           db.pstmt.setString(1,email);
           db.pstmt.setString(2,sname);
           db.pstmt.setString(3,qua);
           db.pstmt.setString(4,dob);
           db.pstmt.setString(5,gender);
           db.pstmt.setString(6,addr);
           db.pstmt.setString(7,city);
           db.pstmt.setString(8,state);
           db.pstmt.setString(9,pin);
           db.pstmt.setString(10,cont);
           int i1 = db.pstmt.executeUpdate();
           db.pstmt = db.con.prepareStatement("insert into login values(?,?,'Student')");
           db.pstmt.setString(1, email);
           db.pstmt.setString(2, pswd);
           int i2 = db.pstmt.executeUpdate();
           if(i1>0 && i2>0){
               response.sendRedirect("index.html?msg=You are Registered Successfully");
           }
           else{
               response.sendRedirect("Regisration.html?msg=Error in Registered");
           }
        }
        catch(Exception e){
          
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
