package sample;

public class CheckDigit {
    public static void main(String[] args) {
        char ch = '5';

        if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Not Digit");
        }
    }
}
