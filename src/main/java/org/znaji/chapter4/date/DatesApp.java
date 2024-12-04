package org.znaji.chapter4.date;

import java.time.*;
import java.time.temporal.ChronoUnit;

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

        //manupulating dates:
        System.out.println("-----------------manupulating dates-----------------");
        var date = LocalDate.of(2024, Month.JANUARY, 20);
        System.out.println("date: " + date);
        date = date.plusDays(2); //LocalDate is immutable so we need to assign the result to a variable
        System.out.println("date plus 2 days: " + date);
        date = date.plusMonths(1);
        System.out.println("date plus 1 month: " + date);
        date = date.plusYears(2);
        System.out.println("date plus 2 years: " + date);

        //manupulating data time:
        System.out.println("-----------------manupulating data time-----------------");
        var time = LocalTime.of(15, 45);
        var dateTime = LocalDateTime.of(date, time);
        System.out.println("dateTime: " + dateTime);
        dateTime = dateTime.minusDays(2);
        System.out.println("dateTime minus 2 days: " + dateTime);
        dateTime = dateTime.minusHours(3);
        System.out.println("dateTime minus 3 hours: " + dateTime);
        dateTime = dateTime.minusMinutes(30);
        System.out.println("dateTime minus 30 minutes: " + dateTime);

        //working with periods:
        System.out.println("-----------------working with periods-----------------");
        var period = Period.ofMonths(1);
        var datePeriod = date.plus(period);
        System.out.println("date plus 1 month: " + datePeriod);
        var dateTimePeriod = dateTime.plus(period);
        System.out.println("dateTime plus 1 month: " + dateTimePeriod);
        //var timePeriod = time.plus(period);//error: UnsupportedTemporalTypeException: Unsupported unit: Months

        //working with durations:
        System.out.println("-----------------working with durations-----------------");
        var dayDuration = Duration.ofDays(1);
        var hourDuration = Duration.ofHours(1);
        var minuteDuration = Duration.of(1, ChronoUnit.MINUTES);
        var secondDuration = Duration.ofSeconds(1);
        var nanoDuration = Duration.of(1, ChronoUnit.NANOS);
        var timeDuration = time.plus(hourDuration);
        var dateTimeDuration = dateTime.plus(hourDuration);
        System.out.println("dayDuration: " + dayDuration + ", hourDuration: " + hourDuration + ", minuteDuration: " + minuteDuration + ", secondDuration: " + secondDuration + ", nanoDuration: " + nanoDuration);
        System.out.println("time plus 1 hour: " + timeDuration + ", dateTime plus 1 hour: " + dateTimeDuration);

    }
}
