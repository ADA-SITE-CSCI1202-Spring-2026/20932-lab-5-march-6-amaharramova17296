class Rectangle {
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
}
//exercise 3
class Square extends Rectangle {
    public Square (int side) {
        super(side,side);
    }
}

public class Main {
    public static void main(String[] args) {

        Object o1 = new Rectangle(5, 10);
        Object o2 = new Rectangle(15, 15);
        Object o3 = new Square(15);

        System.out.println("Objects are identical: " + o1.equals(o2));
        System.out.println("Objects are identical: " + o1.equals(o3));
        System.out.println("Objects are identical: " + o2.equals(o3));
    }
}

