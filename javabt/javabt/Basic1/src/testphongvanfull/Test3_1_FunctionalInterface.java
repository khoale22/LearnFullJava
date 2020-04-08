/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

import java.util.List;

/**
 *
 * @author maich
 */
@FunctionalInterface
public interface Test3_1_FunctionalInterface {
    void doSomething();
        
    int hashCode();
 
    String toString();
 
    boolean equals(Object obj);
    
  //  Object clone();
     default void defaultMethod2() {
 
    }
 
     static void staticMethod() { // PUBLIC
 
    }
}

class Dfskfs implements Test3_1_FunctionalInterface{

    @Override
    public void doSomething() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
