/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
//  c=3 ; d = 1 ; c++ =4 ; b++ =4 ; a = 3
/**
 *
 * @author Khoale123
 */
public class dethi6 {
    
    public static void main(String[] args) {
        int a =1;
        int b =2;
        int c ,d ;
        c = ++b;// 3 3
        d = a++; // 1 2
        System.out.println(c + " "+ d); // 31
        c++;
        b++;
        ++a;
        System.out.println(a + " " +b+ " "+c);  // 2 3 3
    }
}
