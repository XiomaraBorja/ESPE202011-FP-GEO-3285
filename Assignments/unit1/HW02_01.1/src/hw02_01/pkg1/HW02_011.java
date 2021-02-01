/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02_01.pkg1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW02_011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         menu();
        
    }
    
    public static void menu(){
        Scanner scan = new Scanner(System.in);
        short side;
        float reply;
        System.out.println("Calculating the area of an octagon");
        System.out.println("Enter the size of the side: ");
        side = scan.nextShort();
        reply = area(side);
        System.out.println("The octagon area on the side = " + Integer.toString(side) + " es: " + Float.toString(reply));
    }
    
    public static float area(short  side){
        float reply;
        int numerator;
        float denominator;
        numerator = (int)(2*Math.pow(side, 2));
        denominator = (float)Math.tan(22.5);
        reply = numerator/denominator;
        return reply;
    }
    
}
  
   
