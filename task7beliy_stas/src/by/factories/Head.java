package by.factories;

public class Head {
    private final Color type;

    public Head(Color type) {
        this.type = type;
    }

    public Color getColor() {
        return type;
    }

    @Override
    public String toString() {
        return type + " head";
    }

}
