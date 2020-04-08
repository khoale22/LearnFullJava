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
public class bienvar {
   
     
     
     
    public static void main(String[] args) {
        int i = 5;
        
        if(++i < 6){   //  cong truoc roi gan gia tri moi cho i
            
            i++;
        }
        System.out.print(i);
        System.out.println();
        
        
          int j = 5;
        
        if(j++ < 6){  // so sanh i truoc roi moi cong 
            
            j++;
        }
        System.out.print(j);
    }
    
}
