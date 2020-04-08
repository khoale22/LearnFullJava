/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Khoale123
 */
public class NewClass {
    public static void main(String[] args) {
         // khai báo List Interface tên listString có kiểu là String
    // và sử dụng Class là ArrayList để triển khai
    // ArrayList là 1 Class Collection
    // các phần tử trong listString cũng có kiểu là String
    List<String> listString = new ArrayList<String>();
                 
    // khai báo List Interface tên listInteger có kiểu là Integer
    // và sử dụng Class là LinkedList để triển khai
    // LinkedList là 1 Class Collection
    // các phần tử trong listInteger cũng có kiểu là Integer
    List<Integer> listInteger = new LinkedList<Integer>();
    
//    Ngoài ra, nếu chúng ta khai báo một List có Class triển khai là ArrayList và chúng ta đã biết 
//            trước số lượng phần tử thì chúng ta có thể khai báo kèm với số lượng phần tử của nó. 
//                    Ví dụ dưới đây sẽ khai báo một List có tên là listFloat, kiểu là Float và có 1000 phần tử:
    
     List<Float> listFloat = new ArrayList<Float>(1000);
     
     listFloat.add(0.2f);
     
     for(float Float : listFloat){
         
         System.out.println(Float);
     }
//     BAI 1 _______________________________________________________________________
     
     List<String> ListString1 = new ArrayList<String>();
     
     ListString1.add("NUMBER 1");
     ListString1.add("NUMBER 2");
     ListString1.add("NUMBER 3");
     ListString1.add("NUMBER 4");
     
//     
//     for(int i = 0 ;i < ListString1.size();i++){
//         System.out.println(ListString1.get(i));
//     }
     
//     CACH 2
    
//      
//     for (String tentudat : ListString1){
//         
//         System.out.println(tentudat);
//         
//     }
   ///  Add 2 list
      List<String> ListString2 = new ArrayList<String>();
     
     ListString1.add("NUMBER 5");
     ListString1.add("NUMBER 6");
     
     
     ///  Add 2 list
//     ListString1.addAll(ListString2); 
//     
//       for (String str : ListString1) {
//        System.out.println(str);
//    }
      // ADD 2 list theo index
       
        ListString1.addAll(1, ListString2);
          
     
       for (String str : ListString1) {
        System.out.println(str);
    }
       
       
       ListString1.set(2, "NUMBER 7");
        for (String str : ListString1) {
        System.out.println(str);
    }
        
    //    ListString1.remove(0); lay gia tri tai index =0 xoas
         //    ListString1.remove("NUMBER2"); lay gia tri  xoa
        
        
//        // tìm kiếm phần tử "NUMBER2" trong danh sách
//    if (listString.contains("NUMBER2")) {
//        System.out.println("Có phần tử NUMBER2 trong listString.");
//    } else {
//        System.out.println("Không tìm thấy phần tử Six.");
//    }
//        
//        
        
         List<String> listString3 = new ArrayList<String>();
    listString3.add("Four");
    listString3.add("Three");
    listString3.add("Five");
    listString3.add("One");
    listString3.add("Two");
    listString3.add("Three");
   
    
    System.out.println(listString3.indexOf("Three"));
     System.out.println(listString3.lastIndexOf("Three"));
    
     
      Collections.sort(listString3);
      for (String str : listString3) {
        System.out.println(str);
    }
       
     //listString3.remove(3); remove tai index
     
     listString3.remove("One");
     
       for (String str : listString3) {
        System.out.println(str);
    }
    }
    
    
           
}
