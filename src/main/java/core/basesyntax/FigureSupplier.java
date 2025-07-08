package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int MAX_RANDOM_NUMBER = 10;
    public final Random random = new Random();
    public final ColorSupplier colorSupplier = new ColorSupplier();
    String randomColor = colorSupplier.getRandomColor();
    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURE);
        switch (figureType) {
            case 0 -> {
                return new Square(randomColor, random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 1 -> {
                return new Rectangle(randomColor, random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 2 -> {
                return new RightTriangle(randomColor, random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 3 -> {
                return new Circle(randomColor, random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 4 -> {
                return new IsoscelesTrapezoid(randomColor, random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
            }
            default ->
            {
                return new Figure(randomColor) {
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
        return new Circle(Color.WHITE.name(), MAX_RANDOM_NUMBER);
    }
}
