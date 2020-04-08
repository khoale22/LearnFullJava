/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

/**
 *
 * @author maich
 */
public class Test1_static {
    //// PHUONG THUC STATIC CHI GOI DC BIEN STATICVA MOTHED STATIC
    //PHUONG THUC BINH THUONG GOI OK TAT CA
    int name ;
    static int age ;
      public static String test33(String popo){
         // test("fds");
        
        return null;
    }
   public static void testForSupplier22(){};
    public static String testForSupplier(){return "HEllo khoa";};
    public static String testForSupplierHAVePrameter(String a){
        System.out.print("this a class test consumerlol");
        return "HEllo khoa";};
    public static String test(int popo){
        //age OK
       // name NO
       // abc NO      
     //  Test1_static test1_static = new Test1_static();
     //  popo = test1_static.name; OK
        return null;
    }
    
    public void abc(int popp){
      //  test(); OK
      
      int test4;
      popp = age;
     // System.out.println(test4); LOI vì biens cuc bộ phải khởi tạo giá trị vì o có constructor dể set giá trị mắc định
       // test("fds"); OK
  
    }
    public static void main(String[] args) {
        Test1_static test1_static = new Test1_static();
        System.out.println(age);
        System.out.println(test1_static.name);                  
    }   
}
