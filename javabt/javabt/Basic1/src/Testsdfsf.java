/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maich
 */
public class Testsdfsf {
    public static String trimLeadingZeros(String source) {
    for (int i = 0; i < source.length(); ++i) {
        char c = source.charAt(i);
        if (c == '0') {
            System.out.println(source.substring(i));
            return  source.substring(i);
        }else{
            break;
        }
    }
   return null;
}
    
    
    public static void main(String[] args) {
        String source = "00001244";
       // trimLeadingZeros(source);
        for (int i = 0; i < source.length(); ++i) {
        char c = source.charAt(i+1);
        if (c == '0') {
            System.out.println(source.substring(i+1));
            callapi ---
                    if(........getRecord() != 0){
                         break;
                    }
        }
        }else{
            break;
        }
    }
        
    }
}
