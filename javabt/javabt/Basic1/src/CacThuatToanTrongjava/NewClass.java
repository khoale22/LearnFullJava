/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CacThuatToanTrongjava;

/**
 *
 * @author Khoale123
 */
public class NewClass {
    
    public static void main(String[] args) {
//        *
//        **
//        ***
//        ****
//        *****
        
        
        for(int i = 0; i< 5;i++)
          {
              for(int j= 0; j <=i ; j++)
              {
                  System.out.print('*');
              }
              System.out.println();
          }
        
        int number = 1 ;
        while(number<=5){
            
            for(int i =1 ; i<= number;i++)
            {
              System.out.print("*");
            }
            System.out.println();
            number++;
            
            
        }

     for(int i = 4 ; i>=0 ; i--){
        for(int j = 0 ;j<=i ;j++)
        {
         System.out.print('*');
        
        }
      System.out.println();
     }
        
       for(int i = 0 ; i < 5 ; i++){
           for(int j = 0; j < 4-i ; j++){
               System.out.print(" ");
           }
           System.out.print("*");
           System.out.println();
       }      
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
                
    
    
}
