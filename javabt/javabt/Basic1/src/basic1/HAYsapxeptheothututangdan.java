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
public class HAYsapxeptheothututangdan {
    public static void main(String[] args) {
    int n, tempSort;    // số phần tử của mảng
    Scanner scanner = new Scanner(System.in);
         
    // nếu n < 0 thì phải nhập lại
    do {
        System.out.println("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n < 0);
    
    
         
    // khai báo và cấp phát bộ nhớ cho mảng
    int array[] = new int[n];
         
    // nhập giá trị các phần tử cho mảng
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        array[i] = scanner.nextInt();
    }
         
    // hiển thị mảng ban đầu
    System.out.println("\nMảng ban đầu: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
         
    // sắp xếp mảng sử dụng phương pháp Bubble sort 
    // duyệt i từ 0 đến n - 2
    // sau mỗi lần duyệt j = n - 1 đến j >= 1
    // thì sẽ tìm được phần tử nhỏ nhất
    // sau đó tăng i lên 1 và quay lại duyệt j
    // khi i > n - 1 thì ngừng vòng lặp
    
        ///     4  7    8  3
//    for (int i = 0; i < n - 1; i++) {
//        for (int j = n - 1; j >= 1; j--) {
//            // nếu phần tử đứng sau nhỏ hơn phần tử đứng trước
//            // thì đổi chỗ 2 phần tử đó cho nhau
//            // với cách sắp xếp này thì trong lần duyệt đầu tiên
//            // phần tử nhỏ nhất sẽ được chuyển lên trên cùng.
//            if (array[j] < array[j - 1]) {
//                tempSort = array[j];
//                array[j] = array[j-1];
//                array[j-1] = tempSort;
//            }
//        }
//    }
     // 3 5
    for (int i = 0 ; i < n - 1; i++){
        for (int j = i +1 ; j < n ; j ++){
            if (array[i] > array[j]){
                tempSort = array[j];
                array[j] = array[i] ;
                array[i] = tempSort;                
            }
        }
    }
    
    
         
    System.out.println("\nMảng sau khi sắp xếp: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
}
}
