package by.factories;

public class Body {
    private final Color type;

    public Body(Color type) {
        this.type = type;
    }

    public Color getColor() {
        return type;
    }

    @Override
    public String toString() {
        return type + " body";
    }
}





