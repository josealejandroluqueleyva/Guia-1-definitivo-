/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg9;

/**
 *
 * @author josea
 */
public class Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Porfavor introducir el numero de personas obesas en el paseo ");
    int f = teclado.nextInt ();
    
    System.out.print("Porfavor introducir el numero de personas flacas en el paseo: ");
    int g = teclado.nextInt ();
    
     System.out.print("b corresponde al numero de buses : ");
        int d = 0;
     
        int b = (2*g+f)/60;
                
        System.out.println(b);
        
          System.out.print("e corresponde a cantidad de comida :"
                  + "y d corresponde al numero de dias ");
     
        int e = ((5*g)+(3*f))*d;
    
    
        System.out.println(e);
        
       System.out.print("v costo de comida:");
     
        int v = e(10000);
    
    
        System.out.println(v);
        
        System.out.print("h corresponde al numero de habitantes : ");
        
     
        int h = (g+f)/4;
                
        System.out.println(h);
        
        System.out.print("c corresponde al costo de habitaciones : ");
        
     
        int c = h*25000;
                
        System.out.println(c);
        
      System.out.print("El numero de habitaciones c se muñti´plica d numero de dias, y nos da como resultado u que corresponde al costo de habitaciones de todos los dias : ");
        
     
        int u ;
                u =c*d;
                
        System.out.println(u);
          
   
    }

    
