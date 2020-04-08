/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cauHOIphongvan;

/**
 *
 * @author maich
 */
public class StringBuffter {
    public static void main(String[] args) {
        String test1 =new String("khoa"); // khi new moi trỏ đến vị trí trong vùng nhớ
        String test2=new String("khoa");  // sẽ có 2 vùng nhớ có giá trị = khoa
        String test3 = "nga" ; // chỉ có 1 vùng nhớ có giá trị nga
        String test4 = "nga"; // chỉ có 1 vùng nhớ có giá trị nga
//        System.out.print(test1 == test2); false
//         System.out.print(test3== test4); true

        
         
String test5 = new String("trung");
String test6 = test5;
//test5 = "abc"; hoac
test5.concat("fdsfsf");
System.out.print(test5 == test6); // false

StringBuffer test7 = new StringBuffer("Van"); 
StringBuffer test8 = test7;
test7.append("fdsfs");
System.out.print(test7 == test8);
 
    }
    
}
