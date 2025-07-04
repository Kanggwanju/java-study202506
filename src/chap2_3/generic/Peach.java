package chap2_3.generic;

public class Peach implements Fruit {
    private int sweet;

    public Peach(int sweet) {
        this.sweet = sweet;
    }

    @Override
    public String toString() {
        return "Peach{" +
            "sweet=" + sweet +
            '}';
    }
}
