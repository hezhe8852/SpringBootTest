package com.cruddemo.springboot;
import java.util.Scanner;

public class Test {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input1 = sc.next();
            String input2 = sc.next();

            if (input1.length() > 5 && input2.length() >5 && input1.length() < input2.length()) {
                System.out.println("Input paramter error");
            }

            char[] array1 = input1.toCharArray();
            char[] array2 = input2.toCharArray();
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array1.length; j++) {
                    if ( array2[i]  != array1[j]) {
                        System.out.println("false");
                        return;
                    }
                }
            }
            System.out.println("true");

        }
}