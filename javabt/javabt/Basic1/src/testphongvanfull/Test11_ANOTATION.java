/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

import java.io.FileOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Date;

/**
 *
 * @author maich
 */

 public class Test11_ANOTATION {
    private  BigDecimalFixedWidthField bigDecimalFixedWidthField;
     
  
    @Deprecated
    public void test(){
        System.out.println("343");
    }
    @SuppressWarnings("deprecation")
    void useDeprecatedMethod() {
        
    }
    
 // @SuppressWarnings("deprecation")
    public Date getSomeDate() {
 
      Date date = new Date(2014, 9, 25);
      return date;
  }
    public static void main(String[] args) {
        Test11_ANOTATION test11_ANOTATION = new Test11_ANOTATION();
        test11_ANOTATION.test();
        Date someDate = test11_ANOTATION.getSomeDate();
    
       
    }
    
//    public void boqua_canh_bao(){
//        FileOutputStream fos = new FileOutputStream("E:\\student.txt");
//    }    
}
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
 @interface BigDecimalFixedWidthField {
    int scale() default 2;
     boolean includeDecimal() default true;   
}