/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg7;


import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in); 
          
          System.out.print("Porfavor introducir la capacidad  a que pude transportar el camion en kg: ");
          int a = teclado.nextInt ();
    
   
          
          System.out.print("Porfavor introducir la cantidad en kg que desea transportar b: ");
          int b = teclado.nextInt ();
    System.out.print("Introducir el consumo por kilometro del camion c: ");
          int c = teclado.nextInt ();
          
    System.out.print("d es una constante en la distancia ");
        int d;
          
       System.out.println ( d = 80);
          
 System.out.print("e representa el numero de viajes que son necesarios:  ");
 
 
        int e = b/a;
        
          System.out.println(e);
 System.out.print("f representa el numero de galones que se gastaron  ");
         
        int
                 f =  80*(c) ;
        System.out.println(f);
        
 System.out.print("g reprsenta cuanto se gasto en consumo total   ");
 
        int g = f*e;
         
         System.out.println(g);
        
         System.out.print("Cuanto va a costar la gasolina  ");
        
        int h = g *10000;
        
        System.out.println(h);
}
    
    
}
