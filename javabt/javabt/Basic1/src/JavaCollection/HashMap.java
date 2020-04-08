/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
//import java.util.HashMap;
import java.util.LinkedHashMap;
//import java.util.Map;
import java.util.TreeMap;
/**
 
 * @author Khoale123
 */
public class HashMap {
    
public static void main(String[] args) {
    int soSanPham = 2;
    Map<String, String> hashMapProducts = new java.util.HashMap<>();
  //  Map<String,String> hashMapProducts = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    String maSanPham, tenSanPham;
         
    // thêm thông tin của 2 sản phẩm
    // vào trong hashMapProducts
    // trong đó key là mã sản phẩm, còn value là tên của sản phẩm đó
    for (int i = 1; i <= soSanPham; i++) {
        System.out.println("Nhập thông tin của sản phẩm thứ " + i);
        System.out.println("Nhập mã sản phẩm: ");
        maSanPham = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        tenSanPham = scanner.nextLine();
        hashMapProducts.put(maSanPham, tenSanPham);
    }
             
    // hiển thị danh sách sản phẩm sử dụng Iterator
    System.out.println("Danh sách các sản phẩm vừa nhập: ");
    System.out.println("Mã sản phẩm\tTên sản phẩm");
    Iterator<Map.Entry<String, String>> iterator = hashMapProducts.entrySet().iterator();
    while (iterator.hasNext()) {
        // tạo 1 entry
        Map.Entry<String, String> entry = iterator.next();
        System.out.println(entry.getKey() + "\t\t" + entry.getValue());
    }
             
    // thêm 1 sản phẩm mới vào trong hashMapProducts
    // nếu mã sản phẩm đó đã tồn tại thì thông báo mã đã tồn tại
    // ngược lại thì mới nhập tên sản phẩm
    // và thêm vào bình thường sau đó thông báo "Thêm thành công"
    // tăng số sản phẩm lên 1
    System.out.println("Nhập mã sản phẩm cần thêm: ");
    String maSanPhamMoi = scanner.nextLine();
     
    // phương thức containsKey() sẽ kiểm tra mã sản phẩm mới nhập vào
    // có tồn tại trong hashMapProducts hay chưa
    if (hashMapProducts.containsKey(maSanPhamMoi)) {
        System.out.println("Mã sản phẩm = " + maSanPhamMoi + " đã tồn tại!");
    } else {
        System.out.println("Nhập tên sản phẩm cần thêm: ");
        String tenSanPhamMoi = scanner.nextLine();
         
        hashMapProducts.put(maSanPhamMoi, tenSanPhamMoi);
        soSanPham++;
        System.out.println("Danh sách các sản phẩm sau khi thêm: ");
        System.out.println("Số sản phẩm = " + soSanPham);
        System.out.println("Mã sản phẩm\tTên sản phẩm");
        iterator = hashMapProducts.entrySet().iterator();
        while (iterator.hasNext()) {
            // tạo 1 entry
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }
}
}
