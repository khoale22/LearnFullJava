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
public class test9 {

    public static void main(String[] args) {
        try {
            int a, b;
            b = 0;
            System.out.print("S");
            a = 5 / b;
            System.out.print("A");

        } catch (Exception e) {
            System.out.print("B");
        } finally {

        }
        System.out.print("C");
    }
}
