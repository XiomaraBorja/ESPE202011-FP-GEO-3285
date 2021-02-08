/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

/**
 *
 * @author HP
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
 
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
 
       
        MatrizRecursivorecorridodenumeros(m, 0, 0);
    }
 
    public static void MatrizRecursivorecorridodenumeros(int[][] m, int i, int j) {
 
        
        System.out.print(m[i][j] + " ");
 
       
        if (i != m.length - 1 || j != m[i].length - 1) {
 
           
            if (j == m[i].length - 1) {
               
                i++;
               
                j = 0;
                
                System.out.println("");
            } else {
              
                j++;
            }
 
      
            MatrizRecursivorecorridodenumeros(m, i, j);
 
        }
 
    }
 
}
	
