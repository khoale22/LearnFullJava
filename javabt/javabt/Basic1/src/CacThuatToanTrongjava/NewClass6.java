/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CacThuatToanTrongjava;

import java.util.Scanner;

/**
 *
 * @author Khoale123
 */
public class NewClass6 {
//        *
//       * *
//      *   *
//       * *
//        *
     public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap n : ");
        n = sc.nextInt();
        int count = 1;
        for ( int i = 1; i <= n; i ++ ){
            for ( int j = 1; j <= i; j ++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");
        }
    }
    
    
    
}
