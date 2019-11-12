package com.cruddemo.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<String> list2= new ArrayList<String>();
        list2.add("abc");
        list2.add("ABC");
        list2.add("1AB");
        list2.add("bcd");
        list2.add("CCC");
        list = list2.stream().filter(a -> a.contains("1")).collect(Collectors.toList());

        for (String string : list) {
            System.out.println(string);

        }


    }

}
