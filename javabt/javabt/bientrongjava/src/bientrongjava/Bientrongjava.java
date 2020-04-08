/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bientrongjava;

/**
 *
 * @author Khoale123
 */
public class Bientrongjava {
    
    int a = 16;
    
   public void tuoiCon(){
      int tuoi = 10; // bien cuc bo phai khai bao gia tri because khong co gia tri mac dinh
      tuoi = tuoi + 10;
      System.out.println("Tuoi con la : " + tuoi);
   }

    public static void main(String[] args) {
  ////      System.out.println("HELOO        
   
            Bientrongjava test = new Bientrongjava();
         test.tuoiCon();  
        System.out.println(test.a);
    }
    
}
