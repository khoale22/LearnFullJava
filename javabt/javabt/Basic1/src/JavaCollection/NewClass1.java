/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author Khoale123
 */
public class NewClass1 {
  public static void main(String[] args) {
    ArrayList<Integer> arrList1 = new ArrayList<>();
         
    // thêm phần tử vào trong arrList1
    arrList1.add(6);
    arrList1.add(4);
    arrList1.add(9);
         
    ArrayList<Integer> arrList2 = new ArrayList<>();
         
    // thêm phần tử vào trong arrList2
    arrList2.add(11);
    arrList2.add(15);
    arrList2.add(16);
    arrList2.add(19);
         
    // thêm các phần tử của arrList1
    // vào vị trí số 3 của arrList2
    arrList2.addAll(3, arrList1);
         
    System.out.println("Các phần tử có trong arrList2 là: ");       
    for (int number : arrList2) {
        System.out.println(number); 
    }
//    
// 11
//15
//16
//6
//4
//9
//19
     System.out.println(arrList2); // [11, 15, 16, 6, 4, 9, 19]
    
      // xóa tất cả các phần tử trong arrListInteger
    // sử dụng phương thức clear()
    arrList2.clear();
         
    System.out.print("Số phần tử của arrListInteger sau khi xóa = " + 
        arrList2.size());  // xóa tất cả các phần tử trong arrListInteger
    // sử dụng phương thức clear()
    arrList2.clear();
         
    System.out.print("Số phần tử của arrListInteger sau khi xóa = " + 
        arrList2.size());
    
}
    
}
