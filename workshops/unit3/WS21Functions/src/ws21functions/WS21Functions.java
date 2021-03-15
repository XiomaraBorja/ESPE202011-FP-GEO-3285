/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21functions;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author HP
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 Scanner reader = new Scanner(System.in);      
 Scanner in = new Scanner(System.in);
       int[] eggs;
       int number1pots = 0;
       int number2pots = 0;
        System.out.println("♠♦ XIOMARA BORJA ♦♠");
        System.out.println("Enter the fist pot:");      
              number1pots = reader.nextInt();
      
        System.out.println("Enther the second pot:");
               number2pots = reader.nextInt();
               
       
        System.out.println("1.- Enter the number of eggs to be cooked");
        System.out.println("The sum is: "+ sumArray(in));   
    }

    private static int sumArray(Scanner in) {
        int[] arrayNumbers = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++){
            arrayNumbers[i] = in.nextInt();
        }
           
        for(int i = 0; i < 5;i++)
            sum +=arrayNumbers[i];
        
        return sum;
        
        
    }

   
    
    }

    
    

        