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
public class Tinhtong3 {
   // Thực hành Java: Bài 10. Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ. Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32.
    

    public static void main(String[] args) {
        // TODO code application logic here
        int n,tong=0;
        System.out.println("nhap vao so nguyen n ");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        while (n>0) {
            tong+=n%10;   //  CHIA LAY SO DU
            n= n/10; // CHIA LAY THUONG
        }
        System.out.println("tong cac chu so cua n la: "+tong);
        
        
        
        
        int b = 1;
        int c = 1/10;
        int d =1 % 10;
         System.out.println("tong cac chu so cua n latest: "+c +' '+d);
        
    }
    
    
    
    
    
    
    
}
