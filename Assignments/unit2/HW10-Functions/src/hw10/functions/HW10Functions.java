/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.functions;

import java.util.Scanner;

/**
 *
 * @author Xiomara Borja
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float Number1 = 0;
        float Number2 = 0;
        float result;

        Scanner reader;
        reader = new Scanner(System.in);

        System.out.println("=================== ♠♠ Enter the first number: ♠♠ =======================");
        Number1 = reader.nextFloat();
        
        System.out.println("===================== ♠♠ Enter the second number: ♠♠ =======================");
        Number2 = reader.nextFloat();

        result = Number1 / Number2;
       
        System.out.println(" ==================== ♠♠ The division is ♠♠ ====================== " + Number1 + " / " + Number2 + " = " + result);

       
        
        Scanner Sca = new Scanner(System.in);

        
        System.out.print(" =================== ♠♠ Program that calculates the square of a number\n\n  ♠♠ ========================");

        System.out.print(" =========================== ♠♠ Enter the number to be squared: ♠♠ ============================== ");
        
        int n1 = Sca.nextInt();
        int Resultado = n1 * n1;

        System.out.print(n1 + " =============== ♠♠  squared is: ♠♠ =================== " + Resultado);

        
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        
        System.out.print("==================== ♠♠  Enter a whole number: ♠♠ ==================== ");
        n = sc.nextInt();
        System.out.println("===================  ♠♠ Table of ♠♠  ================== " + n);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
            }
    }
 
}
