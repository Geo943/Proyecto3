/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Control.Conexion;
import Modelo.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author geoffrey
 */
public class Nclienteemp extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
             Statement statement = Conexion.conn.createStatement();
            String consulta = "INSERT INTO public.clientes(\n" +
"	id, nombre, nit, direccion, telefono, contacto, \"desc\", estado, tipo)\n" +
"	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
            Cliente pd =new Cliente();
             try (PreparedStatement pst = statement.getConnection().prepareStatement(consulta))
            {     
                
                pst.setInt(1,pd.getId());
                pst.setString(2,request.getParameter("txtnombre"));
                pst.setString(3,request.getParameter("txtnit"));
                pst.setString(4,request.getParameter("txtdireccion"));
                pst.setString(5,request.getParameter("txttelefono"));
                pst.setString(6,request.getParameter("txtcontacto"));
                pst.setInt(7,Integer.parseInt(request.getParameter("txtdes")));
                pst.setString(8,request.getParameter("txtestado"));
                pst.setString(9,request.getParameter("txtTipo"));
                
                pst.execute();
                
                request.getRequestDispatcher("okc1.jsp").forward(request, response);
                
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
            Logger.getLogger(Nclienteemp.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Nclienteemp.class.getName()).log(Level.SEVERE, null, ex);
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
