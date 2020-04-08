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
public class bangcucchuong {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         for (int i = 1;i <=9 ; i++)
         {
           for (int j = 1 ; j<= 9 ;j++)
           {
               System.out.print(i+"*"+j+"="+i*j+"    " );
           }
            System.out.println();
         }
         
    }
}
