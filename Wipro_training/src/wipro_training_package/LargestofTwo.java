package wipro_training_package;

import java.util.Scanner;

public class LargestofTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        sc.close();
    }
}

