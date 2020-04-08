/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

import java.util.function.Supplier;

/**
 *
 * @author maich
 */
public class Test6_1_Supplier {
    public String language;
    public int experience;
 
    public Test6_1_Supplier() {
        this.language = "Java";
        this.experience = 5;
    }
 
//    public Test6_1_Supplier(String language, int experience) {
//        this.language = language;
//        this.experience = experience;
//    }
 
    public void print() {
        System.out.println("Language: " + language + " - Experience: " + experience);
    }
 
    public static String getDefaulLanguage() {
        return "Java";
    }
     public static boolean getBooleanValue() {
        return true;
    }
 
    public static int getIntValue() {
        return 1;
    }
}
 
 class SupplierExample2 {
 
    public static void main(String[] args) {
 
        Supplier<Test6_1_Supplier> supplier1 = Test6_1_Supplier::new;
        Test6_1_Supplier lang = supplier1.get();
        lang.print();
 
        Supplier<String> supplier2 = Test6_1_Supplier::getDefaulLanguage;
        String defaultLang = supplier2.get();
        System.out.println("Default Language: " + defaultLang);
        
        Supplier<Boolean> supplier3 = Test6_1_Supplier::getBooleanValue;
        
          System.out.println("Boolean: " + supplier3.get());
        
    }
}
    
    

