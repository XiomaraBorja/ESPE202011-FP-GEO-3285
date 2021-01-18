/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg04menus;

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
    boolean  mainLoop = true;
    int option;
        
    
    do{
   
        System.out.println("calculator");
        System.out.println("1. -> addition ");
        System.out.println("2. -> trapezium area ");
        System.out.println("3. -> Cylinder volume ");
       System.out.println("4. -> Subtraction"); 
       System.out.println("5. ->Exit");
        
        System.out.println("1. ->Enter your menu option -->");
        option = input.nextInt();
        switch(option){
                
            case 1:     

int addend1;
                int addend2;
                int sum;
                System.out.println("enter addend 1->");
                addend1 =input.nextInt();
                System.out.println("enter addend 2 ->");
                addend2 = input.nextInt();
                sum = addend1 + addend2;
               System.out.println("the addition is --> " + sum);
               break;

            case 2:

     Scanner in = new Scanner(System.in);
   int B=0,b=0,h=0,A=0;
   System.out.println("Enter number >  trapezoid");
   B=in.nextInt();
   System.out.println("Enter number <  trapezoid");
   b=in.nextInt();
   System.out.println("Enter number  h trapezoid");
   h=in.nextInt();
   A=((B+b)/2)*h;
   System.out.println("The area value of the trapezoid " +A);
    break;

            case 3:
                
      int r;
      int H;
      int vcili;
      
        System.out.println("Enter the number r  cylinder : ");
         r = input.nextInt();
        System.out.println("Enter the number h  cylinder");
        H = input.nextInt();
        vcili = (int) ((3.1416) * (r *r) * (H));
        System.out.println("The volume of a cylinder -> " + vcili + "cms3");
        break;
            case 4:   

                    System.out.println("The subtraction ");
                    break;        
            case 5 :
         default:
               System.out.println(" Invelid option \n\n\n ");
               break;
              
        }
       }while (option >5);
    }

    }
    

