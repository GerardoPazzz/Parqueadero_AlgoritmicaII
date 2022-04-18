/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parquedero.Clases;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Axel
 */
public class Parqueo implements Serializable{
    private int id;
    private Date HoraDeEntrada;
    private long cont1,cont2;
    private Date HoraDeSalida;
    private Cliente propietarioDelVehiculo;
    
    public Parqueo(int id , Cliente propietario){
        HoraDeEntrada=new Date();
        cont1=System.currentTimeMillis();
        this.id=id;
        this.propietarioDelVehiculo=propietario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPropietario(Cliente propietario) {
        this.propietarioDelVehiculo = propietario;
    }

    public int getId() {
        return id;
    }

    public Date getHoraDeEntrada() {
        return HoraDeEntrada;
    }

    public Date getHoraDeSalida() {
        return HoraDeSalida;
    }

    public Cliente getPropietario() {
        return propietarioDelVehiculo;
    }
    
    public int getTiempoTotal(){
        HoraDeSalida=new Date();
        cont2=System.currentTimeMillis();
        int x=(int)((cont2-cont1)/3600000);
        return x;
    }
}
