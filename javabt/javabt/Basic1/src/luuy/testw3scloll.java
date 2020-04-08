/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luuy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maich
 */
public class testw3scloll {
    public static void main(String[] args) {
      //  String [] a = ["khoa" , "trung" , "vinh"];
      List<String> mangChuoi = new ArrayList<>();
      mangChuoi.add("khoa1");
        mangChuoi.add("khoa2");
          mangChuoi.add("khoa3");
          mangChuoi.add("khoa3");
        
        int a = mangChuoi.indexOf("khoa4");
        
        System.out.print(a);
         System.out.print(mangChuoi);
        
        
    }
}
