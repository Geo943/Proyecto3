/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Cliente;
import Modelo.Empresa;
import Modelo.Individual;
import Modelo.Log;
import Modelo.Producto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author geoffrey
 */
public class Datosdao {

    public Datosdao() {
    }
    
public List<Log> getdatosusuarios() {
        List<Log> usuarios = new ArrayList<Log>();
        try {
            Statement statement = Conexion.conn.createStatement();
            String consulta = "Select usuario,contraseña from usuarios";
            ResultSet rs1 = statement.executeQuery(consulta);
            while (rs1.next()) {
                usuarios.add(new Log(rs1.getString("usuario"), rs1.getString("contraseña")));
                
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        return usuarios;
    }

public List<Producto> getproductos() {
        List<Producto> productos = new ArrayList<Producto>();
        try {
            Statement statement2 = Conexion.conn.createStatement();
            String consulta2 = "select * from public.\"Producto\"";
            ResultSet rs1 = statement2.executeQuery(consulta2);
            while (rs1.next()) {
                productos.add(new Producto(rs1.getString("nombre"),rs1.getString("marcav"),rs1.getString("modelo"),
                                           rs1.getInt("cantidad"),rs1.getDouble("precio"),rs1.getString("estado")));
                
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        return productos;
    }

public List<Individual> getclientes() {
        List<Individual> clientes = new ArrayList<Individual>();
        try {
            Statement statement = Conexion.conn.createStatement();
            String consulta = "select * from public.\"clientes\" where tipo='individual'";
            ResultSet rs1 = statement.executeQuery(consulta);
            while (rs1.next()) {
               clientes.add(new Individual(rs1.getString("dpi"),rs1.getString("nombre"),rs1.getString("nit"),rs1.getString("direccion"),rs1.getString("telefono"),rs1.getString("estado"),rs1.getString("tipo")));
                 //clientes.add(new Empresa(rs1.getString("contacto"),rs1.getInt("desc"),rs1.getString("nombre"),rs1.getString("nit"),rs1.getString("direccion"),rs1.getString("telefono"),rs1.getString("estado"),rs1.getString("tipo")));
                
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        return clientes;
    }

public List<Empresa> getclientesE() {
        List<Empresa> clientes = new ArrayList<Empresa>();
        try {
            Statement statement = Conexion.conn.createStatement();
            String consulta = "select * from public.\"clientes\" where tipo='Empresa'";
            ResultSet rs1 = statement.executeQuery(consulta);
            while (rs1.next()) {
               //clientes.add(new Individual(rs1.getString("dpi"),rs1.getString("nombre"),rs1.getString("nit"),rs1.getString("direccion"),rs1.getString("telefono"),rs1.getString("estado"),rs1.getString("tipo")));
                 clientes.add(new Empresa(rs1.getString("contacto"),rs1.getInt("desc"),rs1.getString("nombre"),rs1.getString("nit"),rs1.getString("direccion"),rs1.getString("telefono"),rs1.getString("estado"),rs1.getString("tipo")));
                
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        return clientes;
    }

//public List<Producto> getEproductos(int cod) {
//    
//        List<Producto> productos = new ArrayList<Producto>();
//        try {
//            Statement statement2 = Conexion.conn.createStatement();
//            String consulta2 = "select * from public.\"Producto\" where id='"+cod+"'";
//            ResultSet rs1 = statement2.executeQuery(consulta2);
//            while (rs1.next()) {
//                productos.add(new Producto(rs1.getString("nombre"),rs1.getString("marcav"),rs1.getString("modelo"),
//                                           rs1.getInt("cantidad"),rs1.getDouble("precio"),rs1.getString("estado")));
//                
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//
//        }
//        return productos;
//    }



}