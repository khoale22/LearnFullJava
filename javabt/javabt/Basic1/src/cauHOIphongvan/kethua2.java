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
public class kethua2 extends kethua{
    public static void main(String[] args) {
       // kethua2 kethua2 = new kethua2();
       // System.out.println(kethua2.tien2 + " " + kethua2.tien);
    }
    public kethua2(int c) {
        super(c, c);
        // phai cùng kieu voi lop cha
    }

//    public kethua2(int b,int c) {
//        super(c);
//        // phai cùng kieu voi lop cha
//    }  // neu ben lop cha co constructor co tham so , phai co ham nay neu ko loi
//    Trong constructor của class con khi extends phải
//            gọi constructor của lớp cha, nếu không có constructor 
//                    thì hệ thống sẽ tự tạo constructor mặc định và gọi constructor của lớp cha.
    
    @Override  // co thể có hoặc khong Override method lớp cha
    public void test(){
        System.out.print("test lop con");
    }
//    @Override  /// lỗi vì không có test22 trong lơp cha để Override
//    public void test22(){
//        System.out.print("test lop con");
//    }
    
    
}
