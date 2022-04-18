/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parquedero.Clases;
import java.io.Serializable;

/**
 *
 * @author Isaac
 */
public abstract class Persona implements Serializable{
    protected String nombre; 
    protected String apellido;

    public Persona(){}
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
     //Metodos abstractos -> por implementar
    public abstract void setNombre(String n);
    public abstract String getNombre();
    public abstract void setApellido(String a);
    public abstract String getApellido();
}
