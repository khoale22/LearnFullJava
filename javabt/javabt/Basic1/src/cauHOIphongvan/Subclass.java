/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cauHOIphongvan;

/**
 *
 * @author maich
 */
public class Subclass extends Superclass {
    int number = 20;
 
    @Override
    public void hienThi() {
        System.out.println("Đây là phương thức hienThi() của lớp con");
    }
    
   
 
    public static void main(String[] args) {
        Superclass objSubclass = new Subclass();
        objSubclass.hienThi();
        objSubclass.test();
        
        Superclass cha = new Superclass();
        cha.hienThi();
      //  objSubclass.subclassMethod();
    }
 
}
