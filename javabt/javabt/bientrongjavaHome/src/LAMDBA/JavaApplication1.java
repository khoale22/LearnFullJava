/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 * @author mrv
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
     static void someFunction(String s) 
    { 
        System.out.println("Hello" + s); 
    } 
  

    public static void main(String[] args) {
//        int a , b , c ;
//        
//          Random rd = new Random();   // khai báo 1 đối tượng Random
//         
//    // trả về 1 số bất kỳ có kiểu là double
//    int doubleNumber = rd.nextInt();  
//    System.out.println("Số vừa được sinh ra là " + doubleNumber);
 LinkedList<String> animals = new LinkedList<String>();
    animals.add("fox");
    animals.add("cat");
    animals.add("dog");
    animals.add("rabbit");
    animals.add("dog");

//    Iterator<String> it = animals.iterator();
//    while(it.hasNext()) {
//      String value = it.next();
//      System.out.println(value);
//     }

//animals.stream().skip(3).forEach((name123) -> System.out.print(name123)); //rabbitdog
animals.forEach(name123 ->{ System.out.print(name123);});
System.out.println("_________________________1");
animals.stream().forEach(name -> System.out.print(name));
System.out.println("_________________________2");
animals.stream().filter(name ->name == "dog").forEach(System.out::print);
System.out.println("_________________________2.1") ;
animals.stream().filter(name -> name == "dog").forEach(test -> System.out.print(test));
System.out.println("_________________________3");
animals.stream().filter(name ->name == "dog").limit(1).forEach(System.out::print);
System.out.println(":: CACH 1_________________________");
animals.forEach(System.out::println);
System.out.println(":: CACH 2_________________________");
animals.forEach(s -> System.out.println(s)); 
System.out.println(":: MAP CACH 1_________________________UPPERCASE ONLY THIS");
 animals.stream().map(String::toUpperCase).forEach(System.out::println);
System.out.println("COLECT________________________");
System.out.println(animals);
List<String> animals22 = animals.stream().collect(Collectors.toList());
System.out.println(animals22);
System.out.println(" anyMatch()................wil return boolean");
System.out.println(animals.stream().anyMatch(s -> s.equalsIgnoreCase("cAt")));


System.out.println("EXAMPLE ________________________________________________");
List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 5, 1, 7, 2);
numbers.stream().distinct().forEach(System.out::print);
System.out.print(numbers.stream().distinct());
System.out.print(numbers.stream().distinct().collect(Collectors.toList()));
System.out.println("EXAMPLE2 ________________________________________________");
List<Integer> test2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
test2.stream().filter(number -> number > 4).limit(3).forEach(test -> System.out.print(test));

test2.stream().filter(i -> {
            System.out.println("Filter: " + i); 
            return i > 4;
        }).limit(3).forEach(test333 -> System.out.print(test333));

List<Integer> numbers22 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	List<Integer> results =
                numbers22.stream().filter(i -> {
                System.out.println("Filter: " + i);
		return i > 4;
	}).limit(3).collect(Collectors.toList());

	System.out.println("Result of limit: " + results);
        
        numbers22.stream().filter(i -> {
		//System.out.println("Filter: " + i);
                if(i > 4) System.out.println("Filter: " + i);
		return i > 4;
	}).limit(3).forEach(System.out::print);
       
System.out.println("FINDFIRST ________________________________________________");        
        
        numbers22.stream()
			.filter(t -> t > 4)
			.findFirst()
			.ifPresent(System.out::println);
        System.out.println("MAP@222 ________________________________________________");      
        List<String> words = Arrays.asList("Oracle", "Java", "Magazine");
	List<Integer> wordLengths =
			words.stream()
					.map(String :: length)
					.collect(Collectors.toList());
	System.out.println(words);
	System.out.println(wordLengths);
        
        System.out.println("TEST COLON ::_______________");
        animals.forEach(System.out::print);
        animals.forEach(JavaApplication1 :: someFunction);



 

}  
}