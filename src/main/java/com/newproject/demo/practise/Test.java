package com.newproject.demo.practise;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String myName = "shubham";
/*
        StringBuilder newString = new StringBuilder();
        for (int i = myname.length() - 1; i >= 0; i--) {
            newString.append(myname.charAt(i));
        }
        System.out.println(newString);*/

/*        List<String> array = Arrays.asList("shu", "bha", "m", "kru", "ta", "ghya", "shu", "bha");

        array.stream().collect(groupingBy(String::valueOf)).forEach((a, b) -> {
            if (b.size() >= 2) {
                System.out.println("This String occurs more than 1 : " + a);
            }
        });*/

/*        Stream.of(myName.split(""))
                .collect(groupingBy(identity(), LinkedHashMap::new, counting())).forEach((key, value) -> {
                    if (value == 1) {
                        System.out.println("This String occurs 1 : " + key);
                    }
                });

        Map<Character, Long> collect = myName.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        for (Map.Entry<Character, Long> entry : collect.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }*/

/*
        for (char a :  myName.toCharArray()) {
            if (myName.indexOf(a) == myName.lastIndexOf(a)) {
                System.out.println("First non repeating character : " + a);
                break;
            }
        }*/

/*        int number = 123456;
        int temp = 0;

        while (number != 0) {
            temp = temp * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(temp);*/

/*
        String newString = new StringBuilder(myName).reverse().toString();
        System.out.println(newString);*/

 /*       int[] arr = {10, 20, 4, 45, 99};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);*/

/*        int[] arr1 = {1, 2, 2, 3, 1, 4};

        Map<Integer, Long> collect = Arrays.stream(arr1).boxed().collect(groupingBy(e -> e, Collectors.counting()));
        System.out.println(collect);*/

/*        LinkedHashMap<Character, Long> collect1 = myName.chars().mapToObj(c -> (char) c)
                .collect(groupingBy(Function.identity(), LinkedHashMap::new, counting()));*/

/*        for (char key : myName.toCharArray()) {
            if (myName.indexOf(key) == myName.lastIndexOf(key)) {
                System.out.println("First non repeating character : " + key);
                break;
            }

        }*/

/*        Map<Character, Long> collect = myName.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        for (Map.Entry<Character, Long> entry : collect.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non repeating character : " + entry.getKey());
                break;
            }
        }*/

/*        String password = "hello shubham how are you";

        Optional<String> reduce = Stream.of(password.split(" "))
                .reduce((n, o) -> o + " " + n);
        System.out.println(reduce);*/

        List<String> list = Arrays.asList("shubham", "shamaS", "krutagya", "vishal", "vijay");

        List<String> list1 = list.stream().map(String::toLowerCase)
                .filter(n -> n.endsWith("s"))
                .map(String::toUpperCase).toList();
        System.out.println(list1);

        Map<String, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::valueOf));
        System.out.println(collect);

    }
}
