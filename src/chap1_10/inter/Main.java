package chap1_10.inter;

public class Main {

    public static void main(String[] args) {

        Master master = new Master();
        master.letsHund(new Cat());
        master.letsPlay(new Rabbit());
    }
}
