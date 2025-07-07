package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int Count = 5;
    public final Random random = new Random();
    public final int randomNumber = random.nextInt(10);
    public final ColorSupplier colorSupplier = new ColorSupplier();
    private final String figureColor = colorSupplier.getRandomColor();
    public static Color white = Color.WHITE;

    public Figure getRandomFigure() {
        int figureType = random.nextInt(Count);
        switch (figureType) {
            case 0 -> {
                return new Square(figureColor, randomNumber);
            }
            case 1 -> {
                return new Rectangle(figureColor, randomNumber, randomNumber);
            }
            case 2 -> {
                return new RightTriangle(figureColor, randomNumber, randomNumber);
            }
            case 3 -> {
                return new Circle(figureColor, randomNumber);
            }
            case 4 -> {
                return new IsoscelesTrapezoid(figureColor, randomNumber, randomNumber, randomNumber);
            }
            default ->
            {
                return new Figure() {
                    @Override
                    public double getArea() {
                        return 0;
                    }

                    @Override
                    public void draw() {

                    }
                };
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(white.name(), 10);
    }
}
