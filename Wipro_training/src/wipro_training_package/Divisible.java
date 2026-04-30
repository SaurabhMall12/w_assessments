package wipro_training_package;


import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 3 == 0 || num % 7 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}

