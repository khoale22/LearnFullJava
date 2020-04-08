package KienThucLa;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DauHoiExtents {

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

    private static double sum(List<? extends Number> list)
    {
        double sum=0.0;
        for (Number i: list)
        {
            //sum+=i.doubleValue();
            sum+=i.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        List<String> listStudent = new LinkedList<>();
        listStudent.add("khoa");
        listStudent.add("trung");

      //  writeAll(listStudent , 5L);

      //  writeAll2(listStudent , 5L);

        //Upper Bounded Integer List
        List<Integer> list1= Arrays.asList(4,5,6,7);

        //printing the sum of elements in list
        System.out.println("Total sum is:"+sum(list1));

        //Double list
        List<Double> list2=Arrays.asList(4.1,5.1,6.1);

        //printing the sum of elements in list
        System.out.print("Total sum is:"+sum(list2));
        String str = "Hello Loda";
        str.toUpperCase();

    }

}


