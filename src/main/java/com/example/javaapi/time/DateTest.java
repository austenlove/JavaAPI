package com.example.javaapi.time;

import java.util.Date;

public class DateTest {

    /** Date 클래스는 Deprecated */

    public static void main(String[] args) {

        Date today = new Date();
        System.out.println(today);

        // getTime() : 1970. 1. 1 0시 0분 0초 이후 지난 시간을 millisecond로 계산하여 long 타입으로 반환
        System.out.println(today.getTime());

        Date time = new Date(1715526080374L);
        System.out.println(time);
    }
}
