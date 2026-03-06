public class Rectangle {
    int width, height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public boolean equals(Object obj1) {
        Rectangle r =  (Rectangle)obj1;
        return this.width == r.width && this.height == r.height;
    }

    public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(15, 10);
        Rectangle r3 = new Rectangle(5, 10);

        System.out.println(r1.equals(r2)); // false
        System.out.println(r1.equals(r3)); // true
    }
}
}
