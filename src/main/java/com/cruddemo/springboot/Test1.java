package com.cruddemo.springboot;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        get(list);


    }

    private static void get(List<String> list) {
        for (String ACV : list) {
            System.out.println("AAA");
            if (ACV != null) {

            }
        }
    }
}
