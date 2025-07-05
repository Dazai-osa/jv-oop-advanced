package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] mainArr = new Figure[7];

        for (int i = 0; i < mainArr.length; i++) {
            mainArr[i] = (i < 4) ? figureSupplier.getRandomFidure() : figureSupplier.getDefaultFigure();
        }
         for (Figure figure : mainArr) {
             figure.Draw();
         }
    }
}
