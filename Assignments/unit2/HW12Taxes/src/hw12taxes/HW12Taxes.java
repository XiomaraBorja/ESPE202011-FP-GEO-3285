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
                Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option = 0;
        while (option > 2) {
            System.out.println("");
        }
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("Hello, if you want to know the value added tax "
                    + "of a product or service, first check the SRI page, "
                    + "where you can review Goods and services taxed with a "
                    + "0% IVA rate.\n"
                    + "https://www.sri.gob.ec/web/guest/impuesto-al-valor-agregado-iva"
                    + "\n"
                    + "If your good or service is not in this list mentioned "
                    + "above, please choose option 1.\n"
                    + "\n"
                    + "Otherwise choose option 2 to exit. ");
            System.out.println("---------------------------------------------");
            System.out.println("1.----> Know the IVA value to pay of a "
                    + "good or service ");
            System.out.println("2.----> Exit ");
            
            System.out.println("");
            System.out.println("Enter your menu option-->");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter the Value of product");

                    float ValueProdcut = input.nextFloat();
                    float ValueIVA = PrintValueTax(ValueProdcut);
                    ;

                    System.out.println("The IVA is " + ValueIVA );
                    break;

                case 2:
                    System.out.println("Until next time");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid option\n\n");
                    break;

            }
        } while (option != 2);

    }
//------------------------------------------------------------------------------

    
                  