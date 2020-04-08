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
public class dethi4 {
    public static void main(String[] args) {
        int x =2 ;
        int y =0;
        for(;y<10;++y){
            if(y%x == 0){
                continue;
            }
            else if (y==8) {
                break;
            }
            else{
              System.out.print(y+ " ");
            }
        }
          System.out.println();
        for(int k =0 ; k< 5; k++){
            System.out.print(k+ " ");
            if(k==3){
                break;
            }
        }
         System.out.println();
         for(int k1 =0 ; k1< 5; k1++){
            
            if(k1==3){
                break;
            }
            System.out.print(k1+ " ");
        }
    }
}
