/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luuy;

import java.util.Scanner;

/**
 *
 * @author Khoale123
 */
public class NewClass {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       int m = 10;
       
       int songuyen [] = new int[m];
           int dem = 0;
             System.out.print("Nhap vao so kieu string a : "); 
                 String a = scanner.nextLine() ;
                 
                 
        for(int i = 0; i <a.length() ; i++){
            if(Character.isDigit(a.charAt(i))){
                
                songuyen[dem] = a.charAt(i)- 0x30;
                        dem ++; 
                        
                          System.out.print(a.charAt(i) - 0x30);
   
            }
            
                 
          
   
            }
        dem --;
          m  = dem;
                   
                   
                            
                    for(int i = 0; i <=dem; i++){
                        
                        System.out.print(songuyen[i] + " ");
                        
                    }
                    
                    
                   
            
            
            
        }         
        
        
    
       
    
    
    
}
