package com.example.javaapi.string;

public class ToLowerCaseUpperCaseTest {

    /** toLowerCase() : 모든 문자를 소문자로 변환시킨다.
     * toUpperCase() : 모든 문자를 대문자로 변환시킨다.
     * 원본에는 영향을 주지 않는다.
     */

    public static void main(String[] args) {
        String caseStr = "JavaOracle";

        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        System.out.println("toUpperCase() : " + caseStr.toUpperCase());

        System.out.println("caseStr : " + caseStr);   // JavaOracle
    }
}
