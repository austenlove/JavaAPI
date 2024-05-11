package com.example.javaapi.stringbuilder;

public class StringBuilderTest {

    /** String과 StringBuilder */
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("java");

        System.out.println("sb : " + sb);   // toString이 오버라이딩되어 있음
        System.out.println("sb의 hashCode : " + sb.hashCode());

        // 문자열 수정
        sb.append("oracle");
        System.out.println("sb : " + sb);
        System.out.println("sb의 hashCode : " + sb.hashCode());  // 위와 동일한 hashCode 출력 (문자열 변경해도 인스턴스가 변경된 것은 아님)


        /** StringBuilder에서 자주 사용되는 메소드 */
        StringBuilder sb1 = new StringBuilder();

        // capacity() : 용량(현재 버퍼 크기)을 정수형으로 반환 (문자열 길이 + 16이 기본)
        System.out.println(sb1.capacity());

        // append() : 인자로 전달된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가
        for(int i=0; i<50; i++) {
            sb1.append(i);

            System.out.println("sb1 : " + sb1);
            System.out.println("sb1의 capacity : " + sb1.capacity());   // 2n+2씩 증가
            System.out.println("sb1의 hashcode : " + sb1.hashCode());   // 동일 인스턴스
        }

        StringBuilder sb2 = new StringBuilder("javaoracle");

        // delete() : 시작 인덱스와 종료 인덱스를 설정해 원하는 부분의 문자열 제거
        // deleteCharAt() : 문자열 인덱스를 설정해 문자 하나 제거
        // 원본에 영향을 미침
        System.out.println("delete() : " + sb2.delete(2, 5));   // jaracle
        System.out.println("deleteCharAt() : " + sb2.deleteCharAt(0));   // aracle
        System.out.println("sb2 : " + sb2);

        // insert() : 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가
        System.out.println("insert() : " + sb2.insert(1, "vao"));
        System.out.println("insert() : " + sb2.insert(0, "j"));

        // 인덱스 번호가 문자열 길이와 동일하면 append()와 같은 역할
        System.out.println("insert() : " + sb2.insert(sb2.length(), "jdbc"));
        System.out.println("sb2 : " + sb2);


        // reverse() : 문자열을 역순으로 재배열
        // 원본에 영향을 미침
        System.out.println("reverse() : " + sb2.reverse());
        System.out.println("sb2 : " + sb2);

    }
}
