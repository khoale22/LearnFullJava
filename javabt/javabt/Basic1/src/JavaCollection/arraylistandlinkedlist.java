/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Khoale123
 */
public class arraylistandlinkedlist {
    public static void main(String[] args) {
        
//    Nếu dùng List (List a = new ArrayList(); ) sẽ có ưu điểm là bạn có thể chuyển đổi ArrayList sang Vector, LinkedList dễ dàng thông qua các method có 
//            trong List interface, còn nếu dùng kiểu: ArrayList a = new ArrayList();
//            thì bạn sẽ khó làm được điều này, bạn sẽ chỉ dùng được những method trong ArrayList.    
      
    
    List<String> linkedList = new LinkedList<>();
    linkedList.add("Tháng 1");
    linkedList.add("Tháng 2");
    linkedList.add("Tháng 3");
    linkedList.add("Tháng 4");
    linkedList.add("Tháng 5");
    linkedList.add("Tháng 6");
    
    
    System.out.println(linkedList.get(2));
    ArrayList<String> arrayList = new ArrayList<>();
     arrayList.add("Tháng 1");
    arrayList.add("Tháng 2");
    arrayList.add("Tháng 3");
    arrayList.add("Tháng 4");
    arrayList.add("Tháng 5");
    arrayList.add("Tháng 6");
     System.out.println(arrayList.get(2));
     
     
     // https://gpcoder.com/2561-so-sanh-arraylist-va-linkedlist/
    
    }
   
   
    
    
    
}
