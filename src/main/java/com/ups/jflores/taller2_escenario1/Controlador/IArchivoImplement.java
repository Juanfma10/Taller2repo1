/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ups.jflores.taller2_escenario1.Controlador;

import com.ups.jflores.taller2_escenario1.Modelo.archivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JuanFlores
 */
public class IArchivoImplement extends IArchivo{

     private List<IArchivo> hijos = new ArrayList<IArchivo>();    
     
    @Override
    public void crear() {
       for(var hijo: this.hijos){
            hijo.crear();
        }}

    @Override
    public double getTamaño() {
         var retorno=0;
        for(var hijo: this.hijos){
            retorno+=hijo.getTamaño();
        }
        return retorno;
    }
    
    
    public void add(IArchivo figura){
        this.hijos.add(figura);
    }
    
    public void delete(IArchivo figura){
        this.hijos.remove(figura);
    }

    public List<IArchivo> getHijos() {
        return hijos;
    }

     @Override
    public String getTipo() {
       for(var hijo: this.hijos){
           return hijo.getTipo();
        }
       return null;
    }

   @Override
    public String getNombre(){
            for(var hijo: this.hijos){
             return hijo.getNombre();
         }
       return null;
}
}
