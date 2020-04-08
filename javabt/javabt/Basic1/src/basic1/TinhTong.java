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
public class TinhTong {
    
    // tính tổng S = 1 + 1/2 + 1/3 + … + 1/n 
    
    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   
   int n ; float tong = 0 ;
    System.out.println("Nhap vao so nguyen n");
    n = scan.nextInt();
        for (int i=1; i <= n ; i++)
        {
          //  tong = (Float)(tong + 1/i) ; SAi
          //  tong+=(float) 1/i;  OK
            
            tong = tong + (float) 1/i;
        }
            
        System.out.print("tong la "+tong);
       
    }
    
}
