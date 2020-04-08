/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luuy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Khoale123
 */
public class hashmap {
    public static void main(String[] args) {
         HashMap<String, String> hashMap = new HashMap<>();
             
    // Thêm value vào trong hashMap với key tương ứng 
    // sử dụng phương thức put()
    // đối số thứ nhất trong put là key có kiểu là String
    // và đối số thứ hai là value có kiểu là String
    hashMap.put("CSLT", "Cơ sở lập trình");
    hashMap.put("C++", "C++");
    hashMap.put("C#", "C Sharp");
    hashMap.put("PHP", "PHP");
    hashMap.put("Java", "Java");
     hashMap.put("Java", "Java2");
        hashMap.put("Java", "Java3");
        
      
    // tạo 1 Set có tên là setHashMap
    // chứa toàn bộ các entry (vừa key vừa value)
    // của hashMap
    Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
         
    System.out.println("Các entry có trong setHashMap:");
    System.out.println(setHashMap);
    
    System.out.println(setHashMap.size());
    }
}
