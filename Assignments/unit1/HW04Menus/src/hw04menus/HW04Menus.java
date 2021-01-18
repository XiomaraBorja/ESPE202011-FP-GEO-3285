/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW04Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        do {
            System.out.println("Calculator");
            System.out.println("1. -> Multiplicaction");
            System.out.println("2. -> Division");
            System.out.println("3. -> Addition");
            System.out.println("4. -> Subtraction");
            System.out.println("5. -> Exit");
            
            System.out.println("Enter your menu  -->");
            option = input.nextInt();
            
            switch(option) {
                case 1:
                    System.out.println("The multipliation is"); 
                    break;
                case 2:
                     System.out.println("The Division is"); 
                    break;
                    
                case 3:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println(" the sum  --> " + sum );
                    break;
                    
                case 4:  
                    System.out.println("The subtraction ");
                    break;
                   
                case 5:   
                    System.out.println("Good Bye ");  
                    System.exit(0);
                    break; 
    
                default:
                    System.out.println("Invalid opt\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}
   
