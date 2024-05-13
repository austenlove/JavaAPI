package com.example.javaapi.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

    /** Calendar Class
     *  불변 객체가 아니기 때문에 값 수정 가능 (set 메소드)
     *  윤초(leap second)를 고려하지 않음
     *  달을 0부터 11까지 표현하는 불편함
     */

    public static void main(String[] args) {

        /** Calendar */
        Calendar calendar = Calendar.getInstance();   // getInstance() static 메소드 사용
        System.out.println(calendar);

        // GregorianCalendar 이용하는 방법
        Calendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar);

        // 년, 월, 일, 시, 분, 초 정보를 이용해 인스턴스 생성
        int year = 2024;
        int month = 4;   // 달은 0~11월로 사용
        int dayOfMonth = 13;
        int hour = 0;
        int min = 15;
        int second = 0;

        Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
        System.out.println(birthDay);

        // getTimeInMillis() ->  birthday의 milliseconds 값 출력
        System.out.println(birthDay.getTimeInMillis());

        /** getTimeInMillis()
         *  Calendar 객체가 나타내는 시간을 milliseconds(long 타입)로 반환
         *  해당 날짜와 시간을 1970년 1월 1일 00:00:00 GMT(그리니치 표준시)부터
         *  몇 milliseconds가 지났는지를 반환하는 메소드 */

        // getTimeInMillis()로 출력된 정수 -> Date 객체 생성
        Date date = new Date(birthDay.getTimeInMillis());
        System.out.println(date);   // milliseconds 값이 Date의 형태로 출력됨

        Date date2 = new Date(new GregorianCalendar(year, month, dayOfMonth, hour, min, second).getTimeInMillis());
        System.out.println(date2);


        /** Calendar 클래스는 연도, 월, 일 등을 상수로 정의해둠 */
        // get()으로 Calendar 객체의 필드 정보 가져오기
        int birthYear = birthDay.get(1);
        int birthMonth = birthDay.get(2);
        int birthDayOfMonth = birthDay.get(5);

        System.out.println(birthYear);
        System.out.println(birthMonth);
        System.out.println(birthDayOfMonth);

        System.out.println(Calendar.YEAR);   // 1
        System.out.println(Calendar.MONTH);   // 2
        System.out.println(Calendar.DATE);   // 5

        /** get()메소드의 인자로 정수 대신 상수 필드값을 호출하면 의미 전달이 보다 쉬워짐 */
        System.out.println("year : " + birthDay.get(Calendar.YEAR));
        System.out.println("month : " + birthDay.get(Calendar.MONTH));   // 0~11월
        System.out.println("dayOfMonth : " + birthDay.get(Calendar.DATE));
        /** 요일 => 일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7) */
        System.out.println("dayOfWeek : " + birthDay.get(Calendar.DAY_OF_WEEK));


        String day = "";
        switch(birthDay.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                day = "일";
                break;
            case Calendar.MONDAY:
                day = "월";
                break;
            case Calendar.TUESDAY:
                day = "화";
                break;
            case Calendar.WEDNESDAY:
                day = "수";
                break;
            case Calendar.THURSDAY:
                day = "목";
                break;
            case Calendar.FRIDAY:
                day = "금";
                break;
            case Calendar.SATURDAY:
                day = "토";
                break;
        }
        System.out.println("요일 : " + day);

    }
}
