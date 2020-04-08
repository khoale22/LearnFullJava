/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chuoivamang;

/**
 *
 * @author Khoale123
 */
public class testsplit {
    public static void main(String[] args) {
         String s1="Vi du Split   boi Vietjack.com";  
String[] words=s1.split("\\s");//chia chuoi dua tren string phan cac nhau boi khoang trang (\\s) 
//su dung vong lap foreach de in cac phan tu trong mang chuoi  
for(String w:words){  
System.out.print(w);  
}  


String a ="khoa le";
String b = a.toUpperCase();

System.out.print(b);
    }
}
