/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

import java.util.function.Function;

/**
 *
 * @author maich
 */
public class Test8_Function {
    
}
class User {
    private String name;
    private String email;
    String password;
 
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
 
class Member {
    private String name;
    String email2;
 
    public Member(String name, String email2) {
        this.name = name;
        this.email2 = email2;
    }
    public static String test34(){
     return "Hello";
      }
     public String test345(Member member){
     return "Hello";
      }
       public Void test3456(Member member){
         System.out.print("fds");
         return null;
      }
 
    @Override
    public String toString() {
        return "Member [name=" + name + ", email=" + email2 + "]";
    }
}
 
 class FunctionExample2 {
 
    public static void main(String[] args) {
        Function<String, Integer> numberConverter = (str) -> Integer.parseInt(str);
        System.out.println(numberConverter.apply("1")); // 1
        Member memberTest = new Member("Khoa", "fdhfods.com");
        
        Function<Member, String> test = memberTest::test345;
        test.apply(memberTest);
       String test454353 = test.toString();
       String test4543534 =  test.apply(memberTest);// CHINH XAC // HELLo
       
        Function<Member, Void> test324 = memberTest::test3456;
        Function<Member, String> test33 = Member::test34;
        User usetTest = new User("fdsf", "gfsjkg.com", "fdsfs");
        Function<String, String> test3243545 = usetTest::setEmail;
        
        
 
        
 
        Function<User, Member> mapUserToMember = u -> new Member(u.name, u.getEmail());
 
        User user = new User("gpcoder", "gpcodervn@gmail.com", "123");
        Member member = mapUserToMember.apply(user);
        System.out.println(member);
    }
}
