/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

import java.util.function.Consumer;

/**
 *
 * @author maich
 */
public class Test7_Consumer {
     public static final int TEST_NUMBER = 5;
    public static final long TEST_NUMBER_LONG = 5L;
 
    public static void main(String[] args) {
//        Consumer<String> stringTest = () -> "fdsf"; ///ERROR
//        Consumer<Integer> times2 = (e) -> {return System.out.println(e * 2);}; ///ERROR
//        Consumer<String> stringTest = () -> "fdsf";
//        Consumer<String> stringTest44 = Test1_static::testForSupplier;
     
         Consumer<String> stringTest444 = Test1_static::testForSupplierHAVePrameter; // BAT BUOC PHAI CO THAM SO
         stringTest444.accept("jgfdjshgjksghkj");
     //   String sdfd000 =  stringTest444.accept("jgfdjshgjksghkj");
        
                
        Consumer<Integer> times2 = (e) -> { System.out.println(e * 2);};
        Consumer<Long> squared = (e) -> System.out.println(e * e);
        Consumer<Integer> isOdd = (e) -> System.out.println(e % 2 == 1);
 
        // perform every consumer
        times2.accept(TEST_NUMBER); // 10
        squared.accept(TEST_NUMBER_LONG); // 25
        isOdd.accept(TEST_NUMBER); // true
 
        // perform 3 methods in sequence
     //   Consumer<Integer> combineConsumer = times2.andThen(squared).andThen(isOdd);
       // combineConsumer.accept(TEST_NUMBER); // 10 25 true
    }
}
