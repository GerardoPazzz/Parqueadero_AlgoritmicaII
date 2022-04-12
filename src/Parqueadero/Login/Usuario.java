/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parqueadero.Login;
import java.io.*;

/**
 *
 * @author Pc
 */
public class Usuario implements Serializable{

    private String nombre;
    private String clave;
    private String rol;

    public Usuario(String nombre, String clave, String rol) {
        this.nombre = nombre;
        this.clave = clave;
        this.rol = rol;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


}
