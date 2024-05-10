package com.example.javaapi.string;

public class EqualsTest {

    /** 문자열 객체 만드는 법
     *  1) "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리
     *  2) new String("문자열") : 매번 새로운 인스턴스 생성
     * */

    public static void main(String[] args) {

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        // 리터럴 형태로 만든 문자열 인스턴스 => 동일한 값의 인스턴스를 하나의 인스턴스로 관리
        // 따라서 주소값을 비교하는 == 연산으로 비교 시 동일한 주소를 비교하게 되므로 true 반환
        System.out.println("str1 == str2 : " + (str1 == str2) );

        // new 연산자로 새 인스턴스 생성 시 == 연산으로 비교하면 서로 다른 주소값을 가지므로 false 반환
        System.out.println("str2 == str3 : " + (str2 == str3) );

        // new 연산자로 새로운 인스턴스 생성 시 값이 같아도 주소는 상이
        System.out.println("str3 == str4 : " + (str3 == str4) );

        // 위의 4개의 문자열은 모두 동일한 hashCode 값을 가짐
        // 동일한 문자열은 동일한 hashCode 값을 반환하도록 재정의하였기 때문
        System.out.println("str1의 hashCode : " + str1.hashCode() );
        System.out.println("str2의 hashCode : " + str2.hashCode() );
        System.out.println("str3의 hashCode : " + str3.hashCode() );
        System.out.println("str4의 hashCode : " + str4.hashCode() );

        // 문자열은 불변이라는 특징을 지님
        // 기존 문자열이 + 연산을 수행하는 경우 문자열을 수정하는 것이 아니라
        // 새로운 문자열을 할당하게 됨
        str2 += "oracle";

        // str1과 str2는 동일한 인스턴스였지만 수정 후 다른 인스턴스가 됨
        System.out.println("str1 == str2 : " + (str1 == str2) );

    }
}
