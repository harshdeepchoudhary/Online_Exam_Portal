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
public class SubmitAnswer extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
           HttpSession session = request.getSession();
           String user = ""+session.getAttribute("user");
           String id[] = new String[20];
           String ans[] = new String[20];
           int i, count=1, obt=0;
           DBConnection db = new DBConnection();
           for(i=0;i<20;i++){
              id[i] = request.getParameter("id"+count);
              if(request.getParameter("opt"+count)!=null){
                  ans[i]= request.getParameter("opt"+count);
              }
              else{
                  ans[i] = "Not Submitted";
              }
              db.pstmt = db.con.prepareStatement("insert into result_mstr values(?,?,?,?)");
              db.pstmt.setString(1, user);
              db.pstmt.setString(2, id[i]);
              db.pstmt.setString(3, ans[i]);
              db.pstmt.setString(4, new java.util.Date().toString());
              db.pstmt.executeUpdate();
              db.pstmt = db.con.prepareStatement("select * from ques_mstr where qid=? and ans=?");
              db.pstmt.setString(1, id[i]);
              db.pstmt.setString(2, ans[i]);
              db.rst = db.pstmt.executeQuery();
              if(db.rst.next()){
                  obt+=10;
              }
              count++;
           }
           db.pstmt = db.con.prepareStatement("insert into result values(?,curdate(),'100',?)");
           db.pstmt.setString(1, user);
           db.pstmt.setInt(2, obt);
           i = db.pstmt.executeUpdate();
           if(i>0){
               response.sendRedirect("StudentResult.jsp");
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
