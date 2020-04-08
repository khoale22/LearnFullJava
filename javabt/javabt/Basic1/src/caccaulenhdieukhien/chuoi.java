/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caccaulenhdieukhien;

/**
 *
 * @author Khoale123
 */
public class chuoi {
    
     public static String removeCharAt(String s, int pos) {
      return s.substring(0, pos) + s.substring(pos + 1);
   }
    public static void main(String[] args) {
        
        String a = "aacbcr";
        
        String s ="";
      
        char [] b = a.toCharArray();
        char [] c;
        
        for(int i =0; i< b.length -1 ; i++){
             for(int j =i + 1; j< b.length ; j++){
                 
                 
                     if(b[i] == b[j]){
                            
                       s =  removeCharAt(a, i);
                       s =   removeCharAt(a, j);
                         
                      
                     
                       }
                 
                 
             }
            
            
        }
        
        System.out.print(s);
        
        
        
        
        
    }
    
}
