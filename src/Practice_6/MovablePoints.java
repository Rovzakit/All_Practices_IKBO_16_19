package Practice_6;

public class MovablePoints implements Movable {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public MovablePoints(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    protected void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    protected void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    protected void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    protected void setY2(int y2) {
        this.y2 = y2;
    }

    private boolean SameSpeed(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(getX1()-x1, 2) + Math.pow(getY1()-y1, 2)) ==
        Math.sqrt(Math.pow(getX2()-x2, 2) + Math.pow(getY2()-y2, 2));
    }

    @Override
    public String toString() {
        return "MovablePoints{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }

    @Override
    public void move(int x1, int y1, int x2, int y2) {
        if(SameSpeed(x1, y1, x2, y2)){
            this.setX1(getX1()+x1);
            this.setY1(getY1()+y1);
            this.setX2(getX2()+x2);
            this.setY2(getY2()+y2);
        }
    }

    @Override
    public void move(int x, int y) {}

}
