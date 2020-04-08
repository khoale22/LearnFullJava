/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chuoivamang;

import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author Khoale123
 */
// NHAP VAO MOT MANG KHONG CO PHAN TU NAO TRUNG NHAU 
public class mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
       
        do {            
             System.out.print("Nhap vao so nguyen n");  
             n = scanner.nextInt();
        } while (n<=0);
        int i = 0 ;
        int a [] = new int[n];
        
        do {       
             System.out.println("Nhap vao phan tu a"+"["+i+"]" +"  "  ); 
             a[i]=scanner.nextInt();
         for(int j = 0 ; j<= i -1 ; j++){
             
             if(a[i] == a[j] ){
                   System.out.print("ban nhap sai");
                   i--;
                   break;
                  
               }
            
           }
              i++;
           
            
        }  while (i < n); 
        
      
        
        
    }
    
}
