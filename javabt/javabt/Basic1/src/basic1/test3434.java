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
 * @author maich
 */
public class test3434 {
    public static boolean checkSoNguyenTo(int soNguyenTo) {
        for (int i = 2; i < sqrt(soNguyenTo); i++) {
            if (soNguyenTo % i == 0) {
               return false;
            }
        }
       return true;
    }

    
     public static void main(String[] args) {
        // TODO code application logic here 346
        int n, tong = 0;
//        System.out.println("nhap vao so nguyen n ");
//        Scanner input = new Scanner(System.in);
//        n = input.nextInt();
        
        boolean check = checkSoNguyenTo(13);
        
        check == true ?  System.out.println("NO") : System.out.println("YES");
       
       
    }
    
}
