package sample;

import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(5);
        nums.add(8);
        nums.add(20);
        nums.add(15);

        int max = nums.get(0);
        int secondMax = nums.get(0);

        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) > max) {
                secondMax = max;
                max = nums.get(i);
            }
            else if (nums.get(i) > secondMax && nums.get(i) != max) {
                secondMax = nums.get(i);
            }
        }

        System.out.println("Second largest element is: " + secondMax);
    }
}