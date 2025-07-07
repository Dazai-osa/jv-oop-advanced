package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE = 5;
    private static final int MAX_RANDOM_NUMBER = 10;
    public final Random random = new Random();
    /*public final int randomNumber = random.nextInt(MAX_RANDOM_NUMBER);*/
    public final ColorSupplier colorSupplier = new ColorSupplier();
    /*private final String figureColor = colorSupplier.getRandomColor();*/
    public static Color white = Color.WHITE;

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURE);
        /*int randomNumber = random.nextInt(MAX_RANDOM_NUMBER);
        final String figureColor = colorSupplier.getRandomColor();*/
        switch (figureType) {
            case 0 -> {
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 1 -> {
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 2 -> {
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 3 -> {
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER));
            }
            case 4 -> {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER), random.nextInt(MAX_RANDOM_NUMBER));
            }
            default ->
            {
                return new Figure(colorSupplier.getRandomColor()) {
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
        return new Circle(white.name(), MAX_RANDOM_NUMBER);
    }
}
