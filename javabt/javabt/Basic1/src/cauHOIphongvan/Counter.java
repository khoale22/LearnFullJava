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
public class Counter {
    public static int test = 0;
    int count = 0; 
 
    public Counter() {
      
    }
    public static void abc(){
        // count++;  NO
       //  test++;  YES
          System.out.println("DOI Tuong cua lop co the call static method");
    } 
     
    public void visit() {
        test++;
        count++;
        this.print();
    }
     
    public void print() {
        System.out.println("count = " + count + "  " +"test =" + test);     
    }
 
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.visit();
       // c1.test =7; YES
        c1.visit();
       // c1.abc(); YES
        Counter c2 = new Counter();
        c2.visit();
        Counter c3 = new Counter();
        c3.visit();
    }
}




