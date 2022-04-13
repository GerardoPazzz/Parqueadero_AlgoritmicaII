/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parquedero.Clases;

/**
 *
 * @author Isaac
 */
public abstract class Persona {
    protected String nombre; 
    protected String apellido;

    public Persona(){}
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
     //Metodos abstractos -> por implementar
    public abstract void setNombre();
    public abstract String getNombre();
    public abstract void setApellido();
    public abstract String getApellido();
}
