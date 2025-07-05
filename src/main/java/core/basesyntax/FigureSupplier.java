package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int figureCount = 5;
    public static final Random random = new Random();
    public final int randomNumber = random.nextInt(10);
    public final ColorSupplier colorSupplier = new ColorSupplier();
    private final String figureColor = colorSupplier.getRandomColor();
    public static Color white = Color.WHITE;

    public Figure getRandomFigure() {
        int figureType = random.nextInt(figureCount);
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
                return new Figure();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(white.name(), 10);
    }
}
