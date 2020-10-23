package Practice_6;

public class Rectangle {
    private int x;
    private int y;
    private int a;
    private int b;

    public Rectangle(int x, int y, int a, int b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    public int getX() {
        return x;
    }

    protected void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    protected void setY(int y) {
        this.y = y;
    }

    public int getA() {
        return a;
    }

    protected void setA(int A) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    protected void setB(int b) {
        this.b = b;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", a=" + a +
                ", b=" + a +
                '}';
    }
}
