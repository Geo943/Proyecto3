/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Control.Datosdao;
import Modelo.Log;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author geoffrey
 */
public class LogSesin extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        Datosdao dao=new Datosdao();
        List<Log> usu= dao.getdatosusuarios();
        String user=request.getParameter("txtusuario");
         String pass=request.getParameter("txtcontra");
         for(int i=0;i<usu.size();i++){
        if (user.equals(usu.get(i).getUsuario()) && pass.equals(usu.get(i).getContraseña())){
            //System.out.println("it´s ok");
            RequestDispatcher dd=request.getRequestDispatcher("Menu.jsp");
            dd.forward(request, response);
           // response.sendRedirect("Menu.jsp");
             }
        else{
            if (i==usu.size()-1){
                out.println("<div class=\"alert alert-primary\" role=\"alert\">\n" +
                 "  Usuario o contraseña incorecta\n" +
                 "</div>");
                out.println("<a href=\"index.jsp\">intentar de nuevo</a>");
                
               // RequestDispatcher dd2=request.getRequestDispatcher("index.jsp");
                //dd2.forward(request, response);
                
                }
             }
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