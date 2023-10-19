/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apps;

import DB.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hhp
 */
public class ChangePasswordConf extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        try{
            DBConnection db = new DBConnection();
            String opswd = request.getParameter("opswd");
            String npswd = request.getParameter("npswd");
            String cpswd = request.getParameter("cpswd");
             
            db.pstmt = db.con.prepareStatement("select * from login where password=? and usertype='admin'");
            db.pstmt.setString(1, opswd);
            db.rst = db.pstmt.executeQuery();
           if(db.rst.next()){
               if(npswd.equals(cpswd)){
                   db.pstmt = db.con.prepareStatement("update login set password=? where usertype='admin'");
                   db.pstmt.setString(1, npswd);
                   int i = db.pstmt.executeUpdate();
                   if(i>0){
                        HttpSession session=request.getSession();
                        session.setAttribute(npswd, "usertype");
                        response.sendRedirect("AdminLogin.jsp?msg=Password Updated Successfully");
                   }
               }
               else{
                   response.sendRedirect("msg=New and Confirm Password does not match");
               }
           }
           else{
               response.sendRedirect("msg=Error!Incorrect Old Password");
           }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
