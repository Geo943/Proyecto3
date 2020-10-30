/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author geoffrey
 */
public class Log {
    int id;
    private String usuario;
    private String nombreU;
    private String contraseña;

    public Log( String usuario, String nombreU, String contraseña) {
        this.id = id++;
        this.usuario = usuario;
        this.nombreU = nombreU;
        this.contraseña = contraseña;
    }

    public Log(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }
    
    
}
