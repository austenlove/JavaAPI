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



        /** parsing : 문자열 -> 기본 자료형 값으로 변환 */
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");
        long l = Long.parseLong("8");
        float f = Float.parseFloat("4.0");
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true");

        char c = "abc".charAt(0);  // Character는 parsing 기능을 제공하지 않음



        /** valueOf() : 기본 자료형 값 -> Wrapper 타입으로 변환 */
        /** toString() : 필드 값 -> 문자열로 변환 */
        String b2 = Byte.valueOf((byte) 1).toString();
        String s2 = Short.valueOf((short) 2).toString();
        String i2 = Integer.valueOf(4).toString();
        String l2 = Long.valueOf(8L).toString();
        String f2 = Float.valueOf(4.0f).toString();
        String d2 = Double.valueOf(8.0).toString();
        String b1 = Boolean.valueOf(true).toString();
        String c2 = Character.valueOf('a').toString();

        // String 클래스의 valueOf 사용
        String str = String.valueOf(10);

        // 문자열 합치기를 통해 String으로 변환 가능
        String str2 = 123 + "";
    }
}
