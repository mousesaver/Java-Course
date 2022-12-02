package ThisSuper;

public class Shape {
    private int x;
    private int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Square extends Shape {
    private int width;
    private int height;

    public Square(int width, int height) {
        this(0, 0, width, height);
    }

    public Square(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}
