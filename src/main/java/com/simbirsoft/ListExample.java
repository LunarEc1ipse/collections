package com.simbirsoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample {

    public static void main(String... args) {
        List<Integer> integersList = new ArrayList<>();
        List<Integer> integersList2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> newListInt = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        stringList.add("D");
        stringList.add("A");
        stringList.add("B");
        stringList.add("E");
        stringList.add("C");
        System.out.println(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);
        for (int i = 10; i > 0; i--) {
            integersList.add(i);
        }

        System.out.println(integersList);
        System.out.println(integersList.stream().sorted().toList());

        for (int element : integersList) {
            System.out.println(element);
        }
        System.out.println("3 елемент листа " + integersList.get(2));
        System.out.println(newListInt);

        newListInt.addAll(integersList2);
        newListInt.addAll(integersList);
        System.out.println(newListInt);
        newListInt.sort(Collections.reverseOrder());
        System.out.println(newListInt);
    }
}