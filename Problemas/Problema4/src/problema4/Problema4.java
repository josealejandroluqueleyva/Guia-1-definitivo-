/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in); 
          
          System.out.print("Porfavor introducir el valor de r: ");
          int r = teclado.nextInt ();
          
          System.out.print("Lo primero que vamos a encontrar es el area de la del circulo,por medio de la siguiente formula. ");
         
          
         
          
          System.out.print("Por el momento pudimos encontrar el Area por medio de la aplicación de la formula correspondiente, ahora bien hay otra forma que tambien se puede hacer: ");
          
          double Area  = Math.PI * Math.pow(r,2); 
          
          System.out.print("Ahora continuando con la seguda parte de nuestro problema, vamos a encontrar el volumen de la esfera con nuestro r anteriormente dado por el usuarii ");
          
          double Volumen = (4.0/3.0)*Math.PI*(r*r*r);
    
    
    
    }
    
}
