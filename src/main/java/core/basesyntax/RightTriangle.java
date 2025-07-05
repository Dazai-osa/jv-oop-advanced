package core.basesyntax;

public class RightTriangle extends Figure {
    private final int side;
    private final int height;

    public RightTriangle(String color, int side, int height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        double area = (1 / 2) * side * height;
        return area;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: right triangle; color : " + getColor() + "; side: " + side + "; height: " + height + "; area: " + getArea() + ";");
    }
}
