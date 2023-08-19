package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] strings = inArray(new String[]{"arp", "live", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"});
        System.out.println(Arrays.toString(strings));
    }

    public static String[] inArray(String[] array1, String[] array2) {
        SortedSet<String> sortedSet = new TreeSet<>();
        for(String str1 : array1) {
            for(String str2 : array2) {
                if(str2.contains(str1)) {
                    sortedSet.add(str1);
                }
            }
        }
        if(sortedSet.size() == 0) {
            return new String[]{};
        }
        int i = 0;
        String[] returnArray = new String[sortedSet.size()];
        for (String s : sortedSet) {
            returnArray[i] = s;
            i++;
        }
        return returnArray;
    }
}