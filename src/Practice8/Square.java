package Practice8;

public class Square extends Rectangle {
    public Square(){}
    public Square(double side){
        length = side;
        width = side;
    }
    public Square(double side, String color, boolean filled){
        length = side;
        width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
