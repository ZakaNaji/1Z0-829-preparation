package org.znaji.chapter4.date;

import java.time.*;

public class DatesApp {
    public static void main(String[] args) {
        //different date & time classes:
        System.out.println(LocalDate.now());//2021-07-07
        System.out.println(LocalTime.now());//15:45:30.123
        System.out.println(LocalDateTime.now());//2021-07-07T15:45:30.123
        System.out.println(ZonedDateTime.now());//2021-07-07T15:45:30.123+03:00 Africa/Casablanca

        //LocalDate
        System.out.println("-----------------LocalDate-----------------");
        var date1 = LocalDate.of(2021, 7, 7);
        var date2 = LocalDate.of(2021, Month.JULY, 7);
        var date3 = LocalDate.parse("2021-07-07");
        System.out.println("date1: " + date1 + ", date2: " + date2 + ", date3: " + date3);

        //LocalTime
        System.out.println("-----------------LocalTime-----------------");
        var time1 = LocalTime.of(15, 45);
        var time2 = LocalTime.of(15, 45, 30);
        var time3 = LocalTime.of(15, 45, 30, 123);
        System.out.println("time1: " + time1 + ", time2: " + time2 + ", time3: " + time3);

        //LocalDateTime
        System.out.println("-----------------LocalDateTime-----------------");
        var dateTime1 = LocalDateTime.of(2021, 7, 7, 15, 45);
        var dateTime2 = LocalDateTime.of(date1, time3);
        System.out.println("dateTime1: " + dateTime1 + ", dateTime2: " + dateTime2);

        //ZonedDateTime
        System.out.println("-----------------ZonedDateTime-----------------");
        var zoneId = ZoneId.of("Africa/Casablanca");
        var zonedDateTime1 = ZonedDateTime.of(2021, 7, 7, 15, 45, 30, 123, zoneId);
        var zonedDateTime2 = ZonedDateTime.of(dateTime1, zoneId);
        var zonedDateTime3 = ZonedDateTime.of(date1, time3, zoneId);
        System.out.println("zonedDateTime1: " + zonedDateTime1 + ", zonedDateTime2: " + zonedDateTime2 + ", zonedDateTime3: " + zonedDateTime3);

        //error to avoid:
        //var date4 = new LocalDate();//error: LocalDate() has private access in LocalDate
        //var date5 = new LocalDate(2021, 7, 32);//error: java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 32

    }
}
