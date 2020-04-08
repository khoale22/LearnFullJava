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
public class FibonacciKHongdequy1 {
    // 0 1 1 2 3 5 8
  public static int check (int nhap){
      int f1 =0 ; int f2 = 1; int f3 = 1;
      
      if(nhap < 0 ){
          return -1;
      }else if(nhap == 0 || nhap ==1){
          return nhap;
      }else{
          for(int i = 2 ; i< nhap ; i++){
              f1 = f2;
              f2 = f3;
              f3 = f2 + f1;
          }
      }
    return f3;
  }
    public static void main(String[] args) {
         System.out.println("nhap vao so nguyen n ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int k = 0 ; k >=0 ; k++){
          
            //while(check(k) <= n){
                if(check(k) == n){
                     System.out.println("K la OK ");
                     break;
                }
          //  }
               if(check(k)> n){
                   System.out.println("K la NOt OK ");
                   break;
               }
            
        }
        
        
        
    }
       
    
}
