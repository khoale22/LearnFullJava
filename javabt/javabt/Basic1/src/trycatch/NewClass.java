/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trycatch;

/**
 *
 * @author Khoale123
 */
public class NewClass {
      public static void main(String args[]) {
//        try {
//            int data = 50 / 0;
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        System.out.println("rest of the code...");
          // dòng chữ “rest of the code…”  được in ra màn hình).
          
          
        int data = 50 / 0;  // ném ra ngoại lê ở đây
        System.out.println("rest of the code..."); 
//  dòng chữ “rest of the code…” không được in ra màn hình). Tất cả các lệnh không được thực thi sau khi xảy ra ngoại lệ.
    }

          
          
   }
          

    
}
