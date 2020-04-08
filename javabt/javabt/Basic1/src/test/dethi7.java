/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package test;
// i = 0 i++ = 1 ;j=2 ; sum =1
// i =1 i++ =2 j =3 ; sum = 3
// i =2 ; i ++ =3 ; j =4 ; sum = 6
/**
 *
 * @author Khoale123
 */
public class dethi7 {
    public static void main(String[] args) {
        int sum=0;
        for(int i =0, j =0; i<5 & j<5;i++ ,j=i+1){
            sum +=i;
        }
        System.out.print(sum);
    }
}
