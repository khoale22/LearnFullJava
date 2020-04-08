/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring;

/**
 *
 * @author maich
 */
public class Person {
    private String name ;
    private Address address;

    public Person() {
        ///Khi tao moi person se bị phụ thuoc vào adress
        address = new Address();   
    }
    
    public static void main(String[] args) {
        Person person = new Person();
        
        Address address = new Address();
        address.setDiachi(10);
         
        person.address = address;
        
        System.out.print(person.address.getDiachi());
        
    }
   
}


