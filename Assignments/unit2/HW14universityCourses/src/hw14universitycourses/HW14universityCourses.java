/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14universitycourses;

import java.util.Scanner;

/**
 *
 * @author Xiomara Borja
 */
public class HW14universityCourses {

    /**
     * @param args the command line arguments
    
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // universityCourses
        
        
      int[] universityCourses;
        String[] Courses = {"A", "B", "C"};
        float[] studentsByCourse = { 25, 36, 40};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the course parallel -> ");
        n = input.nextInt();

        universityCourses = new int[n];
       
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of students in the course " + (i + 1) + " -> ");
            universityCourses[i] = input.nextInt();
        }

        for (int courses : universityCourses) {
            System.out.println("courses of university are " + courses);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("courses of university " + (i + 1) + " -> " + universityCourses[i]);
        }
        Iterable<String> parallel = null;

        for (String courses : parallel) {
            System.out.println("parallel name -> " + parallel);
        }
        
        for (int i = 0; i < studentsByCourse.length ; i++) {
            System.out.println("student of university " + (i + 1) + " -> " + studentsByCourse[i]);
        }

    }

}

