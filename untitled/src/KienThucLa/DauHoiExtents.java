package KienThucLa;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DauHoiExtents {

    public static <T> T writeAll(Collection<T> list, T test) {

        for (T t : list) {
            test = t;
        }
        return test;
    }

    public static <T> T writeAll2(Collection<? extends T> list, T test) {

        for (T t : list) {
            test = t;
        }
        return test;
    }

    public static void main(String[] args) {

        List<String> listStudent = new LinkedList<>();
        listStudent.add("khoa");
        listStudent.add("trung");

      //  writeAll(listStudent , 5L);

        writeAll2(listStudent , 5L);


    }

}


