/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parquedero.Clases;

/**
 *
 * @author Isaac
 */
public class Cliente extends Persona{
    //public Vehiculo movil;
    
    public Cliente(){
        super();
    }
    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
    }
    
    /*
       setMovil 
       getMovil
    */
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getApellido() {
        return this.apellido;
    }
    
}
