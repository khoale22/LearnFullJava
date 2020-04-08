/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Khoale123
 */
public class Mang {

    static void kiemtraso (int m){
//        MAMNG 2CHIEU    int[][] arr = new int[n][m];

        
        
        for (int i =  2 ; i <= sqrt(m); i++){
            if(m % i != 0){
                System.out.println(m +"  la Songuento");
            }
        }
    
    
    }g

    public static void main(String[] args) {
        int n;
        ///  int arr[] = new int [n]; SAI VI BIEN N CHUA KHOI TAO
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong n");
        n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "      ");

        }
        ///TIM PHAN TU CO GIA TRI LON NHAT < NNO NHAT
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("gia tri nho nhat: " + min);
        System.out.println("gia tri lon nhat: " + max);
 ////// TIM SO NGUYEN TO TRONG MANG

      for (int i = 0; i < n; i++) {
             kiemtraso(arr[i]);
      }

    }
}
