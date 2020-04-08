/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Khoale123
 */
public class test13 {
    public static void main(String[] args) {
        
        int a =1 ;
        
        System.out.print(a++ + ++a + ++a); // 1 + 3 + 4  ;  //  a = 1 truoc thuc hien phep cong truoc den khi goi ++a = 3
                       
        System.out.println(a);
        
        int b =2;
        
        int c = b++; // 2 3
        int d = ++b ;// 4 4
        
        int m = 3;
        
        int l = m++ +2 ;  // bang 5 m = 3 truoc thuc hien phep toan + truoc = 3 +  2 =5 sau do m moi tang len 1 bang 4
        
         System.out.println(c + "" + d+ " " + l);
        
    }
    
}
