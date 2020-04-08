/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author maich
 */


public class Student2 {
     private String id;
    private String name;
    private String email;
    private int age;
 
    public Student2(String id) {
        this.id = id;
    }
 
    public Student2(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }
 
    public String toString() {
        String studentInfo = "Student " + id;
        studentInfo += ": " + name;
        studentInfo += " - " + getEmail();
        studentInfo += " - " + age;
        return studentInfo;
    }
 
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student2 another = (Student2) obj;
            if (this.id.equals(another.id)) {
                return true;
            }
//            if (this.name.equals(another.name)) {
//                return true;
//            }
        }
        return false;
    }
    public int hashCode() {
    return 31 + id.hashCode();
}
    public static void main(String[] args) {
          Student2 student1 = new Student2("123", "Cong", "cong@gmail.com", 22);
        Student2 student2 = new Student2("123", "Cong", "cong@gmail.com", 22);
        Student2 student3 = new Student2("456", "Dung", "dung@gmail.com", 18);
 
        Set<Student2> setStudents = new HashSet<Student2>();
        setStudents.add(student1);
        setStudents.add(student2);
        setStudents.add(student3);
       
         System.out.print("equals " + student1.equals(student2)+ "-----");
          System.out.println("");
     
        // in các phần tử của set ra màn hình
        for (Student2 student : setStudents) {
            System.out.println(student);
        }
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
        public void setEmail(String email) {
        this.email = email;
    }   
}
