package com.simbirsoft;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String... args) {
        Set<String> linkedStringSet = new LinkedHashSet<>();
        linkedStringSet.add("D");
        linkedStringSet.add("A");
        linkedStringSet.add("B");
        linkedStringSet.add("E");
        linkedStringSet.add("C");
        Set<String> treeStringSet = new TreeSet<>(linkedStringSet);
        System.out.println(linkedStringSet);
        System.out.println(treeStringSet);

        System.out.println(treeStringSet);
        System.out.println(treeStringSet);
        System.out.println(linkedStringSet.contains("B"));
        System.out.println(treeStringSet.contains("X"));

        treeStringSet.clear();
    }

}