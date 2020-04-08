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
  public class dethi2 {
   int a , b;
    dethi2(int i, int j){
   a =i;
   b=j;
   }
   void meth(dethi2 o){
       o.a *=2;
       o.b /=2;
   }
   
 
}
  class output{
       
       public static void main(String[] args) {
           dethi2 dethi = new dethi2(10, 20);
           dethi.meth(dethi);
           System.out.println(dethi.a + " " +dethi.b);
       }
       
   }