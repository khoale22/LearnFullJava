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
public class test5 {
   public test5(){};
       static int j=20;
    //   static int vcl = 58;
         public void amethod(int x){
      x=x*2;
      j=j*2;
      
   }
   public static void main(String argv[]){
      int i=10;
      test5 p =  new test5();
      p.amethod(i);
      System.out.println(i);
      //  System.out.println(x); khong hieu 
      System.out.println(j);
      
      
   }
 

}
