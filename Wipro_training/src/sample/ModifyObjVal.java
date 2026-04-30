package sample;

class Box {
    int length;
}

public class ModifyObjVal {
    static void modify(Box b) {
        b.length = 50;
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.length = 10;

        System.out.println("Before: " + b1.length);
        modify(b1);
        System.out.println("After: " + b1.length);
    }
}
