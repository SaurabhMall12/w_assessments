package sample;

import java.io.File;
import java.util.Scanner;

public class ReadExample {
    public static void main(String[] args) {
        try {
            File file = new File("testX2.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}
