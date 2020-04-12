package KienThucLa;

import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;


@Target(value = ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface Normalize {
}

 class AnotaionTest{

   static class Employee {
        @Normalize
        private String name;
        private String position;
        public Employee(String name, String position) {
            this.name = name;
            this.position = position;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getPosition() {
            return position;
        }
        public void setPosition(String position) {
            this.position = position;
        }
    }
     public static void normalize(Employee employee) {
         Field[] fields = employee.getClass().getDeclaredFields();
         for (int i = 0; i < fields.length; i++) {
             Normalize normalize = fields[i].getAnnotation(Normalize.class);
             if (normalize != null) {
                 try {
                     fields[i].setAccessible(true);
                     if (fields[i].get(employee) != null) {
                         fields[i].set(employee, String.valueOf(fields[i].get(employee)).replaceAll("[^A-Za-z0-9 ]", ""));
                     }
                 } catch (Exception ex) {
                     ex.printStackTrace();
                 }
             }
         }
     }

     public static void main(String[] args) throws IOException {
         Employee employee = new Employee("Ng%^u*yen#@ Nhat^%%#@ Ho@a*&amp;amp;amp;ng!!!-", "Software%^$ Engineer@");

         normalize(employee);

         System.out.println(employee.getName());
         System.out.println(employee.getPosition());
     }

}