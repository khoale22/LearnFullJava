/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuoivamang;

/**
 *
 * @author mrv
 */
public class SplitString {
    public static void main(String[] args) {
        String emails = "khoa,trung,nga";
        String [] strings ; 
        
       strings = emails.split(",");
       
       for(String a: strings ){
           System.out.println(a);
       }
      // strings.       
    }
    
}
