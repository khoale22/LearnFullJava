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
public interface NewInterface {
    public static final String TEST_TE = "fds";
    // public String TEST_TE = "fds"; //NHU NHAU  vi mac dinh  static final
  //  public interface ListableJobLocator extends JobLocator  // JobLocator là interface
    /// tât cac phuong thuc trong inter là abstract , ko cần khai báo abstract
    //public void a (){ } //interface abstract methods cannot have body
  // void tenbien(int tenbien);
    
    //Một phương thức static không thể được sử dụng từ khóa this và super.
    void tenbien(int a);
    void tenbien2();
    default void abc(){
        //TEST_TE = "fds";
    }
     static void abcdfd(){
        
    };
    
}

class ImpleInterface implements NewInterface{

    @Override
    public void tenbien(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tenbien2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class a implements NewInterface{

    @Override
    public void tenbien(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void tenbien2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}