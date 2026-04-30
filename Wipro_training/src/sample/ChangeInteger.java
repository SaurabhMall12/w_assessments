package sample;

public class ChangeInteger {
    static void changeValue(int num) {
        num = num + 10;
        System.out.println("Inside method: " + num);
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println("Before: " + a);
        changeValue(a);
        System.out.println("After: " + a);
    }
}