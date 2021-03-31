/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sorting.controller;

/**
 *
 * @author HP
 */
public class Search {
     public static int findTypeMusic(String[] typeMusic, String searchTypeMusic) {
       for (int i = 0; i < 6; i++) {
            if (searchTypeMusic.equals(typeMusic[i])) {
                return 1;
            }
        }
    return -1;
    }
    
}
