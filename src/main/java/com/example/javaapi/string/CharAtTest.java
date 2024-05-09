package com.example.javaapi.string;

public class CharAtTest {

    public static void main(String[] args) {

        /** charAt() */
        String str1 = "apple";

        for(int i=0; i<str1.length(); i++) {
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }

    }
}
