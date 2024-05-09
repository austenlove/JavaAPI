package com.example.javaapi.ObjectTest;

public class HashCodeTest {

    /** Hash Code : 객체를 식별하는 값, 객체의 메모리 주소값
     *  equals()를 재정의하는 경우 반드시 hashCode() 재정의 필요 (Object 클래스 명세 참조)
     *  따라서 동등 값을 가지는 동등 객체는 같은 해시코드를 가져야 함
     */

    public static void main(String[] args) {

        // 동등 객체 생성 후 hashCode 출력
        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1의 hashCode : " + book1.hashCode());
        System.out.println("book2의 hashCode : " + book2.hashCode());
    }

}
