/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

/**
 *
 * @author maich
 */
@FunctionalInterface
interface ExecuteFunction {
    public int execute(int a, int b);
  //  public void abc(); @FunctionalInterface chi cho phép khai báo 1 astract
   
}
 
class MathUtils {
    static int test1;
     int test2;
    public  int sum2(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b) {
        return a + b;
    }
 
    public static int minus(int a, int b) {
        return a - b;
    }
}
 
public class Test3_MethodReferences {
    public static void main(String[] args) {
        MathUtils mdfdsfd = new MathUtils();
       //int dfsdf = mdfdsfd.test1;
        int a = 10;
        int b = 7;
      //  int sum = doAction(a, b, mdfdsfd::sum);
        int sum22 = doAction(a, b, mdfdsfd::sum2);
        System.out.println(a + " + " + b + " = " + sum22); // 10 + 7 = 17
 
        int minus = doAction(a, b, MathUtils::minus);
        System.out.println(a + " - " + b + " = " + minus); // 10 - 7 = 3
    }
 
    public static int doAction(int a, int b, ExecuteFunction func) {
        return func.execute(a, b);
    }
}