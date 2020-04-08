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
public class mang3 {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int n;
       
        do {
            System.out.print("Nhap vao so nguyen n");
            n = scanner.nextInt();
        } while (n <= 0);

        int a[] = new int[n];
          int ch[] = new int[n];
            int le[] = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.println("Nhap vao a[ " + i + "  ");
            a[i] = scanner.nextInt();
        }
        
    int c = 0;
    int d = 0;
     for (int i = 0; i < n ; i++) {
         if(a[i]%2==0){
             ch[c] = a[i];
             c++;        
         }else{
              le[c] = a[i];
             d++;  
             
         }
         
     }
        
           
      System.out.println( "cac phan tu chan");
      for (int i = 0; i < c ; i++) {
          
          System.out.print(ch[i] + "  ");
      }
        
        
    }
}
