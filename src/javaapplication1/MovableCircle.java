package javaapplication1;

public class MovableCircle implements Movable {
    private int x;
    private int y;
    private int R;

    public MovableCircle(int x, int y, int R) {
        this.x = x;
        this.y = y;
        this.R = R;
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

    public int getR() {
        return R;
    }

    protected void setR(int R) {
        this.R = R;
    }



    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", R=" + R +
                '}';
    }

    @Override
    public void move(int x, int y) {
        this.setX(getX()+x);
        this.setY(getY()+y);
    }
}
