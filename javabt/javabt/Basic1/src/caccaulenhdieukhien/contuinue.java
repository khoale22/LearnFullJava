/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caccaulenhdieukhien;

import java.util.Scanner;

/**
 *
 * @author Khoale123
 */
public class contuinue {

    public static void main(String[] args) {
        int m;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong m");
        m = scanner.nextInt();
        int array[] = new int[m];

        for (int i = 0; i < m; i++) {

            System.out.print(" array " + i);

            array[i] = scanner.nextInt();

        }
        int k = 6;
        int dem = 0;

        int b[] = new int[m + 1];

        for (int i = 0; i < m; i++) {

            if (array[i] < k) {

                b[dem] = array[i];

                dem++;


            }

        }
        
          b[dem] = k;

            dem++;

            
            for (int c = 0;  c< m; c++) {

                if (array[c] >= k) {

                    b[dem] = array[c];

                    dem++;

                }
            }

        for (int i = 0; i < m + 1; i++) {

            System.out.print(b[i] + "  ");

        }

    }

}
