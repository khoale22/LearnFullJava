/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chuoivamang;

import java.util.Scanner;

/**
 *
 * @author Khoale123
 */
public class maascci {
    public static void main(String[] args) {
        
        String s ;
      Scanner nhap = new Scanner (System.in);
       System.out.println("Nhap chuoi: ");
       s = nhap.nextLine();
     
       //s="";
      
       for(int i= 0 ;i<s.length();i++){
           
         int ascii =  (int)s.charAt(i);
          
         s += (char)(ascii += 32);
       }
         System.out.println("Day la " + s);
  
  
  
  
        
    }
}
