/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic1;

import java.util.Scanner;
import static java.lang.Math.*;

/**
 *
 * @author Khoale123
 */
public class phuongtrinhbac2 {

    public static void main(String[] args) {
        double a, b, c, delta;
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap vao so a :");
        a = scan.nextDouble();
        System.out.println("Nhap vao so b :");
        b = scan.nextDouble();
        System.out.println("Nhap vao so c :");
        c = scan.nextDouble();
        delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("phuong trinh vo nghiem");
        } else if (delta == 0) {
            System.out.println("phuong trinh co nghiem kep");
            System.out.println("x= " + (-b / (2 * a)));
        } else {
            System.out.println("phuong trinh co hai nghiem phan biet");
            System.out.println("x1=" + (-b + sqrt(delta)) / (2 * a));
            System.out.println("x2=" + (-b - sqrt(delta)) / (2 * a));
        }
    }

}
