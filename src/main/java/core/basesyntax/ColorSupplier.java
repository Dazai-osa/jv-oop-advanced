package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        int colorindex = new Random().nextInt(Color.values().length);
        Color color = Color.values()[colorindex];
        return Color.values()[colorindex].name();
    }
}
