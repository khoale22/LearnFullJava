package KienThucLa;

public class StringThreeDots {
    public static transient int adf = 5;

    public static void test(String... strings){
        for (String variable : strings){
            System.out.println(variable);
        }
    }

    public static void main(String[] args) {

        System.out.println("1 BIEN");
        StringThreeDots.test("khoa");

        System.out.println("2 BIEN");
        StringThreeDots.test("khoa", "trung");

        System.out.println("3 BIEN");
        StringThreeDots.test("khoa", "trung" , "bình");

        System.out.println("3 BIEN");
        StringThreeDots.test((new String[]{"a", "b", "c"}));


    }

}

class test45{


    public static void main(String[] args) {

        System.out.println(StringThreeDots.adf);

    }
}