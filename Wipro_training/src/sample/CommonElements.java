package sample;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        HashSet<Integer> result = new HashSet<>();

        for (Integer val : set1) {
            if (set2.contains(val)) {
                result.add(val);
            }
        }

        System.out.println("Common elements are: " + result);
    }
}
