package com.newproject.demo.practise;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RestClass {
    public static void main(String[] args) {

/*        List<Integer> list = Arrays.asList(1, 2, 3);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        int[] list2 = {1, 2, 3};

        int sum1 = Arrays.stream(list2).sum();
        System.out.println(sum1);*/

        String abcd1 = "shubhamshub";

        LinkedHashMap<Character, Long> collect = abcd1.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        for (Map.Entry<Character, Long> map : collect.entrySet()) {
            if (map.getValue() >= 2) {
                System.out.println(map.getKey());
                break;
            }
        }

     /*   List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6);

        long count = list3.stream().filter(i -> i % 2 == 0).count();
        System.out.println(count);

        String abcd = "today is thursday";

        String s = Stream.of(abcd.split(" ")).reduce((a, b) -> b + " " + a).orElseThrow();
        System.out.println(s);*/
/*        String abcd = "today is thursday";

        String[] seques = abcd.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (int i = seques.length - 1; i >= 0; i--) {
            reverse.append(seques[i]).append(" ");
        }
        System.out.print(reverse);*/
    }


}
