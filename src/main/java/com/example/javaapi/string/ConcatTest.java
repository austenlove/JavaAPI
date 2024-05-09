package com.example.javaapi.string;

public class ConcatTest {

    public static void main(String[] args) {
        /** concat() : 문자열에 인자로 전달된 문자열을 합쳐서 새로운 문자열 반환 */
        String str1 = "java";
        String str2 = "oracle";

        System.out.println("concat() : " + (str1.concat(str2)));
    }
}
