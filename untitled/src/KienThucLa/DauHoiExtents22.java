package KienThucLa;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DauHoiExtents22 {

    public static <T> T writeAll(Collection<T> list, T test) {

        for (T t : list) {
            test = t;
        }
        System.out.println(test);
        return test;
    }

    public static <T> T writeAll2(Collection<? extends T> list, T test) {

        for (T t : list) {
            test = t;
        }
        System.out.println(test);
        return test;
    }

    public static void main(String[] args) {

        String dsfsf  = "gfdgfdgd";
        List<String> listString = new LinkedList<>();
        listString.add("khoa");
        listString.add("trung");

        Student object = new Student("nga", 50);

       // writeAll(listStudent , student);
        writeAll2(listString , object);
    }


}

class  Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}