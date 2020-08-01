/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema8;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
            System.out.print("Porfavor ingresar el numero de personas N, que van al hotel:");
                int N= teclado.nextInt();
                
   System.out.print("a equivale a la cantidad dinero todas las personas:");
   
    int n= N%10; 
    
    System.out.println(n);
    
        int a = N*(10000);
        
        System.out.println(a);
        
        System.out.print("b equivale al pago en efectivo por cada viaje al colectivo:");
        int b = n*2000;
        
        System.out.println(b);
    }
    
}
