/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HW18Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
          int edadSearch, position;
          int[] arr = {2, 6, 7, 27, 38, 98, 10, 24, 37, 13};
          System.out.println("LINEAL SEARCH");
          System.out.println("Age to look for: ");
          edadSearch = sc.nextInt();
          position = linealSearch (arr, edadSearch);
          System.out.println("Age is found in the position:" + position);
    }
    public static int linealSearch (int[] array, int x) {
        int posicion = -1;
        for (int i = 0; i < array.length; i++) { 
            if (array[i] == x) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    public static boolean binarySearch(int[] numbers, int numberToSearch) {
    
  int size = numbers.length;  
  int middle = size/2;        
    
  System.out.println("BINARY SEARCH");
  System.out.println("Size: " + size);
  System.out.println("Middle: " + middle);
  System.out.println("Array: " + Arrays.toString(numbers));
    
  if (numbers[middle] == numberToSearch)
    return true;
  else if (size == 1)
    return false;
  else if (numbers[middle] > numberToSearch)
    return binarySearch(Arrays.copyOfRange(numbers,0,middle),numberToSearch);
  else
    return binarySearch(Arrays.copyOfRange(numbers,middle+1,size),numberToSearch);    
}
}


    }
    
}
