package by.factories;
import java.util.Random;

public class HeadFactory implements Factory<Head> {

    @Override
    public Head makePart() {
        Random x = new Random();
        int i = x.nextInt(4 - 1) + 1;
        if (i == 1) {
            Color type = Color.BLACK;
            return new Head(type);
        } else if (i == 2) {
            Color type = Color.GREEN;
            return new Head(type);
        } else if (i == 3) {
            Color type = Color.RED;
            return new Head(type);
        }
        return null;

    }
}
