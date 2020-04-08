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
public class NewClass5 {
    public static void main(String[] args) {
        
        for(int i = 1 ; i <=5 ; i++){
        
              for(int j = 1 ; j <=5 ; j++){
                  if(j>=2 && j<=4 && i>=2 && i<=4 )
                  {
                    System.out.print("   ");
                  }else{
                  
                    System.out.print("*  ");
                  }
                  
                
              }
               System.out.println();
        
        }
//        *  *  *  *  *
//        *        *  *
//        *     *     *
//        *  *        *
//        *  *  *  *  *
        
        for(int i = 1 ; i <=5 ; i++){
            
             for(int j = 1 ; j <=5 ; j++){
                 
                 if( (i==2 && j ==2)||(i==2 && j==3)||(i==3 && j==2)||(i==3 && j==4)||(i==4 && j==3)||(i==4 && j==4) ){
                  System.out.print("   ");
                  }else{
                  
                    System.out.print("*  ");
                  }
                  
             }
              System.out.println();
        }
          for(int i = 1 ; i <=5 ; i++){
            
             for(int j = 1 ; j <=5 ; j++){
                 
                 if( (i==2 && (j ==2|| j==3))|| (i==3 && (j ==2|| j==4))|| (i==4 && (j ==3|| j==4))  ){
                  System.out.print("   ");
                  }else{
                  
                    System.out.print("*  ");
                  }
                  
             }
              System.out.println();
        }
        
    }
}
