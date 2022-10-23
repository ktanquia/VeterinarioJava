/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinario;

/**
 *
 * @author ADMI
 */
public class Gato extends Animal{
    public String razaGato;

    //constructores
    public Gato() {
    }

    public Gato(String nombre, float peso, String razaGato) {
        super(nombre, peso);
        this.razaGato=razaGato;
    }


    //metodo consulta
    public String getRazaGato() {
        return razaGato;
    }

    //metodo modificador
    public void setRazaGato(String razaGato) {
        this.razaGato = razaGato;
    }
    
   
    public String ListarDatos(){
       return super.ListarDatos()+"\nRaza del Gato: "+razaGato+"\n";
    }
}