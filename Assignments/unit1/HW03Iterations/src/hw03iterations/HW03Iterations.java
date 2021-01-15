/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03iterations;

/**
 *
 * @author HP
 */
public class HW03Iterations {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
          System.out.println("1.-USE \"WHILE\"NUMBER LIST");
        
        int i ;
        i= 0;
        System.out.println("This is a while loop from 1 to 8");
        
        while  (i < 8 ) {
            System.out.println("i-->" +(i+1));
            i+=1;
        }
        
        System.out.println("TABLE WITH A NUMBER LIST"
                + "2.-USE \"FOR\" MULTIPLICATION ");
        System.out.println("Multiplication tables :8 ");
        
        int stop=8;
        int product=0;
        int table = 8;
        for(int k=1 ; k<=stop ; k++){
            product = table * k;
            System.out.println("8 * " + k + " = " + product);
        }
        
        System.out.println("3.-USE \"FOR\"OWN EXAMPLE");
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
     for (String j : cars) {
          System.out.println(j);
          
     }
     System.out.println("END");
                  }
    }

                  
               
  
    
    

