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
public class ConstructorTest {
     void m(ConstructorTest obj) {
        System.out.println("Hello Java");
    }
    
    private static void dsafn(){    }
    void p() {
        m(this);
    }
 
    public static void main(String args[]) {
        ConstructorTest o1 = new ConstructorTest();
        o1.p();
    }
}
