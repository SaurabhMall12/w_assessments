package wipro_training_package;

interface Division {
    void divide(int a, int b);
}

class DivisionImpl implements Division {

    public void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

public class InterfaceTest {
    public static void main(String[] args) {

        Division d = new DivisionImpl();

        d.divide(10, 2);  // normal case
        d.divide(10, 0);  // exception case
    }
}