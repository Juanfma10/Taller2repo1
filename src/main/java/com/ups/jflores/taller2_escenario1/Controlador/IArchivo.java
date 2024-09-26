/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ups.jflores.taller2_escenario1.Controlador;

/**
 *
 * @author JuanFlores
 */
public abstract class IArchivo {
    
      private double tamaño;
      private String tipo;
      private String nombre;

    public abstract double getTamaño();
    public abstract String getTipo();
    public abstract String getNombre();
    public abstract void crear();
   
   
    
}
