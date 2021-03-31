/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws28window;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class WS28Window {

    /**
     * @param fileName
     * @return 
     */
    public static String  read(String fileName){
        String text = " ";
        try {
            
            Scanner s = new Scanner(new File(fileName));
            while (s.hasNextLine()) { 
                text = text + s.nextLine()+ "\n";
            }
            
        }
        
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
        
        return text;       
    }
}
    
