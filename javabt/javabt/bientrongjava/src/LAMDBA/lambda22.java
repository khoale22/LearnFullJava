/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAMDBA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author maich
 */

interface Operation {
    public int add(int c, int d);
}
 interface SayHello {
	void say(String name);
}

public class lambda22 {
    String a;
    // evaluate(list, (n)-> n%2 == 0 );// test(n) return true nếu n chẵn
        public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {

        for(Integer n1: list)  {

            if(predicate.test(n1)) {

                System.out.print(n1 + " ");

            }

        }
        }
    
    
      public static void main(String[] args) {
          
          SayHello sh = (name) -> System.out.println("Hello, " + name);
	  sh.say("Khanh");
        
         
                
                
        Operation operation = (a, b) -> {
            return a + b;
        };
        System.out.println("a + b = " + operation.add(10, 20));
        
        
        
          List<Integer> list =	new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));

 

        System.out.print("Print all numbers: ");

        evaluate(list, (n)->true);// test(n) luôn return true
       ;

        System.out.print("Print no numbers: ");

        evaluate(list, (n)->false);// test(n) luôn return false

 

        System.out.print("Print even numbers: ");

        evaluate(list, (n)-> n%2 == 0 );// test(n) return true nếu n chẵn

        System.out.print("Print numbers greater than 5: ");

        evaluate(list, (n)-> n > 5 );// test(n) return true nếu n > 5
 
        
    }
}
