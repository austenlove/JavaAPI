package com.example.javaapi.ObjectTest;

public class EqualsTest {

    public static void main(String[] args) {

        /** equals() override */
        System.out.println("===================== equals() override =====================");

        // 동일 객체: 주소가 동일한 인스턴스
        // 동등 객체:  주소는 다르더라도 필드값이 동일한 객체

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2));
        System.out.println("두 인스턴스의  equals() 비교 : " + book1.equals(book2));

    }

}
