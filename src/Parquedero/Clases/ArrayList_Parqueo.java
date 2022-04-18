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
    private static ArrayList<Parqueo> listaclientes=new ArrayList<>();   //Almacena la lista de clientes hasta ahora
    public static Cliente clienteactual;
    
    public static void Nuevo_Cliente_Parqueo(Cliente nuevocliente){
        Parqueo parqueo= new Parqueo(listaclientes.size(), nuevocliente);
        listaclientes.add(parqueo);
    }
    
    public static Parqueo Editar_Cliente(int id){
        Parqueo parqueoeditar=listaclientes.get(id);
        return parqueoeditar;
    }
    

    
}
