package com.example.javaapi.string;

public class TrimTest {

    public static void main(String[] args) {

        /** trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환 */
        String trimStr = "   java   ";

        // 앞뒤 공백 확인을 위해 # 기호 추가
        System.out.println("trimStr : #" + trimStr + "#");
        System.out.println("trim() : #" + trimStr.trim() + "#");   // 공백 제거
        
        // 원본에 영향을 주지 않음
        System.out.println("trimStr : #" + trimStr + "#");
    }
}
