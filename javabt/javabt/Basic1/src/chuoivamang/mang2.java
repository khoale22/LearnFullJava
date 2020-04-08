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
public class mang2 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int n;
       
        do {            
             System.out.print("Nhap vao so nguyen n");  
             n = scanner.nextInt();
        } while (n<=0);
        
int a [] = new int[n];
        for(int i = 0 ;i < n-2 ; i++)
         {
         System.out.print("Nhap vao a[ " + i + "  ");  
        a[i] =scanner.nextInt();
        }
         for(int i = 0 ;i < n; i++){
             System.out.println(a[i]);  
         }
    }
}
