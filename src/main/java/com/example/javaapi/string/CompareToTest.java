package com.example.javaapi.string;

public class CompareToTest {

    public static void main(String[] args) {

        // compareTo()
        String str1 = "java";
        String str2 = "java";
        String str3 = "JAVA";
        String str4 = "oracle";

        // 같으면 0 반환
        System.out.println("compareTo() : " + (str1.compareTo(str2)));   // 0

        // 대문자와 소문자는 32만큼 차이
        System.out.println("compareTo() : " + (str1.compareTo(str3)));   // 32
        System.out.println("compareTo() : " + (str3.compareTo(str1)));   // -32

        // jklmno => j부터 o까지 5만큼 차이
        System.out.println("compareTo() : " + (str1.compareTo(str4)));   // -5
        System.out.println("compareTo() : " + (str4.compareTo(str1)));   // 5


        /** 구체적으로 어떤 값이 나오는지보다 양수인지 음수인지를 판단할 목적으로 주로 사용 */

        // compareToIgnoreCase() : 대소문자를 구분하지 않고 비교
        System.out.println("compareToIgnoreCase() : " + (str2.compareToIgnoreCase(str3)));   // 0
    }
}
