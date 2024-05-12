package com.example.javaapi.wrapper;

public class WrapperTest {

    /** Wrapper Class
     *  기본 타입의 데이터를 인스턴스화 해야 하는 경우에 사용
     *  특정 메소드가 매개변수로 객체 타입만 요구하는 경우 기본 타입의 데이터를 먼저 인스턴스로 변환 후 넘겨줘야 함
     */

    /** Boxing & UnBoxing
     *  Boxing : 기본 타입을 래퍼 클래스의 인스턴스로 인스턴스화 하는 것
     *  UnBoxing : 래퍼 클래스 타입의 인스턴스를 기본 타입으로 변경하는 것
     *  AutoBoxing & AutoUnboxing : JDK 1.5부터 boxing과 unboxing을 자바 컴파일러가 자동 처리
     * */

    public static void main(String[] args) {

        int intValue = 20;

        Integer boxingNumber1 = new Integer(intValue);   // boxing으로 인스턴스화
        Integer boxingNumber2 = Integer.valueOf(intValue);   // static 메소드 이용

        int unBoxingNumber1 = boxingNumber1.intValue();   // unboxing

        Integer boxingNumber3 = intValue;   // autoBoxing

        int unBoxingNumber2 = boxingNumber3;   // autoUnboxing

        // Wrapper 클래스 값 비교
        int inum = 20;
        Integer integerNum1 = new Integer(20);
        Integer integerNum2 = new Integer(20);
        Integer integerNum3 = 20;   // autoBoxing
        Integer integerNum4 = 20;

        // 기본 타입과 래퍼 타입은 == 연산으로 비교 가능
        System.out.println("int와 Integer 비교 : " + (inum == integerNum1));
        System.out.println("int와 Integer 비교 : " + (inum == integerNum3));

        // 생성자로 만들어진 인스턴스의 경우 == 로 비교 불가
        // autoBoxing을 통해 만들어진 경우 == 로 비교 가능
        System.out.println("integer와 integer의 비교 : " + (integerNum1 == integerNum2));  // 비교 불가
        System.out.println("integer와 integer의 비교 : " + (integerNum1 == integerNum3));  // 비교 불가
        System.out.println("integer와 integer의 비교 : " + (integerNum3 == integerNum4));

        // 래퍼 클래스 타입의 인스턴스를 비교할 때에는 equals()를 사용
        System.out.println("integerNum1과 integerNum2 비교 : " + (integerNum1.equals(integerNum2)));
        System.out.println("integerNum1과 integerNum3 비교 : " + (integerNum1.equals(integerNum3)));
        System.out.println("integerNum1과 integerNum2 비교 : " + (integerNum3.equals(integerNum4)));
    }
}
