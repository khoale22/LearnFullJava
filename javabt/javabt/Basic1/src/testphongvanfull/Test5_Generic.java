/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

import java.util.Collection;

/**
 *
 * @author maich
 */
public class Test5_Generic<K,V> {
   
    private K key;
    private V value;
    
     public Test5_Generic(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * @return the key
     */
    public K getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * @return the value
     */
    public V getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(V value) {
        this.value = value;
    }
    public static void main(String[] args) {
        Test5_Generic<Integer ,String> test5_Generic = new Test5_Generic<Integer,String >(1, "khoa");
    }
    
}
//class TEdfds<K,T> extends Test5_Generic<K,M>{
//    /// ERROR
//}
class TEdfds<K,T> extends Test5_Generic<String,Integer>{
 
    public TEdfds(String key, Integer value) {
        super(key, value);
    }
}
 interface GenericDao<T> {
 
    void insert(T obj);
 
    void update();
 
}
class MyUtils {
    public static<T> int count(Collection<T> collection, T itemToCount) {
        int count = 0;
        for (T item : collection) {
            if (itemToCount.equals(item)) {
                count++;
            }
        }
        return count;
    }
}