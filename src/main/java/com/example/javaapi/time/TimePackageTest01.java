package com.example.javaapi.time;

import java.time.*;

public class TimePackageTest01 {

    /** Time 패키지
     *  Date와 Calendar와 다르게 불변 => 날짜와 시간을 변경을 하면 기존의 객체가 변경되는 것이 아닌 새로운 객체 반환
     *  불변함으로 멀티스레드 환경에서도 안전
     *
     *  핵심 클래스
     *  LocalTime : 시간 작업 시 사용. 두 개의 정적 메소드를 통해 반환
     *  LocalDate : 날짜 작업 시 사용. 두 개의 정적 매소드를 통해 반환
     *  LocalDateTime : 시간과 날짜를 함께 작업할 때 사용
     *  ZonedDateTime : 시간대를 활용한 작업 필요 시 사용
     */

    public static void main(String[] args) {

        // LocalTime
        // now() : pc의 현재 시간 기준 LocalTime 객체 반환
        // of() : 매개변수로 받은 시간 기준 LocalTime 객체 반환
        LocalTime timeNow = LocalTime.now();
        LocalTime timeOf = LocalTime.of(18, 30, 0);
        System.out.println("timeNow : " + timeNow);
        System.out.println("timeOf : " + timeOf);

        // LocalDate
        // now() : pc의 현재 날짜 기준 LocalDate 객체 반환
        // of() : 매개변수로 받은 날짜 기준 LocalDate 객체 반환
        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf = LocalDate.of(2022, 1, 1);
        System.out.println("dateNow : " + dateNow);
        System.out.println("dateOf : " + dateOf);

        // LocalDateTime
        // now() : pc의 현재 시간과 날짜 기준 LocalDate 객체 반환
        // of() : 매개변수로 받은 시간과 날짜 기준 LocalDate 객체 반환
        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
        System.out.println("dateTimeNow : " + dateTimeNow);
        System.out.println("dateTimeOf : " + dateTimeOf);

        // ZonedDateTime
        // now() : ZoneId를 매개변수로 넘기면 ZonedDateTime 객체 반환
        // of() : 매개변수로 java.util.TimeZone의 getAvailableIDs()가 반환하는 값을 넣어 ZoneId를 반환받을 수 있다.
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTimeNow : " + zonedDateTimeNow);
        System.out.println("zonedDateTimeOf : " + zonedDateTimeOf);
    }

}
