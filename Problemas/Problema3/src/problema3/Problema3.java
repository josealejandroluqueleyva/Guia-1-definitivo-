/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    
     Scanner teclado = new Scanner(System.in); 
     System.out.print("Introducir el nombre de la primera ciudad (f)");
     System.out.print("Introducir el nombre de la segunda ciudad  (e)");
        
     
     System.out.print("Porfavor introducir los valores correspondientes en radianes.  ");
          
          System.out.print("Porfavor introducir el valor de correspondiete a la latitud  (a) de la primera ciudad : ");
          int a = teclado.nextInt ();
          
          System.out.print("Porfavor introducir el valor de correspondiete a la longitud de la primera ciudad (b) de la primera ciudad : ");
          int b = teclado.nextInt ();
          
          System.out.print("Porfavor introducir el valor de correspondiete a la latitud  (c) de la segunda ciudad : ");
          int c = teclado.nextInt ();
          
          System.out.print("Porfavor introducir el valor de correspondiete a la longitud de la segunda ciudad (d) de la primera ciudad : ");
          int d = teclado.nextInt ();
        
           System.out.print("La distancia entre las dos ciudades e y f es:  ");
        
          
        double r; 
        r = (6371.07 * Math.acos(Math.sin(a))*(Math.sin(c)))+((Math.cos(a))*(Math.cos(c))*(Math.cos(b)))- d;
        System.out.println(r);
        
        
        
    }} 