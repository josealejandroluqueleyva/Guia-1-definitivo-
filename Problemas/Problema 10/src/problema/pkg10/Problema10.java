/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg10;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in); 
          
          System.out.print("Porfavor introducir el valor de R: ");
          int R = teclado.nextInt ();
  
          
          System.out.print("Porfavor introducir el valor de H: ");
          int H = teclado.nextInt ();
          
          System.out.print("Porfavor introducir el valor de r, correspondiente al radio del cono menor : ");
          int r = teclado.nextInt ();
          
              System.out.print("Porfavor introducir el valor de h, correspondiente a la altura del cono menor : ");
          int h = teclado.nextInt ();
  
  
          
          
           System.out.print("pertenecientes Radio y la Haltura del cono mayor");
           
            System.out.print("Para calcular el volumen del cono maoyor (a): ");
            
        double a = (Math.PI*H*Math.pow(R,2))/3;
        
         System.out.println(a);
         
       double b = (Math.PI*h*Math.pow(r,2))/3;
       
       System.out.println(b);
       
       System.out.print("Ahora vamos a calcular el volumen del tronco (c):  ");
       
        double c = a-b;
       
       System.out.println(c);
           
           
          
          
    }}
   
