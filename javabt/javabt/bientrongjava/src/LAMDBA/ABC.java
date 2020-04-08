/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAMDBA;

import java.util.*; 
  
class GFG { 
  
    // static function to be called 
    static void someFunction(String s) 
    { 
        System.out.println(s); 
    } 
  
    public static void main(String[] args) 
    { 
  
        List<String> list = new ArrayList<String>(); 
        list.add("Geeks"); 
        list.add("For"); 
        list.add("GEEKS"); 
  
        // call the static method 
        // using double colon operator 
        list.forEach(GFG::someFunction); 
        //CACH 2
       // list.forEach(System.out::println);
        
    } 
} 
