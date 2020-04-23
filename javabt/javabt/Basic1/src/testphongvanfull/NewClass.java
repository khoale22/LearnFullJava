/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testphongvanfull;

import java.time.Instant;
import java.time.ZoneId;
import java.util.TimeZone;

/**
 *
 * @author mrv
 */
public class NewClass {
     public static long getOffsetBetweenUTCAndDefaultTimeZone() {

        TimeZone utcTimeZone = TimeZone.getTimeZone("UTC");
        TimeZone defaultTimeZone = TimeZone.getTimeZone(ZoneId.systemDefault());
        return utcTimeZone.getRawOffset() - defaultTimeZone.getRawOffset() + utcTimeZone.getDSTSavings() - defaultTimeZone.getDSTSavings();
       
    }
     public static void main(String[] args) {
        System.out.print(NewClass.getOffsetBetweenUTCAndDefaultTimeZone());
     }
}
