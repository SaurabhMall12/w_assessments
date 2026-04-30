package sample;

public class NullToWrapper {
    public static void main(String[] args) {
        String str = null;

        try {
            Integer num = Integer.valueOf(str);
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Null or invalid input");
        }
    }
}