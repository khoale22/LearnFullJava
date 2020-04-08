/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caccaulenhdieukhien;

/**
 *
 * @author Khoale123
 */
public class break3 {
 
    
//    public static void ab(){
//     int a = 7;  
//     
//    }
//    public static int gh =7;
//     public void abc(){
//     int a = 7;  
//     
//    }
      public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
        
        
         for (int i = 1; i <= 10; i++) {
             
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
  // BREAK STOP NGAY VONG LAP CHUA NO ONLY
    }

}
