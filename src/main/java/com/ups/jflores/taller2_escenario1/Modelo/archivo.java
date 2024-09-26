/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ups.jflores.taller2_escenario1.Modelo;

import com.ups.jflores.taller2_escenario1.Controlador.IArchivo;

/**
 *
 * @author JuanFlores
 */
public class archivo extends IArchivo{
    String nombre;
    double tamaño;
    String tipo;

    
    public archivo(){}
    
    
    public archivo(String n,double t, String ti){
    this.nombre= n;
    this.tamaño=t;
    this.tipo=ti;
    }
    
    
    @Override
    public String getTipo() {
        return this.tipo;
    }

   
    
    @Override
    public String getNombre() {
        return this.nombre;
    }

   

    @Override
    public double getTamaño() {
        return this.tamaño;
    }

    @Override
    public void crear() {
    }

   

  

    
    
    
}
