package sample;

import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {

        String str = "aabbcdeff";

        HashMap<Character, Integer> map = new HashMap<>();

        // count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // find first non-repeating
        char result = '\0';

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                result = str.charAt(i);
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No unique character found");
        }
    }
}
