interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class Point implements Movable {
    int x,y;
    public Point (int a, int b) {
        this.x = a;
        this.y = b;
    }
    public void moveUp() { y++; }

    public void moveDown() { y--; }

    public void moveLeft() { x--; }

    public void moveRight() { x++; }

    public void print() {
    System.out.println("(" + x + ", " + y + ")");
    }
}

class Circle implements Movable {
    Point center;
    int r;

        public Circle(Point center, int radius) {
        this.center = center;
        this.r = radius;
    }

    public void moveUp() { center.moveUp(); }

    public void moveDown() { center.moveDown(); }

    public void moveLeft() { center.moveLeft(); }

    public void moveRight() { center.moveRight(); }

    public void Print() {
        System.out.print("Center: ");
        center.print();
        System.out.println("Radius: " + r);
    }

}
//checking whether it works
class Main {
    public static void main(String args[]) {
      Point p1 = new Point(5,7);
      Circle c1 = new Circle(p1,3);
      c1.moveRight();
      c1.moveDown();
      c1.Print();
    }
}