/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14matrixsubtraction;

/**
 *
 * @author HP
 */
public class HW14MatrixSubtraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizR[i][j] = matriz1[i][j]-matriz2[i][j];
            }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Ingrese el dato ["+i+"]"+j+"]");
                matriz1[i][j]=scan.nextInt();
            }
        }
    }
    
}
