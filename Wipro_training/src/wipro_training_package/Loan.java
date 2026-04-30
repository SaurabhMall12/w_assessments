package wipro_training_package;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int salary = sc.nextInt();

        if (age >= 21 && salary >= 20000) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}
