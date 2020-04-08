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
 // khong duoc khai bao kieu acsset modyfy trong class ke thua
 class test6 {
     test6(){};
    test6(int c) {
        int i = 100;
        System.out.println(i); // dong nay in ra 100 khong co dong nay chi co dong 200
    }
}

 class Pri extends test6{
    int a = 200; // thay a =i ket qua tuong tu
  
     public Pri(int c) {
          super(c);   // PHAI KHAI BAO DONG DAU TIEN
        System.out.println("d");
     }
     ///HOAC
//     public Pri() {
//             // PHAI KHAI BAO DONG DAU TIEN
//        System.out.println("d");
//       
//    }
     
    
   public static void main(String argv[]){
      Pri p = new Pri();
      System.out.println(p.a);
   }

   
}
