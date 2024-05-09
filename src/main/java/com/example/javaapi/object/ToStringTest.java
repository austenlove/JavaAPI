package com.example.javaapi.object;

public class ToStringTest {

    public static void main(String[] args) {

        /** toString() override */
        System.out.println("==================== toString() override ====================");

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);
        Book book3 = new Book(2, "목민심서", "정약용", 30000);

        // 동일한 값을 가지는 인스턴스도 다른 해쉬코드값을 지님
        // 풀 클래스 이름과 @ 그리고 16진수 해쉬코드 반환
        System.out.println("book1.toString() : " + book1.toString());
        System.out.println("book2.toString() : " + book2.toString());
        System.out.println("book3.toString() : " + book3.toString());

        // toString()을 호출하지 않고 레퍼런스 변수만 출력하는 경우 위와 동일한 결과 출력
        // 이 점을 이용하여 toString() 메소드를 재정의하여 사용 가능
        System.out.println("book1 : " + book1);
        System.out.println("book2 : " + book2);
        System.out.println("book3 : " + book3);

    }

}
