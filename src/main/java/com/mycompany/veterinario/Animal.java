/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinario;

/**
 *
 * @author ADMI
 */
public class Animal {
    public String nombre;
    public float peso;
    
    //contructores
    public Animal(){
    }

    public Animal(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
   //metodo de consulta
    public String getNombre() {
        return nombre;
    }
    
     public float getPeso() {
        return peso;
    }

    //metodos modificadores 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public String ListarDatos(){
     return "\nAnimal: "+this.getClass().getSimpleName()+"\nNombre: "+nombre+"\nPeso: "+peso;   
    }
   
}

