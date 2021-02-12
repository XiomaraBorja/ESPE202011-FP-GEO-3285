/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12taxes;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // DONE

        double revenues = 0;
        double expenses = 0;
        double taxableincome = 0;
        double excessfractiontax = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter your annual revenues : ");
        revenues = scanner.nextFloat();

        System.out.printf("Enter your annual deductible expenses : ");
        expenses = scanner.nextFloat();

        taxableincome = revenues - expenses;
        System.out.printf("Your taxable income is --> " + taxableincome + "\n");

        if (taxableincome <= 11212) {
            System.out.printf("You do NOT have to pay basic fraction tax or excess fraction tax. \n");
        } else {
            if (taxableincome >= 11212 && taxableincome <= 14285) {
                excessfractiontax = (taxableincome - 11212) * 0.05;
                System.out.printf("You do NOT have to pay basic fraction tax.\n ");
                System.out.printf(" Your payment to the excess fraction tax is. $" + excessfractiontax + "\n");
            } else {
                if (taxableincome >= 14285 && taxableincome <= 17854) {
                    excessfractiontax = (taxableincome - 14285) * 0.1;
                    System.out.printf("You have to pay basic fraction tax $154. \n ");
                    System.out.printf(" Your payment to the excess fraction tax is.$ " + excessfractiontax + "\n");
            } else {
                if (taxableincome >= 17854 && taxableincome <= 21442) {
                    excessfractiontax = (taxableincome - 17854) * 0.1;
                    System.out.printf("You have to pay basic fraction tax $154. \n ");
                    System.out.printf(" Your payment to the excess fraction tax is.$ " + excessfractiontax + "\n");
            } else {
                if (taxableincome >= 21442 && taxableincome <= 42874) {
                    excessfractiontax = (taxableincome - 21442) * 0.1;
                    System.out.printf("You have to pay basic fraction tax $154. \n ");
                    System.out.printf(" Your payment to the excess fraction tax is.$ " + excessfractiontax + "\n");
            } else {
                if (taxableincome >= 42874 && taxableincome <= 64297) {
                    excessfractiontax = (taxableincome - 42874) * 0.1;
                    System.out.printf("You have to pay basic fraction tax $154. \n ");
                    System.out.printf(" Your payment to the excess fraction tax is.$ " + excessfractiontax + "\n");        
            } else {
                if (taxableincome >= 64297 && taxableincome <= 85729) {
                    excessfractiontax = (taxableincome - 64297) * 0.1;
                    System.out.printf("You have to pay basic fraction tax $154. \n ");
                    System.out.printf(" Your payment to the excess fraction tax is.$ " + excessfractiontax + "\n");
            } else {
                if (taxableincome >= 85729 && taxableincome <= 114288) {
                    excessfractiontax = (taxableincome - 85729) * 0.1;
                    System.out.printf("You have to pay basic fraction tax $154. \n ");
                    System.out.printf(" Your payment to the excess fraction tax is.$ " + excessfractiontax + "\n");
                }
                  double base;

       double porcentaje;

       double total;

       double iva;

       Scanner leer = new Scanner(System.in);

       CalculaIva calculador = new CalculaIva();

 

       System.out.println("o.01:");

       base = leer.nextDouble();

 

       System.out.println("0.12:");

       porcentaje = leer.nextDouble();

       iva = calculador.obtenerIva(base, porcentaje);

       total = base + iva;

 

       System.err.println("0.01: " + base);

       System.err.println("0.12: " + iva);

       System.err.println("0.12: " + total);
}    
       
                
                

            
                
        
