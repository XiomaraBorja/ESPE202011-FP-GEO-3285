/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author HP
 */
public class BasicOperation {
    
     //adition, substraction, division, multiplication
    
    public static float addTwoNumbers(float addend1, float addend2){
        
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }
   public static float substractTwoNumbers(float addend1, float addend2){
     float sum = 0;
        sum = addend1 - addend2;
        return sum;  
        
        
   }
        
  public static float multiplicationTwoNumbers(float addend1, float addend2){
    float sum = 0;
        sum = addend1 * addend2;
        return sum;  
  }      
        
  
  public static float divisionTwoNumbers(float addend1, float addend2){
            
      float sum = 0;
        sum = addend1 /addend2;
        return sum;
  }
}
}
