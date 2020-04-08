/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chuoivamang;

import java.util.Scanner;

/**
 *
 * @author Khoale123
 */
public class chuoi3 {
    public static void main(String[] args) {
        // TODO code application logic here
        String s, s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban hay nhap s : ");
        s = sc.nextLine();
        System.out.println("Ban hay nhap s1 : ");
        s1= sc.nextLine();
        if ( s.length() != s1.length()){
            System.out.println("Khong phai Anagram");
        }else{
            char a1[] = s.toCharArray();
            for(int i = 0 ; i <a1.length; i ++){
                for (int j = 0 ; j <a1.length; j ++){
                    if(a1[i] > a1[j]){
                        char temp = a1[i];
                        a1[i] = a1[j];
                        a1[j] = temp;
                    }
                }
            }
            char a2[] = s1.toCharArray();
        for(int i = 0; i < a2.length; i ++){
            for ( int j = 0 ; j < a2.length; j ++){
                if(a2[i] > a2[j]){
                    char temp = a2[i];
                    a2[i] = a2[j];
                    a2[j] = temp;
                }
            }
        }
        boolean flag = true;
        for(int i = 0 ; i < a1.length; i ++ ){
            if(a1[i] != a2[i]){
            flag = false;
            break;
        }
        }
        if ( flag == true) {
            System.out.println("Anagram");
        }  else {
            System.out.println("Khong phai Anagram");
        }
        }
        
    }
}
