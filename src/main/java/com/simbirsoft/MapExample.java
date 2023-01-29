package com.simbirsoft;

import java.time.Month;
import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, Month> monthMap = new HashMap<>();
        Map<Month, Integer> monthMap1 = new HashMap<>();
        for (int i = 12; i > 0; i--) {
            monthMap.put(i, Month.of(i));
            monthMap1.put(Month.of(i), i);
        }
        System.out.println(monthMap);
        System.out.println(monthMap1);

        Collection<Month> values = monthMap.values();
        System.out.println(values);
        Set<Map.Entry<Integer, Month>> entries = monthMap.entrySet();
        System.out.println(entries);
        Set<Integer> keySet = monthMap.keySet();
        System.out.println(keySet);
        System.out.println(monthMap.containsKey(5));

        TreeMap<Month, Integer> sortedMap = new TreeMap<>();
        sortedMap.putAll(monthMap1);
        System.out.println(sortedMap);

        monthMap1.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}
