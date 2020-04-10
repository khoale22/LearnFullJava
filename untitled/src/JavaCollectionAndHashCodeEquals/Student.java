/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollectionAndHashCodeEquals;

import java.util.Objects;

/**
 *
 * @author mrv
 */


class Student{

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }



    String name;
    int age;
    Student(String name,int age){
        this.age = age;
        this.name = name;
    }
    public static void main(String[] args) {
        //36671264
        Student student = new Student("khoa3", 1);
        //System.out.println(student.hashCode());
        Student student2 = new Student("khoa3", 1);
       // System.out.println(student2.hashCode());

        System.out.println(student.equals(student2));
        System.out.println(student.hashCode() == student2.hashCode());

    }
}
