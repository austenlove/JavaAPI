package com.example.javaapi.string;

public class EscapeTest {

    /** 이스케이프(escape) 문자
     * 문자열에서 특수문자를 표현하거나 특수기능을 사용할 때 사용하는 문자
     *
     *    \n         개행(줄바꿈)
     *    \t         탭
     *    \'         작은 따옴표
     *    \"         큰따옴표
     *    \\         역슬래쉬 표시
     * */

    public static void main(String[] args) {

        // 개행 문자
        System.out.println("안녕하세요.\n홍길동입니다.");

        // 탭 문자
        System.out.println("안녕하세요.\t홍길동입니다.");

        // 작은따옴표
        System.out.println("안녕하세요. '홍길동'입니다.");

        // 쌍따옴표
        System.out.println("안녕하세요. \"홍길동\"입니다.");

        // 역슬래쉬
        System.out.println("안녕하세요. \\홍길동\\입니다.");

        /** split() 사용 시 이스케이프 문자를 사용해야 하는 특수문자도 존재한다.
         *
         * 이스케이프 문자 사용 안하는 특수문자
         * ~ ` ! @ # % & - _ = ; : ' \ " ,  < > /
         *
         * 이스케이프 문자를 사용하는 특수문자(\\)
         * $ ^ * ( ) + | { } [ ] . ?
         *
         * (앞에 \\ 붙여야 한다.
         * 정규표현식에서 사용되는 특수문자인 경우 \$가 정규표현식 문자와 겹치게 된다.
         * 따라서 $를 기준으로 split 을 하기 위해서는 정규표현식 문자가 아닌 $라는 구분자로 split 하겠다는 의미로 사용되려면
         * 구분문자를 \$로 표현해야 한다.
         * 하지만, 역슬래쉬가 위에서 배운 이스케이프 문자의 역슬래쉬와 겹친다.
         * 따라서 \\$로 해야 역슬래쉬 + $ 로 인식해서 정규표현식을 탈출하는 탈출문자가 된다.)
         */

        String str = "java/oracle/jdbc";
        String[] sarr = str.split("/");

        for(String s : sarr) {
            System.out.println(s);
        }
    }
}
