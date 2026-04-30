package wipro_training_package;

interface Polygon {

    double getArea();

    default double getPerimeter(int... sides) {
        int sum = 0;

        for(int i = 0; i < sides.length; i++) {
            sum = sum + sides[i];
        }

        return sum;
    }

    static String shapeInfo() {
        return "Polygon is a closed shape with multiple sides";
    }
}

class Rectangle implements Polygon {

    int l;
    int b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public double getArea() {
        return l * b;
    }
}

class Triangle implements Polygon {

    int base;
    int height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Day4Test2 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(4, 5);
        System.out.println("Area of rectangle = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter(4,5,4,5));

        Triangle t = new Triangle(3, 6);
        System.out.println("Area of triangle = " + t.getArea());
        System.out.println("Perimeter = " + t.getPerimeter(3,4,5));

        System.out.println(Polygon.shapeInfo());
    }
}
