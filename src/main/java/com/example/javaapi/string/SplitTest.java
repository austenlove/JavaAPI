package com.example.javaapi.string;

import java.util.StringTokenizer;

public class SplitTest {

    public static void main(String[] args) {

        /** split() vs StringTokenizer
         *  문자열을 특정 구분자로 분리한 문자열 반환 */

        /** split(String delimiter) / split(String delimiter, int limit)
         *  정규표현식을 이용하여 문자열 분리
         *  비정형화된 문자열을 분리할 때 사용 (공백 포함)
         *  정규표현식을 이용하기 때문에 속도가 느리다는 단점
         *  (주로 자바스크립트에서 다룸)
         *  */

        /** 2) StringTokenizer :
         *  문자열의 모든 문자들을 구분자로 하여 문자열 분리
         *  정형화된 문자열 패턴을 분리할 때 사용
         *  split()보다 속도면에서 빠름
         *  구분자 생략 시 공백이 기본 구분자
         * */


        String emp1 = "100/홍길동/서울/영업부";
        String emp2 = "200/유관순//총무부";
        String emp3 = "300/이순신/경기도/";


        System.out.println("==================== split() ====================");

        // split()을 이용한 문자열 분리
        String[] emp1Arr = emp1.split("/");
        String[] emp2Arr = emp2.split("/");
        String[] emp3Arr = emp3.split("/");

        for(int i=0; i< emp1Arr.length; i++) {
            System.out.println("emp1Arr[" + i + "] : " + emp1Arr[i]);
        }

        for(int i=0; i< emp2Arr.length; i++) {
            System.out.println("emp2Arr[" + i + "] : " + emp2Arr[i]);
        }

        for(int i=0; i< emp3Arr.length; i++) {
            // 마지막 값은 출력 안됨
            System.out.println("emp3Arr[" + i + "] : " + emp3Arr[i]);
        }


        /** 마지막 구분자 사이에 값이 존재하지 않는데 마지막 값도 추출하고 싶을 때
         *  몇 개의 토큰으로 분리할 것인지 한계치를 두 번째 인자로 넣어줄 수 있다.
         *  이 때 음수를 넣게 되면 마지막 구분자 뒤의 값이 존재하지 않는 경우에도 빈 문자열로 토큰 생성
         * */
        String[] emp4Arr = emp3.split("/", -2);

        for(int i=0; i<emp4Arr.length; i++) {
            System.out.println("emp4Arr[" + i + "] : " + emp4Arr[i]);
        }


        System.out.println("==================== StringTokenizer ====================");

        // StringTokenizer의 경우 공백을 무시함
        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

        while (st1.hasMoreTokens()) {
            System.out.println("st1 : " + st1.nextToken());
        }

        while (st2.hasMoreTokens()) {
            System.out.println("st2 : " + st2.nextToken());
        }

        while (st3.hasMoreTokens()) {
            System.out.println("st3 : " + st3.nextToken());
        }

        // nextToken()으로 토큰을 꺼내면 해당 StringTokenizer의 토큰 재사용 불가
        while(st1.hasMoreTokens()) {
            System.out.println("st1 : " + st1.nextToken());
        }


        // split()은 정규표현식 이용(문자열 패턴) / StringTokenizer는 구분자 문자열 이용
        String colorStr = "red*orange#blue/yellow green";

//        String[] colors = colorStr.split("*#/ ");   // "*#/ "이라는 문자열이 구분자로 존재하지 않아 에러 발생

        /** 대괄호로 묶은 문자열은 문자열이 아닌 각 문자들의 패턴
         *  따라서 순서 상관 없이 존재하는 문자들을 이용하여 구분자로 사용 가능 */
        String[] colors = colorStr.split("[*/# ]");   // 순서 무관

        for(int i=0; i< colors.length; i++) {
            System.out.println("colors[" + i + "] : " + colors[i]);
        }


        // StringTokenizer의 두 번째 인자 문자열 자체는 연속된 문자열이 아닌 하나하나를 구분자로 이용하겠다는 의미
        StringTokenizer colorStringTokenizer = new StringTokenizer(colorStr, "*#/ ");

        while (colorStringTokenizer.hasMoreTokens()) {
            System.out.println(colorStringTokenizer.nextToken());
        }

    }
}
