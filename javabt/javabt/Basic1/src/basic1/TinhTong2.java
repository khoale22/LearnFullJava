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
public class TinhTong2 {
///// Thực hành Java: Bài 8 Viết chương trình tính tổng S = 1 /1! + 2 /2! + ….+ n / n!
    public static int n;
//---------ham tinh giai thua--------------

    public static double giaithua(int n) {
        double tmp = 1;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                tmp *= i;
            }
        }
        return tmp;
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        float tong = 0.0f;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số tự nhiên N = ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            
            tong += i / giaithua(i);
        }
        System.out.println("tong day so la: " + tong);
    }
}
    