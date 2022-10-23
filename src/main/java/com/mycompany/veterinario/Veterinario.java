/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.veterinario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMI
 */
public class Veterinario {
     private final List<Animal>lista; 
     
     public Veterinario(){
         lista=new ArrayList<>();
     }
     
     public void registrar(Animal a){
         lista.add(a);
     }
     
     public List<Animal>getLista(){
         return lista;
         
     }
     
     //MENU
     static Scanner teclado = new Scanner (System.in);
     static Veterinario v1=new Veterinario();
     
     public static void salir (){
         System.out.println("\n PROGRAMA FINAIZADO");
         System.exit(0);
     } 
     
     public static void errorOpcion(){
         System.out.println("\n OPCION INCORRECTA");
         menu();
     }
     
     public static void listar(){
         for(Animal a:v1.getLista()){
             System.out.println(a.ListarDatos());
         }
     }
     
     public static void menu(){
         System.out.println("1.AGREGAR");
         System.out.println("2.listar");
         System.out.println("3.SALIR");
         System.out.println("ELIJA LA OPCION: ");
         int op = teclado.nextInt();
         switch(op){
            case 1 -> agregar();
            case 2 -> {
                listar();
                menu();
             }
            case 3 -> salir();
            default -> errorOpcion();
        } 
         
     }
     
     public static void agregar () {
        
        System.out.println("1.Perro");
        System.out.println("2.Gato");
        System.out.println("Elija la opción: ");
        int opcion = teclado.nextInt();
        
        switch (opcion){
            case 1 -> Perro();
            case 2 -> Gato();
                    default -> {
             }
        }
    }
    public static void Perro(){

    System.out.println("\nSECCION PERROS\n");   
    System.out.println("Ingrese el nombre:");
    String nombre=teclado.next();
    System.out.println("Ingrese el peso:");
    Float peso=teclado.nextFloat();
    System.out.println("Ingrese la raza del perro:");
    String razaPerro=teclado.next();
    Perro p =new Perro(nombre,peso,razaPerro) ;
    v1.registrar(p);
        
    System.out.println("----------------------------------");
    System.out.println("--------REGISTRO GUARDADO---------");
    System.out.println("----------------------------------");
    menu();
   } 
    
    public static void Gato(){

    System.out.println("\nSECCION GATOS\n");   
    System.out.println("Ingrese el nombre:");
    String nombre=teclado.next();
    System.out.println("Ingrese el peso:");
    Float peso=teclado.nextFloat();
    System.out.println("Ingrese la raza del gato:");
    String razaGato=teclado.next();
    Gato g =new Gato(nombre,peso,razaGato) ;
    v1.registrar(g);
        
    System.out.println("----------------------------------");
    System.out.println("--------REGISTRO GUARDADO---------");
    System.out.println("----------------------------------");
    menu();
   }
     
    
}
