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
public class test11 {
 static int xy =100;
 int andfd;
    public static void main(String[] args) {
        test11 t = new test11();
      //   t.xy++; OK
   //  System.out.println(test11.xy);OK
         
      //  System.out.println(t.xy++); 100
      //   System.out.println(t.xy); 101
      //   System.out.println(t.++xy);// khong dc bi loi
      test11 t2 = new test11();
     
      t2.xy++;
      t = new test11();
    
    t.xy++;
    test11.xy++; // dc vi bien static
       System.out.println(xy);        
    }               
}
