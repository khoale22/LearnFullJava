/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chuoivamang;

import java.util.Scanner;

/**
 *
 * @author Khoale123
 */
//1
//str.split("\\s",0)
//để tách xâu thành các xâu con phân cách nhau bởi khoảng trắng. Lưu ý là  method này sẽ tạo ra một
//số xâu con rỗng nếu trong xâu có từ 2 khoảng trắng liên tiếp trở lên. 
//Vì vậy sau sau khi Split xong tả chỉ đếm các xâu con không rỗng và đó chính là các xâu chứa từ.
//  MA ASCII 65 - 90 CHO TU LY TU IN HOA + 32 CHO KY TU IN THUONG
public class kiemtrasokytutu2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         System.out.println("Nhap ky");
        char str=input.next().charAt(0);
        int letterCount=0,digitCount=0,wordCount=0;
      
        str += 32; // chi co tac dung khi su dung ky tu;
        
        System.out.println(str);
        
        
    }   
}
