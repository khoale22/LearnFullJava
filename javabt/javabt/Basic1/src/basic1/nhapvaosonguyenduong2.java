/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic1;

import java.util.Scanner;

/**
 *
 * @author Khoale123
 */
public class nhapvaosonguyenduong2 {
    public static void main(String[] args) {
             
       int n, reverse = 0;
        int rem ;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap vap so nguyen duong n =");
        n = scanner.nextInt();
      
                 while(n > 0)
    {
        rem = n % 10;
        reverse = reverse*10 + rem;
        n /= 10;
    }
                 System.out.print("Nhap vap so nguyen duong n ="+ reverse );
    }
  
    
    
    
    
}
