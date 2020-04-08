/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic1;

/**
 *
 * @author Khoale123
 */
public class FibonacciKHongdequy {
    
    
    ////10 số đầu tiên của dãy số fibonacci: 0 1 1 2 3 5 8 13 21 34 
    

    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

       
         public static void main(String[] args) {
        System.out.println("10 số đầu tiên của dãy số fibonacci: ");
        for (int n = 0; n < 10; n++) {
            System.out.print(fibonacci(n) + " ");
        }
    }
     


    
}
