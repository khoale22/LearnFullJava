/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cauHOIphongvan;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maich
 */
public class ThrowAndThrows {
    private static int nhapTuoiNhanVien() throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Hãy nhập tuổi nhân viên: ");
    int tuoi = scanner.nextInt();
    if (tuoi <= 0) throw new IOException("tuổi không được nhỏ hơn 0.");
  //  if (tuoi < 0) throw new InputMismatchException("tuổi không được nhỏ hơn 0.");
    return tuoi;
}
    
    
//    public static void test() {
//       FileOutputStream fileOutputStream = null;
//       fileOutputStream = new FileOutputStream("D://output.txt");
//       fileOutputStream.write(65);
//    }
    public static void main(String[] args)  {
        try {
            ThrowAndThrows.nhapTuoiNhanVien();
        } catch (IOException ex) {
            Logger.getLogger(ThrowAndThrows.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
    
}
