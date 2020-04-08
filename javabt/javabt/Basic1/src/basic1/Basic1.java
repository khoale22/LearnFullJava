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
public class Basic1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /// Tong CUA 10 so chan dau tien
        int tong = 0;
        for ( int i = 0; i < 20 ;i+=2 )  // i+=2  hoac i= i+2
        {
            tong = tong + i;
        
        }
        System.out.print(tong);
        
        
        
        int tongchan = 0;
        for (int i = 0; i < 10; i++) {
            tongchan +=i*2;
        }
        System.out.println("Tổng 10 số chẵn đầu tiên là:" + tongchan);
        
    }
    
}
