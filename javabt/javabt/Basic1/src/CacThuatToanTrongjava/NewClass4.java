/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CacThuatToanTrongjava;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 *
 * @author Khoale123
 */
public class NewClass4 {
    public static void main(String[] args) {
//        Height = 4          line  =      space + chatater   
//        *                     1           3         1                space = height - line
//       ***                    2           2         3                charater = line*2 - 1
//      *****                   3           1         5
//     *******                  4           0         7
        
        
      final int Height = 4;
      
        
        for(int line = 1 ;line <= Height  ;line ++){

//             for(int space = Height -i ; space > 0 ; space--){
//                     System.out.print(" ");
//             }
             
                 for(int space = 1 ; space <= Height -line ;space++){
             System.out.print(" ");
             
             }
             for(int Charater = 1 ; Charater<=line*2 -1 ;Charater++)
             {
                   System.out.print("*");
             }
               System.out.println("");
        }
        
        
        int dem =1;
         for(int i = 1 ;i <= Height  ;i ++){
//             for(int space = 1; space<= Height -i; space++ ){
//               System.out.print("*");
//             }
             for(int space = Height -i ; space > 0 ; space--){
                     System.out.print(" ");
             }
             for(int Charater = 1 ; Charater<=i*2 -1 ;Charater++)
             {
                   System.out.print(dem);
             }
             dem+=1;
             
               System.out.println("");
        }
        
         
         
         
         
         
         
         
         
        
    }
    
}
