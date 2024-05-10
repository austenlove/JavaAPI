package com.example.javaapi.string;

public class LengthAndIsEmptyTest {

    public static void main(String[] args) {

        String javaoracle = "javaoracle";

        // length() : 문자열의 길이를 정수형으로 반환
        System.out.println("length() : " + javaoracle.length());
        System.out.println("빈 문자열 길이 : " + ("".length()) );

        // isEmpty() : 문자열의 길이가 0이면 true, 아니면 false 반환
        // 길이가 0인 문자열은 null과는 다름
        System.out.println("isEmpty() : " + ("".isEmpty()) );
        System.out.println("isEmpty() : " + ("abc".isEmpty()) );

    }
}
