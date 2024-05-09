package com.example.javaapi.string;

public class IndexOfTest {

    public static void main(String[] args) {

        /** indexOf() :
         * 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환
         * 일치하는 문자가 없는 경우 -1을 반환
         */

        String indexOf = "java oracle";

        System.out.println("indexOf('a') : " + indexOf.indexOf("a"));   // 1
        System.out.println("indexOf('z') : " + indexOf.indexOf("z"));   // -1

        /** lastIndexOf() :
         * 문자열에서 특정 문자를 뒤에서부터 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환
         * 일치하는 문자가 없는 경우 -1을 반환
         */
        System.out.println("lastIndexOf('a') : " + indexOf.lastIndexOf("a"));   // 7
        System.out.println("lastIndexOf('z') : " + indexOf.lastIndexOf("z"));   // -1
    }
}
