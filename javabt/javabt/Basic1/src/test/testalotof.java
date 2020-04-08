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
public class testalotof {
static int i9;
    public static void main(String[] args) {
        String a = "Hello";

        String s = a.substring(0, 3); // lay gia tri tu 0 - (3-1)
        System.out.println(s);

        System.out.println("BAI 2");

        int[] mang = new int[3];

        int s1 = 0;

        int j = 0;

        for (int i : mang) {

            i = j++; // ++j ket qua la 6;

            s1 += i; 
// khi j = 0 thi i = 0 ; j moi tang len 1 => s =0
// khi j = 1 thi i = 1 ; j moi tang len 2 => s =1
// khi j = 2 thi i = 2 ; j moi tang len 3 => s =3


        }
        System.out.println("S = " + s1);
        System.out.println(j);

//        for (int i = 0; i <= 10; i++) {
//
//            int s3 = 0;
//
//            s3 += i;                    // lenh sai vi s3 chi hieu trong vong for
//        }
//
//        System.out.print(s3);
        for (int i = 0; i <= 10; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("BAI 4");
        int i4 = 1;

        int s4 = 1;

        for (i4 = 1; i4 <= 3; i4++) {
            s4 = s4 * i4;
        }

        System.out.println(i4);

        System.out.println("BAI 5");
        int n = 12, k = 2;

        while (k < n) {

            for (k = 2; k <= n; k++) {
                if (n % k == 0) {

                    {

                        System.out.print(k + " ");

                        n = n / k;

                        break;

                    }

                }
            }
        }

//        System.out.println("BAI 6");
//        int k6, n6;
//
//        for (k6 = 1; k6 < 10; k++) {
//            if ((k6 % 3 == 0) && (k6 % 7 == 0)) {
//                System.out.print(k6 + " ");
//            }
//        }
        System.out.println("BAI 7");
        int i7;

        float p7;

        p7 = 1;

        for (i7 = 1; i7 <= 3; i7++) {

            p7 = p7 * i7;

            p7 = p7 * p7;

        }
         System.out.println(p7);
         
         
          System.out.println("BAI 8");
          
         
          int anar[]=new int[]{1, 2, 3};
System.out.println(anar[1]);
 

System.out.println(i9);
    }
}
