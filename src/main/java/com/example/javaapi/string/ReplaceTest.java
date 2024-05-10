package com.example.javaapi.string;

public class ReplaceTest {

    /** replace()
     *  문자열에서 대체할 문자열로 기존 문자열을 변경하여 반환
     *  원본에 영향을 주지 않음
     * */

    public static void main(String[] args) {

        String javaoracle = "javaoracle";

        System.out.println("replace() : " + javaoracle.replace("java", "python"));
        System.out.println("javaoracle : " + javaoracle);
    }
}
