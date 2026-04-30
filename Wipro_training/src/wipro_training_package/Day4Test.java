package wipro_training_package;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

// MovablePoint
class MovablePoint implements Movable {

    int x, y;
    int xSpeed, ySpeed;

    MovablePoint(int x, int y, int xs, int ys) {
        this.x = x;
        this.y = y;
        xSpeed = xs;
        ySpeed = ys;
    }

    public void moveUp() {
        y = y + ySpeed;
    }

    public void moveDown() {
        y = y - ySpeed;
    }

    public void moveLeft() {
        x = x - xSpeed;
    }

    public void moveRight() {
        x = x + xSpeed;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

// MovableCircle
class MovableCircle implements Movable {

    int radius;
    MovablePoint center;

    MovableCircle(int r, MovablePoint c) {
        radius = r;
        center = c;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return "Circle center: " + center + " radius: " + radius;
    }
}

// MovableRectangle
class MovableRectangle implements Movable {

    MovablePoint topLeft;
    MovablePoint bottomRight;

    MovableRectangle(MovablePoint tl, MovablePoint br) {

        if (tl.xSpeed != br.xSpeed || tl.ySpeed != br.ySpeed) {
            System.out.println("Warning: speeds are different");
        }

        topLeft = tl;
        bottomRight = br;
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString() {
        return "Rectangle TL: " + topLeft + " BR: " + bottomRight;
    }
}


public class Day4Test {
    public static void main(String[] args) {

        MovablePoint p = new MovablePoint(0, 0, 2, 2);
        System.out.println(p);
        p.moveUp();
        p.moveRight();
        System.out.println(p);

        MovableCircle c = new MovableCircle(5,
                new MovablePoint(1, 1, 1, 1));
        System.out.println(c);
        c.moveDown();
        c.moveRight();
        System.out.println(c);

        MovableRectangle r = new MovableRectangle(
                new MovablePoint(0, 5, 1, 1),
                new MovablePoint(5, 0, 1, 1));
        System.out.println(r);
        r.moveLeft();
        r.moveDown();
        System.out.println(r);
    }
}