/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chuoivamang;

/**
 *
 * @author Khoale123
 */
public class chuoi {
    public static void main(String[] args) {
         String a = new String("abc");
    String b = "adf";
    
    String noi = a.concat(b);
     System.out.println("noi chuoi concac"+ noi);
    
     String d ="Happy new";
     
     char e = d.charAt(4);
      
     char e1 = d.charAt(5); // tra ve ky tu trong
      System.out.println(e);
       System.out.println(e1);
       System.out.println(e);
       
       int result;
    String string1 = "Happy new year!";
    String string2 = "Happy new ytai!";
         
    result = string1.compareTo(string2);
    if (result == 0) {
        System.out.println("Chuỗi " + string1 + " == " + string2);
    } else if (result < 0) {
        System.out.println("Chuỗi " + string1 + " < " + string2);
    } else {
        System.out.println("Chuỗi " + string1 + " > " + string2);
    }
       
     String string4 = new String("   Welcome to Freetuts.net!   ");
         
    // loại bỏ các khoảng trắng thừa trong chuỗi string1
    string1 = string4.trim();
         
    System.out.println("Chuỗi sau khi loại bỏ khoảng trắng thừa là " + string1);
    
    
    
    String j= "Happy" ;
    String j1 = j.replace('a', 'b');
   System.out.println(j1);
    
    
    
    
    
    
    String s1="this is index of example";  
//passing substring  
int index1=s1.indexOf("is");//tra ve chi muc cua chuoi con is  dau tien
int index2=s1.indexOf("index");//tra ve chi muc cua chuoi con index  
System.out.println(index1+"  "+index2);//2 8  
  
//truyen chuoi con tu chi muc  
int index3=s1.indexOf("is",4);//tra ve chi muc cua chuoi con is sau vi tri chi muc thu 4  
System.out.println(index3);//5 la chi muc cua chuoi con is khac  
  
//truyen gia tri char  
int index4=s1.indexOf('s');//tra ve chi muc cua ky tu s  
System.out.println(index4);//3 


   System.out.println("testfd " +   s1.indexOf(2)); 


String s8="Vietjack";  
System.out.println(s8.substring(2,4));//tra ve et      2 - (4-1)
System.out.println(s8.substring(2));//tra ve etjack  
} 
    
    
    
}
