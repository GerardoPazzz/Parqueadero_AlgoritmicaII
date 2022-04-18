/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parquedero.Clases;

import java.util.ArrayList;

/**
 *
 * @author Axel
 */
public class ArrayList_Parqueo {
    public static ArrayList<Parqueo> listaclientes=new ArrayList<>();   //Almacena la lista de clientes hasta ahora
    public static Cliente clienteactual=new Cliente();
    
    public static void Nuevo_Cliente_Parqueo(Cliente nuevocliente){
        int newid;
        try{
            newid=listaclientes.get(listaclientes.size()-1).getId()+1;
        }catch(IndexOutOfBoundsException ex){
            newid=0;
        }
        Parqueo parqueo= new Parqueo(newid, nuevocliente);
        listaclientes.add(parqueo);
    }
    
    public static Cliente get_Cliente_Parqueo(int id){
        for(Parqueo parqueo: listaclientes){
            if(parqueo.getId()==id)
                return parqueo.getPropietario();
        }
        //Si no encuentra el parqueo con el id elegido, lanza un error que es recogido por la Interfaz_ID_para_editar
        throw new IndexOutOfBoundsException();
    }
    
    public static int get_Indice_Parqueo(String placa){
        for (int i = 0; i < listaclientes.size(); i++) {
            if(listaclientes.get(i).getPropietario().getvehiculo().getplaca().equals(placa))
                return i;
        }
        return -1;
    }
}
