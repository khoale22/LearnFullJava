/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chuoivamang;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Khoale123
 */
public class mang4chen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // khởi tạo arr
        int [] arr = new int [n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập phần tử k = ");
        int k = scanner.nextInt();
        // sắp xếp dãy số theo thứ tự tăng dần
        //sortASC(arr);
        
        Arrays.sort(arr);
        System.out.print("Sắp xếp mảng tăng dần: ");
        for (int i = 0; i < n; i++) {
              System.out.print(arr[i]+ "  ");
            
             }
       
      
       
       
        
       
    }

}
