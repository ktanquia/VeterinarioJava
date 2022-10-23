/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinario;

/**
 *
 * @author ADMI
 */
public class Perro extends Animal{
    public String razaPerro;

    //constructores
    public Perro() {
    }

    public Perro(String nombre, float peso, String razaPerro) {
        super(nombre, peso);
        this.razaPerro=razaPerro;
    }


    //metodo consulta
    public String getRazaPerro() {
        return razaPerro;
    }

    //metodo modificador
    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }
    
    
    public String ListarDatos(){
        return super.ListarDatos()+"\nRaza Perro: "+razaPerro;
        
    }
    
}
