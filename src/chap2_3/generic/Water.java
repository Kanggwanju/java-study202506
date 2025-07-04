package chap2_3.generic;

public class Water {
    private int sweet;

    public Water(int sweet) {
        this.sweet = sweet;
    }

    @Override
    public String toString() {
        return "Water{" +
            "sweet=" + sweet +
            '}';
    }
}
