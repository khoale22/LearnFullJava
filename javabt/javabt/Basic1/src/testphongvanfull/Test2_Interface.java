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
 interface Test2_Interface {
     void dosomething();
    default void testabc(){};
    
    
}
 interface Test3_Interface {
    void dosomething();   
     default void testabc3(){};
}
class A implements Test2_Interface, Test3_Interface{
 
    @Override
    public void dosomething() {
        testabc();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    public static void main(String[] args) {
//       
//    }
//    @Override
//    public void testabc() {
//        Test2_Interface.super.testabc();
//    }
}
 abstract  class AB{
    private int a;
    
    protected abstract void test43324();
    
     void test3424342(){};
}
