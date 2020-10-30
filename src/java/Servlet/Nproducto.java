/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Control.Conexion;
import Modelo.Producto;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author geoffrey
 */
public class Nproducto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
    Statement statement = Conexion.conn.createStatement();
            String consulta = "INSERT INTO public.\"Producto\"(\n" +
            "id ,nombre, marcav, modelo, cantidad, precio, estado)\n" +
            "VALUES ( ?,?, ?, ?, ?, ?, ?);";
            Producto pd =new Producto();
            try (PreparedStatement pst = statement.getConnection().prepareStatement(consulta))
            {     
                
                pst.setInt(1,pd.getId());
                pst.setString(2,request.getParameter("txtnombre"));
                pst.setString(3,request.getParameter("txtmarca"));
                pst.setString(4,request.getParameter("txtmodelo"));
                pst.setInt(5,Integer.parseInt(request.getParameter("txtcantidad")));
                pst.setInt(6,Integer.parseInt(request.getParameter("txtprecio")));
                pst.setString(7,request.getParameter("txtestado"));
                pst.execute();
                
                request.getRequestDispatcher("ok.jsp").forward(request, response);
                
        } catch (Exception ex) {
            Logger.getLogger(Nproducto.class.getName()).log(Level.SEVERE,null,ex);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Nproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Nproducto.class.getName()).log(Level.SEVERE, null, ex);
        }
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
