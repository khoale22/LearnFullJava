/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cauHOIphongvan;

import java.io.Serializable;

/**
 *
 * @author maich
 */
import java.io.*;
class Test implements Serializable{
    int i = 124, j = 123;

    // Transient variables
    transient int k = 20;

    // khong bi anh huong boi transient
    transient static int l = 100;
    transient final int m = 900;
    final transient int b = 110;
    public static void main(String[] args) throws Exception
    {
        Test input = new Test();
        // serialization
        FileOutputStream fos = new FileOutputStream("C:\\New folder\\student2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);

        // de-serialization
        FileInputStream fis = new FileInputStream("C:\\New folder\\student2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Test output = (Test)ois.readObject();
        System.out.println("i = " + output.i);
        System.out.println("j = " + output.j);
        System.out.println("k = " + output.k);
        System.out.println("l = " + output.l);
        System.out.println("m = " + output.m);
          System.out.println("b = " + output.b);
    }
}