/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chuoivamang;

import java.util.Scanner;

//CAT CHUOI
//String s1="Vi du Split boi Vietjack.com";  
//String[] words=s1.split("\\s");//chia chuoi dua tren string phan cac nhau boi khoang trang (\\s) 
////su dung vong lap foreach de in cac phan tu trong mang chuoi  
//for(String w:words){  
//System.out.println(w);  
//}  

/**
 *
 * @author Khoale123
 */
public class loaibokhoangtrang {
      public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
//        String a = "  toi la nguoi viet nam    ";
//        
//        
//        System.out.println(a.trim()); //  loai bo khonag trong 2 dau
//          System.out.println(a);
        String str;
        System.out.println("Nhap xau");
        str = Scanner.nextLine();
        
  String [] spStr = str.split(" ");
  StringBuilder ketqua = new StringBuilder();
  for (int i =spStr.length-1; i>=0 ;i-- ){
      ketqua = ketqua.append(spStr[i]).append(" ");
      
    }     
  
  
//  for(int i=0;i<spStr.length;i++){
//            ketqua=ketqua.append(spStr[spStr.length-i-1]).append(" ");
//        }
             System.out.println(ketqua);
  }
}
