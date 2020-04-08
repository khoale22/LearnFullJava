/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

import java.util.Optional;

/**
 *
 * @author maich
 */

class Student {
    private String name;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
 
public class Test4_OptionalExample1 {
 
    public void preJava8() {
        Student student = getStudent();
        if (student != null) {
           // System.out.println(student.getName());
        }
    }
 
    public void java8() {
      
         
        Student student = getStudent();
        Optional<Student> opt = Optional.of(student);
        if (opt.isPresent()) {
           // System.out.println(opt.get().getName());
     //   }else{
            
      //  }
         opt.ifPresent(s -> System.out.println(s.getName()));  // khong if else dc
       // opt.orElse(null);
     
        }   
    }
    public static void main(String[] args) {
        Test4_OptionalExample1 test4_OptionalExample1 = new Test4_OptionalExample1();
        test4_OptionalExample1.java8();
    }
 
    private Student getStudent() {
        Student student = new Student();
        student.setName("gpcoder.com");
        return null;
    }
}