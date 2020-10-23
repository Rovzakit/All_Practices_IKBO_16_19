package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(1,1, 10);

        System.out.println(circle);

        MovablePoint pointMovable = new MovablePoint(10,10);
        System.out.println(pointMovable);
        pointMovable.move(12,19);
        System.out.println(pointMovable);
    }
}
