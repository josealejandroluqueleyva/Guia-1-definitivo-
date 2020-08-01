/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

    System.out.print("Porfavor introducir el valor de S, correspondiente a la longitud de un lado del polgino: ");
    int s = teclado.nextInt ();
    
    System.out.print("Porfavor introducir el valor de n, correspondiente al numero de lados del polgino: ");
    int n = teclado.nextInt ();
    
    double Area = ((n*(s*s)))/(4*(Math.tan(Math.PI/n)));
    
        System.out.println(Area);
    
    }
    
}
