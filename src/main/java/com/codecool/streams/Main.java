package com.codecool.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> cs = myList.stream().filter(element -> element.charAt(0) == 'c').map(word -> word.substring(0,1).toUpperCase() + word.substring(1)).sorted().collect(Collectors.toList());
        cs.forEach(System.out::println);



        /*List<String> cs = new ArrayList();
        for (String element: myList){
            if (element.charAt(0) == 'c'){
                cs.add(element);
            }
        }
        cs.replaceAll(String::toUpperCase);

        Collections.sort(cs);

        System.out.println("After sorting:");
        for(String element: cs){
            System.out.println(element);
        }*/
    }
}
