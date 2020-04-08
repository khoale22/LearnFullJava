/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

import java.util.Objects;

/**
 *
 * @author maich
 */
public class Test9_UtilsDeran {
    
    public static void checkIfNull(Object o , String errorMessage){
        if(Objects.isNull(o)){
           throw new IllegalArgumentException("fdsfdsfds");
        }
    }
      public static<T> void checkIfNullWithT(T t , String errorMessage){
        if(Objects.isNull(t)){
           throw new IllegalArgumentException("fdsfdsfds");
        }
    }
    
}
