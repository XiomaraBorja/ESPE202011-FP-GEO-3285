/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularcalculator;

import java.util.Scanner;
import utils.BasicOperation;

/**
 *
 * @author HP
 */
public class ModularCalculator {
    
    
      public static void main(String[] args) {
        float operand1;
        float operand2;
        float result;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("  Enter two numbers:   ");
        operand1 = keyboard.nextFloat();
        operand2 = keyboard.nextFloat();
        
        
        System.out.println("----------ADDITION--------");
        
        result = BasicOperations.addTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " + " + operand2 +" = " + result);
        
        
        
        System.out.println("-----Substract-----");
        
        result = BasicOperations.substractTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " - " + operand2 +" = " + result);
        
        
        System.out.println("-----Multiplication-----");
        
        result = BasicOperations.multiplicationTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " * " + operand2 +" = " + result);
        
        
        
        System.out.println("-----Division-----");
        
        result = BasicOperations.divisionTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " %/
    }
    
}
