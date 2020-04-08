/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maich
 */
public class Test5_GenericArray<T> {
    private T[] array;
 
    // Contructor.
    public Test5_GenericArray(T[] array) {
        this.array = array;
    }
 
    public T[] getArray() {
        return array;
    }
 
    // Trả về phần tử cuối cùng của mảng.
    public T getLastElement() {
        if (this.array == null || this.array.length == 0) {
            return null;
        }
        return this.array[this.array.length - 1];
    }
}
 class WildCardExample2 {
 
    public static void main(String[] args) {
 
        List<String> names = new ArrayList<String>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Donald");
 
        List<Integer> values = new ArrayList<Integer>();
        values.add(100);
        values.add(120);
 
        System.out.println("--- Names --");
        printElement(names);
 
        System.out.println("-- Values --");
        printElement(values);
 
    }
    ////---------CACH 1------------------
// public static void printElement(List<?> list) {
//        for (Object e : list) {
//            System.out.println(e);
//        }
//    }
 
    public static<T> void printElement(List<T> list) {
        for (Object e : list) {
            System.out.println(e);
        }
    }
 
}