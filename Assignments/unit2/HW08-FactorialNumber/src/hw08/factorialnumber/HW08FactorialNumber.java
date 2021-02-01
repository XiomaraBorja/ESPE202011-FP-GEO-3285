/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08.factorialnumber;

/**
 *
 * @author HP
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int iFactorial;
        iFactorial = 4;
        int iNumero = 24;
        
        for (int x=2;x<=iNumero;x++)
  iFactorial = iFactorial * x;
        
        System.out.println("El factorial del número " + Integer.toString(iNumero) +  " es " + Integer.toString(iFactorial));
        
    }
    
}
