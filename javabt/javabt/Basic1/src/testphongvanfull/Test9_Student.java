/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

/**
 *
 * @author maich
 */
public class Test9_Student {
     
    private String name;
    private int age;

    public Test9_Student() {   }

    
    public Test9_Student(String name , int age) {
        this.name = name;
        this.age = age;
    }
      
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    
    public static void main(String[] args) {
        
        Test9_Student student = new Test9_Student();
       Test9_UtilsDeran.checkIfNullWithT(student.getName(), "fdsfsf");
        
        
    }
}
