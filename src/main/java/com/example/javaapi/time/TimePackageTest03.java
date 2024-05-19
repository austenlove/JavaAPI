package com.example.javaapi.time;

import java.time.LocalDateTime;

public class TimePackageTest03 {

    /** 필드값 변경 - withXX(), plusXX(), minusXX() */

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();  // 인스턴스 생성
        LocalDateTime localDateTime1 = localDateTime.plusMinutes(30);
        LocalDateTime localDateTime2 = localDateTime.minusHours(3);
        LocalDateTime localDateTime3 = localDateTime.withDayOfYear(1);
        LocalDateTime localDateTime4 = localDateTime.plusDays(10);
        LocalDateTime localDateTime5 = localDateTime.minusYears(2);

        System.out.println("localDateTime = " + localDateTime);
        System.out.println("분 변경 = " + localDateTime1);
        System.out.println("시 변경 = " + localDateTime2);
        System.out.println("일 변경 = " + localDateTime3);
        System.out.println("일 변경 = " + localDateTime4);
        System.out.println("년도 변경 = " + localDateTime5);
    }
}
