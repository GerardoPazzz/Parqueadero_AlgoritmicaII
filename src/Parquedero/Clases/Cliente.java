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
public class Cliente extends Persona implements Serializable {

    public vehiculo Vehiculo;
    public long dni;

    public Cliente() {
        super();
    }

    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public void setVehiculo(vehiculo vehiculo) {
        this.Vehiculo = vehiculo;
    }

    public vehiculo getvehiculo() {
        return Vehiculo;
    }

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

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
}
