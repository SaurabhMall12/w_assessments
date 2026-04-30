package sample;

public class PatternWhile {
    public static void main(String[] args) {

        int i = 5;

        while (i >= 1) {
            int j = 5;

            while (j >= 6 - i) {
                System.out.print(j);
                j--;
            }

            System.out.println(); // move to next line
            i--;
        }
    }
}