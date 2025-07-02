package chap1_8.poly.casting.emp;

public class Main {

    public static void main(String[] args) {

        Owner owner = new Owner();
        owner.orderWork(new Developer());
        owner.orderWork(new Designer());
    }
}
