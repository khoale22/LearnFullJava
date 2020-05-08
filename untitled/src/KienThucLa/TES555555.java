package KienThucLa;

import java.sql.Timestamp;
import java.time.Instant;

public class TES555555 {

    public static void main(String[] args) {


        System.out.println(Instant.parse("2007-12-03T10:15:30.00Z"));

        System.out.println(Timestamp.from(Instant.parse("2007-12-03T10:15:30.00Z")));
    }
}
