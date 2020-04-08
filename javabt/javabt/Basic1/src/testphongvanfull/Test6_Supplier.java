/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author maich
 */
public class Test6_Supplier {
    public static void main(String[] args) {
        //incompatible types: String cannot be converted to Supplier<String>
       //Supplier<String> supplierTest = "fdsf";
       
        Supplier<String> supplierTest = Test1_static::testForSupplier;
        // OR
        //Supplier<String> supplier = () -> "Welcome to gpcoder.com";
        System.out.print(supplierTest.get());
        
        
        
    }
    
}
