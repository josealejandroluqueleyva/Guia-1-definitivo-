/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

/**
 *
 * @author josea
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
          
          System.out.println("Porfavor introducir el valor de la variable m: ");
          float m = (float) teclado.nextInt ();
          
          System.out.println("Porfavor introducir el valor de la variable de la temperatura inicial (Ti): ");
          double i = teclado.nextInt ();
          
          System.out.println("Porfavor introducir el valor de la variable de la temperatura final (Tf): ");
          double f = teclado.nextInt ();
          
          System.out.print("La variable C tiene siempre el valor 4.1813 ");
          
        double C = 4.1813;
        
        
        double a;
        a = f-i;
        System.out.println(a) ; 
        
       
       
       
        
        double q= (a-m)*C;
       
        System.out.println(q) ;
        
        q = a*m*C;
        
        
        
                
      
     
             
             
      
        
          
         
          
    }

    private static double Math(double tf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
