/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw20pinttxt;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author HP
 */
public class HW20PintTXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        public String readTxt(String direction){
        String text = "";
        try{ 
            
            BufferedReader bf = new BufferedReader(new FileReader(direction));
            
            String temp = "";
            String bfRead;
            
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead;
            }
           text = temp;
            
        }catch(Exception e){
            System.out.println("");
        }
    
        return text;
    }
        
        CarController carController = new CarController();
        txtShowData.setText(carController.readTxt("D:\\Universidad\\4to Semestre\\Tareas\\Fundamentos de la Programacion\\Code\\Code 2\\ESPE202011_FP_GEO-3285\\workshops\\Unit 3\\WS27 ADT\\ConcessionarySystem\\Cars.txt"));
        
        
        
        D:\\Universidad\\4to Semestre\\Tareas\\Fundamentos de la Programacion\\Code\\Code 2\\ESPE202011_FP_GEO-3285\\workshops\\Unit 3\\WS27 ADT\\ConcessionarySystem\\Cars.txt
En ves de esto le pones donde tu guardaste tu archivo txt
        
    }
    
}
