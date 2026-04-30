package sample;

import java.util.*;

public class SymmetricDiff {
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

        HashSet<Integer> answer = new HashSet<>();

        // elements in set1 but not in set2
        for (Integer val : set1) {
            if (!set2.contains(val)) {
                answer.add(val);
            }
        }

        // elements in set2 but not in set1
        for (Integer val : set2) {
            if (!set1.contains(val)) {
                answer.add(val);
            }
        }

        System.out.println("Symmetric difference is: " + answer);
    }
}
