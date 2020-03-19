package JavaCollectionAndHashCodeEquals;

public class WapperTest {

    public static void main(String[] args) {
        int a = 5;

        Integer b = 5;
        System.out.println(a == b);
        System.out.println(b.equals(a));  // tudong chuyen a thanh Interger (autoboxing)

        int c = 20;
        Integer i = Integer.valueOf(c);// đổi int thành Integer
        Integer j = c;// autoboxing, tự động đổi int thành Integer trong nội  dịchbộ trình biên hoac nguoc lại

         /// TOM LẠI CHUYỂN vế sau theo vế trước

        int d = 6;
        double n = 4;
        String gf = String.valueOf(d);
        String dfdf = String.valueOf(n);


    }
}
