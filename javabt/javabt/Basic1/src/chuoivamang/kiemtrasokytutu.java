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

public class kiemtrasokytutu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int letterCount=0,digitCount=0,wordCount=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))) letterCount++;
            else if(Character.isDigit(str.charAt(i))) digitCount++;                         
        }
        String[] strArr = str.split(" ");
        for (String strArr1 : strArr) {
            if (!strArr1.isEmpty()) 
                wordCount++;         
        }
        System.out.println("So ky tu: "+letterCount);
        System.out.println("So chu so: "+digitCount);
        System.out.println("So tu: "+wordCount);
    }   
}
