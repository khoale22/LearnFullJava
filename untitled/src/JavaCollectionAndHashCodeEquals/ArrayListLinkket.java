package JavaCollectionAndHashCodeEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkket {

    public static void main(String[] args) {

        List<Integer>  newArrayList = new ArrayList<Integer>();
        newArrayList.add(1);
        newArrayList.add(3);
        newArrayList.add(1, 2);

        List<Integer>  newIntegerList = new LinkedList<Integer>();
        newIntegerList.add(1);
        newIntegerList.add(3);
        newIntegerList.add(1, 2);

        System.out.println("size" + newArrayList.size());
        System.out.println("size" + newIntegerList.size());

        System.out.println(newArrayList.get(2));
        System.out.println(newIntegerList.get(2));

        for (Integer i : newArrayList) {
            System.out.print(i);
        }
        System.out.println();
        for (Integer i : newIntegerList) {
            System.out.print(i);
        }



    }

}


