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
// NHAP VAO SAU VA IN NGUOC LAI
public class chuoi2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String chuoi ;
       char temp =0;
       System.out.print("Nhap vao xau String :");
       
       chuoi = scanner.nextLine();
       
       
       char [] Kytu = chuoi.toCharArray();
       
       for(int i = 0 ; i< Kytu.length/2; i++){
           
         temp = Kytu[i];
         Kytu[i] = Kytu[chuoi.length() - i - 1];
         Kytu[chuoi.length() - i - 1] = temp;
           
       }
//         char ch= scanner.next().charAt(0);
       
       String ketqua = String.valueOf(Kytu); //    //Chuyen mang ky tu thanh xau String
       
        System.out.print(ketqua);
        
    }
}
