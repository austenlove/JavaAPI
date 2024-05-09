package com.example.javaapi.string;

public class SubstringTest {

    /** substring(startIndex) && substring(startIndex, endIndex)
     * 문자열의 일부분을 잘라내어 새로운 문자열 반환
     * 원본에 영향을 주지 않음
     */

    public static void main(String[] args) {
        String javaoracle = "javaoracle";

        // 시작 인덱스만 결과 부분 문자열에 포함되고 종료 인덱스는 부분 문자열에서 제외
        System.out.println("substring(3,6) : " + javaoracle.substring(3,6));
        System.out.println("substring(3) : " + javaoracle.substring(3));

        System.out.println("javaoracle : " + javaoracle);
    }
}
