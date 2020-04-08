/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;

/**
 *
 * @author Khoale123
 */
public class test7 {
  
    private int y ,x = 0;
    void call (int a , int b ){
        
        x =a +1;
        y =b;
    }
 
    
}

    
 class B {
     public static void main(String[] args) {
         test7 t7 = new test7();
         t7.call(2, 3);
         
         System.out.print(t7.x + " " +t7.y);
         
     }
    
}
