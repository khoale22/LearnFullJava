package KienThucLa;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.TimeZone;

public class TImeZoneTest {
}

 class NewClass {

     private static final String DATE_FORMAT_IN_DATABASE = "yyyy-MM-dd HH:mm:ss";

    public static long getOffsetBetweenUTCAndDefaultTimeZone() {

        TimeZone utcTimeZone = TimeZone.getTimeZone("UTC");
        TimeZone defaultTimeZone = TimeZone.getTimeZone(ZoneId.systemDefault());
        return utcTimeZone.getRawOffset() - defaultTimeZone.getRawOffset() + utcTimeZone.getDSTSavings() - defaultTimeZone.getDSTSavings();

    }

     public static Instant toInstant(String dateString) {

         return convertStringToInstant(dateString, DATE_FORMAT_IN_DATABASE);
     }

     /**
      * Convert string date into instant date.
      *
      * @param dateString the string date to format.
      * @param format     the string format to format.
      * @return the instant date for passed valid param, throw exception otherwise.
      */
     public static Instant convertStringToInstant(String dateString, String format) {


         final DateTimeFormatter formatter = DateTimeFormatter
                 .ofPattern(format)
                 .withLocale(Locale.getDefault())
                 .withZone(ZoneId.systemDefault());

         return Instant.from(formatter.parse(dateString));
     }


    public static void main(String[] args) {
        System.out.println(NewClass.getOffsetBetweenUTCAndDefaultTimeZone());

        System.out.println( LocalTime.now(ZoneId.of("Asia/Ho_Chi_Minh")));
        System.out.println( LocalTime.now( ZoneId.of("America/Los_Angeles")));
        System.out.println( LocalTime.now( ZoneId.of("Asia/Bangkok")));

        System.out.println(Instant.parse("9999-12-31T00:00:00.00Z"));
        System.out.println(Timestamp.from(Instant.parse("9999-12-31T00:00:00.00Z")));

        System.out.println("-------------------------------------");

        System.out.println(NewClass.toInstant("9999-12-31 00:00:00"));
        System.out.println(Timestamp.from(NewClass.toInstant("9999-12-31 00:00:00")));

        System.out.println("Instant.now()) : " + Instant.now());

        System.out.println("phan 2") ;
        System.out.println("Instant.ofEpochMilli : " + Instant.ofEpochMilli(-8_520_314_400_000L));

        System.out.println("Instant.ofEpochMilli : " + Instant.ofEpochMilli(-8_520_249_601_000L));
        System.out.println("Instant.ofEpochMilli : " + Instant.ofEpochMilli(-8_520_249_601_000L).plus(6, ChronoUnit.HOURS));

        System.out.println("phan 3") ;
        System.out.println("Instant.ofEpochMilli : " + Timestamp.from(Instant.ofEpochMilli(-8_520_314_400_000L)));

        System.out.println("Instant.ofEpochMilli : " + Timestamp.from(Instant.ofEpochMilli(-8_520_249_601_000L)));
        System.out.println("Instant.ofEpochMilli : " + Timestamp.from(Instant.ofEpochMilli(-8_520_249_601_000L).plus(6, ChronoUnit.HOURS)));

        System.out.println("phan 4") ;

        System.out.println(Instant.parse("9999-12-31T06:00:00.00Z").toEpochMilli());
        System.out.println(Instant.parse("1700-01-01T06:00:00Z").toEpochMilli());

        System.out.println(Instant.ofEpochMilli(253402236000000L));
        System.out.println(Timestamp.from(Instant.ofEpochMilli(253402236000000L)));

//        private static final Instant COST_EFFECTIVE_TIME = Instant.ofEpochMilli(-8_520_314_400_000L);
//        // This is equivalent to 01-01-1700 23:59:59 central time
//        private static final Instant COST_EXPIRATION_TIME = Instant.ofEpochMilli(-8_520_249_601_000L).plus(6, ChronoUnit.HOURS);


//        Ins



    }
}
