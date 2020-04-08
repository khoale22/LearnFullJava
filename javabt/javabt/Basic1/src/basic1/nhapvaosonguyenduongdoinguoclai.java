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
public class nhapvaosonguyenduongdoinguoclai {
    public static void main(String[] args) {
        
        int n;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap vap so nguyen duong n =");
        n = scanner.nextInt();
        int arr []= new int [2] ;
        while(n > 0){
            for(int i = 0; i < 2 ;i++){
                
              arr[i]= n % 10 ;  
                 n = n/10;
            }
             
     
         }
       System.out.print("Sau khi xap xep  ");  
     for(int i = 0; i < 2 ;i++){
           System.out.print(arr[i]);  
     }
     
     
     
     
     
     
     
     
                
    }
}
