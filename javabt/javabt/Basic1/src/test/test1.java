/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Khoale123
 */
public class test1 {

    public static void main(String argv[]) {
        test1 c = new test1();
        String s = new String("ello");
        c.amethod(s);
    }

    public void amethod(String s) {
        char c = 'H';
        c += s;
        System.out.println(c);
    }

}
