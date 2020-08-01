/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import static java.awt.PageAttributes.MediaType.C;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
/**
 * Por medio de una regla de 3, se daran los resultados de la eficiencia del combustible en millas (MPG) y este se pasara
a eficiencia de combustible en kilometros (LPG)
 * Entendiendo que una 1 milla/galon(MPG) equivale a 0.425144 km/L(LPG), segun la fuente https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&ved=2ahUKEwjjmZ7Qs_PqAhXiRt8KHUnOBbUQFjABegQIAhAB&url=https%3A%2F%2Fwww.metric-conversions.org%2Fes%2Flongitud%2Fmillas-a-kilometros.htm&usg=AOvVaw2LLqSwRofty9JOrAk8ejBO
 * 

 */



{


    Scanner teclado = new Scanner(System.in); 
    
     
          
          System.out.print("Porfavor introducir el valor de MPG recorridas, en unidades millas/galon: ");
          float a = teclado.nextInt ();
          

    System.out.print("Teniendo presente que 1 milla/galon equivale a 0.425144 km/L ");
    
    double b = 0.425144;

    System.out.print( "El valor en LPG pertenecientes a LPK es el siguiente: ");
    
    double c = a * b;

    System.out.println(c);
     
    
    System.out.print ("Espero allas tenido una magnifica experiencia, un cordial saludo. ");}

 
    }
    
}
